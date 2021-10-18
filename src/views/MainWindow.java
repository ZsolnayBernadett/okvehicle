/*
 * File: MainController.java
 * Created Date: 2021-09-24 22:21:42
 * Author: Zsolnai Bernadett
 * Github: https://github.com/ZsolnayBernadett
 * -----
 * Last Modified: 2021-10-18
 * Modified By: Zsolnai Bernadett
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 */

package views;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class MainWindow extends JFrame {
    
    public JLabel vehicleLabel = new JLabel("Járművek");
    public JPanel controlPanel = new JPanel();
    public JPanel formPanel = new JPanel();
    public JPanel buttonPanel = new JPanel();
    public JLabel ordinalLabel = new JLabel("Rendszám");
    public JTextField ordinalField = new JTextField();
    public JLabel brandLabel = new JLabel("Márka");
    public JTextField brandField = new JTextField();
    public JLabel yearLabel = new JLabel("Év");
    public JTextField yearField = new JTextField();
    public JButton addButton = new JButton("Hozzáad"); 
    public JButton delButton = new JButton("Töröl");
    public JButton saveButton = new JButton("Mentés");

    public DefaultTableModel vehicleModel = new DefaultTableModel();
    public JTable vehicleTable = new JTable();
    public JScrollPane vehicleScrollPane = new JScrollPane();

    public MainWindow() {

        initGUI();

        this.vehicleModel = new DefaultTableModel();
        this.vehicleTable = new JTable(vehicleModel);
        this.vehicleScrollPane = new JScrollPane(this.vehicleTable);
        this.vehicleScrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Object[] tableLabels = {"Rendszám", "Márka", "Év"};
        this.vehicleModel.setColumnIdentifiers(tableLabels);

        this.vehicleLabel = new JLabel("Járművek");
        this.vehicleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.vehicleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    }

    private void initGUI(){

        initLabel();
        initControlPanel();
        initFormPanel();
        initButtons();
        initFrame();
    }
    
    private void initLabel(){

        this.controlPanel = new JPanel();

        this.ordinalLabel = new JLabel("Rendszám");
        this.ordinalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.ordinalLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
        this.ordinalField = new JTextField();
        this.brandLabel = new JLabel("Márka");
        this.brandLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.brandLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
        this.brandField = new JTextField();
        this.yearLabel = new JLabel("Év");
        this.yearLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.yearLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
        this.yearField = new JTextField();
    }

    private void initControlPanel(){

        this.controlPanel.setLayout(new BoxLayout(this.controlPanel, BoxLayout.LINE_AXIS));
        this.controlPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.controlPanel.add(this.formPanel);
        this.controlPanel.add(this.buttonPanel);

    }

    private void initFormPanel(){

        this.formPanel = new JPanel();
        this.formPanel.setLayout(new GridLayout(3, 2));
        this.formPanel.add(this.ordinalLabel);
        this.formPanel.add(this.ordinalField);
        this.formPanel.add(this.brandLabel);
        this.formPanel.add(this.brandField);
        this.formPanel.add(this.yearLabel);
        this.formPanel.add(this.yearField);
    }

    private void initButtons(){

        this.addButton = new JButton("Hozzáadás");
        this.delButton = new JButton("Törlés");
        this.saveButton = new JButton("Mentés");
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(new BoxLayout(this.buttonPanel, BoxLayout.PAGE_AXIS));
        this.buttonPanel.add(this.addButton);
        this.buttonPanel.add(this.delButton);
        this.buttonPanel.add(this.saveButton);
    }

    private void initFrame(){

        this.add(this.vehicleLabel);
        this.add(this.controlPanel);
        this.add(this.vehicleScrollPane);

        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 250);
        this.pack();
    }
}
