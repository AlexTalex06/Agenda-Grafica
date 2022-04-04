import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu extends JPanel implements ActionListener {
    private JButton btnAlta, btnBuscar, btnEliminar, btnModificar, btnSalir;
    
    public Menu() {
        btnAlta = new JButton("Registrar nuevo contacto");
        btnAlta.addActionListener(this);
        btnBuscar = new JButton("Buscar Persona");
        btnBuscar.addActionListener(this);
        btnEliminar = new JButton("Eliminar Persona");
        btnEliminar.addActionListener(this);
        btnModificar = new JButton("Modificar Datos");
        btnModificar.addActionListener(this);
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);
        add(btnAlta);
        add(btnBuscar);
        add(btnEliminar);
        add(btnModificar);
        add(btnSalir);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAlta) {
            JFrameAlta Alta = new JFrameAlta();
        }
        
        if(e.getSource() == btnBuscar) {
            JFrameBuscar busc = new JFrameBuscar();
        }
                
        if(e.getSource() == btnModificar) {
            JFrameModificar modificar = new JFrameModificar();
        }
        
        if(e.getSource() == btnEliminar) {
            JFrameEliminar eliminar = new JFrameEliminar();
        }
        
        if(e.getSource() == btnSalir) {
            System.exit(0);      
         }
    }
}
