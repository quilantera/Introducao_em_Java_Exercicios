package panel;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;
import java.awt.event.*;
import java.util.ArrayList;  
public class DrawPanel  extends JPanel{
    protected int choose = 0;
    
    boolean pressed = false; 
    int xInit, yInit, xFinal, yFinal;
    ArrayList <Draw> draws = new ArrayList<>(); 
    public DrawPanel(){
        setSize(1000,600);
        new Time().start();
        addMouseListener(new MouseListener(){

            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                choose = 1;
                pressed = true;
                xFinal = e.getX();
                xInit = e.getY();
                
                
            }
          
            public void mouseReleased(MouseEvent e) {
                pressed = false;
                draws.clear();
                xFinal = e.getX();
                xInit = e.getY();
                
                
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
        });
        
    }
    public void paintComponent( Graphics g){
        for(int i = 0; i<draws.size();i++){
            int x = draws.get(i).x;
            int y = draws.get(i).y;
            g.drawLine(x,y, x,y);
        }
       
    }

    
    public class Draw{
        int x, y;
        public Draw(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public class Time extends Thread{
        public void run(){
            while(true){
                if(pressed == true){
                    try{
                        Point point = getMousePosition();
                        draws.add(new Draw(point.x, point.y));
                    }catch(Exception e){}
                    repaint();
                }
            }
        }
    }
}
