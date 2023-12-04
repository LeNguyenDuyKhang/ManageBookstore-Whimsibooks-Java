/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import bus.ChiTietHoaDon_BUS;
import bus.ChiTietTraHang_BUS;
import bus.HoaDonTra_BUS;
import bus.HoaDon_BUS;
import dao.ChiTietTraHang_DAO;
import entities.HoaDonTra;
import entities.HoaDon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utilities.ColorProcessing;
import utilities.CurrentSession;
import utilities.ErrorMessage;
import utilities.Numberic;

/**
 *
 * @author duong
 */
public class Form_TraHang extends javax.swing.JFrame {
    private JFrame frameOriginal;
    private DefaultTableModel tblModelTraHang;
    private TAB_BanHang tabBanHang;
    private HoaDon hoaDon; 
    private HoaDonTra hoaDonTra;
    private HoaDon_BUS hoaDon_BUS;
    private HoaDonTra_BUS hoaDonTra_BUS;
    private ChiTietHoaDon_BUS chiTietHoaDon_BUS;
    private ChiTietTraHang_BUS chiTietTraHang_BUS;
    /**
     * Creates new form Form_ThanhToan
     */
    public Form_TraHang() {
    }
    
    public Form_TraHang(HoaDon x, JFrame y, TAB_BanHang tab, HoaDonTra z) {  
        this.frameOriginal = y;
        this.hoaDon = x;
        this.hoaDonTra = z;
        this.tabBanHang = tab;
        
        hoaDon_BUS = new HoaDon_BUS();
        hoaDonTra_BUS = new HoaDonTra_BUS();
        chiTietHoaDon_BUS = new ChiTietHoaDon_BUS();
        chiTietTraHang_BUS = new ChiTietTraHang_BUS();
        
        
        y.setEnabled(false);
        //setUndecorated(true); 

       // getRootPane().setWindowDecorationStyle(JRootPane.);
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null); 
        
        lblCanThanhToan.setText(Numberic.formatVND(z.tinhTongHoan()));
        lblTongTien.setText(Numberic.formatVND(x.tinhTongTien()));
        lblMaHoaDon.setText(z.getHoaDonID());
        
        lblTraKhach.setText(Numberic.formatVND(z.tinhTongHoan()));
        
        String[] options = {"Sản phẩm lỗi do NSX", "Sản phẩm hết hạn", "Khách hàng đổi ý", "KH không hài lòng", "Không có lý do"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(options);
        JComboBox comboBox = new JComboBox(model);


        jTable1.setColumnSelectionAllowed(true);
        jTable1.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(comboBox));
        
        ArrayList<Object[]> cthdtList = hoaDonTra.tableChiTietHoaDon();
        if (cthdtList == null)
            cthdtList = new ArrayList<Object[]>();
        for (Object[] k : cthdtList){
            tblModelTraHang.addRow(k);
        }
        
        comboBox.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = comboBox.getSelectedIndex();
            if (jTable1.getSelectedRow() < 0)
                return;
            String selectedItem = comboBox.getSelectedItem().toString();

            // Do something with the selected item
            hoaDonTra.getListChiTietHoaDon().get(jTable1.getSelectedRow()).setLiDoTraHang(selectedItem);
        }
    });
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        lblCanThanhToan = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblTraKhach = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblMaHoaDon = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnBackThanhToan = new javax.swing.JButton();
        btnThanhToanHoanTat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Thanh toán");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 102, 165));
        jLabel1.setText("Thông tin hoá đơn mới & trả hàng");

        jPanel5.setBackground(new java.awt.Color(245, 247, 249));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Tổng hoàn");

        lblCanThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCanThanhToan.setForeground(new java.awt.Color(255, 0, 0));
        lblCanThanhToan.setText("100,000 VND");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Cần trả lại khách");

        lblTraKhach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTraKhach.setForeground(new java.awt.Color(255, 0, 0));
        lblTraKhach.setText("100,000 VND");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCanThanhToan, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTraKhach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCanThanhToan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTraKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 247, 249));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã hoá đơn trả");

        lblMaHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMaHoaDon.setForeground(new java.awt.Color(15, 102, 165));
        lblMaHoaDon.setText("HD110923001");

        lblTongTien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(15, 102, 165));
        lblTongTien.setText("120,000 VND");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tổng tiền hoá đơn mới");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMaHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        java.awt.GridBagLayout jPanel6Layout = new java.awt.GridBagLayout();
        jPanel6Layout.columnWidths = new int[] {0, 14, 0};
        jPanel6Layout.rowHeights = new int[] {0};
        jPanel6.setLayout(jPanel6Layout);

        btnBackThanhToan.setBackground(new java.awt.Color(239, 162, 162));
        btnBackThanhToan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBackThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnBackThanhToan.setText("Quay lại");
        btnBackThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackThanhToanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        jPanel6.add(btnBackThanhToan, gridBagConstraints);

        btnThanhToanHoanTat.setBackground(new java.awt.Color(83, 182, 118));
        btnThanhToanHoanTat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThanhToanHoanTat.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToanHoanTat.setText("Hoàn tất");
        btnThanhToanHoanTat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanHoanTatActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        jPanel6.add(btnThanhToanHoanTat, gridBagConstraints);

        jTable1.setModel(tblModelTraHang = new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "STT", "Tên sản phẩm", "Số lượng", "Chọn lí do trả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (ErrorMessage.showConfirmDialogYesNo("Xác nhận thoát", "Hoá đơn này chưa được thanh toán, bạn đã chắc chắn muốn thoát?")){
        	closeFormThanhToan();
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnThanhToanHoanTatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanHoanTatActionPerformed
        // TODO add your handling code here:
    	hoaDon_BUS.cancelHoaDon(hoaDon);
        
        hoaDonTra.setNgayTraHoaDon(new Date());
        hoaDon.setNgayLapHoaDon(hoaDonTra.getNgayTraHoaDon());
        hoaDon.setNhanVien(CurrentSession.getNhanVien());
        hoaDonTra.setNhanVien(CurrentSession.getNhanVien());
        hoaDonTra.setKhachHang(hoaDon.getKhachHang());

        boolean result = hoaDonTra_BUS.createHoaDon(hoaDonTra);
        
        if (!result){
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi khởi tạo hoá đơn trả.");
            return;
        }
        
        result = chiTietTraHang_BUS.addNhieuChiTietCuaMotHoaDon(hoaDonTra.getListChiTietHoaDon());
        if (!result) {
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi thêm chi tiết trả hàng.");
            return;
        }
    	hoaDon.setHoaDonID(null);
    	
    	hoaDon.setTrangThai("DA_XU_LY");
        result = hoaDon_BUS.createHoaDon(hoaDon);
        
        if (!result){
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi khởi tạo hoá đơn.");
            return;
        }
        
        result = chiTietHoaDon_BUS.addNhieuChiTietCuaMotHoaDon(hoaDon.getListChiTietHoaDon());
        if (!result) {
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi thêm chi tiết hoá đơn.");
            return;
        }
        
       
        tabBanHang.thanhToanHoanTat();
        closeFormThanhToan();
    }//GEN-LAST:event_btnThanhToanHoanTatActionPerformed

    private void btnBackThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackThanhToanActionPerformed
        // TODO add your handling code here:
        if (ErrorMessage.showConfirmDialogYesNo("Xác nhận thoát", "Hoá đơn này chưa được thanh toán, bạn đã chắc chắn muốn thoát?")){
            closeFormThanhToan();
        }
    }//GEN-LAST:event_btnBackThanhToanActionPerformed

    private void calcTrangThai(String temp){

    }
    
    private void closeFormThanhToan() {
    	if (frameOriginal != null) {
    		frameOriginal.setEnabled(true);
    	}
        this.dispose();
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackThanhToan;
    private javax.swing.JButton btnThanhToanHoanTat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCanThanhToan;
    private javax.swing.JLabel lblMaHoaDon;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblTraKhach;
    // End of variables declaration//GEN-END:variables

}
