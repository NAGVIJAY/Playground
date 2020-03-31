#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
    float i1,i2;
    float amt,dis,disprc,amtsvd;
    float d;
    cin>>i1>>i2>>d;
    amt=i1+i2 ;
    dis=amt*d/100;
    disprc=amt-dis ;
    amtsvd=amt-disprc ;
    cout<<amt<<endl<<disprc<<endl<<amtsvd;
}