package paintapp;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class RunTime {

	public static void main(String[] args) {
		
		Painter object = new Painter(); 
		object.addMouseListener(object);
		object.addMouseMotionListener(object);
		
		JFrame frame = new JFrame();
		frame.add(object);
		frame.setSize(500, 400);
		frame.setTitle("Painting App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
