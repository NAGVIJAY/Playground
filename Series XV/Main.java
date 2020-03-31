#include<iostream>
using namespace std;
int main()
{
 int num,a=3,b=8,c;
  cin>>num;
  cout<<a<<" "<<b<<" ";
  for(int i=3;i<=num;i++)
  {
    c=a+b+(i-1);
    a=b;
    b=c;
      cout<<c<<" ";
  }
}