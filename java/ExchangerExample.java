import java.util.concurrent.*;

public class ExchangerExample {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger();
        StringConstructor stringConstructor = new StringConstructor(exchanger);
        StringProcessor stringProcessor = new StringProcessor(exchanger);
        Thread stringConstructorThread = new Thread(() -> stringConstructor.construct());
        Thread stringProcessorThread = new Thread(() -> stringProcessor.process());

        stringConstructorThread.start();
        stringProcessorThread.start();

        stringConstructorThread.join();
        stringProcessorThread.join();
    }
}

public class StringConstructor {
    private Exchanger<String> exchanger;

    public StringConstructor(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    public void construct() {
        StringBuilder sb = new StringBuilder();
        for (char c = 'a', count = 0; c <= 'z'; c++, count++) {
            sb.append(c);
            if (count % 3 == 0) {
                try {
                    exchanger.exchange(sb.toString());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
	try {
	    exchanger.exchange(sb.toString());
	    exchanger.exchange("EOS");
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }
}

public class StringProcessor {
    private Exchanger<String> exchanger;

    public StringProcessor(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    public void process() {
        String str = "";

        try {
            str = exchanger.exchange("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (str != "EOS") {
            System.out.println(str);
	    try {
		str = exchanger.exchange("");
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
        }
    }
}
