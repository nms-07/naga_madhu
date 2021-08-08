package revature_programs;

public class Producer_consumer {
    public static final String EOF = "EOF";
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();

        Thread producerThread = new Thread(new Producer(buffer));
        producerThread.setName("producerThread");

        Thread consumerThread1 = new Thread(new Consumer(buffer));
        consumerThread1.setName("consumerThread1");

        Thread consumerThread2 = new Thread(new Consumer(buffer));
        consumerThread2.setName("consumerThread2");

        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}
class Producer implements Runnable {
    private List<String> buffer;

    public Producer(List<String> buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        String numbers[] = {"1", "2", "3"};
        for (String number : numbers) {
            synchronized (buffer) {
                buffer.add(number);
                try {
                    Random random = new Random();
                    Thread.sleep(random.nextInt(2000));
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
            }
            System.out.println(Thread.currentThread().getName() + " added " + number);
        }
        System.out.println(Thread.currentThread().getName() + " added " + Main.EOF);
        synchronized (buffer) {
            buffer.add(Main.EOF);
        }
    }
}

class Consumer implements Runnable {
    private List<String> buffer;

    public Consumer(List<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (buffer) {
                if (buffer.isEmpty()) {
                    continue;
                }
                if (buffer.get(0).equals(Main.EOF)) {
                    System.out.println(Thread.currentThread().getName() + " exiting.");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + " removed " + buffer.remove(0));
                    try {
                        Random random = new Random();
                        Thread.sleep(random.nextInt(2000));
                    } catch (InterruptedException e) {
                        System.out.println(Thread.currentThread().getName() + " interrupted.");
                    }
                }
            }
        }
    }
}