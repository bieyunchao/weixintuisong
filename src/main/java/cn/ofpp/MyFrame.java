package cn.ofpp;



import jdk.nashorn.tools.Shell;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyFrame extends JFrame implements KeyListener{
    public MyFrame(){
        //设置窗口大小
        this.setSize(800,600);
        //设置窗口居中
        this.setLocationRelativeTo(null);
        //设置窗口可见性
        this.setVisible(true);
        //设置点击窗口上的关闭键，结束程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口大小不可变
        this.setResizable(false);
        //向窗口对象添加键盘监听器
        this.addKeyListener(this);
        //设置窗口名称
        this.setTitle("白跃振-微信天气推送");

        // 使用 JTextField 显示文字
        JTextField field = new JTextField();
        field.setText("province");// 设置显示文字
        this.add(field);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
