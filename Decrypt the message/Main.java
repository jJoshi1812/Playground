#include<iostream>
using namespace std;
int main(){
int a,b;
  cin>>a>>b;
  int c=a+b;
  int sum=0;
  for(int i=1;i<c;i++){
  	if(c%i==0){
    	sum=sum+i;
    }
  }
  if (sum==c)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}