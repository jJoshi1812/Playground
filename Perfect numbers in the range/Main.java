#include <iostream>
using namespace std;

int main() 
{
   int a,b,c=0,d=0;
  cin>>a>>b;
  for(int i=a;i<=b;i++){
    c=0;
  	for (int j=1;j<i;j++){
    	if (i%j==0){
        	c+=j;
        }
    }
    if (c==i)
      cout<<i<<" ";
  }
    return 0;
}