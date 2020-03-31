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
    if(arr[i]%2!=0)
    {
      sum=sum+arr[i];
    }
  }
  cout<<"Enter the number of elements in the array\nEnter the elements in the array\nThe sum of the odd elements in the array is "<<sum;
  //Type your code here.
}