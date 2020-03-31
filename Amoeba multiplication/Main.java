#include<iostream>
using namespace std;
int main()
{
  int num,i=1,a=0,b=1,c;
  cin>>num;
  while(i<(num-1))
  {
    c=a+b;
    a=b;
    b=c;
    i++;
  }
  
  cout<<c;
  //Type your code here.
}