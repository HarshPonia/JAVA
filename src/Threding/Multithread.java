package Threding;


//    class thred extends Thread{
//        //    @Override
//        public void run(){
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Hello"+i);
//            }
//        }
//    }
//    public class Multithread {
//        public static void main(String[] args) {
//            thred obj = new thred();
//            obj.start();
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Main"+i);
//            }
//        }
//    }


//class Multi extends Thread{
//    public void run(){
//        System.out.println("thread is running...");
//    }
//    public static void main(String args[]){
//        Multi t1=new Multi();
//        t1.start();
//    }
//}


    class  Multi3 implements Runnable{
public void run(){
        System.out.println("thread is running...");
        }

public static void main(String args[]){
        Multi3 m1=new Multi3();
        Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)
        t1.start();
        }
        }