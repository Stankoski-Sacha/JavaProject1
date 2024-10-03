package test;
import javax.swing.JFrame;
import javax.swing.JButton;

public class test{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button1 = new JButton("test");
        frame.add(button1);


        frame.setVisible(true);
    }
}