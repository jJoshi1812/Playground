#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int total=b*75+c*30;
  if (total<=a)
    cout<<"Boat is stable";
   else
     cout<<"Boat will drow";
}