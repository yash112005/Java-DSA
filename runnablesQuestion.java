//class Balances extends Thread{
//    static int balance = 1000;
//    int withdraw;
//    public Balances(int withdraw){
//       this.withdraw = withdraw;
//    }
//    public synchronized static void withdrawMoney(int amount) {
//        if (balance >= amount) {
//            System.out.println(Thread.currentThread().getName() + " is going to withdraw: " + amount);
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {}
//
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + " remaining balance: " + balance);
//        } else {
//            System.out.println(Thread.currentThread().getName() + " - Sorry, not enough money.");
//        }
//    }
//    public void run() {
//        withdrawMoney(withdraw);
//    }
//}
//public class runnablesQuestion {
//    public static void main(String[] args) {
//        Balances b = new Balances(800);
//        Balances b1 = new Balances(500);
//        b.start();
//        b1.start();
//    }
//}


// using wait and notiffy
class SimpleWaitsNotify {
    private boolean issignal = false;

    public synchronized void waitForSignal() {
        issignal = true;
        System.out.println("Producer Sending signal...");
        notifyAll();
    }

    public synchronized void waitForConsumer() {
        while (!issignal) {
            try {
                System.out.println("Consumer Waiting for signal...");
                wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Consumer Received signal!");
    }
}

class Balances extends Thread {
    private static int balance = 1000;
    private int withdraw;

    public Balances(int withdraw) {
        this.withdraw = withdraw;
    }

    public synchronized void withdrawMoney() {
        if (balance >= withdraw) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw: " + withdraw);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Transaction interrupted.");
            }

            balance -= withdraw;
            System.out.println(Thread.currentThread().getName() + " remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Sorry, not enough money.");
        }
    }


}

public class runnablesQuestion {
    public static void main(String[] args) {
        SimpleWaitNotify obj = new SimpleWaitNotify();
        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(5000);
                obj.waitForSignal();

            } catch (InterruptedException e) {

            }
        });

        Thread consumer = new Thread(obj::waitForConsumer);

        consumer.start();
        producer.start();
        Balances b = new Balances(800);
        Balances b1 = new Balances(500);
        b.start();
        b1.start();
    }
}




