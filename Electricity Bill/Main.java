#include<iostream>
using namespace std;
#include<math.h>
int main()
{
    //fill the code
   int a ;
    cin>>a;
    if (a>0 && a<=200)
    {
        a=floor(a*0.50) ;
    cout<<"Rs."<<a;
    }
    else if (a>200 && a<=400)
    {
        a=round(a*0.65+100);
      cout<<"Rs."<<a;
    }
    else if (a>400 && a<=600)
    {
        a=round(a*0.80+200);
        cout<<"Rs "<<a;
    }
    else if (a>600)
    {
        a=round(a*1.25+425);
        cout<<"Rs."<<a;
    }
    else 
    {
 cout<<"Invalid Input";
    }
    return 0;
}