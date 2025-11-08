
import javax.swing.*;

class PPAFrameCloseComponents
{
    public static void main(String A[])
    {
        JFrame fObj = new JFrame("PPA");

        JButton bObj = new JButton("Ok");
        
        fObj.setSize(300, 300);
        fObj.setVisible(true);
        fObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        // Exit_on_close = 3
        fObj.add(bObj);
    }
}