#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> v = {4, 2, 7, 9, 1, 0, 3, 8, 6, 5};
    sort(v.begin(), v.end());
    for (auto i = v.begin(); i != v.end(); i++)
        cout << *i << " ";
    cout << endl << endl;
    v.push_back(11);
    v.push_back(0);
    v.push_back(23);
    v.push_back(12);
    sort(v.begin(), v.end());
    for (auto i = v.begin(); i != v.end(); i++)
        cout << *i << " ";
    cout << endl;
}
