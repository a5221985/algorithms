#include <iostream>
#include <string>

using namespace std;

int main() {
    string str1 = "Alhamdulillah";
    string str2 = "!";

    // copy str1 into str3
    string str3 = str1;
    cout << "str3 : " << str3 << endl;

    // concatenates str1 and str3
    str3 = str1 + str2;
    cout << "str1 + str2 : " << str3 << endl;

    // total length of str3 after concatenation
    cout << "str3.size() : " << str3.size() << endl;

    return 0;
}
