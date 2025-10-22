class TablePrinter
{
    public void PrintTable(int no)
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
    public void run()
    {

    }
}

class ThreadUserDefinedSynchronise
{
    public static void main(String A[])
    {
        TablePrinter tObj = new TablePrinter();

        tObj.PrintTable(5);
        tObj.PrintTable(4);
    }
}