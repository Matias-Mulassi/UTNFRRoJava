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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
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
		
		JMenuBar menuBar = new JMenuBar();
		
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
		GroupLayout gl_desktopPane = new GroupLayout(desktopPane);
		gl_desktopPane.setHorizontalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 615, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_desktopPane.createSequentialGroup()
					.addGap(287)
					.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_desktopPane.setVerticalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_desktopPane.createSequentialGroup()
					.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(136)
					.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		
		JMenu mnListadoPersonas = new JMenu("Listado Personas");
		menuBar.add(mnListadoPersonas);
		
		JMenuItem mntmListado = new JMenuItem("Listado");
		mntmListado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showListadoPersonas();
		
			}
		});
		mnListadoPersonas.add(mntmListado);
		desktopPane.setLayout(gl_desktopPane);
	}


		protected void showABMCPersona() {
			
			AMBCPersona frmPer=new AMBCPersona();
			desktopPane.add(frmPer);
			frmPer.setVisible(true);
			
			
			}
 protected void showListadoPersonas(){
		ListadoPersonas lp= new ListadoPersonas();
		desktopPane.add(lp);
		lp.setVisible(true);

 			}





}
