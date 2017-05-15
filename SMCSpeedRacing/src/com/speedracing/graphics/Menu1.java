package com.speedracing.graphics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import java.awt.Choice;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JInternalFrame;
import java.awt.Canvas;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Toolkit;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.JTable;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Menu1 extends JFrame
{
	
	
	private static final long serialVersionUID = 1L;
	private JPanel frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Menu1 frame = new Menu1();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu1()
	{
		setResizable(false);
		
		setTitle("SpeedRacing");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Giuseppe\\Desktop\\workspace\\GIOCO_MACCHINE\\immagini\\Menu.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 720);
		frame = new JPanel();
		frame.setBackground(Color.BLACK);
		frame.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(frame);
		frame.setLayout(null);
		
		Button scoreButton = new Button("SCORE");
		scoreButton.setActionCommand("SCORE");
		scoreButton.setBackground(new Color(255, 255, 255));
		scoreButton.setForeground(new Color(107, 142, 35));
		scoreButton.setFont(new Font("Trajan Pro", Font.ITALIC, 26));
		scoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Button playButton = new Button("GARACE");
		playButton.setBackground(Color.WHITE);
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		playButton.setFont(new Font("Trajan Pro", Font.PLAIN, 26));
		playButton.setForeground(new Color(107, 142, 35));
		playButton.setBounds(216, 52, 174, 124);
		frame.add(playButton);
		scoreButton.setBounds(409, 52, 174, 124);
		frame.add(scoreButton);
		
		Button garaceButton = new Button("PLAY");
		garaceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		garaceButton.setForeground(Color.RED);
		garaceButton.setFont(new Font("Trajan Pro", Font.ITALIC, 26));
		garaceButton.setBounds(23, 52, 174, 124);
		frame.add(garaceButton);
		
		JLabel imgMenu = new JLabel("");
		imgMenu.setForeground(new Color(139, 0, 0));
		imgMenu.setHorizontalAlignment(SwingConstants.LEFT);
		imgMenu.setIcon(new ImageIcon("C:\\Users\\Giuseppe\\Desktop\\workspace\\GIOCO_MACCHINE\\immagini\\Menu (1024x576).jpg"));
		imgMenu.setBounds(0, -39, 1024, 720);
		frame.add(imgMenu);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
