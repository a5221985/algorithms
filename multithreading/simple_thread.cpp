#include <stdio.h>
#include <thread>

using namespace std;

void CallFromThread()
{
    printf("Alhamdulillah\n");
}

int main(int argc, char* argv[])
{
    // Launch a new thread
    thread t1(CallFromThread);
    // Join the thread with the main thread
    t1.join();
    return 0;
}
