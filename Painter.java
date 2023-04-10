package paintapp;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class Painter extends JPanel implements MouseListener, MouseMotionListener {

	private int initialX, initialY, temporaryX, temporaryY;
	
	public void mousePressed(MouseEvent e) {
		updateStart(e);
	}

	public void mouseDragged(MouseEvent e) {
		updateLineCoord(e);
		repaint();
	}

	private void updateStart(MouseEvent e) {
		initialX = e.getX();
		initialY = e.getY();
	}

	private void updateLineCoord(MouseEvent e) {
		temporaryX = e.getX();
		temporaryY = e.getY();
	}
	
	private void drawALine(Graphics g) {
		Graphics2D cursor = (Graphics2D) g;
		cursor.setColor(Color.BLACK);
		cursor.setPaintMode();
		cursor.drawLine(initialX, initialY, temporaryX, temporaryY);
		initialX = temporaryX;
		initialY = temporaryY;
	}
	
	protected void paintComponent(Graphics g) {
		drawALine(g);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
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
	
	
	
	
}
