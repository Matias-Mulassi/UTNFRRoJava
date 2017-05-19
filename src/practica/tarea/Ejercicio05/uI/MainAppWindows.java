package practica.tarea.Ejercicio05.uI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//

public class MainAppWindows {
//Comentario//
	private JFrame frmAbmcPersonas;
	private JMenuItem mntmAbmc;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainAppWindows window = new MainAppWindows();
					window.frmAbmcPersonas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainAppWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAbmcPersonas = new JFrame();
		frmAbmcPersonas.setTitle("ABM Java");
		frmAbmcPersonas.setBounds(100, 100, 641, 428);
		frmAbmcPersonas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAbmcPersonas.getContentPane().setLayout(new BorderLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		frmAbmcPersonas.getContentPane().add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		desktopPane.add(menuBar);
		
		JMenu mnPersonas = new JMenu("Personas");
		menuBar.add(mnPersonas);
		
		mntmAbmc = new JMenuItem("ABMC");
		mntmAbmc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			showABMCPersona();
			
			}
		});
		mnPersonas.add(mntmAbmc);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBounds(287, 157, 1, 1);
		desktopPane.add(desktopPane_1);
	}


		protected void showABMCPersona() {
			
			AMBCPersona frmPer=new AMBCPersona();
			desktopPane.add(frmPer);
			frmPer.setVisible(true);
			
			
			
		}







}
