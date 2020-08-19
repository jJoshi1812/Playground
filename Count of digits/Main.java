#include<iostream>
using namespace std;
int main()
{
  int a,count=0;
  cin>>a;
  if (a==0)
    count++;
  while(a!=0){
  	a=a/10;
    count++;
  }
  cout<<count;
}
