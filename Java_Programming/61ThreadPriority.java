class ThreadPriority
{
    public static void main(String A[])
    {
        System.out.println("Inside main method.");

        Thread tObj = Thread.currentThread();
        String name = tObj.getName();
        
        System.out.println("Name of current thread is : " + name);
        
        int priority = tObj.getPriority();
        System.out.println("Priority of current thread is : " + priority);
        
        tObj.setPriority(10);
        
        priority = tObj.getPriority();
        System.out.println("Priority of current thread is : " + priority);        
    }
}