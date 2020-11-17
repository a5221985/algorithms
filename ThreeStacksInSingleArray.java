public class ThreeStacksInSingleArray {
    private int[] tops;
    private StackNode[] stack;
    private int size;
    private int numOfStacks;
    private int emptyCellIndex;

    public void init(int numOfStacks, int size) {
        tops = new int [numOfStacks];
        for (int i = 0; i < tops.length; i++)
            tops[i] = -1;
        stack = new StackNode [size];
        for (int i = 0; i < size; i++)
            stack[i] = new StackNode();
        this.size = size;
        this.numOfStacks = numOfStacks;
        int maxIndex = size - 1;
        for (int i = 0; i < maxIndex; i++)
            stack[i].index = i + 1;
        stack[maxIndex].index = -1;
    }

    public void push(int stackId, int val) {
        if (stack[emptyCellIndex].index == -1 || stackId < 0 || stackId > numOfStacks)
            throw new RuntimeException("Stack is full!");
        int top = tops[stackId];
        tops[stackId] = emptyCellIndex;
        emptyCellIndex = stack[emptyCellIndex].index;
        stack[tops[stackId]].val = val;
        stack[tops[stackId]].index = top;
    }

    public int pop(int stackId) {
        if (tops[stackId] == -1)
            throw new RuntimeException("Stack is empty");
        int val = stack[tops[stackId]].val;
        stack[tops[stackId]].val = 0;
        int top = tops[stackId];
        tops[stackId] = stack[top].index;
        stack[top].index = emptyCellIndex;
        emptyCellIndex = top;
        return val;
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < size; i++)
            System.out.println(i + ": val: " + stack[i].val + ", index: " + stack[i].index);
        System.out.println();
    }

    public static void main(String[] args) {
        ThreeStacksInSingleArray tsisa = new ThreeStacksInSingleArray();
        int size = 100;
        int numOfStacks = 3;
        tsisa.init(numOfStacks, size);
        tsisa.push(0, 11);
        tsisa.push(0, 12);
        tsisa.push(1, 21);
        tsisa.push(0, 13);
        tsisa.push(2, 31);
        tsisa.push(1, 22);
        tsisa.push(2, 32);
        tsisa.push(2, 33);

        tsisa.print();

        System.out.println("Stack 0: " + tsisa.pop(0));
        System.out.println("Stack 0: " + tsisa.pop(0));
        System.out.println("Stack 0: " + tsisa.pop(0));
        System.out.println("Stack 1: " + tsisa.pop(1));
        System.out.println("Stack 1: " + tsisa.pop(1));
        System.out.println("Stack 2: " + tsisa.pop(2));
        System.out.println("Stack 2: " + tsisa.pop(2));
        System.out.println("Stack 2: " + tsisa.pop(2));

        tsisa.push(0, 14);
        tsisa.push(0, 15);
        tsisa.push(1, 23);
        tsisa.push(0, 16);

        tsisa.print();
 
        System.out.println("Stack 0: " + tsisa.pop(0));
        System.out.println("Stack 0: " + tsisa.pop(0));
        System.out.println("Stack 0: " + tsisa.pop(0));
        System.out.println("Stack 1: " + tsisa.pop(1));

        tsisa.print();
       
        int stackId = 0; 
        for (int i = 0; i < 50; i++) {
            stackId = (int) (Math.random() * 3);
            tsisa.push(stackId, stackId * 10 + i);
        } 


        tsisa.print();       
    }
}

class StackNode {
    int val;
    int index;
}
