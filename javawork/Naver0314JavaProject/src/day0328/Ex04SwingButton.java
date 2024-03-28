package day0328;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex04SwingButton extends JFrame {
    JButton btn1, btn2;
    JButton []btnArray = new JButton[6]; // 각 배열의 값 null
    String []btnLabel = {"초록색","빨강색","분홍색","노랑색","주황색","랜덤색"};
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

        //btnArray 배열 변수를 생성 후 프레이메 추가
        int yPos = 50;
        for (int i = 0; i < btnArray.length; i++) {
            btnArray[i] = new JButton(btnLabel[i]);
            btnArray[i].setBounds(10,yPos,100,30);
            this.add(btnArray[i]);
            yPos+=35;
            // 익명 내부 클래스 형태로 이벤트 구현
            btnArray[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Object ob = e.getSource(); // 이벤트가 발생한 오브젝트
                    JButton ob = (JButton)e.getSource();
                    System.out.println(ob.getText());
                    //System.out.println(ob.getLabel());
                    switch (ob.getText()){
                        case "빨강색": Ex04SwingButton.this.getContentPane().setBackground(Color.red); break;
                        case "초록색": Ex04SwingButton.this.getContentPane().setBackground(Color.green); break;
                        case "분홍색": Ex04SwingButton.this.getContentPane().setBackground(Color.pink); break;
                        case "노랑색": Ex04SwingButton.this.getContentPane().setBackground(Color.yellow); break;
                        case "주황색": Ex04SwingButton.this.getContentPane().setBackground(Color.orange); break;
                        case "랜덤색": {
                            int r = (int)(Math.random()*256);
                            int g = (int)(Math.random()*256);
                            int b = (int)(Math.random()*256);
                            Ex04SwingButton.this.getContentPane().setBackground(new Color(r,g,b));
                            break;
                        }
                    }
                }
            });
        }
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
