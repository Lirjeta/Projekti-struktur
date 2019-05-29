import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class timerEgg {

class TestPane extends JPanel {

    JLabel label;
    //Ne kemi deklaruar nje variable te klases JLabel me emrin label.
    Timer timer;
    //Ne kemi deklaruar nje variable te klases Timer me emrin timer.

    int count;
    int i;

    public TestPane() {

        Scanner scan = new Scanner(System.in);
        //Krijon një shembull të skanerit të klasës që merrë nga shfrytezuesi nje numbër si një argument. 
  // Klasa e skanerit përdoret për të marrë të dhëna nga shfrytzuesi.

        System.out.println("Enter no. of seconds: ");
        //Shfaq një mesazh  për të futur numrin e sekondave.
        
        i = scan.nextInt();

        if (i > 60 || i <= 0)
        //E kontrollon vleren nese eshtei > 60 ose i <= 0
         {
            System.out.println("Invalid Input");
            //Do të shfaqet dialogu i mesazhit të titulluar Invalid Input.
            
            System.exit(0);
        }

        if (i == 60) {
           
            label = new JLabel("01:00");
        } else {
           
            label = new JLabel("00:" + Integer.toString(i));
            // Krijon një shembull JLabel me tekstin e specifikuar "00:" dhe vlerën e i.
        }
        label.setFont(new Font("", Font.PLAIN, 50));
           // Krijon një Font të ri nga emri, stili dhe madhësia e pikës së caktuar, dhe e vendos atë si font për etiketë.            

        setLayout(new GridBagLayout());
        
        add(label);

        timer = new Timer(500, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                i--;

                if (i >= 0)
                // Kontrolloni nëse vlera e i është më e madhe ose e barabartë me 0.
                 {
                    timer.setDelay(1000);
                    label.setText("00:" + Integer.toString(i));
                    if (i < 10) {
                        label.setText("00:0" + Integer.toString(i));
                    }
                }
            }
        });

        timer.setInitialDelay(1000);

        timer.start();

        timer.setDelay(1000);

    }

    @Override
    public Dimension getPreferredSize() {

        return new Dimension(560, 560);
    }

    @Override
    public void paintComponent(Graphics g) {

        g.setColor(Color.ORANGE);
        g.fillOval(160, 120, 240, 350);
    }
    }
    }

