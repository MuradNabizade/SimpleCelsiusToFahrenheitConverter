package com.muradn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGui extends JFrame {
    private JPanel mainPanel;
    private JTextField CelsiusTextField;
    private JButton ConvertButton;
    private JLabel faranheit;

    public CelsiusConverterGui(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        ConvertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr=(int)((Double.parseDouble(CelsiusTextField.getText()))+1.8+32);
                faranheit.setText(tempFahr+" Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new CelsiusConverterGui("Converter");
        frame.setVisible(true);
        //frame.setSize(400,400);
    }
}
