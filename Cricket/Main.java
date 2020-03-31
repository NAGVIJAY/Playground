#include<math.h>
#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  int nob,nor,rs,bb;
  float ov;
  cin>>nob>>nor>>rs>>bb;
 cout<<(nob/6)<<endl;
  cout<<((bb/6)+((bb%6)*0.1))<<endl;
  ov=((bb/6)+((bb%6)/10.0));
  printf("%.1f\n",rs/ov);
  printf("%.1f\n",nor/50.0);
  if((rs/ov)>(nor/50.0))
  {
    cout<<"Eligible to Win"<<endl;
  }
  else
  {
    cout<<"Not Eligible to Win"<<endl;
  }
  
}