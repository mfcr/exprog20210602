package fp.daw.exprog20210602.ejercicio4;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

import com.sun.glass.events.KeyEvent;

public class Ejercicio4Swing extends JFrame implements ActionListener,MouseMotionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton boton1 ;
	JButton boton2;
	JLabel etiqueta;
	int cont=0;
	
	public Ejercicio4Swing() {
		setPreferredSize(new Dimension(300, 200));	
		getContentPane().setLayout(new GridLayout(3,1));
		
		boton1=new JButton("Pulsa Aqui");
		boton1.setMnemonic(KeyEvent.VK_P);
		boton1.addActionListener(this);
		boton1.setActionCommand("mas");
		getContentPane().add(boton1);
		
		etiqueta=new JLabel("Pulsado 0 veces.");
		etiqueta.addMouseMotionListener(this);
		
		getContentPane().add(etiqueta);

		boton2=new JButton("Reset");
		boton2.setMnemonic(KeyEvent.VK_R);
		boton2.addActionListener(this);
		boton2.setActionCommand("reset");
		getContentPane().add(boton2);

		pack();
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Examen 3ª Evaluacion - Ejercicio4");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override	public void windowClosing(WindowEvent e) {
				switch (JOptionPane.showConfirmDialog(null,"Salir","¿Desea salir?",JOptionPane.YES_NO_OPTION)) {
					case JOptionPane.YES_OPTION:
						System.exit(0);
				}
			}});
		
		pack();

	}
/*NOTA: ME QUEDO PENDIENTE HACER QUE SE PUSIESE EL TEXTO EN ROJO AL PASAR CON EL RATON
 * PERO NO HE TENIDO MAS TIEMPO*/
 

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("mas")) {
			cont++;
		} else if (e.getActionCommand().equals("reset")) {
			cont=0;
		}
		etiqueta.setText("Pulsado "+cont+" veces.");
	}
	public static void main(String[] args)	{
		Ejercicio4Swing e = new Ejercicio4Swing();		
		SwingUtilities.invokeLater(() -> e.setVisible(true));
	}
}