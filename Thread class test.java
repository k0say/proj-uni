class MyThread extends Thread    {
    static int counter = 0;
    static int counter2 = counter;
    
    public void increment() {
        counter++;
}
    
    public void run()   {
        increment();
        System.out.println("X: "+counter+" Y: "+(counter*(-1)));
    }
}

public class test {
    public static void main (String[] args) throws InterruptedException {
        for (int i = 0;i < 10 ; i++)    {
            new MyThread().start();
            //MyThread.counter++;
            Thread.sleep(100);

        } 
    }
}
