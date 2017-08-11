package practica.tarea.Ejercicio05.uI;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

import javax.swing.JScrollPane;
import practica.tarea.Ejercicio05.Entities.Persona;
import practica.tarea.Ejercicio05.logic.ControladorABMCPersonas;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class ListadoPersonas extends JInternalFrame {
	private ArrayList<Persona> pers;
	ControladorABMCPersonas ctrl= new ControladorABMCPersonas();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoPersonas frame = new ListadoPersonas();
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
	public ListadoPersonas() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		try {
			setClosed(true);
		} catch (PropertyVetoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setClosable(true);
		setBounds(100, 100, 500, 426);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnEditarClick();
				}
		});
		
		JButton btnMostrar = new JButton("Refrescar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listado();
				initDataBindings();}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(32, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
							.addGap(25))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnMostrar, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(85))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEditar)
						.addComponent(btnMostrar))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		listado();
		initDataBindings();
		
	}

	private void listado() {
		try{
			this.pers=ctrl.getAll();
		} catch (Exception e){
			JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
	
		}
		
	}

	protected void btnEditarClick() {
		int indexPersona;
		try {
			indexPersona = table.convertRowIndexToModel(table.getSelectedRow());
			
			AMBCPersona pd= new AMBCPersona();
			pd.showPersona(this.pers.get(indexPersona));
			
			this.getDesktopPane().add(pd);
			pd.setVisible(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "Por favor seleccione una columna");
		}
		
		
		
	}
	
	protected void initDataBindings() {
		JTableBinding<Persona, List<Persona>, JTable> jTableBinding = SwingBindings.createJTableBinding(UpdateStrategy.READ, pers, table);
		//
		BeanProperty<Persona, String> personaBeanProperty = BeanProperty.create("dni");
		jTableBinding.addColumnBinding(personaBeanProperty).setColumnName("DNI");
		//
		BeanProperty<Persona, String> personaBeanProperty_1 = BeanProperty.create("nombre");
		jTableBinding.addColumnBinding(personaBeanProperty_1).setColumnName("Nombre");
		//
		BeanProperty<Persona, String> personaBeanProperty_2 = BeanProperty.create("apellido");
		jTableBinding.addColumnBinding(personaBeanProperty_2).setColumnName("Apellido");
		//
		BeanProperty<Persona, String> personaBeanProperty_3 = BeanProperty.create("categoria.descripcion");
		jTableBinding.addColumnBinding(personaBeanProperty_3).setColumnName("Categoria");
		//
		jTableBinding.bind();
	}
}
