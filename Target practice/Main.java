#include<iostream>
using namespace std;
int main()
{
  int n,tar,sum=0,i=0;
  cin>>tar;
  while(1)
  {
    cin>>n;
    sum+=n;
    i++;
    if (sum>=tar)
    {
      break;
    }
   }
  cout<<"The number of turns is "<<i;
  //Type your code here.
}