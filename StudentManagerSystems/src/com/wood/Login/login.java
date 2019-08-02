package com.wood.Login;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame{
	// 定义组件
    JPanel jp1, jp2, jp3;
    JLabel userText, pwdText;
    JButton loginBtn, registBtn;
    JTextField username;
    JPasswordField password;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	login d1 = new login();

    }

    // 构造函数
    public login() {

        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        userText = new JLabel("账号：");
        pwdText = new JLabel("密码：");

        loginBtn = new JButton("登录");
        registBtn = new JButton("注册");

        username = new JTextField(10);

        password = new JPasswordField(10);// 设置布局管理(上面忘记：extends JFrame，这里出错了)
        this.setLayout(new GridLayout(3, 1));

        // 加入各个组件
        jp1.add(userText);
        jp1.add(username);

        jp2.add(pwdText);
        jp2.add(password);

        jp3.add(loginBtn);
        jp3.add(registBtn);

        // 加入到JFrame
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        this.setSize(400, 250);
        this.setTitle("登录");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void loginBtnText(){
    	loginBtn = new JButton("登录");
    	loginBtn.getKeyListeners();
    }

}
