#include<iostream>
using namespace std;
int main()
{
 int num,i=1,sum=0;
  cin>>num;
  while(i<=(num/2))
  {
    if(num%i==0)
    {
    sum=sum+i;
    }
    i++;
  }
  
  if (num<sum)
  {
    cout<<"Abundant Number";
  }
  else
  {
    cout<<"Not Abundant Number";
  }
  
}