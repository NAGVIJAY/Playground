#include<iostream>
using namespace std;
int main()
{
  int num,sum=0;
cin>>num;
  int arr[num];
  for(int i=0;i<num;i++)
  {
    cin>>arr[i];
    sum=sum+arr[i];
  }
  cout<<sum;
  //Type your code here.
}