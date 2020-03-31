#include<iostream>
using namespace std;
int main()
{
  int a,rem=0,b=0;
  cin>>a;
  while(a!=0)
  {
    rem=a%10;
    b=b+rem;
    a=a/10;
  }
  cout<<"Alice must go in path-"<<b;
  //Type your code here.
}