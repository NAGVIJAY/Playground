#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if((a<b && a<c))
  {
    cout<<"L1";
  }
  else if((b<c&&b<a))
  {
    cout<<"L2";
  }
  else if((c<a &&c<b))
  {
    cout<<"L3";
  }
    
  //Type your code here.
}