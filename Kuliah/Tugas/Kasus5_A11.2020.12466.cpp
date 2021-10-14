#include <iostream>
using namespace std;

int n,br=1;
int main()

{
    cout<< " Masukkan Angka : ";
    cin>>n;

    while (br<=n)
    {
        for(int i=1; i<=br; i++)
        {

            cout<<i<<' ';
        }
        br++;
        cout<<endl;
    }
    return 0;
}
