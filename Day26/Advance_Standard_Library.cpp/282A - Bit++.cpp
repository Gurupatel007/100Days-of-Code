#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;

    int x = 0;
    string statement;

    for (int i = 0; i < n; i++)
    {
        cin >> statement;

        if (statement.find("++") != string::npos)
        {
            x++;
        }
        else
        {
            x--;
        }
    }

    cout << x << endl;

    return 0;
}
