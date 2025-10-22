class TablePrinter
{
    synchronized public void PrintTable(int no)
    {
        int i = 0;

        for(i = 1; i <= 10; i++)
        {
            System.out.println("Name : " + Thread.currentThread().getName() + ": " + (no * i));
        }
    }
}

class Demo extends Thread
{   
    public TablePrinter tObj;
    public int no;

    public Demo(TablePrinter t, int n, String name)
    {
        this.tObj = t;
        this.no = n;
        setName(name);
    }

    public void run()
    {
        tObj.PrintTable(no);
    }
}

class ThreadUserDefinedSynchroniseXX
{
    public static void main(String A[])
    {
        System.out.println("Start of main thread");

        TablePrinter tObj = new TablePrinter();

        Demo dObj1 = new Demo(tObj, 5, "First");
        Demo dObj2 = new Demo(tObj, 4, "Second");

        try
        {
            dObj1.start();
            dObj2.start();

            dObj1.join();
            dObj2.join();
        }
        catch (InterruptedException iObj)
        {

        }

        System.out.println("End of main thread.");
    }
}