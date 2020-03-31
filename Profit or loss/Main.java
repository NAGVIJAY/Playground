#include<iostream>
using namespace std;
int main()
{
  float price,cp;
cin>>price>>cp;  
 if (price > (cp*12))
 {
   cout<<"Loss : Rs."<<(price-(cp*12));
 }
  else if (price < (cp*12))
  {
    cout<<"Profit : Rs."<<((cp*12)-price);
  }
  else 
  {
    cout<<"No profit nor loss";
  }
  
  //Type your code here.
}