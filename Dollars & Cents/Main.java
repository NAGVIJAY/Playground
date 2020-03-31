#include<iostream>
using namespace std;
int main()
{
  int d1,a,d2,b,d,c;
  cin>>d1>>a>>d2>>b;
  c =(a + b) % 100;
  d = (d1 +d2) + ((a+b)/100);
  cout<<d<<endl<<c;
}