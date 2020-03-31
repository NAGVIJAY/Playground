#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>> num;
  
 if((num>99) && (((num/10)%10)%3==0)  )
 {
   cout<<"Trendy Number";
 }
  else
    cout<<"Not a Trendy Number";
  //Type your code here.
}