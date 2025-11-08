import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient2
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is running ...");


        Socket sObj = new Socket("localhost", 2100);
        System.out.println("Server successfully connected ...");

        DataInputStream diObj = new DataInputStream(sObj.getInputStream());
        DataOutputStream doObj = new DataOutputStream(sObj.getOutputStream());
    }
}