import queue

def bfs(g, s):
    visited = []
    prev = []
    for i in range(0, len(g)):
        visited.append(False)
        prev.append(None)

    Q = queue.Queue()
    visited[s] = True
    print(s)
    Q.put(s)

    while not Q.empty():
        node = Q.get()
        neighbors = g[node]
        for next in neighbors:
            if not visited[next]:
                visited[next] = True
                Q.put(next)
                print(next)
                prev[next] = node

    return prev


if __name__ == "__main__":
    g = {}
    g[0] = [1, 2, 3, 4];
    g[1] = [0, 2, 3, 4];
    g[2] = [0, 1, 3, 4];
    g[3] = [0, 1, 2, 4];
    g[4] = [0, 1, 2, 3];
    prev = bfs(g, 0)

    #for i in range(0, len(prev)):
    #    print(prev[i])
