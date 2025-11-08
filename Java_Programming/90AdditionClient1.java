import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient1
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is running ...");


        Socket sObj = new Socket("localhost", 2100);
        System.out.println("Server successfully connected ...");
    }
}