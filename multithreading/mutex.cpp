#include <stdio.h>
#include <thread>

using namespace std;

mutex m;
int i = 0;
void MakeACallFromPhoneBooth()
{
    m.lock();
    printf("%d Hello Wife\n", i++);
    m.unlock();
}

int main(int argc, char* argv[])
{
    thread man1(MakeACallFromPhoneBooth);
    thread man2(MakeACallFromPhoneBooth);
    thread man3(MakeACallFromPhoneBooth);
    man1.join();
    man2.join();
    man3.join();
    return 0;
}
