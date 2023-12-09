import javax.swing.*;
import java.awt.*;


class LoginComponent extends JFrame {

  int height = 25;
  String myFont = "JetBrains Mono";
  LoginComponent() {

    JLabel labelName = new JLabel();
    labelName.setText("Username : ");
    labelName.setBounds(20,90, 150, height);
    labelName.setFont(new Font(myFont, Font.PLAIN, 16));

    JTextField inName = new JTextField(20);
    inName.setBounds(200,90, 150, height);
    inName.setFont(new Font(myFont, Font.PLAIN, 16));



    JLabel labelPassword = new JLabel();
    labelPassword.setText("Password : ");
    labelPassword.setBounds(20, 120, 150, height);
    labelPassword.setFont(new Font(myFont, Font.PLAIN, 16));


    JPasswordField inPassword = new JPasswordField(30);
    inPassword.setBounds(200, 120, 150, height);
    inPassword.setFont(new Font(myFont, Font.PLAIN, 16));


    JButton btnLogin = new JButton();
    btnLogin.setText("Login");
    btnLogin.setBounds(150, 180, 100, 30);
    btnLogin.setFont(new Font(myFont, Font.PLAIN, 16));

    JLabel labelAfterLoggedin = new JLabel();
    labelAfterLoggedin.setVisible(false);
    labelAfterLoggedin.setBounds(70, 100, 2000, 50 );
    labelAfterLoggedin.setFont(new Font(myFont, Font.PLAIN, 30));


    btnLogin.addActionListener( e -> {

      String msgGreet = "Hello " + inName.getText() + ", Nice to meet you.";
      labelAfterLoggedin.setText(msgGreet);
      labelAfterLoggedin.setVisible(true);
      labelName.setVisible(false);
      inName.setVisible(false);
      labelPassword.setVisible(false);
      inPassword.setVisible(false);
      btnLogin.setVisible(false);

    });



    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(900,700);
    this.setVisible(true);
    this.setTitle("Login Page");

    this.add(labelName);          this.add(inName);
    this.add(labelPassword);      this.add(inPassword);
    this.add(btnLogin);

    this.add(labelAfterLoggedin);
  }

  public static void main(String[] args) {
    new LoginComponent();
  }

}
