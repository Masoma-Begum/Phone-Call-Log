/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.*;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

class FileDemo2 extends JFrame
        implements ActionListener {

    private TextArea inputTextArea = new TextArea();
    private JButton loadButton = new JButton("load");
    private BufferedReader inFile;
    private JTextField nameField = new JTextField(20);

    public static void main(String[] args) {
        new FileDemo2();
    }

    public FileDemo2() {
        setSize(300, 300);
        setTitle("File Input Demo");
        add("Center", inputTextArea);
        JPanel bottom = new JPanel();
        bottom.add(loadButton);
        bottom.add(nameField);
        add("South", bottom);
        loadButton.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == loadButton) {
            String fileName;
            fileName = nameField.getText();
            try {
                inFile = new BufferedReader(
                        new FileReader("c://file//fil.name"));
                inputTextArea.setText(""); // clear the input area
                String line;

                while ((line = inFile.readLine()) != null) {
                    inputTextArea.append(line + "\n");
                }
                inFile.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "File not found");
                nameField.setText("");
            }
        }
    }
}
