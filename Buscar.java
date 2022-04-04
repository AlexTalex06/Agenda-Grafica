import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Buscar extends JPanel implements ActionListener {
    private JButton btnBuscar;
    private JTextField txtNombre, txtTelefono, txtCorreo, txtFechaCum;
    Agenda ag = new Agenda();
    
    public Buscar() {
        setLayout(new GridLayout(7, 2));
        JLabel lblNombre = new JLabel("Nombre o Apodo: ", JLabel.RIGHT);
        txtNombre = new JTextField(15);
        add(lblNombre);
        add(txtNombre);
        
        JLabel lblTelefono = new JLabel("Numero de telefono: ", JLabel.RIGHT);
        txtTelefono = new JTextField(15);
        add(lblTelefono);
        add(txtTelefono);
        
        JLabel lblCorreo = new JLabel("Correo electronico: ", JLabel.RIGHT);
        txtCorreo = new JTextField(20);
        add(lblCorreo);
        add(txtCorreo);
        
        JLabel lblFechaCum = new JLabel("Fecha de nacimiento: ", JLabel.RIGHT);
        txtFechaCum = new JTextField(15);
        add(lblFechaCum);
        add(txtFechaCum);
        
        btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(this);
        add(btnBuscar);
        
        txtTelefono.setEditable(false);
        txtCorreo.setEditable(false);
        txtFechaCum.setEditable(false);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnBuscar) {
            if(txtNombre.getText() == null || txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Coloca el nombre que deseas buscar",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
                txtNombre.requestFocus();
            } else {
                String nombre = txtNombre.getText();
                int n = ag.getPersona(nombre);
                if(n != -2) {
                    Persona p = ag.buscar(n);
                    txtTelefono.setText(p.getTelefono());
                    txtCorreo.setText(p.getCorreo());
                    txtFechaCum.setText(p.getFechaCumple());
                } else {
                    JOptionPane.showMessageDialog(this,
                            "No hay ninguna persona registrada con ese nombre",
                            "ERROR",
                    JOptionPane.ERROR_MESSAGE);
                    txtNombre.requestFocus();
                }
            }
        }
    }
}
