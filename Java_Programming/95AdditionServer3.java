import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer3
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

        int no1 = 0, no2 = 0, result = 0;

        no1 = diObj.readInt();
        no2 = diObj.readInt();

        result = no1 + no2;

        doObj.writeInt(result);


        sObj.close();
        ssObj.close();
        System.out.println("Server application terminated ...");
    }
}