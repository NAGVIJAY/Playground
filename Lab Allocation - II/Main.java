#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  string s;
  cin>>a>>b>>c>>s;
  //getline(cin,s);
  if(s =="L1")
  {
    if(b>c)
    {
      cout<<"L3";
    }
    else
    {
      cout<<"L2";
    }
  }
   else if(s=="L2")
  {
    if(a>c)
    {
      cout<<"L3";
    }
    else
    {
      cout<<"L1";
    }
  }
   if(s=="L3")
  {
    if(b>a)
    {
      cout<<"L1";
    }
    else
    {
      cout<<"L2";
    }
  }
  //Type your code here.
}