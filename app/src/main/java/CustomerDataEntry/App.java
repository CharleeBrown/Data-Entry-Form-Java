/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CustomerDataEntry;
import javax.swing.*;
import java.awt.*;
public class App {
    CardLayout crd;
    public String getGreeting() {
        return "Hello World!";
    }
    public JFrame createForm(){
        
        JFrame form = new JFrame();
//        JPanel panel = new JPanel(new CardLayout());;
//        panel.setSize(700,700);
//        form.add(panel);
        form.setPreferredSize(new Dimension(800, 800));
        JLabel firstNameLabel = new JLabel("First Name");
        firstNameLabel.setSize(90,90);
        firstNameLabel.setLocation(300, 50);
        JLabel lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setLocation(300,150);
        
        JLabel zipCodeLabel = new JLabel("Zip Code");
        zipCodeLabel.setLocation(300, 200);
        
        JTextArea firstNameArea = new JTextArea(5, 10);
        firstNameArea.setLocation(300, 250);
        
        JTextArea lastNameArea = new JTextArea(5,10);
        
        JTextArea zipCodeArea = new JTextArea(5,10);
        lastNameLabel.setSize(90, 90);
        
        form.add(firstNameLabel, BorderLayout.NORTH);
        form.add(lastNameLabel);
        form.add(zipCodeLabel);
        form.add(firstNameArea, BorderLayout.NORTH);
        form.add(lastNameArea);
        form.add(zipCodeArea);
        
        form.pack();
        form.setVisible(true);
        
    
        
        
        return form;
    }

    public static void main(String[] args) {
        //System.out.println(new App().getGreeting());
        new App().createForm();
    }
}