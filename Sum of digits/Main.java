#include<iostream>
using namespace std;
int main()
{
  int num,rem,sum=0;
  cout<<"Enter the value of n\nThe sum of digits in ";
  cin>>num;
  int temp=num;
  while(num!=0)
  {
    rem=num%10;
    sum+=rem;
    num/=10;
  }
  cout<<temp<<" is "<<sum;
  //Type your code here.
}