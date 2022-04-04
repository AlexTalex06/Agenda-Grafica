import javax.swing.*;
import java.awt.*;
public class JFrameModificar extends JFrame {
    Modificar mostrar = new Modificar();
    public JFrameModificar() {
        initComponents();
    }
    
    private void initComponents() {
        this.setEnabled(true);
        setSize(350, 200);
        setTitle("Modificar Persona");
        setResizable(false);
        setContentPane(mostrar);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
