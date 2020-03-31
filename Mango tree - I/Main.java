#include<iostream>
using namespace std;
int main()
{
  int r,c,n,i,flag=0;
  cin>>r>>c>>n;
  i=1;
  while(i<c)
  {
    if(n==((i*r)+1))
    {
      flag=1;
    }
    i++;
  }
  int j=1;
  while(j<=r)
  {
    if(n==j)
    {
      flag=1;
    }
    j++;
  }
  if(flag==1)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}