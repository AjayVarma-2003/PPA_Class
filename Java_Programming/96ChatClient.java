import java.io.*;
import java.net.*;

class ChatClient
{
    public static void main(String A[]) throws Exception
    {
        String str = "";
        


        Socket sObj = new Socket("localhost", 5100);
        System.out.println("Client get connected with server successfully ...");

        PrintStream pObj = new PrintStream(sObj.getOutputStream());
        BufferedReader bObj1 = new BufferedReader(new InputStreamReader(sObj.getInputStream()));
        BufferedReader bObj2 = new BufferedReader(new InputStreamReader(System.in));




        System.out.println("Enter message for server : ");
        str = bObj2.readLine();
        pObj.println(str);


        str = bObj1.readLine();
        System.out.println("Server says : " + str);
    }
}