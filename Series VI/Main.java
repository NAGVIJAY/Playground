#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int num;
  cin>>num;
  for (int i=1;i<=num;i++)
  {
    if(i%2!=0)
    {
      cout<<pow(i,2)-1<<" ";
    }
    else
      cout<<pow(i,2)-2<<" ";
  }
}