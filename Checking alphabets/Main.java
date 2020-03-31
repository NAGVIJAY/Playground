#include<iostream>
using namespace std;
int main()
{
  char alpha;
  cin>>alpha;
  if(alpha== 'a'|| alpha== 'e'|| alpha== 'i'|| alpha== 'o'||alpha== 'u'||alpha== 'A'||alpha== 'E'||alpha== 'I'||alpha== 'O'||alpha== 'U')
  {
    cout<<"Vowel";
  }
  else if((alpha>64 && alpha <91) ||(alpha>96 && alpha<<122))
  {
    cout<<"Consonant";
  }
  else
  {
cout<<"Not an alphabet";
  }
  
  //Type your code here.
}