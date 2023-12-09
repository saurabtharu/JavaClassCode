import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



class CalculatorApp extends JFrame implements ActionListener{

  int myFontSize = 17;
  JLabel labelResult;
  JButton btnAdd, btnSub, btnMul, btnDiv, btnMod, btnReset, btnClose;
  JTextField textNum1, textNum2;

  CalculatorApp() {

    JLabel labelNum1 = new JLabel();
    labelNum1.setText("Enter first number  : ");
    labelNum1.setBounds(20, 40, 250, 30);
    labelNum1.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));

    textNum1 = new JTextField();
    textNum1.setBounds(290, 40, 100, 30);

    JLabel labelNum2 = new JLabel();
    labelNum2.setText("Enter second number : ");
    labelNum2.setBounds(20, 80, 250, 30);
    labelNum2.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));

    labelResult = new JLabel();
    labelResult.setBounds(20, 250, 1000, 30);
    labelResult.setVisible(false);
    labelResult.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));

    textNum2 = new JTextField();
    textNum2.setBounds(290, 80, 100, 30);

    btnAdd = new JButton();
    btnAdd.setText("+");
    btnAdd.setBounds(30, 130, 100, 30);
    btnAdd.setFont(new Font("JetBrains Mono", Font.PLAIN, myFontSize));


    btnSub = new JButton();
    btnSub.setText("-");
    btnSub.setBounds(140, 130, 100, 30);
    btnSub.setFont(new Font("JetBrains Mono", Font.BOLD, myFontSize));

    btnMul = new JButton();
    btnMul.setText("*");
    btnMul.setBounds(250, 130, 100, 30);
    btnMul.setFont(new Font("JetBrains Mono", Font.BOLD, myFontSize));

    btnDiv = new JButton();
    btnDiv.setText("/");
    btnDiv.setBounds(360, 130, 100, 30);
    btnDiv.setFont(new Font("JetBrains Mono", Font.BOLD, myFontSize));


    btnMod = new JButton();
    btnMod.setText("%");
    btnMod.setBounds(70, 170, 100, 30);
    btnMod.setFont(new Font("JetBrains Mono", Font.BOLD, myFontSize));


    btnReset = new JButton();
    btnReset.setText("Reset");
    btnReset.setBounds(180, 170, 100, 30);
    btnReset.setFont(new Font("JetBrains Mono", Font.BOLD, myFontSize));

    btnClose = new JButton();
    btnClose.setText("Close");
    btnClose.setBounds(290, 170, 100, 30);
    btnClose.setFont(new Font("JetBrains Mono", Font.BOLD, myFontSize));


    btnAdd.addActionListener(this);
    btnSub.addActionListener(this);
    btnMul.addActionListener(this);
    btnDiv.addActionListener(this);
    btnMod.addActionListener(this);
    btnReset.addActionListener(this);
    btnClose.addActionListener(this);


    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(800,600);
    this.setVisible(true);

    this.add(labelNum1);    this.add(textNum1);
    this.add(labelNum2);    this.add(textNum2);
    this.add(btnAdd);   this.add(btnSub);     this.add(btnMul);     this.add(btnDiv);
    this.add(btnMod);   this.add(btnReset);   this.add(btnClose);
    this.add(labelResult);
  }

  public void actionPerformed(ActionEvent ae) {
    Double num1 = 0.0 , num2 = 0.0 , result = 0.0 ;
    try {
      num1 = Double.parseDouble(textNum1.getText());
      num1 = Double.parseDouble(textNum1.getText());
    } catch(NumberFormatException e) {
      textNum1.setText("Invalid input");
    }
    try {
      num2 = Double.parseDouble(textNum2.getText());
    } catch(NumberFormatException e) {
      textNum2.setText("Invalid input");
    }

    if(ae.getSource() == btnAdd) {
      labelResult.setVisible(false);
      result = num1 + num2;
      String resString = "The result of operation " + num1 + " + " + num2 + " is " + result + ".";
      labelResult.setText(resString);
      labelResult.setVisible(true);
    }

    if(ae.getSource() == btnSub) {
      labelResult.setVisible(false);
      result = num1 - num2;
      String resString = "The result of operation " + num1 + " - " + num2 + " is " + result + ".";
      labelResult.setText(resString);
      labelResult.setVisible(true);
    }

    if(ae.getSource() == btnMul) {
      labelResult.setVisible(false);
      result = num1 * num2;
      String resString = "The result of operation " + num1 + " * " + num2 + " is " + result + ".";
      labelResult.setText(resString);
      labelResult.setVisible(true);
    }

    if(ae.getSource() == btnDiv) {
      labelResult.setVisible(false);
      result = num1 / num2;
      String resString = "The result of operation " + num1 + " / " + num2 + " is " + result + ".";
      labelResult.setText(resString);
      labelResult.setVisible(true);
    }

    if(ae.getSource() == btnMod) {
      labelResult.setVisible(false);
      result = num1 % num2;
      String resString = "The result of operation " + num1 + " % " + num2 + " is " + result + ".";
      labelResult.setText(resString);
      labelResult.setVisible(true);
    }

    if(ae.getSource() == btnReset) {
      textNum1.setText("");
      textNum2.setText("");
      labelResult.setVisible(false);
    }

    if(ae.getSource() == btnClose) {
      System.exit(0);
    }

  }


  public static void main(String[] args) {
    new CalculatorApp();
  }
}
