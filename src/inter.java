
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")

class Inter extends JPanel
{
	private JButton playbutton,single,multi,mode,host,join,connect;
	private JRadioButton p2,p3,p4;
	private Image img;
	private JTextField host_name;
	private JLabel lab;
	@Override
	protected void paintComponent(Graphics g)
	{
	    super.paintComponent(g);
	    // paint the background image and scale it to fill the entire space
	    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

	}
	
	public Inter(String img) 
	{
	    this((BufferedImage) new ImageIcon(img).getImage());
	}
    
	public Inter(BufferedImage img) 
	{
	    this.img = img;
	    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
	    setLayout(null);
	    playbutton=new JButton();  
	    single=new JButton();
	    multi=new JButton();
	    mode=new JButton();
	    host=new JButton("HOST a GAME");
	    join=new JButton("JOIN a GAME");
	    p2=new JRadioButton("TWO PLAYER",true);
	    p3=new JRadioButton("THREE PLAYER",true);
	    p4=new JRadioButton("FOUR PLAYER",true);
	    ButtonGroup radio=new ButtonGroup();
	    radio.add(p2);
	    radio.add(p3);
	    radio.add(p4);
	    
	    playbutton.setBounds((int)(Start.setx*0.17),(int)(Start.sety*0.78),(int)(Start.setx*0.19),(int)(Start.sety*0.13));
	    
	    
	    try 
	    {
	        Image imgbtn = ImageIO.read(getClass().getResource("nplay.jpg"));
	        Image resizedImage = imgbtn.getScaledInstance(playbutton.getWidth(), playbutton.getHeight(),Image.SCALE_SMOOTH);
	        playbutton.setIcon(new ImageIcon(resizedImage));
	    
	        
	    } 
	    catch (IOException ex) 
	    {
	    }
	    
		
		playbutton.setBorder(BorderFactory.createEmptyBorder());
	    start_play handler=new start_play();
	    playbutton.addActionListener(handler);
	    single.addActionListener(handler);
	    multi.addActionListener(handler);
	    mode.addActionListener(handler);
	    host.addActionListener(handler);
	    join.addActionListener(handler);
	    
	    add(playbutton);
	    add(mode);
	    add(p2);
	    //addComponentListener(this);
	  }
	 
    private class start_play implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		if(e.getSource()==playbutton)
    		{
    		     Inter.this.remove(playbutton);
    		     Inter.this.add(single);
    		     Inter.this.add(multi);
    		     //Rectangle r = Inter.this.getBounds();
    			 // int h = r.height;
    			 // int  w = r.width;
    			  single.setBounds((int)(Start.setx*0.15),(int)(Start.sety*0.5),(int)(Start.setx*0.19),(int)(Start.sety*0.13));
    			  multi.setBounds((int)(Start.setx*0.15),(int)(Start.sety*0.7),(int)(Start.setx*0.19),(int)(Start.sety*0.13));
    			  try 
    			    {
    			        Image imgbtn = ImageIO.read(getClass().getResource("single.jpg"));
    			        Image resizedImage = imgbtn.getScaledInstance(single.getWidth(), single.getHeight(),Image.SCALE_SMOOTH);
    			        single.setIcon(new ImageIcon(resizedImage));
    			    
    			        
    			    } 
    			    catch (IOException ex) 
    			    {
    			    }
    			  single.setBorder(BorderFactory.createEmptyBorder());
    			  try 
    			  {
  			        Image imgbtn = ImageIO.read(getClass().getResource("multi.jpg"));
  			        Image resizedImage = imgbtn.getScaledInstance(multi.getWidth(), multi.getHeight(),Image.SCALE_SMOOTH);
  			        multi.setIcon(new ImageIcon(resizedImage));
  			      } 
    			  catch (IOException ex) 
    			  {
    				  
    			  }
    			  multi.setBorder(BorderFactory.createEmptyBorder());
    		     repaint();
    		}
    		else if(e.getSource()==single)
    		{
    			Inter.this.remove(single);
    			Inter.this.remove(multi);
    			repaint();
    			//Start Game
    		}
    		else if(e.getSource()==multi)
    		{
    			Inter.this.remove(single);
    			Inter.this.remove(multi);
    			Inter.this.add(host);
    			Inter.this.add(join);
    			host.setBounds((int)(Start.setx*0.15),(int)(Start.sety*0.5),(int)(Start.setx*0.19),(int)(Start.sety*0.13));
    			join.setBounds((int)(Start.setx*0.15),(int)(Start.sety*0.7),(int)(Start.setx*0.19),(int)(Start.sety*0.13));
    			repaint();
    			
    		}
    		else if(e.getSource()==host)
    		{
    			Inter.this.remove(host);
    			Inter.this.remove(join);
    			p2.setBounds((int)(Start.setx*0.15),(int)(Start.sety*0.5),(int)(Start.setx*0.15),(int)(Start.sety*0.07));
    			p3.setBounds((int)(Start.setx*0.15),(int)(Start.sety*0.6),(int)(Start.setx*0.15),(int)(Start.sety*0.07));
    			p4.setBounds((int)(Start.setx*0.15),(int)(Start.sety*0.7),(int)(Start.setx*0.15),(int)(Start.sety*0.07));
    			mode.setBounds((int)(Start.setx*0.15),(int)(Start.sety*0.8),(int)(Start.setx*0.15),(int)(Start.sety*0.07));
    			try 
    		    {
    		        Image imgbtn = ImageIO.read(getClass().getResource("next.jpg"));
    		        Image resizedImage = imgbtn.getScaledInstance(mode.getWidth(), mode.getHeight(),Image.SCALE_SMOOTH);
    		        mode.setIcon(new ImageIcon(resizedImage));
    		    
    		        
    		    } 
    		    catch (IOException ex) 
    		    {
    		    }
    			mode.setBorder(BorderFactory.createEmptyBorder());
    			Inter.this.add(p2);
    			Inter.this.add(p3);
    			Inter.this.add(p4);
    			Inter.this.add(mode);
    			repaint();
    		}
    		else if(e.getSource()==join)
    		{
    			Inter.this.remove(host);
    			Inter.this.remove(join);
    			host_name=new JTextField();
    			lab=new JLabel("Enter ip address");
    			connect=new JButton("CONNECT");
    			connect.addActionListener(this);
    			host_name.setBounds((int)(Start.setx*0.2),(int)(Start.sety*0.5),(int)(Start.setx*0.15),(int)(Start.sety*0.07));
    			lab.setBounds((int)(Start.setx*0.1),(int)(Start.sety*0.5),(int)(Start.setx*0.15),(int)(Start.sety*0.07));
    			connect.setBounds((int)(Start.setx*0.2),(int)(Start.sety*0.7),(int)(Start.setx*0.15),(int)(Start.sety*0.07));
    			Inter.this.add(host_name);
    			Inter.this.add(lab);
    			Inter.this.add(connect);
    			repaint();
    		}
    		else if(e.getSource()==mode)
    		{
    			int p;
    			if(p2.isSelected())
    				p=2;
    			else if(p3.isSelected())
    				p=3;
    			else
    				p=4;    			
    			Inter.this.remove(p2);
    			Inter.this.remove(p3);
    			Inter.this.remove(p4);
    			Inter.this.remove(mode);
    			repaint();
    			new host(p);
    			
    		}
    		else if(e.getSource()==connect)
    		{
    			try
    			{
    				connect_to_host cth=new connect_to_host(host_name.getText());
    				System.out.println("connection successful");
    			}
    			catch(Exception ex)
    			{
    				ex.printStackTrace();
    			}
    		}
    	}
    
    }
	
}