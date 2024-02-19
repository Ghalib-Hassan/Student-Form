
package graph32;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Container;

public class Graph32 {

    public static void main(String[] args) {
        
/*  
        JFrame f = new JFrame("SHAPES");
        MyPanel p = new MyPanel(); 
        
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setSize(1370, 800);
        f.setLocation(0, 0);
        f.setVisible(true);
      
*/
   JFrame f = new JFrame("Student Data");

   //set size and location of frame
   f.setSize(400, 500);
   f.setLocation(0, 120);
  
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //make sure it quits when x is clicked
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        //set look and feel
  
   JLabel labelS = new JLabel("Enter your name: ");
   labelS.setBounds(50, 50, 100, 50);
   JTextField motto1 = new JTextField();            
   motto1.setBounds(160, 58, 200, 30);              //set size of the text box
   
   JLabel labelF = new JLabel("Enter your father name: ");
   labelF.setBounds(450, 50, 140, 50);
   JTextField father = new JTextField();
   father.setBounds(595, 58, 200, 30);
 
   JLabel labelR = new JLabel("Enter your roll number: ");
   labelR.setBounds(850, 50, 140, 50);
   JTextField rollno = new JTextField();
   rollno.setBounds(990, 58, 200, 30);
   
   JLabel labelSec = new JLabel("Enter your Section: ");
   labelSec.setBounds(50, 115, 120, 50);
   JTextField section = new JTextField();
   section.setBounds(170, 120, 200, 30);
   
   JLabel labelSes = new JLabel("Enter your session: ");
   labelSes.setBounds(450, 115, 120, 50);
   JTextField session = new JTextField();
   session.setBounds(572, 120, 200, 30);
   
   JLabel labelDep = new JLabel("Enter your department: ");
   labelDep.setBounds(850, 115, 140, 50);
   JTextField depart = new JTextField();
   depart.setBounds(990, 120, 200, 30);
   
   JButton b = new JButton("Submit");
   b.setBounds(450, 200, 100, 30);

   JButton c = new JButton("Cancel");
   c.setBounds(680, 200, 100, 30);
   
   Container d = f.getContentPane();
   d.setBackground(new Color(98, 162, 208));
   
   
   
   //add elements to the frame
   f.add(labelS);
   f.add(motto1);
   f.setLayout(null);
   f.setVisible(true);
   
   f.add(labelF);
   f.add(father);
   f.setLayout(null);
   f.setVisible(true);
   
   f.add(labelR);
   f.add(rollno);
   f.setLayout(null);
   f.setVisible(true);
   
   f.add(labelSec);
   f.add(section);
   f.setLayout(null);
   f.setVisible(true);
   
   f.add(labelSes);
   f.add(session);
   f.setLayout(null);
   f.setVisible(true);
   
   f.add(labelDep);
   f.add(depart);
   f.setLayout(null);
   f.setVisible(true);
   
   f.add(b);
   f.add(c);
    
   }

}
