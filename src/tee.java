import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class tee extends JFrame{
	private JPanel panel;
	private JLabel status;
	
	public tee(){
		super("Mouse Events Handling");
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		
		status = new JLabel("Default");
		add(status, BorderLayout.SOUTH);
		
		handler h = new handler();
		panel.addMouseListener(h);
		panel.addMouseMotionListener(h);
		
		setSize(550,300);
		setVisible(true);
	}
	
	private class handler implements MouseListener, MouseMotionListener{
		public void mouseClicked(MouseEvent e){
			status.setText(String.format("Clicked at %d, %d", e.getX(), e.getY()));
		}
		public void mousePressed(MouseEvent e){
			status.setText("You pressed down the mouse");
		}
		public void mouseReleased(MouseEvent e){
			status.setText("You released the mouse button");
		}
		public void mouseEntered(MouseEvent e){
			status.setText("You have entered the window area");
			panel.setBackground(Color.BLUE);
		}
		public void mouseExited(MouseEvent e){
			status.setText("You have left the window area");
			panel.setBackground(Color.RED);
		}
		
		public void mouseDragged(MouseEvent e){
			status.setText("You are dragging the mouse");
		}
		public void mouseMoved(MouseEvent e){
			status.setText("You moved the mouse");
		}
	}

}
