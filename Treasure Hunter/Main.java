#include<iostream>
using namespace std;
int main()
{
      int gc,x,y;
    int b,c,others;
    cin>>gc>>x>>y;
    
    b=gc*x/100 ;
    c=(gc-b)*y/100 ;
    others=(gc-b-c)/3 ;
    cout<<b<<endl<<c<<endl<<others;
  //Type your code here.
}