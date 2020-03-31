#include<iostream>
using namespace std;
int main()
{
int r,c,sum=0,sum1=0;
  cin>>r>>c;
  int arr[r],arr1[c];
  for(int i=0;i<r;i++)
  {
    cin>>arr[i];
    sum=sum+arr[i];
  }
  for(int i=0;i<c;i++)
  {
    cin>>arr1[i];
    sum1=sum1+arr1[i];
  }
 	if ((r==c)&&(sum==sum1))
    {
     cout<<"Same";
    }
  else
  {
    cout<<"Not Same";
  }
}