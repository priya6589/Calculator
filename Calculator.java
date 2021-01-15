package calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


/**
 *
 * @author hp
 */

class Cal implements ActionListener{
     private JFrame f=new JFrame("My calculator in java....");
     private JTextArea s=new JTextArea();
     
     //calculation variables:
     String strNum1="";
     String strNum2="";
     
     String[] statment;
     
    double num1=0;
     double num2=0;
     double totalVal=0;
     
     String strTotal="";
     //btns:
     private JButton btn0=new JButton("0");
     private JButton btn1=new JButton("1");
     private JButton btn2=new JButton("2");
     private JButton btn3=new JButton("3");
     private JButton btn4=new JButton("4");
     private JButton btn5=new JButton("5");
     private JButton btn6=new JButton("6");
     private JButton btn7=new JButton("7");
     private JButton btn8=new JButton("8");
     private JButton btn9=new JButton("9");
     private JButton btnEql=new JButton("=");
     private JButton btnPoint=new JButton(".");
     private JButton btnBack=new JButton("OFF");
     private JButton btnDiv=new JButton("/");
     private JButton btnMul=new JButton("*");
     private JButton btnSub=new JButton("-");
     private JButton btnPer=new JButton("%");
     private JButton btnAdd=new JButton("+");
    Cal(){
     Container c=f.getContentPane();
     c.setBackground(Color.PINK);
     
     
     f.setSize(400,550);
     f.setVisible(true);
     f.setResizable(false);
     f.setLayout(null);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //screen...
     s.setSize(380, 100);
     s.setLocation(7,5);
     s.setEditable(true);
     
     
       //btnEql;
     btnEql.setSize(100,50);
     btnEql.setLocation(120,460);
     btnEql.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             //s.append("=");
             if(s.getText().contains("+"))
             {
                 statment=s.getText().split("\\+");
                 strNum1=statment[0];
                 strNum2=statment[1];
                 
                 num1=Double.parseDouble(strNum1);
                 num2=Double.parseDouble(strNum2);
                 
                 totalVal=num1+num2;
                 
                 strTotal=Double.toString(totalVal);
                 
                 s.setText(strTotal);
             }
             else if(s.getText().contains("-"))
             {
                 statment=s.getText().split("\\-");
                 strNum1=statment[0];
                 strNum2=statment[1];
                 
                 num1=Double.parseDouble(strNum1);
                 num2=Double.parseDouble(strNum2);
                 
                 totalVal=num1-num2;
                 
                 strTotal=Double.toString(totalVal);
                 
                 s.setText(strTotal);
             }
             else if(s.getText().contains("/"))
             {
                 statment=s.getText().split("\\/");
                 strNum1=statment[0];
                 strNum2=statment[1];
                 
                 num1=Double.parseDouble(strNum1);
                 num2=Double.parseDouble(strNum2);
                 
                 totalVal=num1/num2;
                 
                 strTotal=Double.toString(totalVal);
                 
                 s.setText(strTotal);
             }
               else if(s.getText().contains("*"))
             {
                 statment=s.getText().split("\\*");
                 strNum1=statment[0];
                 strNum2=statment[1];
                 
                 num1=Double.parseDouble(strNum1);
                 num2=Double.parseDouble(strNum2);
                 
                 totalVal=num1*num2;
                 
                 strTotal=Double.toString(totalVal);
                 
                 s.setText(strTotal);
             }
               else if(s.getText().contains("%"))
             {
                 statment=s.getText().split("\\%");
                 strNum1=statment[0];
                 strNum2=statment[1];
                 
                 num1=Double.parseDouble(strNum1);
                         //parseInt(strNum1);
                 num2=Double.parseDouble(strNum2);
                 
                 totalVal=num1%num2;
                 
                 strTotal=Double.toString(totalVal);
                 
                 s.setText(strTotal);
             }
             
         }});

     //btnBack;
     btnBack.setSize(200,30);
     btnBack.setLocation(120,110);
     btnBack.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
//             s.append("OFF");
             System.exit(0);
         }
     });
     //btnPoint;
     btnPoint.setSize(100,50);
     btnPoint.setLocation(230,460);
     btnPoint.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append(".");
         }
     });
     
     //btn0;
     btn0.setSize(100,50);
     btn0.setLocation(10,460);
     btn0.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("0");
         }
     });
      //btn1;
     btn1.setSize(100,50);
     btn1.setLocation(10,400);
     btn1.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("1");
         }
     });
       //btn2;
     btn2.setSize(100,50);
     btn2.setLocation(120,400);
     btn2.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("2");
         }
     });
     //bt3:
     btn3.setSize(100,50);
     btn3.setLocation(230,400);
     btn3.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("3");
         }
     });
     
         //btn4;
     btn4.setSize(100,50);
     btn4.setLocation(10,340);
     btn4.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("4");
         }
     });
       //btn5;
     btn5.setSize(100,50);
     btn5.setLocation(120,340);
     btn5.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("5");
         }
     });
     //bt6:
     btn6.setSize(100,50);
     btn6.setLocation(230,340);
     btn6.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("6");
         }
     });
     
    //btn7;
     btn7.setSize(100,50);
     btn7.setLocation(10,280);
     btn7.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("7");
         }
     });
       //btn8;
     btn8.setSize(100,50);
     btn8.setLocation(120,280);
     btn8.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("8");
         }
     });
     //bt9:
     btn9.setSize(100,50);
     btn9.setLocation(230,280);
     btn9.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("9");
         }
     });
           
     //btnDiv:
     btnDiv.setSize(100,50);
     btnDiv.setLocation(230,220);
     btnDiv.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("/");
         }
     });
     
      //btnMul:
     btnMul.setSize(100,50);
     btnMul.setLocation(120,220);
     btnMul.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("*");
         }
     });
       //btnAdd:
     btnAdd.setSize(100,150);
     btnAdd.setLocation(10,120);
     btnAdd.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("+");
         }
     });
       //btnSub:
     btnSub.setSize(100,50);
     btnSub.setLocation(230,150);
     btnSub.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("-");
         }
     });
     
      //btnPer:
     btnPer.setSize(100,50);
     btnPer.setLocation(120,150);
     btnPer.addActionListener(new ActionListener(){
     
        public void actionPerformed(ActionEvent arg0)
         {
             s.append("%");
         }
     });
       
     
     //Add Objects to screen...
     f.add(s);
     f.add(btn0);
     f.add(btn1);
     f.add(btn2);
     f.add(btn3);
     f.add(btn4);
     f.add(btn5);
     f.add(btn6);
     f.add(btn7);
     f.add(btn8);
     f.add(btn9);
     f.add(btnPoint);
     f.add(btnBack);
     f.add(btnEql);
     f.add(btnDiv);
     f.add(btnMul);
     f.add(btnSub);
     f.add(btnPer);
     f.add(btnAdd);
     
  
     
     
     
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cal cal=new Cal();
    }
    
}
