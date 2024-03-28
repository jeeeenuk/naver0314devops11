package day0328;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex04SwingButton extends JFrame {
    JButton btn1, btn2;
    public Ex04SwingButton(String title){
        super(title);
        this.setLocation(100, 100);
        this.setSize(300, 300);
        this.getContentPane().setBackground(new Color(93, 199, 187)); // 배경색 변경 ..
        //this.getContentPane().setBackground(Color.CYAN);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료 ..
        this.initDesign();
        this.setVisible(true);
    }
    public void initDesign(){
        this.setLayout(null); //기본 레이아웃 없애기
        // 버튼 1 생성
        btn1 = new JButton("1");
        // 프레임 추가
        btn1.setBounds(10, 10, 100, 30);
        this.add(btn1);
        // btn1 에 이벤트 추가-익명 내부 클래스 형태로 이벤트 구현
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Ex04SwingButton.this, "Left");
            }
        });

        btn2 = new JButton("2");
        btn2.setBounds(120,10,100,30);
        this.add(btn2);
        btn2.addActionListener(new Button2Event());
    }
    class Button2Event implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //parentComponent 에 null 값을 줄 경우에 frame 내에서의 창이 팝업 되지 않고 전체 화면의 가운데에 팝업된다.
            JOptionPane.showMessageDialog(null, "Right");
        }
    }
    public static void main(String[] args) {
        Ex04SwingButton a = new Ex04SwingButton("Swing Button");
    }
}
