import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// 定义一个类gui，作为GUI的入口类

public class gui {
    private JFrame frame;

    public void showGUI() {
        // 创建一个JFrame作为窗口
        frame = new JFrame("登录界面");
        frame.setSize(400, 300); // 设置窗口大小
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口时退出程序

        // 创建一个面板
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel); // 添加组件到面板

        // 设置窗口可见
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null); // 设置布局为绝对布局

        // 创建一个标签
        JLabel userLabel = new JLabel("用户名:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        // 创建一个标签
        JLabel passwordLabel = new JLabel("密码:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        // 创建一个文本框
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JPasswordField passwordText = new JPasswordField(40);
        passwordText.setEchoChar('*');
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // 创建一个按钮
        JButton loginButton = new JButton("登录");
        loginButton.setBounds(50, 100, 80, 25);
        panel.add(loginButton);

        // 添加按钮的事件处理
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText(); // 获取文本框中的用户名

                char[] password = passwordText.getPassword(); // 获取文本框中的密码
                if(password==null||password.length==0) {
                    JOptionPane.showMessageDialog(panel, "密码不能为空!");
                }else {
                    JOptionPane.showMessageDialog(panel, "密码正确!");
                    JOptionPane.showMessageDialog(panel, "欢迎, " + username + "!"); // 显示欢迎信息
                    frame.dispose(); // 关闭窗口
                    maingui gui = new maingui();
                    gui.showmain(); // 打开主界面
                }
                userText.setText(""); // 清空文本框
                passwordText.setText("");
            }
        });
    }
}
