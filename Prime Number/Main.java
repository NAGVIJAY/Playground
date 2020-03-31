#include<iostream>
using namespace std;
int main()
{
  int num,count=1;
  cin>>num;
  for(int i=2;i<=num;i++)
  {
    if(num%i==0)
    {
      count++;
    }
  }
  if(count==2)
  {
    cout<<"Prime Number";
  }
  else
    cout<<"Not a Prime Number";
  
  //Type your code here.
}