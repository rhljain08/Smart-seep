
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;




public class Start
{
	public static int setx,sety;
	public static void main(String args[]) throws IOException
	{
		JFrame start=new JFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		  int height = screenSize.height;
		  int width = screenSize.width;
		  setx=(int)(width/1.2);
		  sety=(int)(height/1.2);
		  
		Inter panel = new Inter( ImageIO.read(Start.class.getClassLoader().getResourceAsStream("bg.jpg")));
		//System.out.println(panel);
		//start.getContentPane().add(panel);
		start.add(panel);
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  start.pack();

		  // make the frame half the height and width
		  start.setSize(setx, sety);
		  
		  // here's the part where i center the jframe on screen
		  start.setLocationRelativeTo(null);
		  start.setResizable(false);
		  /*start.setVisible(true);
		start.setSize(setx,sety);
		*/
	    start.setVisible(true);
	}
}