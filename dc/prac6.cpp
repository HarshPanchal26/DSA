#include <bits/stdc++.h>
#include <cmath>

using namespace std;

int main()
{
    int n;
   
    int totalChar = 0;
    string s = "";
    map<string,string> map;
    
    cout<<"190420116027 : Jenish Jai"<<endl;
    cout<<"Practical 6 : Write a program to implement digram coding for given text file" <<endl;
    
    ifstream myFile("test.txt");
   
    if(myFile.fail()){
        cout<<"Error"<<endl;
        return 0;
    }
   
    char c;
    int count = 0;
    while(myFile.get(c)){
       
       s.push_back(c);
    }
    myFile.close();
    
    map["a"]  = "000";
    map["b"]  = "001";
    map["c"]  = "010";
    map["d"]  = "011";
    map["r"]  = "100";
    map["ab"]  = "101";
    map["ac"]  = "110";
    map["ad"]  = "111";
    
    int i=0;
    string ans;
    while(i<s.length()){
        
        string s1 = "";
        
        s1.push_back(s.at(i));
        
        if(i!=s.length()-1)
            s1.push_back(s.at(i+1));
        
        if(map.find(s1)!=map.end()){
            ans = ans + map[s1];
            i = i+2;
        }
        else{
            s1 = "";
            s1.push_back(s.at(i));
            ans = ans+map[s1];
            i++;
        }
    }
    
    cout<<"Input String : " <<s<<endl;
    cout<<"Encoded String is : "<<ans<<endl;
   
}
