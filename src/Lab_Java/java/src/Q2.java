//public class Q2 implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("hello");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        Q2 t1 = new Q2();
//        t1.();
//    }
//}









class run1{
    void fun(){
        System.out.println("Hello1");
    }
}

class run2 {
    void fun(){
        System.out.println("Hello2");
    }
}
public class Q2 implements Runnable{
    public void run(){
        for (int i =1;i<=10;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }


    public static void main(String[] args) {
        Q2 obj = new Q2();
        Thread th = new Thread(obj);
        th.start();
    }



}


