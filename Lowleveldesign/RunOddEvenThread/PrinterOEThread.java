package Lowleveldesign.RunOddEvenThread;

public class PrinterOEThread implements Runnable{

    static int counter=10;
    int reminder;

    static final Object lock= new Object();

    public PrinterOEThread(int reminder) {
        this.reminder = reminder;
    }

    void print(){
        System.out.println(Thread.currentThread().getName()+"  "+" "+counter--);
    }

    @Override
    public void run() {

        for (int i =1; i<=5; i++) {
            synchronized (lock){
                while (counter%2!=reminder)
                try {
                   lock.wait();
                   Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                print();
                lock.notifyAll();
            }
        }

    }
    public static void main(String[] args) {
        PrinterOEThread odd=new PrinterOEThread(1);
        PrinterOEThread even=new PrinterOEThread(0);


        Thread threadOdd= new Thread(odd,"oddthread");
        Thread threadEven= new Thread(even,"eventhread");

        threadOdd.start();
        threadEven.start();


    }
}
