import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient3
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is running ...");


        Socket sObj = new Socket("localhost", 2100);
        System.out.println("Server successfully connected ...");

        DataInputStream diObj = new DataInputStream(sObj.getInputStream());
        DataOutputStream doObj = new DataOutputStream(sObj.getOutputStream());

        int no1 = 11, no2 = 10, result = 0;

        doObj.writeInt(no1);
        doObj.writeInt(no2);



        result = diObj.readInt();
        System.out.println("Addition is : " + result);

        sObj.close();

        System.out.println("Client application terminated ...");
    }
}