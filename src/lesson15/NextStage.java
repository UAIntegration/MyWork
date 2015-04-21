package lesson15;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import static lesson15.TextClass.*;

public class NextStage extends javax.swing.JFrame {
//final JTextArea text = new JTextArea("Мама");
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("code run");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NextStage();
            }
        });
    }
    public NextStage() {
        JFrame frame = new JFrame("Test1");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //JLabel label = new JLabel("Try to click");
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        frame.add(panel);
        addComponentsToPane(frame.getContentPane());
        //panel.add(label);
        
        /*JButton button1 = new JButton("OK");
        panel.add(button1);
        JButton button2 = new JButton("1");
        panel.add(button2);
        JButton button3 = new JButton("2");
        panel.add(button3);
        JButton button4 = new JButton("3");
        panel.add(button4);*/
        panel.add(textpanel());
        show_text("Мама");
        /*button1.addActionListener (new Action1());
        button2.addActionListener (new Action2());
        button3.addActionListener (new Action2());
        button4.addActionListener (new Action2());*/
        /*button2.addActionListener (new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                text.append("\nмыла\nраму");
                //throw new UnsupportedOperationException("Not supported yet.");
            }
            
        });*/
    }
    
    public static void addComponentsToPane(Container pane) { 
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS)); 
        addALabel("Try to click", pane);
        addAButton("Button 1", pane);
        addAButton("Button 2", pane);
        addAButton("Button 3", pane);
        addAButton("Button 4", pane);
    }
    private static void addAButton(String text, Container container) { 
        JButton button = new JButton(text); 
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener (new Action2());
        container.add(button);
    }
    private static void addALabel(String text, Container container) { 
        JLabel label = new JLabel(text);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(label);
    } 
    
    static class Action1 implements ActionListener {        
        public void actionPerformed (ActionEvent e) { 
          JFrame frame2 = new JFrame("Clicked");
          frame2.setVisible(true);
          frame2.setSize(200,200);
          JLabel label = new JLabel("you clicked me");
          JPanel panel = new JPanel();
          frame2.add(panel);
          panel.add(label);
        }
    }

    static class Action2 implements ActionListener {        
        public void actionPerformed (ActionEvent e) {     
            show_text("\nмыла\nраму");
        }
    }
}