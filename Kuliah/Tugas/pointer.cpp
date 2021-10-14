#include<iostream>
using namespace std;

void passbyref(int &x)
{
    x =5;
    cout<< " PassByReffrence" << endl;
    cout<< " Alamat memori saat ini :"<< &x <<endl;
    cout<< " Value saat ini : "<< x <<endl;
}

void passbyval(int x)
{
    x =5;
    cout<< " PassByValue" << endl;
    cout<< " Alamat memori saat ini :"<< &x <<endl;
    cout<< " Value saat ini : "<< x <<endl;
}
int main()
{
    int a = 0;
    cout<< " Alamat memori a :"<< &a <<endl;
    cout<< " Value a :"<< a <<endl;
    passbyref(a);
    cout<< " Value a sekarang :"<< a <<endl;

    int b = 0;
    cout<< " \nAlamat memori b :"<< &a <<endl;
    cout<< " Value b :"<< a <<endl;
    passbyval(b);
    cout<< " Value b sekarang :"<< a <<endl;

    return 0;
}
