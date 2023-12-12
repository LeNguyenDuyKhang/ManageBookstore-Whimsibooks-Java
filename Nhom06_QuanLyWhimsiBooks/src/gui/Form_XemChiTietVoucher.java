/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import bus.KhuyenMai_BUS;
import entities.KhuyenMai;

/**
 *
 * @author NguyenThanhLuan
 */
public class Form_XemChiTietVoucher extends javax.swing.JFrame {
	private DefaultTableModel tableModelVoucher;
	private KhuyenMai_BUS khuyenMai_BUS;
	
	
	private void loadData(String tenSK) {
		ArrayList<KhuyenMai> khuyenMais = khuyenMai_BUS.getKhuyenMaiTheoTen1(tenSK);
		int count = 0, countDa = 0;
		KhuyenMai khuyenMai = new KhuyenMai();
		for(KhuyenMai km : khuyenMais) {
			khuyenMai = km;
			String trangThai = "Chưa sử dụng";
			if(km.getSoLuotDaApDung() != 0) {
				trangThai = "Đã sử dụng";
				countDa++;
			}
			tableModelVoucher.addRow(new Object[] {km.getCodeKhuyenMai(), km.getLoaiKhuyenMai(), km.getDonHangTu(), km.getGiaTri(),trangThai});
			count++;
		}
		txtTen.setText(khuyenMai.getTenKhuyenMai());
		txtNBD.setText(khuyenMai.getNgayKhuyenMai()+"");
		txtNKT.setText(khuyenMai.getNgayHetHanKM()+"");
		txtSL.setText(count+"");
		txtDaSD.setText(countDa+"");
		txtChuaSD.setText((count - countDa)+"");
	}
	
    /**
     * Creates new form Form_XemChiTietVoucher
     */
    public Form_XemChiTietVoucher(String tenSK) {
        initComponents();
        khuyenMai_BUS = new KhuyenMai_BUS();
        loadData(tenSK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ALL = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        lblTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lblNgayBatDau = new javax.swing.JLabel();
        txtNBD = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lblNgayKetThuc = new javax.swing.JLabel();
        txtNKT = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtSoLuong = new javax.swing.JLabel();
        txtSL = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtChuaSD = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtDaSD = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVoucher = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        back = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        ALL.setLayout(new java.awt.BorderLayout());
        ALL.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(316, 80));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jPanel14.setLayout(new java.awt.GridLayout(3, 1));

        jPanel15.setLayout(new javax.swing.BoxLayout(jPanel15, javax.swing.BoxLayout.LINE_AXIS));

        lblTen.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblTen.setForeground(new java.awt.Color(15, 145, 239));
        lblTen.setText("Tên sự kiện: ");
        lblTen.setMaximumSize(new java.awt.Dimension(100, 16));
        lblTen.setMinimumSize(new java.awt.Dimension(100, 16));
        lblTen.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel15.add(lblTen);

        txtTen.setText("jLabel2");
        jPanel15.add(txtTen);

        jPanel14.add(jPanel15);

        jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.LINE_AXIS));

        lblNgayBatDau.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblNgayBatDau.setForeground(new java.awt.Color(15, 145, 239));
        lblNgayBatDau.setText("Ngày bắt đầu: ");
        lblNgayBatDau.setMaximumSize(new java.awt.Dimension(100, 16));
        lblNgayBatDau.setMinimumSize(new java.awt.Dimension(100, 16));
        lblNgayBatDau.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel16.add(lblNgayBatDau);

        txtNBD.setText("jLabel2");
        jPanel16.add(txtNBD);

        jPanel14.add(jPanel16);

        jPanel17.setLayout(new javax.swing.BoxLayout(jPanel17, javax.swing.BoxLayout.LINE_AXIS));

        lblNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblNgayKetThuc.setForeground(new java.awt.Color(15, 145, 239));
        lblNgayKetThuc.setText("Ngày kết thúc: ");
        lblNgayKetThuc.setMaximumSize(new java.awt.Dimension(100, 16));
        lblNgayKetThuc.setMinimumSize(new java.awt.Dimension(100, 16));
        lblNgayKetThuc.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel17.add(lblNgayKetThuc);

        txtNKT.setText("jLabel2");
        jPanel17.add(txtNKT);

        jPanel14.add(jPanel17);

        jPanel5.add(jPanel14);

        jPanel7.setLayout(new java.awt.GridLayout(3, 1));

        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtSoLuong.setForeground(new java.awt.Color(15, 145, 239));
        txtSoLuong.setText("Số lượng Voucher: ");
        txtSoLuong.setMaximumSize(new java.awt.Dimension(120, 16));
        txtSoLuong.setMinimumSize(new java.awt.Dimension(100, 16));
        txtSoLuong.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel9.add(txtSoLuong);

        txtSL.setText("jLabel2");
        jPanel9.add(txtSL);

        jPanel7.add(jPanel9);

        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(15, 145, 239));
        jLabel13.setText("Chưa sử dụng: ");
        jLabel13.setMaximumSize(new java.awt.Dimension(120, 16));
        jLabel13.setMinimumSize(new java.awt.Dimension(120, 16));
        jLabel13.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel13.add(jLabel13);

        txtChuaSD.setText("jLabel2");
        jPanel13.add(txtChuaSD);

        jPanel7.add(jPanel13);

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(15, 145, 239));
        jLabel6.setText("Đã sử dụng: ");
        jLabel6.setMaximumSize(new java.awt.Dimension(120, 16));
        jLabel6.setMinimumSize(new java.awt.Dimension(120, 16));
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel8.add(jLabel6);

        txtDaSD.setText("jLabel2");
        jPanel8.add(txtDaSD);

        jPanel7.add(jPanel8);

        jPanel5.add(jPanel7);

        jPanel4.add(jPanel5, java.awt.BorderLayout.NORTH);

        tableVoucher.setModel(tableModelVoucher = new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã giảm giá", "Hình thức giảm","Đon hàng từ" ,"Mức giảm giá", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVoucherMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVoucher);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        ALL.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 14));
        jPanel2.add(filler2);

        back.setText("Trở về");
        back.setPreferredSize(new java.awt.Dimension(120, 30));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back);
        jPanel2.add(filler1);

        ALL.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon-voucher.png"))); // NOI18N
        jPanel3.add(jLabel3);

        ALL.add(jPanel3, java.awt.BorderLayout.LINE_START);

        getContentPane().add(ALL, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVoucherMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableVoucherMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
            this.setVisible(false);
            this.dispose();
    }//GEN-LAST:event_backActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ALL;
    private javax.swing.JButton back;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNgayBatDau;
    private javax.swing.JLabel lblNgayKetThuc;
    private javax.swing.JLabel lblTen;
    private javax.swing.JTable tableVoucher;
    private javax.swing.JLabel txtChuaSD;
    private javax.swing.JLabel txtDaSD;
    private javax.swing.JLabel txtNBD;
    private javax.swing.JLabel txtNKT;
    private javax.swing.JLabel txtSL;
    private javax.swing.JLabel txtSoLuong;
    private javax.swing.JLabel txtTen;
    // End of variables declaration//GEN-END:variables
}
