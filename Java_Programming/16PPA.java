// This is file to explain concept of user defined pacakages

import Marvellous.Demo;
import Marvellous.Hello;
import Marvellous.Infosystems.LB;

class PPA
{
    public static void main(String A[])
    {
        Hello hObj = new Hello();
        Demo dObj = new Demo();
        LB lObj = new LB();

        hObj.fun();
        dObj.gun();
        lObj.sun();
    }
}