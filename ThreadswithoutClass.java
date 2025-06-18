public class ThreadswithoutClass {
    public static void main(String[] args) {
        System.out.println("hello");
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
            System.out.println("hiii");

        });
        Thread t2 = new Thread(()->{
            System.out.println("hi");
        });
        t1.start();
        t2.start();
    }
}
