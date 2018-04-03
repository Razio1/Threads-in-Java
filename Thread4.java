package lab5;


import java.awt.Color;
import javax.swing.JButton;

class Thread4 extends Thread{
    int t;
    JButton b15, b11, b6, b1;
     Thread4(int t4, JButton btnNewButton_15, JButton btnNewButton_11, JButton btnNewButton_6, JButton btnNewButton_1)
    {
     t=1000*t4;
     b15=btnNewButton_15;
     b11=btnNewButton_11;
     b6=btnNewButton_6;
     b1=btnNewButton_1;}
     public void run(){
         b15.setBackground(Color.GRAY);
         b11.setBackground(Color.GRAY);
         b6.setBackground(Color.GRAY);
         b1.setBackground(Color.GRAY);
         while(true)
         {
             b15.setBackground(Color.YELLOW);
             try {
                sleep(t);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             while(b11.getBackground()==Color.GREEN)
             {
                b15.setBackground(Color.RED);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
             }
            try {
                    sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
             b15.setBackground(Color.GRAY);
             b11.setBackground(Color.YELLOW);
             try {
                sleep(t);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             while(b6.getBackground()==Color.GREEN)
             {
                b11.setBackground(Color.RED);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
             }
            try {
                    sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
             b11.setBackground(Color.GRAY);
             b6.setBackground(Color.YELLOW);
             try {
                sleep(t);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             while(b1.getBackground()==Color.GREEN)
             {
                b6.setBackground(Color.RED);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
             }
            try {
                    sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
             b6.setBackground(Color.GRAY);
             b1.setBackground(Color.YELLOW);
             try {
                sleep(t);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             b1.setBackground(Color.GRAY);
        }
    }
}