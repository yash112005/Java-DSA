//class MyRunnable implements Runnable{
//    private String filename;
//    public MyRunnable(String filename){
//        this.filename = filename;
//    }
//    public void run(){
//
//        for(int i = 1;i<=5;i++){
//            System.out.println(filename+"downloading..."+(i*20)+"%");
//            try {
//                Thread.sleep(1000);
//
//            } catch (Exception e) {
//
//            }
//
//        }
//        System.out.println(filename + "done");
//    }
//}


class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread using runnable interface......");
    }
}


public class Runnables {
    public static void main(String[] args) {
        // using join function
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        try {
            t.join();
        } catch (Exception e) {

        }
        for(int i=1;i<5;i++){
            System.out.println(i);
        }
//        System.out.println("main thread is running....");

        // running two files parallel
//        MyRunnable m = new MyRunnable("File 1");
//        MyRunnable m1 = new MyRunnable("File 2");
//        Thread t1 = new Thread(m);
//        Thread t2 = new Thread(m1);
//
//        t1.start();
//        t2.start();



    }
}
