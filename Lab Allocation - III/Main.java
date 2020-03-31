#include<iostream>
using namespace std;
int main()
{
  int a[3],c=0;
  //Type your code here.
  for(int i=0;i<=3;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<3;i++)
  {
    if(a[3]<a[i])
    {
      c++;
    }
  }
  cout<<c;
}