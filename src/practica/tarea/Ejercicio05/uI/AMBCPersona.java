package practica.tarea.Ejercicio05.uI;
//
import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import practica.tarea.Ejercicio05.Entities.Categoría;
import practica.tarea.Ejercicio05.Entities.Persona;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import practica.tarea.Ejercicio05.logic.*;
import practica.tarea.Ejercicio05.util.AppDataException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JComboBox;
public class AMBCPersona extends JInternalFrame {

	private ControladorABMCPersonas ctrl= new ControladorABMCPersonas();
	
	
	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JCheckBox chckbxHabilitado;
	private JTextField textField;
	private JComboBox cboCategoria;

	/**
	 * Launch the applicatioN.
	 */
	public static void Oldmain(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AMBCPersona frame = new AMBCPersona();
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
	public AMBCPersona() {
		setClosable(true);
		setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 386, 339);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDni = new JLabel("DNI");
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		
		chckbxHabilitado = new JCheckBox("Habilitado");
		chckbxHabilitado.setSelected(true);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {	
					buscarClick();
			}
		});
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			agregarClick();
			
			}
		});
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			borrarClick();
			
			}
		});
		
		
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			modificarClick();
			}
		});
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("Id");
		
		JLabel lblCategoria = new JLabel("Categoria");
		
		cboCategoria = new JComboBox();
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblApellido)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
							.addComponent(lblId)
							.addGap(18)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDni)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNombre)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(33)
							.addComponent(btnBuscar))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAgregar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnBorrar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnModificar)
					.addContainerGap(125, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblCategoria)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cboCategoria, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(181, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(chckbxHabilitado)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDni)
						.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombre)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellido)
						.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblId))
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategoria)
						.addComponent(cboCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addComponent(chckbxHabilitado)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAgregar)
						.addComponent(btnBorrar)
						.addComponent(btnModificar))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		cargarListas();
	}

	private void cargarListas() {
		
			try {
				this.cboCategoria.setModel(new DefaultComboBoxModel(ctrl.getCategorias().toArray()));
				this.cboCategoria.setSelectedIndex(-1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
	}
	
	
	protected void buscarClick() {
		//p.setDni(this.txtDni.getText()); //Aqui pasamos el control grafico//
		try {
			this.mapearAForm(ctrl.getByDni(this.mapearDeForm()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this,"Error, No existe una persona con ese Dni");
		}
	}
	
	protected void agregarClick(){
		//p.setDni(this.txtDni.getText());
		try {
			ctrl.crearPersona(this.mapearDeForm());
			JOptionPane.showMessageDialog(null,"Persona agregada Exitosamente");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this,"Error, Ya existe una persona con ese DNI");
		}
		
		
		
					}
	
	protected void borrarClick() {
		//p.setDni(this.txtDni.getText());
		try {
			ctrl.borrarPersona(this.mapearDeForm());
			JOptionPane.showMessageDialog(null,"Persona Borrada Con exito");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this,"Error, No existe una persona con ese DNI");
		}
		
				
				}
				protected void modificarClick(){
					try {
						ctrl.actualizarPersona(this.mapearDeForm());
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(this, e.getMessage());
					}
					
				
				}
					
					
					
					
	
	
	
	
	private void mapearAForm(Persona p) {   //Este metodo pone los datos en el formulario//
		if(!String.valueOf(p.getId()).isEmpty()) {
			this.textField.setText(String.valueOf(p.getId()));
		}
		this.txtDni.setText(p.getDni());
		this.txtNombre.setText(p.getNombre());
		this.txtApellido.setText(p.getApellido());
		this.chckbxHabilitado.setSelected(p.isHabilitado());
		this.cboCategoria.setSelectedItem(p.getCategoria());
		
		
		
		
		
	}

	private Persona mapearDeForm ()
	{ 
		Persona p= new Persona();
		if(!this.textField.getText().isEmpty()) {
			p.setId(Integer.parseInt(this.textField.getText()));
		}
		p.setDni(this.txtDni.getText());
		p.setNombre(this.txtNombre.getText());
		p.setApellido(this.txtApellido.getText());
		p.setApellido(this.txtApellido.getText());
		p.setHabilitado(this.chckbxHabilitado.isSelected());
		if (cboCategoria.getSelectedIndex() != -1){
			p.setCategoria((Categoría)this.cboCategoria.getSelectedItem());
		}
		return p;
				
		
	}	

	
	

	

	public void showPersona(Persona p){
		this.mapearAForm(p);
	}



}
