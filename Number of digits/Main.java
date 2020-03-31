#include<iostream>
using namespace std;
int main()
{
  int num,c=1;
  cin>>num;
  int temp=num;
  while(num>9)
  {
    c++;
    num/=10;
  }
  cout<<"Enter the value of n\nThe number of digits in "<<temp<<" is "<<c;
  //Type your code here.
}