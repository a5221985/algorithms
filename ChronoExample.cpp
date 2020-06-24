#include <iostream>

using namespace std;
using namespace std::chrono;

int main() {
    for (auto m = local_days{January/9/2019}; year_month_day{m}.year() < 2020y; m += weeks{2}) {
        zoned_time_london{"Europe/London", m + 18h};
        cout << london << '\n';
        cout << zoned_time{"America/New_York", london} << '\n';
        cout << zoned_time{"Etc/UTC", london} << '\n';
        cout << '\n';
    }
}
