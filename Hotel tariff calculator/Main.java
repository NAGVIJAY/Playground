#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if (a==3)
  {
    cout<< (b*c);
  }
  else if (a>0 && a<=12)
  {
 	 if(a == 4 || 5|| 11|| 12 || 6)
  {
    cout << ((b*c) +(((b*c)*20)/100));
  }
  else
  {
    cout<<(b*c);
  }
  }
  else
    cout<<"Invalid Input";
  
  
  //Type your code here.
}