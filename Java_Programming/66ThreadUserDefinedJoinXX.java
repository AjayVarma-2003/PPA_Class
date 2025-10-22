class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of " + Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinXX
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");

        Demo dObj1 = new Demo();
        Demo dObj2 = new Demo();

        dObj1.setName("First");
        dObj2.setName("Second");

        dObj1.start();
        dObj2.start();

        try                                         // Checked exception
        {
            dObj1.join();
            dObj2.join();
        }
        catch(InterruptedException iObj)
        {

        }

        System.out.println("End of main thread");
    }
}