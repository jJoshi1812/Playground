#include <iostream>
using namespace std;

int main() 
{
   int a,b,c,ans;
  cout<<"Enter first number : ";
  cin>>a;
  cout<<"Enter second number : ";
  cin>>b;
  cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>c;
  switch (c){
    case 1: ans=a+b;
    cout<<ans;
    break;
    case 2: ans=a-b;
    cout<<ans;
    break;
    case 3: ans=a*b;
    cout<<ans;
    break;
    case 4: ans=a/b;
    cout<<ans;
    break;
    case 5: ans=a%b;
    cout<<ans;
    break;
    default: cout<<"Invalid operation";
    break;
  }
    return 0;
}