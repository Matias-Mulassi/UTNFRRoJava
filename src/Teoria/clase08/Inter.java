package Teoria.clase08;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Inter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inter frame = new Inter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTitulo = new JLabel("Titulo");
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 34, 86, 20);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 12));
		lblNewLabel.setBounds(32, 38, 46, 14);
		desktopPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
			
		
		comboBox.setModel(new DefaultComboBoxModel(new Planeta[]{new Planeta("Marte",33),
				new Planeta("Neptuno",122),
				new Planeta("Zork",1433)}));
		comboBox.setBounds(136, 86, 97, 26);
		desktopPane.add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTitulo.setText(((Planeta)comboBox.getSelectedItem()).getDenominacion());
			
				
			}
		});
		btnNewButton.setBounds(147, 136, 89, 36);
		desktopPane.add(btnNewButton);
		
		
	}
}
