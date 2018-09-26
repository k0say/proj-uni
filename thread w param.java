class MyThread implements Runnable    {
    static int counter = 0;
    static int counter2 = counter;
    int mamt;
    
    public MyThread(int x)  {
        this.mamt = x;
    }
    
    public void increment() {
        counter++;
}
    
    public void run()   {
        increment();
        System.out.println("X =" + mamt + " + " + counter + " = "+(mamt+counter));
        
    }
}

public class test {
    public static void main (String[] args) throws InterruptedException {
        for (int i = 0;i < 10 ; i++)    {
            Thread asd = new Thread(new MyThread(5));
            asd.start();
            //MyThread.counter++;
            Thread.sleep(100);

        } 
    }
}
