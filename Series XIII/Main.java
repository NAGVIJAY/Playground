#include<iostream>
using namespace std;
int main()
{
  int num,a=5;
  cin>>num;
  cout<<a<<" ";
  for (int i = 3;i<num*2;i+=2)
  {
    a=a+(11*(i-2));
    cout<<a<<" ";
  }
  //Type your code here.
}