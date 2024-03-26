package day0326;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyFrame extends JFrame{
    public MyFrame(){
        super("701 화이팅");
        this.setLocation(300, 100); //frame 시작 위치
        this.setSize(300, 300); // frame 의 너비, 높이
        this.setVisible(true);

        // Frame 에 이벤트 추가
        this.addWindowListener(new WindowExit());
    }
    class WindowExit implements WindowListener{
        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Close Window");
            System.exit(0); // 종료
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("Window I-Con");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }
}
public class Ex06WindowFrame {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
