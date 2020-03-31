#include<iostream>
using namespace std;
int main()
{
  int num,a=0,b=1,c;
  cout<<"Enter the value of n"<<endl;
  cin>>num;
  {
    for(int i=2;i<num;i++)
    {
      c=a+b;
     a=b;
      b=c;
    }
    cout<<"The term "<<num<<" in the fibonacci series is "<<c;
  }
}