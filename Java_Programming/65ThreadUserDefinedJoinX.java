class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of " + Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinX
{
    public static void main(String A[]) throws InterruptedException
    {
        System.out.println("Inside main thread");

        Demo dObj1 = new Demo();
        Demo dObj2 = new Demo();

        dObj1.setName("First");
        dObj2.setName("Second");

        dObj1.start();
        dObj2.start();

        dObj1.join();
        dObj2.join();

        System.out.println("End of main thread");
    }
}