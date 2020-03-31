#include<iostream>
using namespace std;
int main()
{
 int a,b,c,d;
  float vol;
  cin>>a>>b>>c>>d;
  
  vol= 3.14* a *a *b;
  if(vol<=(d*c))
  {
    cout<<"The tank can be filled within "<< d<<" hours";
  }
  else
  {
    cout<<"The tank cannot be filled within "<<d<<" hours";
  }
  //Type your code here.
}