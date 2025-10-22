class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method");
    }
}

class ThreadUserDefined2
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");

        Demo dObj1 = new Demo();
        Demo dObj2 = new Demo();

        dObj1.start();
        dObj2.start();

        System.out.println("End of main thread");
    }
}