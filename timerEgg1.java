import java.awt.BorderLayout;

import javax.swing.JFrame;

public class timerEgg1 {

    public timerEgg1() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Timer");
        //munde te vendoset ose te ndryshohet emri i kornizes
        frame.setLayout(new BorderLayout());
        //Nepermes metodes setLayout() kryhet shperndarja e komponenteve mbrenda kornizws.
        frame.add(new TestPane());
        frame.pack();
       
        frame.setVisible(true);
        //Paraqitja e kornizes ne ekran


    }
}