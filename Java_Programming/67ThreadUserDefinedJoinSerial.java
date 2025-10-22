class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of " + Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinSerial
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");

        Demo dObj1 = new Demo();
        Demo dObj2 = new Demo();

        dObj1.setName("First");
        dObj2.setName("Second");

        try                                         // Checked exception
        {
            dObj1.start();
            dObj1.join();
            System.out.println("End of first thread");

            dObj2.start();
            dObj2.join();
            System.out.println("End of second thread");
        }
        catch(InterruptedException iObj)
        {

        }

        System.out.println("End of main thread");
    }
}