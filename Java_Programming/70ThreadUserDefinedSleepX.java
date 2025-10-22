// Code to demonstrate thread scheduling.

class Demo extends Thread
{
    public void run()
    {
        int i = 0;

        try
        {
            for(i = 1; i <= 5; i++)
            {
                Thread.sleep(1000);

                System.out.println("Inside run method of " + Thread.currentThread().getName());
            }
        }
        catch(InterruptedException iObj)
        {
            
        }
    }
}

class ThreadUserDefinedSleepX
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");

        Demo dObj1 = new Demo();
        Demo dObj2 = new Demo();

        dObj1.setName("First");
        dObj2.setName("Second");

        try
        {
            dObj1.start();
            dObj2.start();
            
            dObj2.join();
            dObj1.join();
        }
        catch(InterruptedException iObj)
        {

        }

        System.out.println("End of main thread");
    }
}