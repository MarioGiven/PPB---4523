#include<iostream>
using namespace std;

int main()
{
    int angka;

    cout<<" Masukkan Angka : ";
    cin>>angka;

    for(int i=1;i<=angka;++i)
    {
        for(int j=1;j<=i;++j)
        {
          cout<<j<<" ";
        }
        cout<<"\n";
    }
    return 0;
}
