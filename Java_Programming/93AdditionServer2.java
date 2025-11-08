import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer2
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server is running ...");
        ServerSocket ssObj = new ServerSocket(2100);
        System.out.println("Server is waiting at port number 2100 ...");
        Socket sObj = ssObj.accept();
        System.out.println("Client request arrives and accepted by the server ...");

        DataInputStream diObj = new DataInputStream(sObj.getInputStream());
        DataOutputStream doObj = new DataOutputStream(sObj.getOutputStream());
    }
}