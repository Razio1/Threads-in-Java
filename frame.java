package lab5;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class frame extends JFrame {
	 
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private static int t1, t2, t3, t4;
    private static JButton btnNewButton_0, btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_4, btnNewButton_5, btnNewButton_6, btnNewButton_7, btnNewButton_8, btnNewButton_9, btnNewButton_10, btnNewButton_11, btnNewButton_12, btnNewButton_13, btnNewButton_14, btnNewButton_15;
 
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame frame = new frame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
 
        Scanner temp = new Scanner(System.in);
 
        System.out.println("Set t1: ");
        t1 = Integer.parseInt(temp.next());
 
        System.out.println("Set t2: ");
        t2 = Integer.parseInt(temp.next());
 
        System.out.println("Set t3: ");
        t3 = Integer.parseInt(temp.next());
 
        System.out.println("Set t4: ");
        t4 = Integer.parseInt(temp.next());
       
        System.out.println(t1+" "+t2+" "+t3+" "+t4);
       
         Thread1 th1 = new Thread1(t3, btnNewButton_0, btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_4);
         th1.start();
         Thread1 th2 = new Thread1(t2, btnNewButton_5, btnNewButton_6, btnNewButton_7, btnNewButton_8, btnNewButton_9);
         th2.start();
         Thread1 th3 = new Thread1(t1, btnNewButton_10, btnNewButton_11, btnNewButton_12, btnNewButton_13, btnNewButton_14);
         th3.start();
         Thread4 th4 = new Thread4(t4, btnNewButton_15, btnNewButton_13, btnNewButton_8, btnNewButton_3);
         th4.start();
    }
 
    public frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
       
        // III
        btnNewButton_4 = new JButton("");
        btnNewButton_4.setBounds(314, 11, 89, 23);
        contentPane.add(btnNewButton_4);
       
        btnNewButton_3 = new JButton("");
        btnNewButton_3.setBounds(314, 45, 89, 23);
        contentPane.add(btnNewButton_3);
       
        btnNewButton_2 = new JButton("");
        btnNewButton_2.setBounds(314, 81, 89, 23);
        contentPane.add(btnNewButton_2);
       
        btnNewButton_1 = new JButton("");
        btnNewButton_1.setBounds(314, 115, 89, 23);
        contentPane.add(btnNewButton_1);
       
        btnNewButton_0 = new JButton("");
        btnNewButton_0.setBounds(314, 145, 89, 23);
        contentPane.add(btnNewButton_0);
       
        // II
       
        btnNewButton_9 = new JButton("");
        btnNewButton_9.setBounds(215, 11, 89, 23);
        contentPane.add(btnNewButton_9);
       
        btnNewButton_8 = new JButton("");
        btnNewButton_8.setBounds(215, 45, 89, 23);
        contentPane.add(btnNewButton_8);
       
        btnNewButton_7 = new JButton("");
        btnNewButton_7.setBounds(215, 81, 89, 23);
        contentPane.add(btnNewButton_7);
       
        btnNewButton_6 = new JButton("");
        btnNewButton_6.setBounds(215, 115, 89, 23);
        contentPane.add(btnNewButton_6);
   
        btnNewButton_5 = new JButton("");
        btnNewButton_5.setBounds(215, 145, 89, 23);
        contentPane.add(btnNewButton_5);
       
        // I
        btnNewButton_14 = new JButton("");
        btnNewButton_14.setBounds(119, 11, 89, 23);
        contentPane.add(btnNewButton_14);
       
        btnNewButton_13 = new JButton("");
        btnNewButton_13.setBounds(119, 45, 89, 23);
        contentPane.add(btnNewButton_13);
       
        btnNewButton_12 = new JButton("");
        btnNewButton_12.setBounds(119, 81, 89, 23);
        contentPane.add(btnNewButton_12);
       
        btnNewButton_11 = new JButton("");
        btnNewButton_11.setBounds(119, 115, 89, 23);
        contentPane.add(btnNewButton_11);
   
        btnNewButton_10 = new JButton("");
        btnNewButton_10.setBounds(119, 145, 89, 23);
        contentPane.add(btnNewButton_10);
        
     // yellow
        btnNewButton_15 = new JButton("");
        btnNewButton_15.setBounds(15, 45, 89, 23);
        contentPane.add(btnNewButton_15);
    }
}
