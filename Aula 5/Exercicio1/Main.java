import javax.swing.JFrame;

import panel.DrawPanel;


public class Main {


    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(1000,900);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new DrawPanel());
        frame.setVisible(true);
        

    }
}