import java.io.*;
import java.net.*;

class ChatServer
{
    public static void main(String A[]) throws Exception
    {
        String str1 = "";
        String str2 = "";

        ServerSocket ssObj = new ServerSocket(5100);
        System.out.println("Server is waiting at port 5100 ...");

        Socket sObj = ssObj.accept();
        System.out.println("Client request gets accepted successfully ...");

        PrintStream pObj = new PrintStream(sObj.getOutputStream());
        BufferedReader bObj1 = new BufferedReader(new InputStreamReader(sObj.getInputStream()));
        BufferedReader bObj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("----------------------------------------------------------------------");
        System.out.println("-------------------------Marvellous Server ---------------------------");
        System.out.println("----------------------------------------------------------------------");

        while(true)
        {
            str1 = bObj1.readLine();
            System.out.println("Client says : " + str1);

            if(str1.equals("end"))
            {
                break;
            }

            System.out.println("Enter message for client : ");
            str2 = bObj2.readLine();
            pObj.println(str2);
        }

        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");
        
    }
}