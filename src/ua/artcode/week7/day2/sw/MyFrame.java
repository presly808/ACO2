package ua.artcode.week7.day2.sw;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame {

    private JTextField textField;
    private JTextArea textArea;

    public MyFrame(){
        super("First Frame");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        setVisible(true);

    }

    private void init(){
        GridLayout buttonPanelLayout = new GridLayout(1,2);
        JPanel buttonPanel = new JPanel(buttonPanelLayout);

        JButton buttonLoad = new JButton("LOAD");
        buttonLoad.addActionListener(new LoadListener());

        JButton buttonSave = new JButton("SAVE");
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileUtils.save(textField.getText(), textArea.getText());
            }
        });

        buttonPanel.add(buttonLoad);
        buttonPanel.add(buttonSave);

        JPanel southPanel = new JPanel(new GridLayout(2,1));
        textField = new JTextField("C:\\");
        southPanel.add(textField);
        southPanel.add(buttonPanel);

        getContentPane().add(southPanel, BorderLayout.SOUTH);

        textArea = new JTextArea();
        getContentPane().add(textArea, BorderLayout.CENTER);


    }



    private class LoadListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String content = FileUtils.load(textField.getText());
            textArea.setText(content);
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
