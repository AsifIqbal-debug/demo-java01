import javax.swing.JOptionPane;
public class demo_four {
    public static void main(String[] args){
        String name=JOptionPane.showInputDialog("Enter your name :");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"Your age is "+age+" old");
        float height= Float.parseFloat(JOptionPane.showInputDialog("Enter your height (Feet)"));
        JOptionPane.showMessageDialog(null, "Your Height is "+height+ "Feet");

    }
}
