import javax.swing.*;


public class Swing6
 {
       public  static  void main(String[]  args)
       {

              JFrame f= new JFrame ();

              JPasswordField pass= new JPasswordField();

              JLabel l1= new JLabel("Password");

              l1.setBounds(20,100,80,30);
              
              pass.setBounds(100,100,100,30);

              f.add(l1);

              f.add(pass);

              f.setSize(300,300);

              f.setLayout(null);

              f.setVisible(true);

              
       }
}
