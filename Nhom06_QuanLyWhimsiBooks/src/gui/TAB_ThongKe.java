/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import bus.ThongKe_BUS;
import ultilities.chartbar.Chart;
import ultilities.chartbar.ModelChart;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import utilities.Numberic;

/**
 *
 * @author duong
 */
public class TAB_ThongKe extends javax.swing.JPanel {

    private ThongKe_BUS thongKe_BUS;
    private String[] quyTRANS = {"", "I", "II", "III", "IV"};

    /**
     * Creates new form TAB_ThongKe
     */
    public TAB_ThongKe() {
        thongKe_BUS = new ThongKe_BUS();

        initComponents();
        Date ngayKetThuc = new Date();

        Date ngayBatDau = new Date();
        ngayBatDau.setDate(ngayKetThuc.getDate() - 7);
        chart.addLegend("Doanh thu", new Color(245, 189, 135), new Color(245, 189, 135));
        chart.addLegend("Tiền vốn", new Color(135, 189, 245), new Color(135, 189, 245));
        chart.addLegend("Lợi nhuận", new Color(189, 135, 245), new Color(189, 135, 245));
        chart.addLegend("Trả hàng", new Color(139, 229, 222), new Color(139, 229, 222));
        loadThongKe(ngayBatDau, ngayKetThuc, "7 ngày gần đây", 0);

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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 15), new java.awt.Dimension(10, 15), new java.awt.Dimension(10, 15));
        jPanel13 = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jLabel11 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jComboBox1 = new javax.swing.JComboBox<>();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel14 = new javax.swing.JPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jLabel12 = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        cboBaoCaoTheo = new javax.swing.JComboBox<>();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel15 = new javax.swing.JPanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jLabel13 = new javax.swing.JLabel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel16 = new javax.swing.JPanel();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        txtNgayBatDau = new com.toedter.calendar.JDateChooser();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel17 = new javax.swing.JPanel();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jLabel14 = new javax.swing.JLabel();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel18 = new javax.swing.JPanel();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        jPanel19 = new javax.swing.JPanel();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        btnThongKe = new javax.swing.JButton();
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        filler27 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20), new java.awt.Dimension(20, 20));
        jPanel20 = new javax.swing.JPanel();
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        btnXuatExel = new javax.swing.JButton();
        filler26 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10));
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTienVon = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblTraHang = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblLoiNhuan = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblDoanhThu = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        chart = new utilities.chartline.CurveLineChart();
        jPanel2 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel6.setMaximumSize(new java.awt.Dimension(200, 600));
        jPanel6.setPreferredSize(new java.awt.Dimension(70, 516));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Tuỳ chọn báo cáo");
        jPanel12.add(jLabel10);

        jPanel6.add(jPanel12);

        filler2.setEnabled(false);
        jPanel6.add(filler2);

        jPanel13.setEnabled(false);
        jPanel13.setMaximumSize(new java.awt.Dimension(300, 25));
        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));
        jPanel13.add(filler5);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Thống kê theo:");
        jPanel13.add(jLabel11);
        jPanel13.add(filler3);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sản phẩm" }));
        jPanel13.add(jComboBox1);
        jPanel13.add(filler8);

        jPanel6.add(jPanel13);
        jPanel6.add(filler1);

        jPanel14.setMaximumSize(new java.awt.Dimension(300, 25));
        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.LINE_AXIS));
        jPanel14.add(filler6);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Báo cáo theo:  ");
        jPanel14.add(jLabel12);
        jPanel14.add(filler4);

        cboBaoCaoTheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7 ngày qua", "Tháng trước", "Năm trước", "Quý", "Thời gian tuỳ chọn" }));
        jPanel14.add(cboBaoCaoTheo);
        jPanel14.add(filler7);

        jPanel6.add(jPanel14);
        jPanel6.add(filler12);

        jPanel15.setMaximumSize(new java.awt.Dimension(300, 25));
        jPanel15.setLayout(new javax.swing.BoxLayout(jPanel15, javax.swing.BoxLayout.LINE_AXIS));
        jPanel15.add(filler9);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Thời gian bắt đầu:");
        jPanel15.add(jLabel13);
        jPanel15.add(filler10);

        jPanel6.add(jPanel15);
        jPanel6.add(filler13);

        jPanel16.setMaximumSize(new java.awt.Dimension(300, 25));
        jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.LINE_AXIS));
        jPanel16.add(filler14);
        jPanel16.add(txtNgayBatDau);
        jPanel16.add(filler16);

        jPanel6.add(jPanel16);
        jPanel6.add(filler11);

        jPanel17.setMaximumSize(new java.awt.Dimension(300, 25));
        jPanel17.setLayout(new javax.swing.BoxLayout(jPanel17, javax.swing.BoxLayout.LINE_AXIS));
        jPanel17.add(filler15);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Thời gian kết thúc:");
        jPanel17.add(jLabel14);
        jPanel17.add(filler17);
        jPanel17.add(filler18);

        jPanel6.add(jPanel17);
        jPanel6.add(filler19);

        jPanel18.setMaximumSize(new java.awt.Dimension(300, 25));
        jPanel18.setLayout(new javax.swing.BoxLayout(jPanel18, javax.swing.BoxLayout.LINE_AXIS));
        jPanel18.add(filler21);
        jPanel18.add(txtNgayKetThuc);
        jPanel18.add(filler22);

        jPanel6.add(jPanel18);
        jPanel6.add(filler20);

        jPanel19.setMaximumSize(new java.awt.Dimension(300, 50));
        jPanel19.setPreferredSize(new java.awt.Dimension(95, 50));
        jPanel19.setLayout(new java.awt.GridBagLayout());
        jPanel19.add(filler23, new java.awt.GridBagConstraints());

        btnThongKe.setBackground(new java.awt.Color(15, 145, 239));
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKe.setText("Thống kê");
        btnThongKe.setPreferredSize(new java.awt.Dimension(200, 50));
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel19.add(btnThongKe, gridBagConstraints);
        jPanel19.add(filler24, new java.awt.GridBagConstraints());

        jPanel6.add(jPanel19);
        jPanel6.add(filler27);

        jPanel20.setMaximumSize(new java.awt.Dimension(300, 50));
        jPanel20.setPreferredSize(new java.awt.Dimension(95, 50));
        jPanel20.setLayout(new java.awt.GridBagLayout());
        jPanel20.add(filler25, new java.awt.GridBagConstraints());

        btnXuatExel.setBackground(new java.awt.Color(85, 182, 83));
        btnXuatExel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXuatExel.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatExel.setText("Xuất Excel");
        btnXuatExel.setPreferredSize(new java.awt.Dimension(200, 50));
        btnXuatExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel20.add(btnXuatExel, gridBagConstraints);
        jPanel20.add(filler26, new java.awt.GridBagConstraints());

        jPanel6.add(jPanel20);

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(jPanel3, gridBagConstraints);

        java.awt.GridBagLayout jPanel4Layout = new java.awt.GridBagLayout();
        jPanel4Layout.columnWidths = new int[] {0};
        jPanel4Layout.rowHeights = new int[] {0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0};
        jPanel4.setLayout(jPanel4Layout);

        java.awt.GridBagLayout jPanel5Layout = new java.awt.GridBagLayout();
        jPanel5Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel5Layout.rowHeights = new int[] {0};
        jPanel5.setLayout(jPanel5Layout);

        jPanel8.setBackground(new java.awt.Color(20, 116, 185));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tổng vốn");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel8.add(jLabel1, gridBagConstraints);

        lblTienVon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTienVon.setForeground(new java.awt.Color(255, 255, 255));
        lblTienVon.setText("1,000,000,000 đ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel8.add(lblTienVon, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(jPanel8, gridBagConstraints);

        jPanel9.setBackground(new java.awt.Color(20, 116, 185));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Trả hàng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel9.add(jLabel3, gridBagConstraints);

        lblTraHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTraHang.setForeground(new java.awt.Color(255, 255, 255));
        lblTraHang.setText("1,000,000,000 đ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel9.add(lblTraHang, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(jPanel9, gridBagConstraints);

        jPanel10.setBackground(new java.awt.Color(20, 116, 185));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lợi nhuận");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel10.add(jLabel5, gridBagConstraints);

        lblLoiNhuan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoiNhuan.setForeground(new java.awt.Color(255, 255, 255));
        lblLoiNhuan.setText("1,000,000,000 đ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel10.add(lblLoiNhuan, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(jPanel10, gridBagConstraints);

        jPanel11.setBackground(new java.awt.Color(20, 116, 185));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Doanh thu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel11.add(jLabel7, gridBagConstraints);

        lblDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        lblDoanhThu.setText("1,000,000,000 đ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        jPanel11.add(lblDoanhThu, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(jPanel11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel4.add(jPanel5, gridBagConstraints);

        java.awt.GridBagLayout jPanel7Layout = new java.awt.GridBagLayout();
        jPanel7Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel7Layout.rowHeights = new int[] {0};
        jPanel7.setLayout(jPanel7Layout);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(chart, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.8;
        jPanel4.add(jPanel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jPanel4, gridBagConstraints);

        jTabbedPane1.addTab("Thống kê doanh thu", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Thống kê xu hướng", jPanel2);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void loadThongKe(Date start, Date end, String tilte, int loaiBieuDoTemp) {
        SimpleDateFormat sdfTitle = new SimpleDateFormat("dd/MM/yyyy");
        int loaiBieuDo = 0;
        // loaiBieuDo

        // 1 => Ngay
        // 2 => Thang
        // 3 => Nam
        // 4 => Quy
        double tongDoanhThu = 0, tongTienVon = 0, tongLoiNhuan = 0, tongTraHang = 0;

        int soNgay = ((int) (end.getTime() / 86400000)) - ((int) (start.getTime() / 86400000));

        if (soNgay < 1) {
            soNgay = 1;
        }

        int mocBieuDo = 0;

        chart.clear();

        ArrayList<Map.Entry<Date, double[]>> listThongKe = new ArrayList<Map.Entry<Date, double[]>>();
        listThongKe = thongKe_BUS.thongKeTheoThoiGian(start, end);

        chart.setTitle("Từ " + sdfTitle.format(start) + " đến " + sdfTitle.format(end));
        if (loaiBieuDoTemp != 0) {
            loaiBieuDo = loaiBieuDoTemp;
        } else if (soNgay >= 730) {
            loaiBieuDo = 3;
        } else if (soNgay > 365) {
            mocBieuDo = mocBieuDo / 90;
            loaiBieuDo = 4;
        } else if (soNgay >= 360) {
            mocBieuDo = 12;
            loaiBieuDo = 2;
        } else if (soNgay >= 180) {
            mocBieuDo = soNgay / 90;
            loaiBieuDo = 4;
        } else if (soNgay > 31) {
            mocBieuDo = 2;
            loaiBieuDo = 2;
        } else {
            mocBieuDo = soNgay;
            loaiBieuDo = 1;
        }

        Date tempCheckStart = new Date(start.getYear(), start.getMonth(), start.getDate());

        if (loaiBieuDo == 4) {
            tempCheckStart.setMonth(6);
            if (end.compareTo(tempCheckStart) <= 0) {
                loaiBieuDo = 3;
            }
        }

        if (loaiBieuDo == 3) {
            if (start.getYear() == end.getYear()) {
                loaiBieuDo = 2;
            }
        }

        if (loaiBieuDo == 2) {
            if (start.getYear() == end.getYear()) {
                if (start.getMonth() == end.getMonth()) {
                    loaiBieuDo = 1;
                }
            }
        }

        if (loaiBieuDo == 1) {
            if (start.getDate() == end.getDate()) {
                end.setDate(1 + end.getDate());
            }
        }
        System.out.println("Select" + loaiBieuDo);
        Date ngayTruocDo = start;
        double[] thongKeDataTemp = new double[]{0, 0, 0, 0};
        String quyTemp = "";
        for (int i = 0; i < listThongKe.size(); i++) {
            Map.Entry<Date, double[]> entry = listThongKe.get(i);

            double[] object = entry.getValue();
            tongDoanhThu += object[0];
            tongTienVon += object[1];
            tongLoiNhuan += object[2];
            tongTraHang += object[3];

            object[0] = object[0] / 100000;
            object[1] = object[1] / 100000;
            object[2] = object[2] / 100000;
            object[3] = object[3] / 100000;

            switch (loaiBieuDo) {
                case 1: {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
                    if (ngayTruocDo.getDate() + 1 < entry.getKey().getDate()) {
                        int temp = entry.getKey().getDate() - ngayTruocDo.getDate();
                        for (int k = 0; k < temp; k++) {
                            ngayTruocDo.setDate(ngayTruocDo.getDate() + 1);
                            chart.addData(new utilities.chartline.ModelChart(sdf.format(ngayTruocDo), new double[]{0, 0, 0, 0}));
                        }
                    }
                    chart.addData(new utilities.chartline.ModelChart(sdf.format(entry.getKey()), new double[]{object[0], object[1], object[2], object[3]}));
                    break;
                }
                case 2: {
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
                    if (ngayTruocDo.getMonth() == entry.getKey().getMonth()) {
                        thongKeDataTemp[0] += object[0];
                        thongKeDataTemp[1] += object[1];
                        thongKeDataTemp[2] += object[2];
                        thongKeDataTemp[3] += object[3];
                    } else {
                        if (ngayTruocDo.getMonth() + 1 < entry.getKey().getMonth()) {
                            int temp = entry.getKey().getMonth() - ngayTruocDo.getMonth();
                            for (int k = 0; k < temp; k++) {
                                ngayTruocDo.setMonth(ngayTruocDo.getMonth() + 1);
                                chart.addData(new utilities.chartline.ModelChart(sdf.format(ngayTruocDo), new double[]{0, 0, 0, 0}));
                            }
                        }
                        chart.addData(new utilities.chartline.ModelChart(sdf.format(ngayTruocDo), thongKeDataTemp));
                        thongKeDataTemp = new double[]{0, 0, 0, 0};
                        thongKeDataTemp[0] += object[0];
                        thongKeDataTemp[1] += object[1];
                        thongKeDataTemp[2] += object[2];
                        thongKeDataTemp[3] += object[3];
                    }
                    break;
                }
                case 3: {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                    if (ngayTruocDo.getYear() == entry.getKey().getYear()) {
                        thongKeDataTemp[0] += object[0];
                        thongKeDataTemp[1] += object[1];
                        thongKeDataTemp[2] += object[2];
                        thongKeDataTemp[3] += object[3];
                    } else {
                        if (ngayTruocDo.getYear() + 1 < entry.getKey().getYear()) {
                            int temp = entry.getKey().getYear() - ngayTruocDo.getYear();
                            for (int k = 0; k < temp; k++) {
                                ngayTruocDo.setMonth(ngayTruocDo.getMonth() + 1);
                                chart.addData(new utilities.chartline.ModelChart(sdf.format(ngayTruocDo), new double[]{0, 0, 0, 0}));
                            }
                        }
                        chart.addData(new utilities.chartline.ModelChart(sdf.format(ngayTruocDo), thongKeDataTemp));
                        thongKeDataTemp = new double[]{0, 0, 0, 0};
                        thongKeDataTemp[0] += object[0];
                        thongKeDataTemp[1] += object[1];
                        thongKeDataTemp[2] += object[2];
                        thongKeDataTemp[3] += object[3];
                    }
                    break;
                }
                case 4: {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                    int quarter = (entry.getKey().getMonth() / 3) + 1;
                    String quyHienTai = "Quý " + quyTRANS[quarter] + "/" + sdf.format(entry.getKey());
                    if (quyTemp.isBlank()) {
                        quyTemp = quyHienTai;
                    }
                    if (quyTemp.equalsIgnoreCase(quyHienTai)) {
                        thongKeDataTemp[0] += object[0];
                        thongKeDataTemp[1] += object[1];
                        thongKeDataTemp[2] += object[2];
                        thongKeDataTemp[3] += object[3];
                    } else {
                        chart.addData(new utilities.chartline.ModelChart(quyTemp, thongKeDataTemp));
                        thongKeDataTemp = new double[]{0, 0, 0, 0};
                        thongKeDataTemp[0] += object[0];
                        thongKeDataTemp[1] += object[1];
                        thongKeDataTemp[2] += object[2];
                        thongKeDataTemp[3] += object[3];
                    }
                    quyTemp = quyHienTai;
                    break;
                }
                default:
                    break;
            }
            ngayTruocDo = entry.getKey();
        }

        // Show after done
        if (loaiBieuDo == 1) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");

            if (ngayTruocDo.getDate() + 1 < end.getDate()) {
                int temp = end.getDate() - ngayTruocDo.getDate();
                for (int k = 0; k < temp; k++) {
                    ngayTruocDo.setDate(ngayTruocDo.getDate() + 1);
                    chart.addData(new utilities.chartline.ModelChart(sdf.format(ngayTruocDo), new double[]{0, 0, 0, 0}));
                }
            }
        } else if (loaiBieuDo == 2) {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
            chart.addData(new utilities.chartline.ModelChart(sdf.format(ngayTruocDo), thongKeDataTemp));
            if (ngayTruocDo.getMonth() + 1 < end.getMonth()) {
                int temp = end.getMonth() - ngayTruocDo.getMonth();
                for (int k = 0; k < temp; k++) {
                    ngayTruocDo.setMonth(ngayTruocDo.getMonth() + 1);
                    chart.addData(new utilities.chartline.ModelChart(sdf.format(ngayTruocDo), new double[]{0, 0, 0, 0}));
                }
            }
        } else if (loaiBieuDo == 3) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            chart.addData(new utilities.chartline.ModelChart(sdf.format(ngayTruocDo), thongKeDataTemp));
            if (ngayTruocDo.getYear() + 1 < end.getYear()) {
                int temp = end.getYear() - ngayTruocDo.getYear();
                for (int k = 0; k < temp; k++) {
                    ngayTruocDo.setYear(ngayTruocDo.getYear() + 1);
                    chart.addData(new utilities.chartline.ModelChart(sdf.format(ngayTruocDo), new double[]{0, 0, 0, 0}));
                }
            }
        } else if (loaiBieuDo == 4) {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            int quarter = (start.getMonth() / 3) + 1;
            if (chart.getModelSize() < 2) {
                chart.addData(new utilities.chartline.ModelChart("Từ " + sdf.format(start) + " đến trước " + quyTemp, new double[]{0, 0, 0, 0}));
            }
            chart.addData(new utilities.chartline.ModelChart(quyTemp, thongKeDataTemp));
        }

        //chart.addData(new utilities.chartline.ModelChart("Default", thongKeDataTemp));
        lblDoanhThu.setText(Numberic.formatD(tongDoanhThu));
        lblLoiNhuan.setText(Numberic.formatD(tongLoiNhuan));
        lblTraHang.setText(Numberic.formatD(tongTraHang));
        lblTienVon.setText(Numberic.formatD(tongTienVon));

        chart.start();
    }


    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        txtNgayBatDau.getDate();
        txtNgayKetThuc.getDate();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnXuatExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatExelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnXuatExel;
    private javax.swing.JComboBox<String> cboBaoCaoTheo;
    private utilities.chartline.CurveLineChart chart;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler26;
    private javax.swing.Box.Filler filler27;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblLoiNhuan;
    private javax.swing.JLabel lblTienVon;
    private javax.swing.JLabel lblTraHang;
    private com.toedter.calendar.JDateChooser txtNgayBatDau;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc;
    // End of variables declaration//GEN-END:variables
}
