package main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        //new Solve_Quadratic_Equation();
        try {
            cat cat = new cat("TiGer");
            System.out.println(cat.isItCat());
        }catch (Exception e){
            System.out.println(e);
        }
//        ArrayList<String> details=new ArrayList<>();
//        System.out.print("Enter the number of strings : ");
//        int size= input.nextInt();
//        String [] hh=new String[10];
//        hh[0]="st";
//        hh[1]="nd";
//        hh[2]="rd";
//        try{
//            for(int i=3;i< hh.length;i++){
//                hh[i]="th";
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        for(int i =0; i<size;i++){
//            System.out.print("Enter the "+(i+1) + hh[i] + " string : ");
//            String s=input.next();
//            details.add(s);
//        }
//        System.out.println();
//        System.out.println();
//        for (int i =0; i<details.size();i++){
//            System.out.print(details.get(i) + " ");
//            for (int j=0; j<details.size();j++){
//                if(!details.get(i).equals(details.get(j))){
//                    System.out.print(details.get(j) +" ");
//                }
//            }
//            System.out.println();
//        }
    }
}
class Solve_Quadratic_Equation extends JFrame implements ActionListener {
    JButton button;

    JTextField textField_a;
    JTextField textField_b;
    JTextField textField_c;

    double a;
    double b;
    double c;

    public Solve_Quadratic_Equation(){
        ImageIcon icon = new ImageIcon("equation.png");
        setIconImage(icon.getImage());

        setTitle("Solve Quadratic Equation");
        Border border = BorderFactory.createLineBorder(Color.RED ,3);
        setVisible(true);
        setSize(450,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,150);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
        setResizable(false);


        JLabel label = new JLabel("aX² + bX + c");
        label.setForeground(Color.RED);
        label.setFont(new Font("times new roman" , Font.BOLD, 30));
        label.setBounds(140,5,200,60);


        JLabel label1 = new JLabel("a");
        label1.setFont(new Font("times new roman" , Font.BOLD, 35));
        label1.setBounds(50,70,200,60);
        label1.setForeground(Color.WHITE);


        JLabel label2 = new JLabel("b");
        label2.setFont(new Font("times new roman" , Font.BOLD, 35));
        label2.setBounds(200,70,200,60);
        label2.setForeground(Color.WHITE);


        JLabel label3 = new JLabel("c");
        label3.setFont(new Font("times new roman" , Font.BOLD, 35));
        label3.setBounds(350,70,200,60);
        label3.setForeground(Color.WHITE);


        textField_a = new JTextField();
        textField_a.setBounds(10,120,100,30);
        textField_a.setFont(new Font("times new roman" , Font.BOLD, 18));
        textField_a.setBackground(Color.DARK_GRAY);
        textField_a.setForeground(Color.WHITE);


        textField_b = new JTextField();
        textField_b.setBounds(160,120,100,30);
        textField_b.setFont(new Font("times new roman" , Font.BOLD, 18));
        textField_b.setBackground(Color.DARK_GRAY);
        textField_b.setForeground(Color.WHITE);


        textField_c = new JTextField();
        textField_c.setBounds(310,120,100,30);
        textField_c.setFont(new Font("times new roman" , Font.BOLD, 18));
        textField_c.setBackground(Color.DARK_GRAY);
        textField_c.setForeground(Color.WHITE);

        button = new JButton("Solve");
        button.setFont(new Font("times new roman" , Font.BOLD, 30));
        button.setBounds(140,190,150,40);
        button.setBorder(border);
        button.setBackground(new Color(0, 42, 72));
        button.setForeground(Color.white);
        button.setFocusable(false);
        button.addActionListener(this);


        add(label);
        add(label1);
        add(label2);
        add(label3);
        add(textField_a);
        add(textField_b);
        add(textField_c);
        add(button);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            try{
                a= Double.parseDouble(textField_a.getText());
                b= Double.parseDouble(textField_b.getText());
                c= Double.parseDouble(textField_c.getText());
                String [] ok ={"OK"};
                double X1 = (( (-1*b) + (Math.sqrt( (Math.pow(b,2)) - (4*a*c) ) ) ) / ((2*a)) ) ;
                double X2 = (( (-1*b) - (Math.sqrt( (Math.pow(b,2)) - (4*a*c) ) ) ) / ((2*a)) ) ;
                String hh = "X1 = "  + X1 +"\n"+ "X2 = "+ X2;
                JOptionPane.showOptionDialog(this,hh ,"the result", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,ok,0);

            }catch (Exception u){
                JOptionPane.showMessageDialog(this,"Enter a numbers please" ,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
class cat{
    String [] arr={"Cat" , "Tiger" ,"Loin"};
    private String input;
    private boolean isItCat;
    public cat(){
        input="cat";
    }
    public cat(String input){
        isItCat();
    }

    public void setInput(String input) {
        this.input = input;
    }
    public String getInput(){
        return input;
    }

    public boolean isItCat() {
        isItCat=false;
        for(int i =0;i<arr.length;i++){
            if(input.equals(arr[i])){
                isItCat=true;
            }
        }
        return isItCat;
    }
}
