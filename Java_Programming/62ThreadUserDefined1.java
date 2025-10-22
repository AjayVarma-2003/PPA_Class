class Demo extends Thread
{
    public void run()                       // Callback method which will gets automatically called when thread gets scheduled
    {
        System.out.println("Inside run method");
    }
}

class ThreadUserDefined1
{
    public static void main(String A[])
    {
        Demo dObj1 = new Demo();
        dObj1.start();                      // calls indirectly to run method. Makes the thread in runnable state.
    }
}