#include<iostream>
using namespace std;
int main()
{
  int num,sum=0,rem=0,r;
  cin>>num;
  r=num;
  while(num)
  {
    rem=num%10;
    sum=sum+rem;
    num=num/10;
  }
  if (r%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
   cout<<"Not Harshad Number";
  }
  //Type your code here.
}