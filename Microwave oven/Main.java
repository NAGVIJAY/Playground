#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
        float n,heat;
        cin>>n>>heat;
        if(n<=1)
            cout<<fixed<<setprecision(2)<<heat;
        else if(n==2)
        {           heat=heat+(heat/2);
            cout<<fixed<<setprecision(2)<<heat;
        }
        else if(n==3)
        {
             heat=(heat*2);
            cout<<fixed<<setprecision(2)<<heat;
        }
        else
            cout<<"Number of items is more";
}