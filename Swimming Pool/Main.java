#include<iostream>
using namespace std;
int main()
{
    int s,c,volume;
 cin>>s>>c;
   volume=s*s*s*1000;
   if (volume>c)
   {
 cout<<"Can store";
   }
   else 
   {
  cout<<"Cannot store";
   }
    
    return 0;
}