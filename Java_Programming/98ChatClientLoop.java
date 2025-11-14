import java.io.*;
import java.net.*;

class ChatClient
{
    public static void main(String A[]) throws Exception
    {
        String str1 = "";
        String str2 = "";
        


        Socket sObj = new Socket("localhost", 5100);
        System.out.println("Client get connected with server successfully ...");

        PrintStream pObj = new PrintStream(sObj.getOutputStream());
        BufferedReader bObj1 = new BufferedReader(new InputStreamReader(sObj.getInputStream()));
        BufferedReader bObj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("----------------------------------------------------------------------");
        System.out.println("-------------------------Marvellous Client ---------------------------");
        System.out.println("----------------------------------------------------------------------");

        
        while(true)
        {
            System.out.println("Enter message for server : ");
            str1 = bObj2.readLine().toLowerCase();
            pObj.println(str1);

            if(str1.equals("end"))
            {
                break;
            }


            str2 = bObj1.readLine().toLowerCase();
            System.out.println("Server says : " + str2);
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");
    }
}