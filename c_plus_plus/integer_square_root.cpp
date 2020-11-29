#include <iostream>

using namespace std;

int find_sqrt(int num);
int _sqrt(int num);

int find_sqrt(int num)
{
    if (num < 0) {
        cout << "num must not be negative" << endl;
        return -1;
    }
    if (num < 2)
        return num;
    return _sqrt(num);
}

int _sqrt(int num)
{
    int low = 0;
    int high = num;
    int mid = 0;
    int sqr = 0;
    while (low < high - 1)
    {
        mid = (low + high) >> 1;
        sqr = mid * mid;
        if (sqr == num)
            return mid;
        else if (sqr < num)
            low = mid;
        else
            high = mid; 
    }
    return low;
}

int main(int argc, char** argv)
{
    int num = atoi(argv[1]);
    int sqrt = find_sqrt(num);
    cout << "square root of " << num << " is " << sqrt << endl;
}
