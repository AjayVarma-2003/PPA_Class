
import java.awt.event.*;
import javax.swing.*;

class MarvellousListener implements ActionListener
{
    public void actionPerformed(ActionEvent aObj)
    {
        System.out.println("Button clicked");
    }
}

class EventHandlingSeparateClassX
{
    public static void main(String A[])
    {
        JFrame fObj = new JFrame("PPA");
        JButton bObj = new JButton("Ok");

        bObj.setBounds(450, 300, 100, 50);

        MarvellousListener mObj = new MarvellousListener();
        bObj.addActionListener(mObj);

        fObj.add(bObj);
        
        fObj.setSize(600, 400);
        fObj.setLayout(null);
        fObj.setVisible(true);
        fObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        // Exit_on_close = 3
    }
}