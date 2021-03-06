package librarymanagement;

import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Browse extends javax.swing.JPanel {

    Image im;

    public Browse() {
        try {

            FileInputStream fin = new FileInputStream("D:\\IconLibrary\\setim.jpg");
            im = ImageIO.read(fin);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        // initComponents();
    }

    public void paintComponent(Graphics g) {

        g.drawImage(im, 0, 0, 98, 124, this);
    }

    public void setImage(String fname) {
        try {
            FileInputStream fi = new FileInputStream(fname);
            im = ImageIO.read(fi);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
