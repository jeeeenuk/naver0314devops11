package day0328;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex06SwingCanvasRadio extends JFrame {
    final static String PHOTO1 = "/Users/jeenukjung/Desktop/naver0314/workall/image/연예인사진/19.jpg";
    final static String PHOTO2 = "/Users/jeenukjung/Desktop/naver0314/workall/image/연예인사진/18.jpg";
    final static String PHOTO3 = "/Users/jeenukjung/Desktop/naver0314/workall/image/연예인사진/15.jpg";
    final static String PHOTO4 = "/Users/jeenukjung/Desktop/naver0314/workall/image/연예인사진/2.jpg";

    Color boxColor = new Color(67, 196, 207); // 초기 박스 색상
    JRadioButton rbBox1,rbBox2,rbBox3,rbBox4;
    JRadioButton []rbPhoto = new JRadioButton[4];
    int photoIndex = 1;
    MyDraw draw = new MyDraw();
    public Ex06SwingCanvasRadio(String title){
        super(title);
        this.setLocation(100, 100);
        this.setSize(400, 500);
        //this.getContentPane().setBackground(new Color(93, 199, 187)); // 배경색 변경 ..
        //this.getContentPane().setBackground(Color.CYAN);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료 ..
        this.initDesign();
        this.setVisible(true);
    }
    // Canvas 내부 클래스
    class MyDraw extends Canvas{
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(boxColor); // 채워진 박스 그리기
            g.fillRect(30,30,330,320);

            Image image = null;
            switch (photoIndex){
                case 1: image = new ImageIcon(PHOTO1).getImage(); break;
                case 2: image = new ImageIcon(PHOTO2).getImage(); break;
                case 3: image = new ImageIcon(PHOTO3).getImage(); break;
                case 4: image = new ImageIcon(PHOTO4).getImage(); break;
            }
            g.drawImage(image, 70, 40, 250, 300, this);
        }
    }
    public void initDesign(){
        this.add("Center",draw);
        JPanel pTop = new JPanel(); // 상단에 색상 라디오 버튼 추가
        ButtonGroup bg1 = new ButtonGroup();

        rbBox1 = new JRadioButton("Green");
        bg1.add(rbBox1);
        pTop.add(rbBox1);

        rbBox2 = new JRadioButton("SkyBlue", true);
        bg1.add(rbBox2);
        pTop.add(rbBox2);

        rbBox3 = new JRadioButton("pink");
        bg1.add(rbBox3);
        pTop.add(rbBox3);

        rbBox4 = new JRadioButton("Orange");
        bg1.add(rbBox4);
        pTop.add(rbBox4);

        //rbBox1 에 대한 이벤트
        rbBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boxColor = Color.green;
                draw.repaint();
            }
        });
        rbBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boxColor = new Color(67, 196, 207);
                draw.repaint();
            }
        });

        rbBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boxColor = Color.pink;
                draw.repaint();
            }
        });
        rbBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boxColor = Color.orange;
                draw.repaint();
            }
        });
        this.add("North", pTop); // 프레임 상단에 Panel 추가

        JPanel pBottom = new JPanel();
        ButtonGroup bg2 = new ButtonGroup();
        String []s = {"수지","신세경","설현","김우빈"};
        for (int i = 0; i < s.length; i++) {
            rbPhoto[i] = new JRadioButton(s[i], i == (photoIndex - 1));
            bg2.add(rbPhoto[i]);
            pBottom.add(rbPhoto[i]);

            int finalI = i+1;
            rbPhoto[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    photoIndex = finalI;
                    draw.repaint();
                }
            });
        }
        this.add("South", pBottom);
    }
    public static void main(String[] args) {
        Ex06SwingCanvasRadio a = new Ex06SwingCanvasRadio("기본창");
    }
}
