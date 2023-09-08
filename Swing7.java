import javax.swing.*;

// creating password in java by swing usinh inheritance 
public class Swing7 extends JFrame
{
   JFrame f;

   Swing7()
   {
       JPasswordField p1= new  JPasswordField();

       JLabel l1= new JLabel("Enter Password");

              p1.setBounds(100,100,100,30);

              l1.setBounds(20,100,80,30);

              add(l1);

              add(p1);

              setSize(300,300);

              setLayout(null);

              setVisible(true);
       
   }

    public static void main(String[] args) {

       new Swing7();

       
   }
}

