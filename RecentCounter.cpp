#include <deque>
class RecentCounter {
  deque<int> req;
public:
  RecentCounter() {
    req = {};
  }

  int pint(int t) {
    req.push_back(t);
    while (req.front() < t - 3000) req.pop_front();
    return req.size();
  }
};
