#include<iostream>
using namespace std;
   
int recSearch(int arr[], int l,  
              int r, int x) 
{ 
    if (r < l) 
        return -1; 
    if (arr[l] == x) 
        return l; 
    if (arr[r] == x) 
        return r; 
    return recSearch(arr, l + 1,  
                          r - 1, x); 
} 
  
// Driver Code 
int main() 
{ 
  int num;
  cin>>num;
  int arr[num];
  for(int i=0;i<num;i++)
  {
    cin>>arr[i];
  }
    int x; 
  cin>>x;
      int n = sizeof(arr) / sizeof(arr[0]); 
    int index = recSearch(arr, 0, n - 1, x); 
    if (index != -1) 
    cout << x; 
    else
        cout << "The number is not present in the list" ; 
    return 0; 
} 