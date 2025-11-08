
import javax.swing.*;
import java.awt.event.*;

class MarvellousLoginFrame implements ActionListener
{
    JFrame fObj;
    JButton bObj;
    JTextField tObj;
    JPasswordField pObj;
    JLabel lblUsername, lblPassword, lblResult;

    public MarvellousLoginFrame(String title, int width, int height)
    {
        fObj = new JFrame(title);

        fObj.setSize(width, height);

        lblUsername = new JLabel("Username");
        lblUsername.setBounds(50, 50, 100, 30);

        tObj = new JTextField();
        tObj.setBounds(150, 50, 150, 30);

        lblPassword = new JLabel("Password");
        lblPassword.setBounds(50, 100, 100, 30);

        pObj = new JPasswordField();
        pObj.setBounds(150, 100, 150, 30);

        lblResult = new JLabel("Hello");
        lblResult.setBounds(150, 150, 100, 30);

        bObj = new JButton("Submit");
        bObj.setBounds(100, 200, 100, 30);

        fObj.add(bObj);
        fObj.add(tObj);
        fObj.add(pObj);
        fObj.add(lblUsername);
        fObj.add(lblPassword);
        fObj.add(lblResult);

        bObj.addActionListener(this);
        fObj.setLayout(null);
        fObj.setVisible(true);
        fObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aObj)
    {

    }
}

class LoginFrame3
{
    public static void main(String A[])
    {
        MarvellousLoginFrame mObj = new MarvellousLoginFrame("Login", 400, 300);
    }
}