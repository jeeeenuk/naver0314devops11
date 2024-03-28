package Studying;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class SimpleImageViewer {

    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("Simple Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // 메뉴바 생성
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");

        // 메뉴 아이템에 이벤트 리스너 추가 (이미지 열기)
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    // 이미지를 라벨에 표시
                    displayImage(frame, selectedFile.getAbsolutePath());
                }
            }
        });

        // 메뉴바 구성
        menu.add(openItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // 프레임 표시
        frame.setVisible(true);
    }

    // 이미지를 불러와서 프레임에 표시하는 메소드
    private static void displayImage(JFrame frame, String path) {
        // 이전에 추가된 컴포넌트가 있으면 제거
        frame.getContentPane().removeAll();

        // 이미지 아이콘 생성 및 라벨에 추가
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT));
        JLabel label = new JLabel(imageIcon);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        // 프레임 콘텐츠를 재배치
        frame.revalidate();
        frame.repaint();
    }
}
