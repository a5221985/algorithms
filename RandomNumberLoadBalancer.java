public class RandomNumberLoadBalancer {
    public int[] generateStatistics(int serverNum, int requestsNum) {
        int[] statistics = new int [serverNum];
        for (int i = 0; i < requestsNum; i++) {
          int index = (int) (Math.random() * serverNum);
          statistics[index] = statistics[index] + 1;
          print(statistics);
        }
        return statistics;
    }

    public void print(int[] statistics) {
        for (int i = 0; i < statistics.length; i++)
            System.out.print(statistics[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        RandomNumberLoadBalancer rnlb = new RandomNumberLoadBalancer();
        int serverNum = 5;
        int requestsNum = 500000000;
        int[] statistics = rnlb.generateStatistics(serverNum, requestsNum);
        rnlb.print(statistics);
    }
}
