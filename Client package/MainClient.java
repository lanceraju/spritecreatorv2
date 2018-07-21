package Client;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTextPane;

import Logic.BaseShape;
import Logic.ElliShape;
import Logic.MainLogic;
import Logic.RectShape;

import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;



public class MainClient {

	private JFrame frmSpriteCreatorV;
	private JTextField textFieldHeight;
	private JTextField textFieldWidth;
	private JTextField textFieldRotate;
	private String defaultShape = "Ellipse";
	private MainLogic mLogic;
	private static SpriteField panel;
	double tX = 0;
	double tY = 0;
	double mRotation = 0;
	private Color mColor = Color.BLACK;
	double mWidth = 100;
	double mHeight = 50;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClient window = new MainClient();
					window.frmSpriteCreatorV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainClient() {
		initialize();
	}

	
	private void initialize() {
		frmSpriteCreatorV = new JFrame();
		frmSpriteCreatorV.setTitle("Sprite Creator v2.0");
		frmSpriteCreatorV.setBounds(100, 100, 981, 671);
		frmSpriteCreatorV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		panel = new SpriteField();
		panel.setBounds(34, 11, 600, 600);
		mLogic = new MainLogic();
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
			double tX = e.getX();
			double tY = e.getY();
			String tWidthParse = textFieldWidth.getText();
			String tHeightParse = textFieldHeight.getText();
			String tRotationParse = textFieldRotate.getText();
			double tWidth = mWidth;
			double tHeight = mHeight;
			double tRotation = mRotation;
			try
			{
				tWidth = Double.parseDouble(tWidthParse);
				tHeight = Double.parseDouble(tHeightParse);
				tRotation = Double.parseDouble(tRotationParse);
			}
			catch(Exception a)
			{
				
			}
			mLogic.ChooseShape(tX, tY, tRotation, mColor, tWidth, tHeight, defaultShape);
			}
		});
		frmSpriteCreatorV.getContentPane().setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		frmSpriteCreatorV.getContentPane().add(panel);
		
		JButton btnRed = new JButton("");
		btnRed.setBounds(720, 555, 69, 23);
		btnRed.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
		
			
			mColor = Color.RED;
//			BaseShape tNew;
//			tNew.GetColor(Color.RED);
//			//Pass to shape
			}
		});
		btnRed.setForeground(Color.RED);
		btnRed.setBackground(Color.RED);
		frmSpriteCreatorV.getContentPane().add(btnRed);
		
		JButton btnOrange = new JButton("");
		btnOrange.setBounds(720, 590, 69, 23);
		btnOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mColor = Color.ORANGE;
			}
		});
		btnOrange.setForeground(Color.ORANGE);
		btnOrange.setBackground(Color.ORANGE);
		frmSpriteCreatorV.getContentPane().add(btnOrange);
		
		JButton btnPink = new JButton("");
		btnPink.setBounds(640, 520, 69, 23);
		btnPink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mColor = Color.PINK;
			}
		});
		btnPink.setBackground(Color.PINK);
		btnPink.setForeground(Color.PINK);
		frmSpriteCreatorV.getContentPane().add(btnPink);
		
		JButton btnBlue = new JButton("");
		btnBlue.setBounds(720, 520, 69, 23);
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mColor = Color.BLUE;
			}
		});
		btnBlue.setBackground(Color.BLUE);
		btnBlue.setForeground(Color.BLUE);
		frmSpriteCreatorV.getContentPane().add(btnBlue);
		
		JButton btnGreen = new JButton("");
		btnGreen.setBounds(720, 485, 69, 23);
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mColor = Color.GREEN;
			}
			
		});
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setForeground(Color.GREEN);
		frmSpriteCreatorV.getContentPane().add(btnGreen);
		
		JButton btnYellow = new JButton("");
		btnYellow.setBounds(640, 555, 69, 23);
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mColor = Color.YELLOW;
			}
		});
		btnYellow.setForeground(Color.YELLOW);
		btnYellow.setBackground(Color.YELLOW);
		frmSpriteCreatorV.getContentPane().add(btnYellow);
		
		JButton btnMagenta = new JButton("");
		btnMagenta.setBounds(640, 590, 69, 23);
		btnMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mColor = Color.MAGENTA;
			}
		});
		btnMagenta.setForeground(new Color(255, 51, 255));
		btnMagenta.setBackground(new Color(255, 51, 255));
		frmSpriteCreatorV.getContentPane().add(btnMagenta);
		
		JButton btnBlack = new JButton("");
		btnBlack.setBounds(720, 450, 69, 23);
		btnBlack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mColor = Color.BLACK;
			}
		});
		btnBlack.setBackground(new Color(0, 0, 0));
		btnBlack.setForeground(new Color(0, 0, 0));
		frmSpriteCreatorV.getContentPane().add(btnBlack);
		
		JButton btnGray = new JButton("");
		btnGray.setBounds(640, 450, 69, 23);
		btnGray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mColor = Color.LIGHT_GRAY;
			}
		});
		btnGray.setForeground(Color.LIGHT_GRAY);
		btnGray.setBackground(Color.LIGHT_GRAY);
		frmSpriteCreatorV.getContentPane().add(btnGray);
		
		JButton btnCyan = new JButton("");
		btnCyan.setBounds(640, 485, 69, 23);
		btnCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mColor = Color.CYAN;
			}
		});
		btnCyan.setBackground(Color.CYAN);
		btnCyan.setForeground(Color.CYAN);
		frmSpriteCreatorV.getContentPane().add(btnCyan);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(700, 21, 46, 14);
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmSpriteCreatorV.getContentPane().add(lblHeight);
		
		textFieldHeight = new JTextField();
		textFieldHeight.setBounds(682, 46, 76, 20);
		frmSpriteCreatorV.getContentPane().add(textFieldHeight);
		textFieldHeight.setColumns(10);
		
		JLabel lblWidth = new JLabel(" Width");
		lblWidth.setBounds(840, 21, 63, 14);
		lblWidth.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmSpriteCreatorV.getContentPane().add(lblWidth);
		
		textFieldWidth = new JTextField();
		textFieldWidth.setBounds(825, 46, 75, 20);
		frmSpriteCreatorV.getContentPane().add(textFieldWidth);
		textFieldWidth.setColumns(10);
		
		JLabel lblRotation = new JLabel("Rotation");
		lblRotation.setBounds(780, 117, 63, 14);
		lblRotation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmSpriteCreatorV.getContentPane().add(lblRotation);
		
		JButton btnCounterCW = new JButton("-");
		btnCounterCW.setBounds(682, 238, 46, 23);
		btnCounterCW.setToolTipText("Rotate by -15 degrees");
		btnCounterCW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mLogic.Rotate(-15 * Math.PI/180);
				
			}
		});
		frmSpriteCreatorV.getContentPane().add(btnCounterCW);
		
		JButton btnCW = new JButton("+");
		btnCW.setBounds(760, 238, 46, 23);
		btnCW.setToolTipText("Rotate by 15 degrees");
		btnCW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mLogic.Rotate(15 * Math.PI/180);
				
			}
		});
		frmSpriteCreatorV.getContentPane().add(btnCW);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.setBounds(865, 238, 83, 23);
		btnUndo.setToolTipText("Remove last shape");
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mLogic.Undo();
			}
		});
		frmSpriteCreatorV.getContentPane().add(btnUndo);
		
		textFieldRotate = new JTextField();
		textFieldRotate.setBounds(760, 142, 86, 20);
		frmSpriteCreatorV.getContentPane().add(textFieldRotate);
		textFieldRotate.setColumns(10);
		
		JButton btnRotate = new JButton("Rotate");
		btnRotate.setBounds(865, 142, 74, 21);
		btnRotate.setToolTipText("Set a new rotation");
		btnRotate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				String tRotationParse = textFieldRotate.getText();
				mRotation = Integer.parseInt(tRotationParse);
				mRotation = mRotation * Math.PI/180;
			}
		});
		frmSpriteCreatorV.getContentPane().add(btnRotate);
		
		JButton btnRectangle = new JButton("Rectangle");
		btnRectangle.setBounds(679, 340, 110, 23);
		btnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			defaultShape = "Rectangle";
			
			}
		});
		btnRectangle.setToolTipText("Create a rectangle");
		frmSpriteCreatorV.getContentPane().add(btnRectangle);
		
		JButton btnEllipse = new JButton("Ellipse");
		btnEllipse.setBounds(806, 340, 110, 23);
		btnEllipse.setToolTipText("Create an ellipse");
		btnEllipse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			defaultShape = "Ellipse";
			}
		});
		frmSpriteCreatorV.getContentPane().add(btnEllipse);
		
		JLabel lblRotateBy = new JLabel("Rotate by -15 / 15 degrees");
		lblRotateBy.setBounds(671, 213, 161, 14);
		lblRotateBy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmSpriteCreatorV.getContentPane().add(lblRotateBy);
		
		JLabel lblChangeShapes = new JLabel("Change shapes");
		lblChangeShapes.setBounds(754, 317, 125, 14);
		lblChangeShapes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmSpriteCreatorV.getContentPane().add(lblChangeShapes);
		
		JLabel lblColorSelection = new JLabel("Color Selection");
		lblColorSelection.setBounds(679, 425, 100, 14);
		lblColorSelection.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmSpriteCreatorV.getContentPane().add(lblColorSelection);
		frmSpriteCreatorV.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmSpriteCreatorV.getContentPane(), panel, btnRed, btnOrange, btnPink, btnBlue, btnGreen, btnYellow, btnMagenta, btnBlack, btnGray, btnCyan, lblHeight, textFieldHeight, lblWidth, textFieldWidth, lblRotation, btnCounterCW, btnCW, btnUndo, lblRotateBy, textFieldRotate, btnRotate, lblChangeShapes, btnRectangle, btnEllipse}));
	
	}
	public static void ChangeValues (ArrayList <BaseShape> tShape)
	{
		panel.ShapeToSprite(tShape);
	}
}

