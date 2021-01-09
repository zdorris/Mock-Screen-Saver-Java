import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
@SuppressWarnings("serial")
public class Shape extends JPanel  {
	//random number 
	private static final Random r = new Random();
	private int x;          
	private int y;          
	private int shapeWidth;
	private int shapeHeight;
	boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;
	public void paintComponent(Graphics g){
	     super.paintComponent(g);
	     //variable declaration
	     int width = getWidth();
	     int height = getHeight();     	   
	     //loop to decide color, coordinates, and size for shapes randomly
	     for(int i = 0; i < 10; i++)
	     {
	       Color color = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));	       	          
	       x = DecideCoor(width);
	       y = DecideCoor(height);
	       shapeWidth = DecideSize(width);
	       shapeHeight = DecideSize(height);
	      
	       g.fillOval(x, y, shapeWidth, shapeHeight);
	       g.setColor(color);
	       g.fillOval(x, y, shapeWidth, shapeHeight);
	       g.fillRect(y, x, shapeHeight, shapeWidth);
	       g.setColor(color);
	       g.fillRect(x, y, shapeHeight, shapeWidth);     
	     }   
	     class TimerListener implements ActionListener
	      {
	         public void actionPerformed(ActionEvent event)
	         {	  
	        	repaint();
	        	    	        	     	
	         }
	      }

	      ActionListener listener = new TimerListener();
	      final int DELAY = 1000; // Milliseconds between timer ticks
	      Timer t = new Timer(DELAY, listener);
	      t.start(); 
	     
	 }
	 
	
	//decide the coordinates and size of the shapes
	 public static int DecideCoor(int origin){
	    int coordinate = r.nextInt(origin + 1);
	    return coordinate;
	 }
	 public static int DecideSize(int dimension){
	    int side = r.nextInt(dimension / 2);
	    return side;
	}
	 
}	
