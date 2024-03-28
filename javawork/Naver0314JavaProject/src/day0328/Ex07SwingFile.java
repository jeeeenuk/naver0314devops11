package day0328;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Ex07SwingFile extends JFrame {
    JButton btnOpen, btnSave;
    JTextArea memoArea;
    public Ex07SwingFile(String title){
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
        JPanel panel = new JPanel();
        btnOpen = new JButton("File Open");
        btnSave = new JButton("Flie Save");
        panel.add(btnOpen);
        panel.add(btnSave);

        this.add("North", panel);
        memoArea = new JTextArea();
        //this.add("Center", memoArea);
        this.add("Center", new JScrollPane(memoArea));

        btnOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //파일 다이얼로그 (열기 모드)
                FileDialog fileDialog = new FileDialog(Ex07SwingFile.this,"File Open",FileDialog.LOAD);
                fileDialog.setVisible(true); //다이얼로그 불러오기
                if (fileDialog.getDirectory()==null) return; //취소 클릭시 이벤트 종료
                String PATH = fileDialog.getDirectory() + fileDialog.getFile(); //불러올 파일은 디렉토리명 + 파일명

                FileReader fr = null;
                BufferedReader br = null;
                try {
                    fr = new FileReader(PATH);
                    br = new BufferedReader(fr);
                    memoArea.setText(""); //기존 메모장 지우기
                    while (true){
                        String line = br.readLine();
                        if(line == null) break;
                        memoArea.append(line +"\n");
                    }
                } catch (IOException ex) {
                } finally {
                    try {
                        br.close();
                        fr.close();
                    } catch (IOException|NullPointerException ex) {
                    }
                }
            }
        });
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileDialog fileDialog = new FileDialog(Ex07SwingFile.this,"File Save",FileDialog.SAVE);
                fileDialog.setVisible(true); //다이얼로그 불러오기
                if (fileDialog.getDirectory()==null) return; //취소 클릭시 이벤트 종료
                String PATH = fileDialog.getDirectory() + fileDialog.getFile(); //불러올 파일은 디렉토리명 + 파일명

                FileWriter fw = null;
                try {
                    fw = new FileWriter(PATH);
                    fw.write(memoArea.getText());
                } catch (IOException ex) {
                } finally {
                    try {
                        fw.close();
                    } catch (IOException ex) {
                    }
                }
            }
        });
    }
    public static void main(String[] args) {
        Ex07SwingFile a = new Ex07SwingFile("Simple Txt");
    }
}
