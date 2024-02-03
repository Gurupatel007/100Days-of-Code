// link to the problem : https://www.codingninjas.com/studio/problems/fa-1-ece_4606261?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

#include <iostream>
using namespace std;
int Maximum(int x, int y)
{
	// Write your code here.
	if(x>y) return x;
	return y;
}
void Swap(int &x, int &y)
{
	// Write your code here.
	int c = x;
	x = y;
	y = c;
}
int main()
{
	int test, a, b, r;
	cin >> test;
	cin >> a >> b;
	switch (test)
	{
	case 1:
		r = Maximum(a, b);
		cout << r;
		break;
	case 2:
		Swap(a, b);
		cout << a << " " << b;
		break;
	default:
		cout << "Invalid test option";
	}
	return 0;
}