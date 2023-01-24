#include <bits/stdc++.h>
using namespace std;
void findGolomb(int n,int m);
int main()
{
    int m;
    cout<<"190420116043 : HARSH PANCHAL"<<endl;
    cout<<"Practical 4 : Generate the Golomb Codes for input parameter m=5 and for the set of integers "
            "n={0,1,2,…,15}."<<endl;
    cout<<"Enter m : ";
    cin>>m;
    cout<<"n\tq\tr\tcodeword"<<endl;
    for(int i=0;i<=15;i++)
        findGolomb(i,m);
    return 0;
}
void findGolomb(int n,int m){
    int c,k,q,r;
    string x="";
    string y = "";
    q = n/m;
    
    for(int i=1;i<=q;i++)
        x=x+"1";
    
    x = x+"0";
    
    k = ceil(log2(m));
    c = pow(2,k)-m;
    r = n%m;
    int r1=r;
    if(r>=0 && r<c){
        k = k-1;
    }
    else{
        r1=r1+c;
    }
   
    while(r1>0){
        y.push_back((char)((char)((int)('0')+(r1%2))));
        r1=r1/2;
    }
    
    string y1 ="";
    
    for(int i=y.length()-1;i>=0;i--)
        y1=y1+y.at(i);
        
    int len = k-y.length();
    string temp = "";
    while(len > 0){
        temp+="0";
        len--;
    }
    x=x+temp;
    x = x+y1;
    
    cout<<n<<"\t"<<q<<"\t"<<r<<"\t"<<x<<endl;
}

