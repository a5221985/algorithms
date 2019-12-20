#include <stdio.h>
#include <thread>

using namespace std;

void CallFromThread(int thread_id)
{
    printf("Thread ID: %d\n", thread_id);
}

int main(int argc, char* argv[])
{
    constexpr int kNumThreads = 5;
    thread t[kNumThreads];
    
    // Launch a group of threads
    for (int i = 0; i < kNumThreads; i++)
        t[i] = thread(CallFromThread, i);

    printf("Launched from the main\n");

    //Join the threads with the main method
    for (int i = 0; i < kNumThreads; i++)
        t[i].join();

    return 0;
}
