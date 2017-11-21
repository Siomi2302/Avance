package interfaz;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Main extends javax.swing.JFrame {

    private Graphics dibujo;
    private int x, y, mouseX, mouseY;
    
    public Main() {
        initComponents();
        dibujo=Panel.getGraphics();
        addEventos();
        this.setLocationRelativeTo(null);
    }

    public void addEventos(){
    Panel.addMouseMotionListener(new MouseMotionAdapter(){
        @Override
        public void mouseMoved(MouseEvent evento){
            coordenadasLabel.setText(String.format("Coordenadas: [%d, %d]",
            evento.getX(),evento.getY()));
            mouseX = evento.getX();
            mouseY = evento.getY();
            if(cuadradoRButton.isSelected())
                dibujarCuadrado();
        }
    });
    }
    
    void dibujarCuadrado()
    {
        for(;x != mouseX; )
        {
            for(; y != mouseY; )
            {
                if(y > mouseY)
                    y--;
                else
                    y++;
            }
            
            if(x > mouseX)
                    x--;
                else
                    x++;
            
            x = Panel.getWidth()/2 - 25;
            y = Panel.getHeight()/2 - 25;
            dibujo.setColor(Color.blue);
            dibujo.drawRect(x, y, 50, 50);
            dibujo.fillRect(x, y, 50, 50);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botones = new javax.swing.ButtonGroup();
        cuadradoRButton = new javax.swing.JRadioButton();
        circuloRButton = new javax.swing.JRadioButton();
        ambosRButton = new javax.swing.JRadioButton();
        Panel = new javax.swing.JPanel();
        coordenadasLabel = new javax.swing.JLabel();
        salirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(556, 510));
        setMinimumSize(new java.awt.Dimension(556, 510));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(556, 510));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botones.add(cuadradoRButton);
        cuadradoRButton.setText("Cuadrado");
        cuadradoRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadradoRButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cuadradoRButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        Botones.add(circuloRButton);
        circuloRButton.setText("Circulo");
        getContentPane().add(circuloRButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        Botones.add(ambosRButton);
        ambosRButton.setText("Ambos");
        getContentPane().add(ambosRButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Plano"));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 530, 380));

        coordenadasLabel.setText("Coordenadas:");
        getContentPane().add(coordenadasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        salirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/salir.png"))); // NOI18N
        salirButton.setBorder(null);
        salirButton.setBorderPainted(false);
        salirButton.setContentAreaFilled(false);
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        getContentPane().add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirButtonActionPerformed

    private void cuadradoRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoRButtonActionPerformed
       //vfddss
    }//GEN-LAST:event_cuadradoRButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup Botones;
    private javax.swing.JPanel Panel;
    private javax.swing.JRadioButton ambosRButton;
    private javax.swing.JRadioButton circuloRButton;
    private javax.swing.JLabel coordenadasLabel;
    private javax.swing.JRadioButton cuadradoRButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
}
