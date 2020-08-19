#include<iostream>
using namespace std;
int main()
{
  int a,c=0;
  cin>>a;
  if(a<=200)
    c=a*0.5;
  else if (a<=400)
    c=a*0.65+100;
  else if(a<=600)
    c=a*0.80+200;
   else
     c=a*1.25+425;
  cout<<"Rs."<<c;
  }