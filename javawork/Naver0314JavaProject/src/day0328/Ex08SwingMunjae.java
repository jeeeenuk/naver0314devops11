package day0328;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex08SwingMunjae extends JFrame {
    JButton btnOpen;
    MyDraw draw = new MyDraw();
    public Ex08SwingMunjae(String title){
        super(title);
        this.setLocation(100, 100);
        this.setSize(300, 300);
        //this.getContentPane().setBackground(new Color(93, 199, 187)); // 배경색 변경 ..
        //this.getContentPane().setBackground(Color.CYAN);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료 ..
        this.initDesign();
        this.setVisible(true);
    }
    class MyDraw extends Canvas{
        @Override
        public void paint(Graphics g) {
            super.paint(g);
        }
    }
    public void initDesign(){
        JPanel panel = new JPanel();
        btnOpen = new JButton("사진 불러오기");
        panel.add(btnOpen);
        this.add("North", panel);

        btnOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileDialog fileDialog = new FileDialog(Ex08SwingMunjae.this,"사진 불러오기", FileDialog.LOAD);
                fileDialog.setVisible(true);
                if (fileDialog.getDirectory()==null) return;
                String PATH = fileDialog.getDirectory() + fileDialog.getFile();
            }
        });
    }
    public static void main(String[] args) {
        Ex08SwingMunjae a = new Ex08SwingMunjae("Load Image");
    }
}
