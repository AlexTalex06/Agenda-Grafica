import javax.swing.*;
import java.awt.*;
public class JFrameBuscar extends JFrame {
    Buscar mostrar = new Buscar();
    
    public JFrameBuscar() {
        initComponents();
    }
    
    private void initComponents() {
        this.setEnabled(true);
        setSize(350, 200);
        setTitle("Buscar persona");
        setResizable(false);
        setContentPane(mostrar);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
