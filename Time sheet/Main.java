#include<iostream>
using namespace std;
int main()
{
        int sun,mon,tue,wed,thu,fri,sat;
        cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
        int tot=sun+mon+tue+wed+thu+fri+sat;
        int bas_sal=tot*100;
        if(tot-sun-sat>40)
        bas_sal=bas_sal+((tot-40)*25);
        if(sun>0){
        bas_sal=bas_sal+(sun*50);
        if(sun>=8)
        bas_sal=bas_sal+((sun-8)*15);
        }
        if(mon>=8)
        bas_sal=bas_sal+((mon-8)*15);
        if(tue>=8)
        bas_sal=bas_sal+((tue-8)*15);
        if(wed>=8)
        bas_sal=bas_sal+((wed-8)*15);
        if(thu>=8)
        bas_sal=bas_sal+((thu-8)*15);
        if(fri>=8)
        bas_sal=bas_sal+((fri-8)*15);
        if(sat>0)
        {
        bas_sal=bas_sal+(sat*25);
        if(sat>=8)
        bas_sal=bas_sal+((sat-8)*15);
        }
        cout<<(bas_sal);
}