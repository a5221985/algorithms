#include <iostream>

using namespace std;

bool find_sqrt(int num, int* sqrt);
bool _sqrt(int num, int* sqrt);

bool find_sqrt(int num, int* sqrt)
{
    if (num < 0) {
        cout << "num must not be negative" << endl;
        return false;
    }
    if (num < 2) {
        *sqrt = num;
        return true;
    }
    _sqrt(num, sqrt);
    return true;
}

bool _sqrt(int num, int* sqrt)
{
    int low = 0;
    int high = num;
    int mid = 0;
    int sqr = 0;
    while (low < high - 1)
    {
        mid = (low + high) >> 1;
        sqr = mid * mid;
        if (sqr == num) {
            *sqrt = mid;
            return true;
        }
        else if (sqr < num)
            low = mid;
        else
            high = mid; 
    }
    *sqrt = low;
    return true;
}

int main(int argc, char** argv)
{
    int num = atoi(argv[1]);
    int sqrt = 0;
    if (find_sqrt(num, &sqrt))
        cout << "square root of " << num << " is " << sqrt << endl;
}
