
import javax.swing.*;

class PPAFrameComponentsPosition
{
    public static void main(String A[])
    {
        JFrame fObj = new JFrame("PPA");

        JButton bObj = new JButton("Ok");

        bObj.setBounds(450, 300, 100, 50);
        fObj.add(bObj);
        
        fObj.setSize(600, 400);
        fObj.setLayout(null);
        fObj.setVisible(true);
        fObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        // Exit_on_close = 3
    }
}