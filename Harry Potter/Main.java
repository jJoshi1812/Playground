#include<iostream>
using namespace std;
int main()
{
  int a,c=0,l;
  cin>>a;
  int f=a%10;
  while(a!=0){
  	l=a%10;
    c+=1;
    a=a/10;
  }
  if (c<4){
    l=0;}
  int ans=l+f;
  cout<<ans;
}