package Threding;

class thread1 extends Thread{
    public  void run()
    {
        try {
            for (int i =1;i<15;i++)
            {
                System.out.println("harsh........ "+i);
                sleep(1000);
            }

        }
        catch (Exception e)
        {

        }
    }
}
class thread2 extends Thread {
    public void run() {
        try {
            for (int j = 60; j < 100; j = j + 2) {
                System.out.println(j + "..................Deepak");
                sleep(500);
            }
        } catch (Exception E) {
        }
    }
}



//                          Tread priority