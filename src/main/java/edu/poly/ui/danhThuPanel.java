/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.ui;

import edu.poly.Helper.databaseHelper;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.io.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartUtilities;
import org.jfree.data.category.CategoryDataset;

/**
 *
 * @author ASUS
 */
public class danhThuPanel extends javax.swing.JPanel {

    /**
     * Creates new form danhThuPanel
     */
    public danhThuPanel() {
        initComponents();
        radKhoangThoiGian.setSelected(true);
        khoangThoiGianEnable();
        thangDisable();
        quyDisable();
        namDisable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        radKhoangThoiGian = new javax.swing.JRadioButton();
        radThang = new javax.swing.JRadioButton();
        radQuy = new javax.swing.JRadioButton();
        radNam = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        khoangThoiGian_dpkNgayBD = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        khoangThoiGian_dpkNgayKT = new org.jdesktop.swingx.JXDatePicker();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        thang_thangBD = new com.toedter.calendar.JMonthChooser();
        thang_thangKT = new com.toedter.calendar.JMonthChooser();
        thang_namBD = new com.toedter.calendar.JYearChooser();
        thang_namKT = new com.toedter.calendar.JYearChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        quy_cbxQuyBD = new javax.swing.JComboBox<>();
        quy_cbxQuyKT = new javax.swing.JComboBox<>();
        quy_cbxnamBD = new com.toedter.calendar.JYearChooser();
        quy_cbxNamKT = new com.toedter.calendar.JYearChooser();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nam_NamBD = new com.toedter.calendar.JYearChooser();
        nam_namKT = new com.toedter.calendar.JYearChooser();

        jButton1.setText("Thống Kê");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        jLabel1.setText("Loại thống kê:");

        buttonGroup1.add(radKhoangThoiGian);
        radKhoangThoiGian.setText("Khoảng thời gian");
        radKhoangThoiGian.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radKhoangThoiGianStateChanged(evt);
            }
        });

        buttonGroup1.add(radThang);
        radThang.setText("Tháng");
        radThang.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radThangStateChanged(evt);
            }
        });

        buttonGroup1.add(radQuy);
        radQuy.setText("Quý");
        radQuy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radQuyStateChanged(evt);
            }
        });

        buttonGroup1.add(radNam);
        radNam.setText("Năm");
        radNam.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radNamStateChanged(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Khoảng thời gian"));

        jLabel2.setText("Ngày bắt đầu:");

        khoangThoiGian_dpkNgayBD.setFormats("dd/MM/yyyy");

        jLabel3.setText("Ngày kết thúc:");

        khoangThoiGian_dpkNgayBD.setFormats("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(khoangThoiGian_dpkNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(khoangThoiGian_dpkNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(khoangThoiGian_dpkNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(khoangThoiGian_dpkNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tháng"));

        jLabel5.setText("Tháng kết thúc:");

        jLabel4.setText("Tháng bắt đầu:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(thang_thangBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(thang_namBD, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(thang_thangKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(thang_namKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(thang_namBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thang_thangBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(thang_thangKT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thang_namKT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Quý"));

        jLabel6.setText("Quý bắt đầu:");

        jLabel7.setText("Quý kết thúc:");

        quy_cbxQuyBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quý 1", "Quý 2", "Quý 3", "Quý 4" }));

        quy_cbxQuyKT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quý 1", "Quý 2", "Quý 3", "Quý 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quy_cbxQuyBD, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quy_cbxQuyKT, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quy_cbxnamBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quy_cbxNamKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quy_cbxQuyBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quy_cbxnamBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quy_cbxQuyKT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quy_cbxNamKT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Năm"));

        jLabel9.setText("Năm kết thúc:");

        jLabel8.setText("Năm bắt đầu:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nam_NamBD, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(nam_namKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nam_NamBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nam_namKT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radKhoangThoiGian)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radThang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radQuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radNam)
                        .addGap(0, 399, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(radKhoangThoiGian)
                    .addComponent(radThang)
                    .addComponent(radQuy)
                    .addComponent(radNam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        final String fait = "FAIT";
        //        final String audi = "AUDI";
        //        final String ford = "FORD";
        //        final String speed = "Speed";
        //        final String popular = "Popular";
        //        final String mailage = "Mailage";
        //        final String userrating = "User Rating";
        //        final String safety = "safety";
        //        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //
        //        dataset.addValue(1.0, fait, speed);
        //        dataset.addValue(4.0, fait, popular);
        //        dataset.addValue(3.0, fait, userrating);
        //        dataset.addValue(5.0, fait, mailage);
        //        dataset.addValue(5.0, fait, safety);
        //
        //        dataset.addValue(5.0, audi, speed);
        //        dataset.addValue(7.0, audi, popular);
        //        dataset.addValue(6.0, audi, userrating);
        //        dataset.addValue(10.0, audi, mailage);
        //        dataset.addValue(4.0, audi, safety);
        //
        //        dataset.addValue(4.0, ford, speed);
        //        dataset.addValue(3.0, ford, popular);
        //        dataset.addValue(2.0, ford, userrating);
        //        dataset.addValue(3.0, ford, mailage);
        //        dataset.addValue(6.0, ford, safety);
        //
        //        JFreeChart barChart = ChartFactory.createBarChart3D(
        //                "Car Usage Statistics",
        //                "Category",
        //                "Score",
        //                dataset,
        //                PlotOrientation.VERTICAL,
        //                true, true, false);
        //
        //        int width = 640;
        //        /* Width of the image */
        //        int height = 480;
        //        /* Height of the image */
        //        File barChart3D = new File("barChart3D.jpeg");
        //        try {
        //            ChartUtilities.saveChartAsJPEG(barChart3D, barChart, width, height);
        //        } catch (IOException ex) {
        //            Logger.getLogger(danhThuPanel.class.getName()).log(Level.SEVERE, null, ex);
        //        }

        ChartPanel chartPanel = new ChartPanel(createChart());

        chartPanel.setPreferredSize(
                new java.awt.Dimension(200, 200));
//        JFrame frame = new JFrame();

//        jPanel1.add(chartPanel);
        chartPanel.setDomainZoomable(true);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(chartPanel, BorderLayout.NORTH);
        jPanel1.validate();
//        jPanel1.setTitle(
//                "Biểu đồ JFreeChart trong Java Swing");
//        jPanel1.setSize(
//                600, 400);
//        frame.setLocationRelativeTo(
//                null);
//        jPanel1.setResizable(
//                false);
//        jPanel1.setVisible(
//                true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radKhoangThoiGianStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radKhoangThoiGianStateChanged
        if (radKhoangThoiGian.isSelected()) {
            khoangThoiGianEnable();
            thangDisable();
            quyDisable();
            namDisable();
        }
    }//GEN-LAST:event_radKhoangThoiGianStateChanged

    private void radThangStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radThangStateChanged
        if (radThang.isSelected()) {
            khoangThoiGianDisable();
            thangEnable();
            quyDisable();
            namDisable();
        }
    }//GEN-LAST:event_radThangStateChanged

    private void radQuyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radQuyStateChanged
        if (radQuy.isSelected()) {
            khoangThoiGianDisable();
            thangDisable();
            quyEnable();
            namDisable();
        }
    }//GEN-LAST:event_radQuyStateChanged

    private void radNamStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radNamStateChanged
        if (radNam.isSelected()) {
            khoangThoiGianDisable();
            thangDisable();
            quyDisable();
            namEnable();
        }
    }//GEN-LAST:event_radNamStateChanged
    public JFreeChart createChart() {

        JFreeChart barChart = ChartFactory.createBarChart(
                "BÁO CÁO DOANH THU TỪ NGÀY " + getBatDau() + " ĐẾN NGÀY " + getKetThuc(),
                "Thời gian", "Số tiền(VND)",
                createDataset(), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }

    private CategoryDataset createDataset() {

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String sql = "select sum(TienThueXe) as 'Tien', ThoiGianKetThucHopDong from Tien t join HOPDONG hd on t.MaThanhToan = hd.MaThanhToan where ThoiGianKetThucHopDong between ? and ? group by ThoiGianKetThucHopDong";
        try {
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setDate(1, getBatDau());
            pstm.setDate(2, getKetThuc());
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "Số tiền(VND)", rs.getDate(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        dataset.addValue(68000000, "Số tiền(VND)", "1990");
//        dataset.addValue(80000000, "Số tiền(VND)", "2000");
//        dataset.addValue(88000000, "Số tiền(VND)", "2010");
//        dataset.addValue(95000000, "Số tiền(VND)", "2020");
        return dataset;
    }

    public void khoangThoiGianDisable() {
        khoangThoiGian_dpkNgayBD.setEnabled(false);
        khoangThoiGian_dpkNgayKT.setEnabled(false);
    }

    public void khoangThoiGianEnable() {
        khoangThoiGian_dpkNgayBD.setEnabled(true);
        khoangThoiGian_dpkNgayKT.setEnabled(true);
    }

    public void thangDisable() {
        thang_thangBD.setEnabled(false);
        thang_thangKT.setEnabled(false);
        thang_namBD.setEnabled(false);
        thang_namKT.setEnabled(false);
    }

    public void thangEnable() {
        thang_thangBD.setEnabled(true);
        thang_thangKT.setEnabled(true);
        thang_namBD.setEnabled(true);
        thang_namKT.setEnabled(true);
    }

    public void quyDisable() {
        quy_cbxQuyBD.setEnabled(false);
        quy_cbxQuyKT.setEnabled(false);
        quy_cbxnamBD.setEnabled(false);
        quy_cbxNamKT.setEnabled(false);
    }

    public void quyEnable() {
        quy_cbxQuyBD.setEnabled(true);
        quy_cbxQuyKT.setEnabled(true);
        quy_cbxnamBD.setEnabled(true);
        quy_cbxNamKT.setEnabled(true);
    }

    public void namDisable() {
        nam_NamBD.setEnabled(false);
        nam_namKT.setEnabled(false);
    }

    public void namEnable() {
        nam_NamBD.setEnabled(true);
        nam_namKT.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXDatePicker khoangThoiGian_dpkNgayBD;
    private org.jdesktop.swingx.JXDatePicker khoangThoiGian_dpkNgayKT;
    private com.toedter.calendar.JYearChooser nam_NamBD;
    private com.toedter.calendar.JYearChooser nam_namKT;
    private com.toedter.calendar.JYearChooser quy_cbxNamKT;
    private javax.swing.JComboBox<String> quy_cbxQuyBD;
    private javax.swing.JComboBox<String> quy_cbxQuyKT;
    private com.toedter.calendar.JYearChooser quy_cbxnamBD;
    private javax.swing.JRadioButton radKhoangThoiGian;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radQuy;
    private javax.swing.JRadioButton radThang;
    private com.toedter.calendar.JYearChooser thang_namBD;
    private com.toedter.calendar.JYearChooser thang_namKT;
    private com.toedter.calendar.JMonthChooser thang_thangBD;
    private com.toedter.calendar.JMonthChooser thang_thangKT;
    // End of variables declaration//GEN-END:variables

    private Date getBatDau() {
        Date batDau = null;
        int thangBD = 0;
        int namBD = 0;
        if (radKhoangThoiGian.isSelected()) {
            java.util.Date utilDate1 = khoangThoiGian_dpkNgayBD.getDate();
            batDau = new java.sql.Date(utilDate1.getTime());
        }
        if (radThang.isSelected()) {
            thangBD = thang_thangBD.getMonth();
            namBD = thang_namBD.getValue();
            batDau = new java.sql.Date((namBD - 1900), thangBD, 1);
        }
        if (radQuy.isSelected()) {
            namBD = quy_cbxnamBD.getValue();
            switch (quy_cbxQuyBD.getSelectedItem().toString()) {
                case "Quý 1":
                    thangBD = 0;
                    break;
                case "Quý 2":
                    thangBD = 3;
                    break;
                case "Quý 3":
                    thangBD = 6;
                    break;
                case "Quý 4":
                    thangBD = 9;
                    break;
            }
            batDau = new java.sql.Date((namBD - 1900), thangBD, 1);
        }
        if (radNam.isSelected()) {
            thangBD = 0;
            namBD = nam_NamBD.getValue();
            batDau = new java.sql.Date((namBD - 1900), thangBD, 1);
        }
        System.out.println("bat dau: " + batDau);
        return batDau;
    }
//public static void main(String[] args) throws Exception {
//        
//    }

    private Date getKetThuc() {
        Date ketThuc = null;
        int thangKT = 0;
        int namKT = 0;
        if (radKhoangThoiGian.isSelected()) {
            java.util.Date utilDate2 = khoangThoiGian_dpkNgayKT.getDate();
            ketThuc = new java.sql.Date(utilDate2.getTime());
        }
        if (radThang.isSelected()) {
            thangKT = thang_thangKT.getMonth();
            namKT = thang_namKT.getValue();
//            java.util.Date utilDate2 = new GregorianCalendar(namKT, thangKT, 31);
            ketThuc = new java.sql.Date((namKT - 1900), thangKT, 31);
        }
        if (radQuy.isSelected()) {
            namKT = quy_cbxNamKT.getValue();
            switch (quy_cbxQuyKT.getSelectedItem().toString()) {
                case "Quý 1":
                    thangKT = 2;
                    break;
                case "Quý 2":
                    thangKT = 5;
                    break;
                case "Quý 3":
                    thangKT = 8;
                    break;
                case "Quý 4":
                    thangKT = 11;
                    break;
            }
            ketThuc = new java.sql.Date((namKT - 1900), thangKT, 31);
        }
        if (radNam.isSelected()) {
            thangKT = 11;
            namKT = nam_namKT.getValue();
            ketThuc = new java.sql.Date((namKT - 1900), thangKT, 31);
        }
        System.out.println("Ket thuc: " + ketThuc);
        System.out.println("\n");
        return ketThuc;
    }
}
