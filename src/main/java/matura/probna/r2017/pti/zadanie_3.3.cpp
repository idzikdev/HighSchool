#include <iostream>
using namespace std;

bool sprawdz(int n, int T[])
{
 int j=0, m=n;
 for (int i=2;i<=n/6&&j<3;i++)
 {
  if (m%i==0&&(m/i)%i==0) return false;
  if (m%i==0)
  {
   T[j++]=i;
   m/=i;
  }
 }
 if (n==T[0]*T[1]*T[2]) return true;
 return false;
}

main()
{
  int n, T[10]={0};
  cin>>n;
  if (sprawdz(n,T)) cout<<T[0]<<"\t"<<T[1]<<"\t"<<T[2]<<endl;
  else cout<<"NIE"<<endl;
  return 0;
}
