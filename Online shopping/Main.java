#include<iostream>
using namespace std;
int main()
{
  int f1,f2,f3,s1,s2,s3,a1,a2,a3, r1,r2,r3;
  
 cin >> f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
 r1= f1-(((f1*f2)/100))+f3;
  r2= s1-(((s1*s2)/100))+s3;
r3= a1-(((a1*a2)/100))+a3;
  cout<<"In Flipkart Rs."<<r1<<endl;
  cout<<"In Snapdeal Rs."<<r2<<endl;
  cout<<"In Amazon Rs."<<r3<<endl;
  
  if (r1<=r2 && r1<=r3   )
  {
    cout<<"He will prefer Flipkart";
  }
  else if (r2<r1 && r2< r3)
  {
   cout<<"He will prefer Snapdeal";
  }
  else if (r3<r1 && r3<r2)
  {
    cout<<"He will prefer Amazon";
  }
  
  
  
  
  
  //Type your code here.
}