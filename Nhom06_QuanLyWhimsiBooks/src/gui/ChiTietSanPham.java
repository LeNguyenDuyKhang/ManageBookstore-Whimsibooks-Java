/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import entities.SanPham;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ChiTietSanPham extends javax.swing.JPanel {
    private SanPham sanPham;
    /**
     * Creates new form ChiTietSanPham
     */
    public ChiTietSanPham() {
        initComponents();
    }
    
    public ChiTietSanPham(SanPham x) {
        initComponents();
        this.sanPham = x;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Component_SanPham = new javax.swing.JPanel();
        jPanel_Box_Left = new javax.swing.JPanel();
        jPanel_Img = new javax.swing.JPanel();
        jPanel_Info_SanPham1 = new javax.swing.JPanel();
        jPanel159 = new javax.swing.JPanel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel_TenSanPham1 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel160 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel161 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel162 = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel163 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel164 = new javax.swing.JPanel();
        jButton28 = new javax.swing.JButton();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 30), new java.awt.Dimension(10, 10));
        jButton29 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Component_SanPham.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_Component_SanPham.setMinimumSize(new java.awt.Dimension(430, 300));
        jPanel_Component_SanPham.setLayout(new javax.swing.BoxLayout(jPanel_Component_SanPham, javax.swing.BoxLayout.LINE_AXIS));

        jPanel_Img.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout jPanel_ImgLayout = new javax.swing.GroupLayout(jPanel_Img);
        jPanel_Img.setLayout(jPanel_ImgLayout);
        jPanel_ImgLayout.setHorizontalGroup(
            jPanel_ImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel_ImgLayout.setVerticalGroup(
            jPanel_ImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_Box_LeftLayout = new javax.swing.GroupLayout(jPanel_Box_Left);
        jPanel_Box_Left.setLayout(jPanel_Box_LeftLayout);
        jPanel_Box_LeftLayout.setHorizontalGroup(
            jPanel_Box_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Box_LeftLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jPanel_Img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_Box_LeftLayout.setVerticalGroup(
            jPanel_Box_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Box_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Component_SanPham.add(jPanel_Box_Left);

        jPanel_Info_SanPham1.setLayout(new java.awt.BorderLayout());

        jPanel159.setLayout(new javax.swing.BoxLayout(jPanel159, javax.swing.BoxLayout.Y_AXIS));
        jPanel159.add(filler8);
        jPanel159.add(filler10);

        jPanel_TenSanPham1.setAlignmentX(0.0F);
        jPanel_TenSanPham1.setLayout(new javax.swing.BoxLayout(jPanel_TenSanPham1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel132.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel132.setText("Tên sản phẩm: ");
        jPanel_TenSanPham1.add(jLabel132);

        jLabel133.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel133.setText("Field_TenSanPham");
        jPanel_TenSanPham1.add(jLabel133);

        jPanel159.add(jPanel_TenSanPham1);
        jPanel159.add(filler1);

        jPanel160.setAlignmentX(0.0F);
        jPanel160.setLayout(new javax.swing.BoxLayout(jPanel160, javax.swing.BoxLayout.LINE_AXIS));

        jLabel124.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel124.setText("Tác giả: ");
        jPanel160.add(jLabel124);

        jLabel125.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel125.setText("Field_TacGia");
        jPanel160.add(jLabel125);

        jPanel159.add(jPanel160);
        jPanel159.add(filler2);

        jPanel161.setAlignmentX(0.0F);
        jPanel161.setLayout(new javax.swing.BoxLayout(jPanel161, javax.swing.BoxLayout.LINE_AXIS));

        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel126.setText("Nhà xuất bản: ");
        jPanel161.add(jLabel126);

        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel127.setText("Field_NhaXuatBan");
        jPanel161.add(jLabel127);

        jPanel159.add(jPanel161);
        jPanel159.add(filler3);

        jPanel162.setAlignmentX(0.0F);
        jPanel162.setLayout(new javax.swing.BoxLayout(jPanel162, javax.swing.BoxLayout.LINE_AXIS));

        jLabel128.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel128.setText("Danh mục: ");
        jPanel162.add(jLabel128);

        jLabel129.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel129.setText("Field_DanhMuc");
        jPanel162.add(jLabel129);

        jPanel159.add(jPanel162);
        jPanel159.add(filler4);

        jPanel163.setAlignmentX(0.0F);
        jPanel163.setLayout(new javax.swing.BoxLayout(jPanel163, javax.swing.BoxLayout.LINE_AXIS));

        jLabel130.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel130.setText("Số lượng: ");
        jPanel163.add(jLabel130);

        jLabel131.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel131.setText("Field_SoLuong");
        jPanel163.add(jLabel131);

        jPanel159.add(jPanel163);
        jPanel159.add(filler5);
        jPanel159.add(filler6);
        jPanel159.add(filler7);

        jPanel164.setAlignmentX(0.0F);
        jPanel164.setLayout(new javax.swing.BoxLayout(jPanel164, javax.swing.BoxLayout.LINE_AXIS));

        jButton28.setBackground(new java.awt.Color(85, 182, 83));
        jButton28.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Sửa");
        jButton28.setAutoscrolls(true);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel164.add(jButton28);
        jPanel164.add(filler9);

        jButton29.setBackground(new java.awt.Color(219, 79, 78));
        jButton29.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("Ngừng bán");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgungKDActionPerformed(evt);
            }
        });
        jPanel164.add(jButton29);

        jPanel159.add(jPanel164);

        jPanel_Info_SanPham1.add(jPanel159, java.awt.BorderLayout.CENTER);

        jPanel_Component_SanPham.add(jPanel_Info_SanPham1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_Component_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Component_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, sanPham.getTenSanPham());
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnNgungKDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgungKDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNgungKDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel_Box_Left;
    private javax.swing.JPanel jPanel_Component_SanPham;
    private javax.swing.JPanel jPanel_Img;
    private javax.swing.JPanel jPanel_Info_SanPham1;
    private javax.swing.JPanel jPanel_TenSanPham1;
    // End of variables declaration//GEN-END:variables
}
