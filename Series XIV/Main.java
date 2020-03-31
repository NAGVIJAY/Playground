#include<iostream>
using namespace std;
int main()
{
  int num,a=2,b=3;
  cin>>num;
  for(int i=1;i<=num;i++)
  {
    cout<<a<<" ";
    a=a+b;
    b=b*2;
  }
}