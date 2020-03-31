#include<iostream>
using namespace std;
int main()
{
  int num,a=1,b=2;
  cin>>num;
  for(int i=1;i<=num;i++)
  {
    if (i%2!=0)
    {
      cout<<a<<" ";
      a=a*3;
    }
    else
    {
      cout<<b<<" ";
      b=b*3;
    }
  }
  
  //Type your code here.
}