#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
  int a=9,b=11,c;
  
  for(int i=1;i<=num;i++)
  {
    if(i==1)
    {
      cout<<a<<" ";
    }
    else if(i==2)
    {
      cout<<b<<" ";
      
    }
    else
    {
    c=a+b;
    cout<<c<<" ";
    a=b;
      b=c;
    }
  }
  //Type your code here.
}