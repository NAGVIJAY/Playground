#include <bits/stdc++.h> 
using namespace std; 
void reverseStr(string& str) 
{ 
    int n = str.length(); 
    for (int i = 0; i < n / 2; i++) 
        swap(str[i], str[n - i - 1]); 
} 
int main() 
{ 
    string str;
  getline(cin, str);
    reverseStr(str); 
    cout <<"The reversed String is "<< str<<"."; 
    return 0; 
} 