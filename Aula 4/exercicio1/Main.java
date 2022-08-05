import javax.swing.*;

import java.awt.event.*;
public class Main {
    
    public static void main( String args[]){
        JFrame frame = new JFrame("atividade 1 aula 6");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        JPanel panel = new JPanel();
        JTextField text = new JTextField(10);
        JLabel question = new JLabel("digite sua mensagem");
        JButton  button = new JButton("Enviar mensagem");
        JLabel result = new JLabel("");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                String value = text.getText();
                result.setText(value);
                
            }
        });
        panel.add(question);
        panel.add(text);
        panel.add(button);
        panel.add(result);
        frame.add(panel);
        frame.setVisible(true);
      

    }
  
    
}