#include<iostream>
using namespace std;
int main()
{
  int r,c, t;
  
 cin>>r>>c>>t;
  if((t<=(c*2)&& t>c) || (t>(r*(c-2))&&t<=(r*(c-1))))
  {
    cout<<"It is a mango tree";
  }
  else
  {
    cout<<"It is not a mango tree";
  }
  //Type your code here.
}