#include<iostream>
using namespace std;
int main()
{
  int num,i=0;
  cin>>num;
    cout<<num<<endl;
  while(num)
  {
    if (num==1)
    {
      cout<<i;
      break;
    }
    else if (num%2==0)
    {
      num=num/2;
      cout<<num<<endl;
    }
    else if (num%2!=0)
    {
      num= (3*num) +1;
      cout<<num<<endl;
    }
    i++;
  }

     
  //Type your code here.
}