#include<iostream>
using namespace std;
int main()
{
  int c,r,n,i,j,flag=0;
  cin>>r>>c>>n;
  if(n%r==1)
  {
    flag=1;
  }
  if((n<=r*c)&&(n>=((r*c)-(r-1))))
  {
    flag=1;
  }
  if(n<r)
  {
    flag=1;
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