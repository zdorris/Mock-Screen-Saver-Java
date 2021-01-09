import javax.swing.*;
public class Main
{
	public static void main(String[] args)
	{
		//creating the frame
		JFrame f = new JFrame("screen saver");
		//declaring an object of the shape class
		Shape shape = new Shape();
		
		f.add(shape);
		//frame housekeeping
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setSize(600,600);
		f.setVisible(true);							
	}
	
}
