
import javax.swing.*;
import java.awt.event.*;

class MarvellousLoginFrame
{
    public MarvellousLoginFrame(String title, int width, int height)
    {
        JFrame fObj = new JFrame(title);

        fObj.setSize(width, height);
        fObj.setVisible(true);
        fObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class LoginFrame2
{
    public static void main(String A[])
    {
        MarvellousLoginFrame mObj = new MarvellousLoginFrame("Login", 600, 400);
    }
}