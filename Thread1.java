package lab5;

import java.awt.Color;
import javax.swing.JButton;

class Thread1 extends Thread{
    int t;
    JButton b0, b1, b2, b3, b4;
    
     Thread1(int t1, JButton btnNewButton_0, JButton btnNewButton_1, JButton btnNewButton_2, JButton btnNewButton_3, JButton btnNewButton_4)
     {
     t=1000*t1;
     b0=btnNewButton_0;
     b1=btnNewButton_1;
     b2=btnNewButton_2;
     b3=btnNewButton_3;
     b4=btnNewButton_4;
     }
     public void run(){
         b0.setBackground(Color.GRAY);
         b1.setBackground(Color.GRAY);
         b2.setBackground(Color.GRAY);
         b3.setBackground(Color.GRAY);
         b4.setBackground(Color.GRAY);
         while(true)
         {
             b0.setBackground(Color.GREEN);
             try {
                sleep(t);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             b0.setBackground(Color.GRAY);
             b1.setBackground(Color.GREEN);
             try {
                sleep(t);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             b1.setBackground(Color.GRAY);
             b2.setBackground(Color.GREEN);
             try {
                sleep(t);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             while((b3.getBackground()==Color.YELLOW)||(b3.getBackground()==Color.RED))
             {
                b2.setBackground(Color.RED);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
             }
             b2.setBackground(Color.GRAY);
             b3.setBackground(Color.GREEN);
             try {
                sleep(t);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             b3.setBackground(Color.GRAY);
             b4.setBackground(Color.GREEN);
             try {
                sleep(t);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             b4.setBackground(Color.GRAY);
         }
     }
    }