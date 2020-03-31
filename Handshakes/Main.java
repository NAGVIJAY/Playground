#include<iostream>
using namespace std;
int main()
{
  int num,sum = 0;
  cin>>num;
  //sum = num * (num - 1)/2;  //direct formula
  for(int i = 1;i < num; i++)
    sum = sum + i;
  cout<<sum;
}