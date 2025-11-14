import java.io.*;
import java.net.*;

class ChatServer
{
    public static void main(String A[]) throws Exception
    {
        String str = "";

        ServerSocket ssObj = new ServerSocket(5100);
        System.out.println("Server is waiting at port 5100 ...");

        Socket sObj = ssObj.accept();
        System.out.println("Client request gets accepted successfully ...");

        PrintStream pObj = new PrintStream(sObj.getOutputStream());
        BufferedReader bObj1 = new BufferedReader(new InputStreamReader(sObj.getInputStream()));
        BufferedReader bObj2 = new BufferedReader(new InputStreamReader(System.in));




        str = bObj1.readLine();
        System.out.println("Client says : " + str);
        System.out.println("Enter message for client : ");
        str = bObj2.readLine();
        pObj.println(str);
        
    }
}