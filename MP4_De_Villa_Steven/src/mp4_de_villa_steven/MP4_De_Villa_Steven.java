/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp4_de_villa_steven;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.MouseEvent;

/**
 *
 * @author stevendevilla
 */
public class MP4_De_Villa_Steven {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                simpleCalculator();
        }
        });
    }
    private static void simpleCalculator(){
        final JFrame frame = new JFrame("Simple calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel numberPanel1 = new JPanel(new GridLayout(1,2));
        final JLabel number1 = new JLabel("First Number");
        final JTextField text1 = new JTextField();
        text1.setColumns(5);
        numberPanel1.add(number1);
        numberPanel1.add(text1);
        
        JPanel numberPanel2 = new JPanel(new GridLayout(1,2));        
        final JLabel number2 = new JLabel("Second Number");
        final JTextField text2 = new JTextField();
        text2.setColumns(5);
        numberPanel2.add(number2);
        numberPanel2.add(text2);
        
        JPanel resultPanel = new JPanel(new GridLayout(1,2));  
        final JLabel result = new JLabel("Result: ");
        final JLabel fResultLabel = new JLabel(); 
        resultPanel.add(result);
        resultPanel.add(fResultLabel);
        
        JPanel buttonsPanel1 = new JPanel(new GridLayout(1,2));
        JPanel buttonsPanel2 = new JPanel(new GridLayout(1,2));
        JPanel buttonsPanel3 = new JPanel(new GridLayout(1,2));
        
        final JButton add = new JButton("ADD");
        add.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            String x= text1.getText() ;
            int number1 = Integer.parseInt(x);
            String y=text2.getText();
            int number2 = Integer.parseInt(y);
            int result=number1 + number2;
            String z= Integer.toString(result);
            fResultLabel.setText(z);
        }
        });
        
        final JButton subtract = new JButton("SUBTRACT");
        subtract.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            String x= text1.getText() ;
            int number1 = Integer.parseInt(x);
            String y=text2.getText();
            int number2 = Integer.parseInt(y);
            int result=number1 - number2;
            String z= Integer.toString(result);
            fResultLabel.setText(z);
        }
        });
        
        final JButton multiply = new JButton("MULTIPLY");
        multiply.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            String x= text1.getText() ;
            int number1 = Integer.parseInt(x);
            String y=text2.getText();
            int number2 = Integer.parseInt(y);
            int result=number1 * number2;
            String z= Integer.toString(result);
            fResultLabel.setText(z);
        }
        });
        
        final JButton divide = new JButton("DIVIDE");
        divide.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            String x= text1.getText() ;
            double number1 = Integer.parseInt(x);
            String y=text2.getText();
            double number2 = Integer.parseInt(y);
            double result=number1 / number2;
            String z= Double.toString(result);
            fResultLabel.setText(z);
        }
        });
        
        final JButton reset = new JButton("RESET");   
        reset.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            text1.setText("");
            text2.setText("");
            fResultLabel.setText("");
        }
        });
        
        final JButton quit = new JButton("QUIT");
        quit.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            String message = "This will terminate the program!";
            JOptionPane.showMessageDialog(null, message);
            System.exit(0);
        }
        });
        
        buttonsPanel1.add(add);
        buttonsPanel1.add(subtract);
        buttonsPanel2.add(multiply);
        buttonsPanel2.add(divide);
        buttonsPanel3.add(reset);
        buttonsPanel3.add(quit);
        
        JPanel parentPanel = new JPanel(new GridLayout (6,1));
        parentPanel.add(numberPanel1);
        parentPanel.add(numberPanel2);
        parentPanel.add(resultPanel);
        parentPanel.add(buttonsPanel1);
        parentPanel.add(buttonsPanel2);
        parentPanel.add(buttonsPanel3);
        
        frame.setContentPane(parentPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
}
}

