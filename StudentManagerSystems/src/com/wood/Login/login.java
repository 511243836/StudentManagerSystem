package com.wood.Login;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame{
	// �������
    JPanel jp1, jp2, jp3;
    JLabel userText, pwdText;
    JButton loginBtn, registBtn;
    JTextField username;
    JPasswordField password;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	login d1 = new login();

    }

    // ���캯��
    public login() {

        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        userText = new JLabel("�˺ţ�");
        pwdText = new JLabel("���룺");

        loginBtn = new JButton("��¼");
        registBtn = new JButton("ע��");

        username = new JTextField(10);

        password = new JPasswordField(10);// ���ò��ֹ���(�������ǣ�extends JFrame�����������)
        this.setLayout(new GridLayout(3, 1));

        // ����������
        jp1.add(userText);
        jp1.add(username);

        jp2.add(pwdText);
        jp2.add(password);

        jp3.add(loginBtn);
        jp3.add(registBtn);

        // ���뵽JFrame
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        this.setSize(400, 250);
        this.setTitle("��¼");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void loginBtnText(){
    	loginBtn = new JButton("��¼");
    	loginBtn.getKeyListeners();
    }

}
