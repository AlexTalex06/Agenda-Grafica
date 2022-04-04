import javax.swing.*;
import java.awt.*;
public class JFrameEliminar extends JFrame {
    Eliminar mostrar = new Eliminar();
    
    public JFrameEliminar() {
        initComponents();
    }
    
    private void initComponents() {
        this.setEnabled(true);
        setSize(350, 200);
        setTitle("Eliminar Persona :(");
        setResizable(false);
        setContentPane(mostrar);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
