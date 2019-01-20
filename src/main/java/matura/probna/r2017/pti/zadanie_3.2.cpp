#include <iostream>
#include <cmath>
using namespace std;

bool sprawdz (int n)
{
 double pom=sqrt(n);
 for (int i=2;i<=pom;i++)
  if (n%i==0) return false;
 return true;
}

main()
{
 int n;
 cin>>n;
 if (sprawdz(n)) cout<<"TAK"<<endl;
 else cout<<"NIE"<<endl;
 return 0;
}
