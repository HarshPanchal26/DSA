#include <bits/stdc++.h>
using namespace std;
int main()
{   
    cout<<"190420116027 : Jenish Jai"<<endl;
    cout<<"Practical 5 : Encode a given string “BILL GATES” using Arithmetic Encoding/Decoding"
   "scheme"<<endl;
    string s;
    string s1;
    cout<<"Enter String : ";
    getline(cin,s);
    map<char, int> order;
    map<char, int> map;
    for(int i=0;i<s.length();i++){
        map[s.at(i)]++;    
    }
    
    double prob[map.size()+1];
    int i=1;
    
    for(auto m:map)
	{    
        prob[i] = (m.second/(double)s.length());
        i++;
    }
    i=1;
    for(auto m:map)
	{    
        order[m.first] = i;
        i++;
    }
    
    double F[map.size()+1];
    
    F[0] = 0;
    for(int j=1;j<=map.size();j++){
        
        F[j] = prob[j]+F[j-1];
    }
    double l=0;
    double u = 1;
    
    cout<<endl;
    
    for(int j=0;j<s.size();j++){
        
        double l1= l + ((u-l)*F[order[s.at(j)]-1]);
        
        u = l + (u-l)*F[order[s.at(j)]];
        
        l=l1;
        
    }
    double tag = (l+u)/2;
   
    cout<<"Tag is : "<<tag<<endl;
    
    string decode = "";
    
    l=0;
    u=1;
    double l1 = 0;
    double u1 = 1;
    for(int j=0;j<s.size();j++){
        
        for(auto m : order){
            
            l1 = l + (u-l)*F[m.second-1];
            
            u1 = l + (u-l)*F[m.second];
            
            
            if(tag>=l1 && tag<u1){
                
                
                decode.push_back(m.first);
                
                l=l1;
                
                u=u1;
                break;
            }
        }    
    }
    
    cout<< "Decode string is : "<<decode<<endl;
    return 0;
}
