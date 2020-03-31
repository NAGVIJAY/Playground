#include<iostream>
using namespace std;
int main()
{
int num,temp;
  cin>>num;
  int arr[num];
  for (int i=0;i<num;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<num;i++)
  {
    for(int j=0;j<num;j++)
    {
      if(arr[i]<arr[j])
      {
        temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;  
      }
    }
  }
    cout<<"Sorted array is:\n";
    for (int i=0;i<num;i++)
    {
      cout<<arr[i]<<endl;
    }
  
}