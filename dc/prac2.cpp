

#include <bits/stdc++.h>
using namespace std;
int size;
bool checkPrefix(string str,int index);
bool exist(string suffix);
vector<string> codewords;
int main()
{ 
    int n;
    cout<<"190420116071 : Meet Vaghasiya";
    cout<<"\n Practical 2 : Take set of symbols and associated code. Check whether given code is Prefix or not. Also check whether the code is UDC or not.";
    cout<<"\n\n Enter n :- ";
    cin>>n;
    size = n;
   
    for(int i=0;i<n;i++)
{   
        string code;
        cin>>code;
        codewords.push_back(code);
}   
    bool flag = true;
  
    for(int i=0;i<codewords.size();i++)
    {  
        flag = checkPrefix(codewords[i],i);   
        // cout<<codewords.size()<<" ";
        // cout<<size<<" "<<endl;
        if(!flag)
       {
            cout<<"Not UDC"<<endl;
            break;
        }
    }
   
    if(flag)
    {   
        cout<<"UDC"<<endl;
    }
    return 0;
}

bool checkPrefix(string str,int index)
{   
    for(int i=0;i<codewords.size();i++)
    {
            // cout<<codewords.size()<<" ";
        if(i!=index && str.length()<codewords[i].length())
        {       
            string substring =  codewords[i].substr(0,str.length());
            // cout<<substring<<" ";
            if(substring==str)
	{
                string suffix = codewords[i].substr(str.length());   
                if(exist(suffix))
                {
                    codewords.push_back(suffix);
                    size++;
                    // cout<<"check"<<" ";
                }
                else
                    return false;
            }
        }
    }
   
    return true;
}

bool exist(string suffix)
{
    // cout<<codewords.size()<<" ";
    for(int i=0;i<codewords.size();i++)
    {   
        if(suffix==codewords[i])
        {
            return false;
        }
    }
  
    return true;
} 
