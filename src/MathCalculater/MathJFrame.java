package MathCalculater;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.*;

public class MathJFrame extends JFrame {


    private JLabel jlb1 = new JLabel("", RIGHT);
    private JPanel jpn1 = new JPanel();
    private MathJPanel1 jpn3 = new MathJPanel1();
    public MathJFrame(){
        init();
    }
    private void init(){
        jlb1.setFont(new Font("楷體", Font.PLAIN, 50));
        jlb1.setForeground(Color.white);
        jpn1.setPreferredSize(new Dimension(0,60));
        jpn1.setBackground(Color.BLACK);
        jpn3.setPreferredSize(new Dimension(0,370));
        jpn3.setBackground(Color.BLACK);


        //this.setTitle("Test123");
        this.setSize(300,550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(3,3));

        this.getContentPane().add(jpn1,BorderLayout.PAGE_START);
        this.getContentPane().add(jlb1,BorderLayout.CENTER);
        this.getContentPane().add(jpn3,BorderLayout.PAGE_END);
        this.getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
        this.setVisible(true);
    }

    public class MathJPanel1 extends JPanel{
        private CircleButtonGray ccb1 = new CircleButtonGray("1");
        private CircleButtonGray ccb2 = new CircleButtonGray("2");
        private CircleButtonGray ccb3 = new CircleButtonGray("3");
        private CircleButtonGray ccb4 = new CircleButtonGray("4");
        private CircleButtonGray ccb5 = new CircleButtonGray("5");
        private CircleButtonGray ccb6 = new CircleButtonGray("6");
        private CircleButtonGray ccb7 = new CircleButtonGray("7");
        private CircleButtonGray ccb8 = new CircleButtonGray("8");
        private CircleButtonGray ccb9 = new CircleButtonGray("9");
        private CircleButtonZero ccb0 = new CircleButtonZero("0");
        private CircleButtonOrange ccbPlus = new CircleButtonOrange("+");
        private CircleButtonOrange ccbMinus = new CircleButtonOrange("-");
        private CircleButtonOrange ccbMultiply = new CircleButtonOrange("×");
        private CircleButtonOrange ccbDivide = new CircleButtonOrange("÷");
        private CircleButtonGray ccbDecimalPoint = new CircleButtonGray(".");
        private CircleButtonLightGray ccbPercentage = new CircleButtonLightGray("％");
        private CircleButtonLightGray ccbNegativeNumber = new CircleButtonLightGray("±");
        private CircleButtonLightGray ccbClearOrAllClaer = new CircleButtonLightGray("AC");
        private CircleButtonOrange ccbEquals = new CircleButtonOrange("=");

        public MathJPanel1() {
            init();
        }

        String str1="", calculating1="";
        int count;

        private void init() {
            jlb1.setText("0");//進入計算機初始值
            ccb0.setBackground(Color.darkGray);
            ccb0.setFont(new Font("楷體", Font.PLAIN, 24));
            ccb0.setForeground(Color.white);
            ccb0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(ccbEquals.getActionCommand().equals("Equals")){
                        jlb1.setText("");
                        ccbEquals.setActionCommand("");
                    }
                    if(calculating1 !=""){
                        switch (calculating1) {//點擊數字值時，運算符背景及顏色恢復為正常
                            case "plus":
                                ccbPlus.setBackground(new Color(255, 161, 66));
                                ccbPlus.setForeground(Color.white);
                                break;
                            case "minus":
                                ccbMinus.setBackground(new Color(255, 161, 66));
                                ccbMinus.setForeground(Color.white);
                                break;
                            case "multiply":
                                ccbMultiply.setBackground(new Color(255, 161, 66));
                                ccbMultiply.setForeground(Color.white);
                                break;
                            case "divide":
                                ccbDivide.setBackground(new Color(255, 161, 66));
                                ccbDivide.setForeground(Color.white);
                                break;
                        }
                    }
                    if(jlb1.getText().equals("0")){//Label值為0時
                        jlb1.setText("");
                    }else if(!(jlb1.getText().equals("0"))){//Label值不為0時
                        if(count!=0){//count不為0，運算符點擊過
                            jlb1.setText("");
                        }
                    }
                    count=0;
                    if((jlb1.getText().length()+ccb0.getText().length())>9){
                        jlb1.setText(jlb1.getText());
                    }else {
                        jlb1.setText(jlb1.getText()+ccb0.getText());
                    }
                }
            });

            ccb1.setBackground(Color.darkGray);//設置按鈕背景
            ccb1.setFont(new Font("楷體", Font.PLAIN, 24));//設置按鈕text樣式
            ccb1.setForeground(Color.white);//設置按鈕text顏色
            ccb1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(ccbEquals.getActionCommand().equals("Equals")){
                        jlb1.setText("");
                        ccbEquals.setActionCommand("");
                    }
                    if(calculating1 !=""){
                        switch (calculating1) {//點擊數字值時，運算符背景及顏色恢復為正常
                            case "plus":
                                ccbPlus.setBackground(new Color(255, 161, 66));
                                ccbPlus.setForeground(Color.white);
                                break;
                            case "minus":
                                ccbMinus.setBackground(new Color(255, 161, 66));
                                ccbMinus.setForeground(Color.white);
                                break;
                            case "multiply":
                                ccbMultiply.setBackground(new Color(255, 161, 66));
                                ccbMultiply.setForeground(Color.white);
                                break;
                            case "divide":
                                ccbDivide.setBackground(new Color(255, 161, 66));
                                ccbDivide.setForeground(Color.white);
                                break;
                        }
                    }
                    if(jlb1.getText().equals("0")){//Label值為0時
                        jlb1.setText("");
                    }else if(!(jlb1.getText().equals("0"))){//Label值不為0時
                        if(count!=0){//count不為0，運算符點擊過
                            jlb1.setText("");
                        }
                    }
                    count=0;
                    if((jlb1.getText().length()+ccb1.getText().length())>9){
                        jlb1.setText(jlb1.getText());
                    }else {
                        jlb1.setText(jlb1.getText()+ccb1.getText());
                    }
                }
            });

            ccb2.setBackground(Color.darkGray);
            ccb2.setFont(new Font("楷體", Font.PLAIN, 24));
            ccb2.setForeground(Color.white);
            ccb2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(ccbEquals.getActionCommand().equals("Equals")){
                        jlb1.setText("");
                        ccbEquals.setActionCommand("");
                    }
                    if(calculating1 !=""){
                        switch (calculating1) {//點擊數字值時，運算符背景及顏色恢復為正常
                            case "plus":
                                ccbPlus.setBackground(new Color(255, 161, 66));
                                ccbPlus.setForeground(Color.white);
                                break;
                            case "minus":
                                ccbMinus.setBackground(new Color(255, 161, 66));
                                ccbMinus.setForeground(Color.white);
                                break;
                            case "multiply":
                                ccbMultiply.setBackground(new Color(255, 161, 66));
                                ccbMultiply.setForeground(Color.white);
                                break;
                            case "divide":
                                ccbDivide.setBackground(new Color(255, 161, 66));
                                ccbDivide.setForeground(Color.white);
                                break;
                        }
                    }
                    if(jlb1.getText().equals("0")){//Label值為0時
                        jlb1.setText("");
                    }else if(!(jlb1.getText().equals("0"))){//Label值不為0時
                        if(count!=0){//count不為0，運算符點擊過
                            jlb1.setText("");
                        }
                    }
                    count=0;
                    if((jlb1.getText().length()+ccb2.getText().length())>9){
                        jlb1.setText(jlb1.getText());
                    }else {
                        jlb1.setText(jlb1.getText()+ccb2.getText());
                    }
                }
            });

            ccb3.setBackground(Color.darkGray);
            ccb3.setFont(new Font("楷體", Font.PLAIN, 24));
            ccb3.setForeground(Color.white);
            ccb3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(ccbEquals.getActionCommand().equals("Equals")){
                        jlb1.setText("");
                        ccbEquals.setActionCommand("");
                    }
                    if(calculating1 !=""){
                        switch (calculating1) {//點擊數字值時，運算符背景及顏色恢復為正常
                            case "plus":
                                ccbPlus.setBackground(new Color(255, 161, 66));
                                ccbPlus.setForeground(Color.white);
                                break;
                            case "minus":
                                ccbMinus.setBackground(new Color(255, 161, 66));
                                ccbMinus.setForeground(Color.white);
                                break;
                            case "multiply":
                                ccbMultiply.setBackground(new Color(255, 161, 66));
                                ccbMultiply.setForeground(Color.white);
                                break;
                            case "divide":
                                ccbDivide.setBackground(new Color(255, 161, 66));
                                ccbDivide.setForeground(Color.white);
                                break;
                        }
                    }
                    if(jlb1.getText().equals("0")){//Label值為0時
                        jlb1.setText("");
                    }else if(!(jlb1.getText().equals("0"))){//Label值不為0時
                        if(count!=0){//count不為0，運算符點擊過
                            jlb1.setText("");
                        }
                    }
                    count=0;
                    if((jlb1.getText().length()+ccb3.getText().length())>9){
                        jlb1.setText(jlb1.getText());
                    }else {
                        jlb1.setText(jlb1.getText()+ccb3.getText());
                    }
                }
            });

            ccb4.setBackground(Color.darkGray);
            ccb4.setFont(new Font("楷體", Font.PLAIN, 24));
            ccb4.setForeground(Color.white);
            ccb4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(ccbEquals.getActionCommand().equals("Equals")){
                        jlb1.setText("");
                        ccbEquals.setActionCommand("");
                    }
                    if(calculating1 !=""){
                        switch (calculating1) {//點擊數字值時，運算符背景及顏色恢復為正常
                            case "plus":
                                ccbPlus.setBackground(new Color(255, 161, 66));
                                ccbPlus.setForeground(Color.white);
                                break;
                            case "minus":
                                ccbMinus.setBackground(new Color(255, 161, 66));
                                ccbMinus.setForeground(Color.white);
                                break;
                            case "multiply":
                                ccbMultiply.setBackground(new Color(255, 161, 66));
                                ccbMultiply.setForeground(Color.white);
                                break;
                            case "divide":
                                ccbDivide.setBackground(new Color(255, 161, 66));
                                ccbDivide.setForeground(Color.white);
                                break;
                        }
                    }
                    if(jlb1.getText().equals("0")){//Label值為0時
                        jlb1.setText("");
                    }else if(!(jlb1.getText().equals("0"))){//Label值不為0時
                        if(count!=0){//count不為0，運算符點擊過
                            jlb1.setText("");
                        }
                    }
                    count=0;
                    if((jlb1.getText().length()+ccb4.getText().length())>9){
                        jlb1.setText(jlb1.getText());
                    }else {
                        jlb1.setText(jlb1.getText()+ccb4.getText());
                    }
                }
            });

            ccb5.setBackground(Color.darkGray);
            ccb5.setFont(new Font("楷體", Font.PLAIN, 24));
            ccb5.setForeground(Color.white);
            ccb5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(ccbEquals.getActionCommand().equals("Equals")){
                        jlb1.setText("");
                        ccbEquals.setActionCommand("");
                    }
                    if(calculating1 !=""){
                        switch (calculating1) {//點擊數字值時，運算符背景及顏色恢復為正常
                            case "plus":
                                ccbPlus.setBackground(new Color(255, 161, 66));
                                ccbPlus.setForeground(Color.white);
                                break;
                            case "minus":
                                ccbMinus.setBackground(new Color(255, 161, 66));
                                ccbMinus.setForeground(Color.white);
                                break;
                            case "multiply":
                                ccbMultiply.setBackground(new Color(255, 161, 66));
                                ccbMultiply.setForeground(Color.white);
                                break;
                            case "divide":
                                ccbDivide.setBackground(new Color(255, 161, 66));
                                ccbDivide.setForeground(Color.white);
                                break;
                        }
                    }
                    if(jlb1.getText().equals("0")){//Label值為0時
                        jlb1.setText("");
                    }else if(!(jlb1.getText().equals("0"))){//Label值不為0時
                        if(count!=0){//count不為0，運算符點擊過
                            jlb1.setText("");
                        }
                    }
                    count=0;
                    if((jlb1.getText().length()+ccb5.getText().length())>9){
                        jlb1.setText(jlb1.getText());
                    }else {
                        jlb1.setText(jlb1.getText()+ccb5.getText());
                    }
                }
            });

            ccb6.setBackground(Color.darkGray);
            ccb6.setFont(new Font("楷體", Font.PLAIN, 24));
            ccb6.setForeground(Color.white);
            ccb6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(ccbEquals.getActionCommand().equals("Equals")){
                        jlb1.setText("");
                        ccbEquals.setActionCommand("");
                    }
                    if(calculating1 !=""){
                        switch (calculating1) {//點擊數字值時，運算符背景及顏色恢復為正常
                            case "plus":
                                ccbPlus.setBackground(new Color(255, 161, 66));
                                ccbPlus.setForeground(Color.white);
                                break;
                            case "minus":
                                ccbMinus.setBackground(new Color(255, 161, 66));
                                ccbMinus.setForeground(Color.white);
                                break;
                            case "multiply":
                                ccbMultiply.setBackground(new Color(255, 161, 66));
                                ccbMultiply.setForeground(Color.white);
                                break;
                            case "divide":
                                ccbDivide.setBackground(new Color(255, 161, 66));
                                ccbDivide.setForeground(Color.white);
                                break;
                        }
                    }
                    if(jlb1.getText().equals("0")){//Label值為0時
                        jlb1.setText("");
                    }else if(!(jlb1.getText().equals("0"))){//Label值不為0時
                        if(count!=0){//count不為0，運算符點擊過
                            jlb1.setText("");
                        }
                    }
                    count=0;
                    if((jlb1.getText().length()+ccb6.getText().length())>9){
                        jlb1.setText(jlb1.getText());
                    }else {
                        jlb1.setText(jlb1.getText()+ccb6.getText());
                    }
                }
            });

            ccb7.setBackground(Color.darkGray);
            ccb7.setFont(new Font("楷體", Font.PLAIN, 24));
            ccb7.setForeground(Color.white);
            ccb7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(ccbEquals.getActionCommand().equals("Equals")){
                        jlb1.setText("");
                        ccbEquals.setActionCommand("");
                    }
                    if(calculating1 !=""){
                        switch (calculating1) {//點擊數字值時，運算符背景及顏色恢復為正常
                            case "plus":
                                ccbPlus.setBackground(new Color(255, 161, 66));
                                ccbPlus.setForeground(Color.white);
                                break;
                            case "minus":
                                ccbMinus.setBackground(new Color(255, 161, 66));
                                ccbMinus.setForeground(Color.white);
                                break;
                            case "multiply":
                                ccbMultiply.setBackground(new Color(255, 161, 66));
                                ccbMultiply.setForeground(Color.white);
                                break;
                            case "divide":
                                ccbDivide.setBackground(new Color(255, 161, 66));
                                ccbDivide.setForeground(Color.white);
                                break;
                        }
                    }
                    if(jlb1.getText().equals("0")){//Label值為0時
                        jlb1.setText("");
                    }else if(!(jlb1.getText().equals("0"))){//Label值不為0時
                        if(count!=0){//count不為0，運算符點擊過
                            jlb1.setText("");
                        }
                    }
                    count=0;
                    if((jlb1.getText().length()+ccb7.getText().length())>9){
                        jlb1.setText(jlb1.getText());
                    }else {
                        jlb1.setText(jlb1.getText()+ccb7.getText());
                    }
                }
            });

            ccb8.setBackground(Color.darkGray);
            ccb8.setFont(new Font("楷體", Font.PLAIN, 24));
            ccb8.setForeground(Color.white);
            ccb8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(ccbEquals.getActionCommand().equals("Equals")){
                        jlb1.setText("");
                        ccbEquals.setActionCommand("");
                    }
                    if(calculating1 !=""){
                        switch (calculating1) {//點擊數字值時，運算符背景及顏色恢復為正常
                            case "plus":
                                ccbPlus.setBackground(new Color(255, 161, 66));
                                ccbPlus.setForeground(Color.white);
                                break;
                            case "minus":
                                ccbMinus.setBackground(new Color(255, 161, 66));
                                ccbMinus.setForeground(Color.white);
                                break;
                            case "multiply":
                                ccbMultiply.setBackground(new Color(255, 161, 66));
                                ccbMultiply.setForeground(Color.white);
                                break;
                            case "divide":
                                ccbDivide.setBackground(new Color(255, 161, 66));
                                ccbDivide.setForeground(Color.white);
                                break;
                        }
                    }
                    if(jlb1.getText().equals("0")){//Label值為0時
                        jlb1.setText("");
                    }else if(!(jlb1.getText().equals("0"))){//Label值不為0時
                        if(count!=0){//count不為0，運算符點擊過
                            jlb1.setText("");
                        }
                    }
                    count=0;
                    if((jlb1.getText().length()+ccb8.getText().length())>9){
                        jlb1.setText(jlb1.getText());
                    }else {
                        jlb1.setText(jlb1.getText()+ccb8.getText());
                    }
                }
            });
            ccb9.setBackground(Color.darkGray);
            ccb9.setFont(new Font("楷體", Font.PLAIN, 24));
            ccb9.setForeground(Color.white);
            ccb9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(ccbEquals.getActionCommand().equals("Equals")){
                        jlb1.setText("");
                        ccbEquals.setActionCommand("");
                    }
                    if(calculating1 !=""){
                        switch (calculating1) {//點擊數字值時，運算符背景及顏色恢復為正常
                            case "plus":
                                ccbPlus.setBackground(new Color(255, 161, 66));
                                ccbPlus.setForeground(Color.white);
                                break;
                            case "minus":
                                ccbMinus.setBackground(new Color(255, 161, 66));
                                ccbMinus.setForeground(Color.white);
                                break;
                            case "multiply":
                                ccbMultiply.setBackground(new Color(255, 161, 66));
                                ccbMultiply.setForeground(Color.white);
                                break;
                            case "divide":
                                ccbDivide.setBackground(new Color(255, 161, 66));
                                ccbDivide.setForeground(Color.white);
                                break;
                        }
                    }
                    if(jlb1.getText().equals("0")){//Label值為0時
                        jlb1.setText("");
                    }else if(!(jlb1.getText().equals("0"))){//Label值不為0時
                        if(count!=0){
                            jlb1.setText("");
                        }
                    }
                    count=0;
                    if((jlb1.getText().length()+ccb9.getText().length())>9){
                        jlb1.setText(jlb1.getText());
                    }else {
                        jlb1.setText(jlb1.getText()+ccb9.getText());
                    }
                }
            });

            ccbPlus.setFont(new Font("楷體", Font.PLAIN, 26));
            ccbPlus.setForeground(Color.white);//設置按鈕text顏色
            ccbPlus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbPlus.setBackground(Color.white);
                    ccbPlus.setForeground(new Color(255, 161, 66));
                    ccbMinus.setBackground(new Color(255, 161, 66));
                    ccbMinus.setForeground(Color.white);
                    ccbMultiply.setBackground(new Color(255, 161, 66));
                    ccbMultiply.setForeground(Color.white);
                    ccbDivide.setBackground(new Color(255, 161, 66));
                    ccbDivide.setForeground(Color.white);
                    count++;
                    if(!(calculating1.equals(""))){//calculating1被賦予值，運算符被點擊過
                        if(str1.contains(".") || jlb1.getText().contains(".")){
                            calculating1 +="IsFloat";
                        }
                        switch (calculating1){
                            case "plus":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) + Integer.valueOf(jlb1.getText())));
                                break;
                            case "minus":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) - Integer.valueOf(jlb1.getText())));
                                break;
                            case "multiply":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) * Integer.valueOf(jlb1.getText())));
                                break;
                            case "divide":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) / Integer.valueOf(jlb1.getText())));
                                break;
                            case "plusIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) + Float.valueOf(jlb1.getText())));
                                break;
                            case "minusIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) - Float.valueOf(jlb1.getText())));
                                break;
                            case "multiplyIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) * Float.valueOf(jlb1.getText())));
                                break;
                            case "divideIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) / Float.valueOf(jlb1.getText())));
                                break;
                        }
                    }
                    str1=jlb1.getText();
                    if(jlb1.getText().length()>9){
                        jlb1.setText(jlb1.getText().substring(0,9));
                    }
                    calculating1="plus";//點擊了plus，將calculating值更改為目前點擊的運算符
                }
            });

            ccbMinus.setFont(new Font("楷體", Font.PLAIN, 34));
            ccbMinus.setForeground(Color.white);//設置按鈕text顏色
            ccbMinus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //閃爍完後呈現的背景及字體顏色
                    ccbMinus.setBackground(Color.white);
                    ccbMinus.setForeground(new Color(255, 161, 66));
                    ccbPlus.setBackground(new Color(255, 161, 66));
                    ccbPlus.setForeground(Color.white);
                    ccbMultiply.setBackground(new Color(255, 161, 66));
                    ccbMultiply.setForeground(Color.white);
                    ccbDivide.setBackground(new Color(255, 161, 66));
                    ccbDivide.setForeground(Color.white);
                    count++;
                    if(!(calculating1.equals(""))){//calculating1被賦予值，運算符被點擊過
                        if(str1.contains(".") || jlb1.getText().contains(".")){
                            calculating1 +="IsFloat";
                        }
                        switch (calculating1){
                            case "plus":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) + Integer.valueOf(jlb1.getText())));
                                break;
                            case "minus":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) - Integer.valueOf(jlb1.getText())));
                                break;
                            case "multiply":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) * Integer.valueOf(jlb1.getText())));
                                break;
                            case "divide":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) / Integer.valueOf(jlb1.getText())));
                                break;
                            case "plusIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) + Float.valueOf(jlb1.getText())));
                                break;
                            case "minusIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) - Float.valueOf(jlb1.getText())));
                                break;
                            case "multiplyIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) * Float.valueOf(jlb1.getText())));
                                break;
                            case "divideIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) / Float.valueOf(jlb1.getText())));
                                break;
                        }
                    }
                    str1=jlb1.getText();
                    calculating1="minus";//點擊了plus，將calculating值更改為目前點擊的運算符
                }
            });

            ccbDivide.setFont(new Font("楷體", Font.PLAIN, 26));
            ccbDivide.setForeground(Color.white);//設置按鈕text顏色
            ccbDivide.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //閃爍完後呈現的背景及字體顏色
                    ccbDivide.setBackground(Color.white);
                    ccbDivide.setForeground(new Color(255, 161, 66));
                    ccbPlus.setBackground(new Color(255, 161, 66));
                    ccbPlus.setForeground(Color.white);
                    ccbMinus.setBackground(new Color(255, 161, 66));
                    ccbMinus.setForeground(Color.white);
                    ccbMultiply.setBackground(new Color(255, 161, 66));
                    ccbMultiply.setForeground(Color.white);
                    count++;
                    if(!(calculating1.equals(""))){//calculating1被賦予值，運算符被點擊過
                        if(str1.contains(".") || jlb1.getText().contains(".")){
                            calculating1 +="IsFloat";
                        }
                        switch (calculating1){
                            case "plus":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) + Integer.valueOf(jlb1.getText())));
                                break;
                            case "minus":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) - Integer.valueOf(jlb1.getText())));
                                break;
                            case "multiply":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) * Integer.valueOf(jlb1.getText())));
                                break;
                            case "divide":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) / Integer.valueOf(jlb1.getText())));
                                break;
                            case "plusIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) + Float.valueOf(jlb1.getText())));
                                break;
                            case "minusIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) - Float.valueOf(jlb1.getText())));
                                break;
                            case "multiplyIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) * Float.valueOf(jlb1.getText())));
                                break;
                            case "divideIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) / Float.valueOf(jlb1.getText())));
                                break;
                        }
                    }
                    str1=jlb1.getText();
                    calculating1="divide";//點擊了plus，將calculating值更改為目前點擊的運算符
                }
            });

            ccbMultiply.setFont(new Font("楷體", Font.PLAIN, 26));
            ccbMultiply.setForeground(Color.white);//設置按鈕text顏色
            ccbMultiply.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //閃爍完後呈現的背景及字體顏色
                    ccbMultiply.setBackground(Color.white);
                    ccbMultiply.setForeground(new Color(255, 161, 66));
                    ccbPlus.setBackground(new Color(255, 161, 66));
                    ccbPlus.setForeground(Color.white);
                    ccbMinus.setBackground(new Color(255, 161, 66));
                    ccbMinus.setForeground(Color.white);
                    ccbDivide.setBackground(new Color(255, 161, 66));
                    ccbDivide.setForeground(Color.white);
                    count++;
                    if(!(calculating1.equals(""))){//calculating1被賦予值，運算符被點擊過
                        if(str1.contains(".") || jlb1.getText().contains(".")){
                            calculating1 +="IsFloat";
                        }
                        switch (calculating1){
                            case "plus":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) + Integer.valueOf(jlb1.getText())));
                                break;
                            case "minus":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) - Integer.valueOf(jlb1.getText())));
                                break;
                            case "multiply":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) * Integer.valueOf(jlb1.getText())));
                                break;
                            case "divide":
                                jlb1.setText(Integer.toString(Integer.valueOf(str1) / Integer.valueOf(jlb1.getText())));
                                break;
                            case "plusIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) + Float.valueOf(jlb1.getText())));
                                break;
                            case "minusIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) - Float.valueOf(jlb1.getText())));
                                break;
                            case "multiplyIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) * Float.valueOf(jlb1.getText())));
                                break;
                            case "divideIsFloat":
                                jlb1.setText(Float.toString(Float.valueOf(str1) / Float.valueOf(jlb1.getText())));
                                break;
                        }
                    }
                    str1=jlb1.getText();
                    if(jlb1.getText().length()>9){
                        jlb1.setText(jlb1.getText().substring(0,9));
                    }
                    calculating1="multiply";//點擊了plus，將calculating值更改為目前點擊的運算符
                }
            });

            ccbDecimalPoint.setBackground(Color.darkGray);
            ccbDecimalPoint.setFont(new Font("楷體", Font.PLAIN, 30));
            ccbDecimalPoint.setForeground(Color.white);//設置按鈕text顏色
            ccbDecimalPoint.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(count==0){
                        if(jlb1.getText().contains(".")){
                            jlb1.setText(jlb1.getText());
                        }else{
                            if (jlb1.getText().equals("0")){
                                jlb1.setText("0.");
                            }else {
                                jlb1.setText(jlb1.getText()+ccbDecimalPoint.getText());
                            }
                        }
                    }else{
                        count=0;
                        jlb1.setText("0.");
                    }
                }
            });

            ccbPercentage.setBackground(new Color(173, 173, 173));
            ccbPercentage.setFont(new Font("楷體", Font.PLAIN, 20));
            ccbPercentage.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    float percentageIsFloat;
                    if(jlb1.getText().contains(".")){
                        percentageIsFloat = Float.valueOf(jlb1.getText());
                    }else {
                        percentageIsFloat = Integer.valueOf(jlb1.getText());
                    }
                    jlb1.setText(Float.toString(percentageIsFloat/100));
                }
            });

            ccbClearOrAllClaer.setBackground(new Color(173, 173, 173));
            ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 15));
            ccbClearOrAllClaer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    switch (ccbClearOrAllClaer.getText()){
                        case "C":
                            ccbClearOrAllClaer.setText("AC");
                            ccbClearOrAllClaer.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
                            jlb1.setText("0");
                            break;
                        case "AC":
                            str1="";
                            calculating1="";
                            count=0;
                    }
                    ccbPlus.setBackground(new Color(255, 161, 66));
                    ccbPlus.setForeground(Color.white);
                    ccbMinus.setBackground(new Color(255, 161, 66));
                    ccbMinus.setForeground(Color.white);
                    ccbMultiply.setBackground(new Color(255, 161, 66));
                    ccbMultiply.setForeground(Color.white);
                    ccbDivide.setBackground(new Color(255, 161, 66));
                    ccbDivide.setForeground(Color.white);
                }
            });

            ccbNegativeNumber.setBackground(new Color(173, 173, 173));
            ccbNegativeNumber.setFont(new Font("楷體", Font.PLAIN, 24));
            ccbNegativeNumber.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbClearOrAllClaer.setText("C");//ccbClearOrAllClaer初始值為AC，任何按鈕點擊後則變為C
                    ccbClearOrAllClaer.setFont(new Font("楷體", Font.PLAIN, 18));//將ccbClearOrAllClaer的Font字體大小變更為18
                    if(!(jlb1.getText().contains("-"))){
                        jlb1.setText("-" + jlb1.getText());
                    }else {
                        jlb1.setText(jlb1.getText().replace("-",""));
                    }
                }
            });

            ccbEquals.setFont(new Font("楷體", Font.PLAIN, 26));
            ccbEquals.setForeground(Color.white);//設置按鈕text顏色
            ccbEquals.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ccbPlus.setBackground(new Color(255, 161, 66));
                    ccbPlus.setForeground(Color.white);
                    ccbMinus.setBackground(new Color(255, 161, 66));
                    ccbMinus.setForeground(Color.white);
                    ccbMultiply.setBackground(new Color(255, 161, 66));
                    ccbMultiply.setForeground(Color.white);
                    ccbDivide.setBackground(new Color(255, 161, 66));
                    ccbDivide.setForeground(Color.white);
                    ccbEquals.setActionCommand("Equals");
                    if(str1.contains(".") || jlb1.getText().contains(".")){
                        calculating1 +="IsFloat";
                    }
                    switch (calculating1) {
                        case "plus":
                            jlb1.setText(Integer.toString(Integer.valueOf(str1) + Integer.valueOf(jlb1.getText())));
                            break;
                        case "minus":
                            jlb1.setText(Integer.toString(Integer.valueOf(str1) - Integer.valueOf(jlb1.getText())));
                            break;
                        case "multiply":
                            jlb1.setText(Integer.toString(Integer.valueOf(str1) * Integer.valueOf(jlb1.getText())));
                            break;
                        case "divide":
                            jlb1.setText(Integer.toString(Integer.valueOf(str1) / Integer.valueOf(jlb1.getText())));
                            break;
                        case "plusIsFloat":
                            jlb1.setText(Float.toString(Float.valueOf(str1) + Float.valueOf(jlb1.getText())));
                            break;
                        case "minusIsFloat":
                            jlb1.setText(Float.toString(Float.valueOf(str1) - Float.valueOf(jlb1.getText())));
                            break;
                        case "multiplyIsFloat":
                            jlb1.setText(Float.toString(Float.valueOf(str1) * Float.valueOf(jlb1.getText())));
                            break;
                        case "divideIsFloat":
                            jlb1.setText(Float.toString(Float.valueOf(str1) / Float.valueOf(jlb1.getText())));
                            break;
                    }
                    str1=jlb1.getText();
                    if(jlb1.getText().length()>9){
                        jlb1.setText(jlb1.getText().substring(0,9));
                    }
                    calculating1="";
                }
            });


            this.add(ccbClearOrAllClaer);
            this.add(ccbNegativeNumber);
            this.add(ccbPercentage);
            this.add(ccbDivide);
            this.add(ccb7);
            this.add(ccb8);
            this.add(ccb9);
            this.add(ccbMultiply);
            this.add(ccb4);
            this.add(ccb5);
            this.add(ccb6);
            this.add(ccbMinus);
            this.add(ccb1);
            this.add(ccb2);
            this.add(ccb3);
            this.add(ccbPlus);
            this.add(ccb0);
            this.add(ccbDecimalPoint);
            this.add(ccbEquals);

        }

    }

}
