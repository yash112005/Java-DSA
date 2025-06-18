class DownloadFile extends Thread{
    private String filename;
    public DownloadFile(String filename){
        this.filename = filename;
    }
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println(filename+"downloading..."+(i*20)+"%");
            try {
                Thread.sleep(1000);

            } catch (Exception e) {

            }

        }
        System.out.println(filename + "done");
    }
}
//class DownloadFile extends Thread{
//    public static void file(String file){
//        for(int i = 1;i<=5;i++){
//            System.out.println(file+"downloading..."+(i*20)+"%");
//            try {
//                Thread.sleep(5000);
//
//            } catch (Exception e) {
//
//            }
//
//        }
//        System.out.println(file + "done");
//    }
//}

//class Mythread extends Thread{
//    public void run(){
//        System.out.println("thread is running......");
//        try {
//            Thread.sleep(5000);
//

//        } catch (Exception e) {
//
//        }
//        System.out.println("hiii");
//    }
//}
public class threads {
    public static void main(String[] args) {
//        Mythread t1 = new Mythread();
//        t1.start();
//        System.out.println("hello");

        // without thread
//        DownloadFile d = new DownloadFile();
//        d.file("file A");
//        d.file("file B");

        // with thread
        DownloadFile file1 = new DownloadFile("file 1");
        DownloadFile file2 = new DownloadFile("file 2");
        file1.start();
        file2.start();





    }
}
