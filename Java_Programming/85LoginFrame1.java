
import javax.swing.*;
import java.awt.event.*;

class MarvellousLoginFrame
{
    public MarvellousLoginFrame()
    {
        JFrame fObj = new JFrame("Login Portal");

        fObj.setSize(400, 300);
        fObj.setVisible(true);
        fObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class LoginFrame1
{
    public static void main(String A[])
    {
        MarvellousLoginFrame mObj = new MarvellousLoginFrame();
    }
}