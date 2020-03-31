#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
  int arr[num];
  for(int i=0;i<num;i++)
  {
    cin>>arr[i];
  }
  int max=arr[0];
  for(int i=1;i<num;i++)
  {
    if(max<arr[i])
    {
      max=arr[i];
    }
  }
  cout<<"Enter the size of the array\nEnter "<<num<<" elements of an array\nMaximum element in the array is "<<max;
}