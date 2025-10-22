class ThreadDemo2
{
    public static void main(String A[])
    {
        System.out.println("Inside main method.");
        Thread tObj = Thread.currentThread();
        String name = tObj.getName();
        System.out.println("Name of current thread is : "+ name);
    }
}