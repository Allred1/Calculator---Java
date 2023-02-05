
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


class Main extends JFrame implements ActionListener {
    // Frame
    static JFrame frame;
    // Ttextfield
    static JTextField textField;
 
    // Operator and numbers
    String num1;
    String num2;
    String operator;
 
    // Constructor
    Main() {
        operator = "";
        num1 = "";
        num2 = "";        
    }
 


    public static void main(String args[])
    {
        // Create and set up window. 
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Object of class
        Main calculating = new Main();
        
        // Establish boundaries
        var x = 10;
        var y = 300;
        var buttonWidth = 70;
        var buttonHeight = 50;
        var horizontalSpace = buttonWidth + 5;
        var verticalSpace = -55;

        // Create the user's input display
        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBounds(10,y + (verticalSpace * 4),295,buttonHeight); 
        textField.setEditable(false);
 
         
        // Create Buttons
        // Number Buttons
        JButton bZero = new JButton("0");       bZero.setBackground(Color.white);
        JButton bOne = new JButton("1");        bOne.setBackground(Color.white);
        JButton bTwo = new JButton("2");        bTwo.setBackground(Color.white);
        JButton bThree = new JButton("3");      bThree.setBackground(Color.white);
        JButton bFour = new JButton("4");       bFour.setBackground(Color.white);
        JButton bFive = new JButton("5");       bFive.setBackground(Color.white);
        JButton bSix = new JButton("6");        bSix.setBackground(Color.white);
        JButton bSeven = new JButton("7");      bSeven.setBackground(Color.white);
        JButton bEight = new JButton("8");      bEight.setBackground(Color.white);
        JButton bNine = new JButton("9");       bNine.setBackground(Color.white);

        // Operator Buttons 
        JButton bAdd = new JButton("+");        bAdd.setBackground(Color.white);
        JButton bSubtract = new JButton("-");   bSubtract.setBackground(Color.white);
        JButton bMultiply = new JButton("x");   bMultiply.setBackground(Color.white);
        JButton bDivide = new JButton("/");     bDivide.setBackground(Color.white);
        JButton bDot = new JButton(".");        bDot.setBackground(Color.white);
        JButton bEquals = new JButton("=");     bEquals.setBackground(Color.lightGray);
        JButton bClear = new JButton("C");      bClear.setBackground(Color.white);
        // JButton bDelete = new JButton("Del");
        // JButton bBlank = new JButton("");


        // Set Button positions
        // Row 1
        // bBlank.setBounds(x,y - verticalSpace,buttonWidth,buttonHeight);
        bZero.setBounds(x + horizontalSpace,y - verticalSpace,buttonWidth,buttonHeight);
        bDot.setBounds(x + (horizontalSpace * 2),y - verticalSpace,buttonWidth,buttonHeight);
        bEquals.setBounds(x + (horizontalSpace * 3),y - verticalSpace,buttonWidth,buttonHeight);
        // Row 2
        bOne.setBounds(x,y,buttonWidth,buttonHeight);
        bTwo.setBounds(x + horizontalSpace,y,buttonWidth,buttonHeight);
        bThree.setBounds(x + (horizontalSpace * 2),y,buttonWidth,buttonHeight);
        bAdd.setBounds(x + (horizontalSpace * 3),y,buttonWidth,buttonHeight);
        // Row 3
        bFour.setBounds(x,y + verticalSpace,buttonWidth,buttonHeight);
        bFive.setBounds(x + horizontalSpace,y + verticalSpace,buttonWidth,buttonHeight);
        bSix.setBounds(x + (horizontalSpace * 2),y + verticalSpace,buttonWidth,buttonHeight);
        bSubtract.setBounds(x + (horizontalSpace * 3),y + verticalSpace,buttonWidth,buttonHeight);
        // Row 4
        bSeven.setBounds(x,y + (verticalSpace * 2),buttonWidth,buttonHeight);
        bEight.setBounds(x + horizontalSpace,y + (verticalSpace * 2),buttonWidth,buttonHeight);
        bNine.setBounds(x + (horizontalSpace * 2),y + (verticalSpace * 2),buttonWidth,buttonHeight);
        bMultiply.setBounds(x + (horizontalSpace * 3),y + (verticalSpace * 2),buttonWidth,buttonHeight);
        // Row 5
        // bClearAll.setBounds(x,y +(verticalSpace * 3),buttonWidth, buttonHeight);
        // bDelete.setBounds(x + horizontalSpace,y +(verticalSpace * 3),buttonWidth,buttonHeight);
        bClear.setBounds(x + (horizontalSpace * 2),y + (verticalSpace * 3),buttonWidth,buttonHeight);
        bDivide.setBounds(x + (horizontalSpace * 3),y + (verticalSpace * 3),buttonWidth,buttonHeight);

 
        // add action listeners
        bMultiply.addActionListener(calculating);
        bDivide.addActionListener(calculating);
        bSubtract.addActionListener(calculating);
        bAdd.addActionListener(calculating);
        bNine.addActionListener(calculating);
        bEight.addActionListener(calculating);
        bSeven.addActionListener(calculating);
        bSix.addActionListener(calculating);
        bFive.addActionListener(calculating);
        bFour.addActionListener(calculating);
        bThree.addActionListener(calculating);
        bTwo.addActionListener(calculating);
        bOne.addActionListener(calculating);
        bZero.addActionListener(calculating);
        bDot.addActionListener(calculating);
        bClear.addActionListener(calculating);
        bEquals.addActionListener(calculating);
 
        // Add Buttons to Frame
        frame.add(bZero); frame.add(bDot); frame.add(bEquals);
        frame.add(bOne); frame.add(bTwo); frame.add(bThree); frame.add(bAdd);
        frame.add(bFour); frame.add(bFive); frame.add(bSix); frame.add(bSubtract);
        frame.add(bSeven); frame.add(bEight); frame.add(bNine); frame.add(bMultiply);
        frame.add(bClear); frame.add(bDivide);
        // frame.add(bClearAll); // frame.add(bDelete); //  frame.add(bBlank);
        
 
        frame.add(textField); 
        frame.setSize(330,450);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }


    public void actionPerformed(ActionEvent e)
    {
        String input = e.getActionCommand();
 
        // if the value is a number
        if ((input.charAt(0) >= '0' && input.charAt(0) <= '9') || input.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!operator.equals(""))
                num2 = num2 + input;
            else
                num1 = num1 + input;
 
            // set the value of text
            textField.setText(num1 + operator + num2);
        }
        else if (input.charAt(0) == 'C') {
            // clear the one letter
            num1 = operator = num2 = "";
 
            // set the value of text
            textField.setText(num1 + operator + num2);
        }
        else if (input.charAt(0) == '=') {
 
            double te;
 
            // store the value in 1st
            if (operator.equals("+"))
                te = (Double.parseDouble(num1) + Double.parseDouble(num2));
            else if (operator.equals("-"))
                te = (Double.parseDouble(num1) - Double.parseDouble(num2));
            else if (operator.equals("/"))
                te = (Double.parseDouble(num1) / Double.parseDouble(num2));
            else
                te = (Double.parseDouble(num1) * Double.parseDouble(num2));
 
            // set the value of text
            textField.setText(num1 + operator + num2 + "=" + te);
 
            // convert it to string
            num1 = Double.toString(te);
 
            operator = num2 = "";
        }
        else {
            // if there was no operand
            if (operator.equals("") || num2.equals(""))
                operator = input;
            // else evaluate
            else {
                double te;
 
                // store the value in 1st
                if (operator.equals("+"))
                    te = (Double.parseDouble(num1) + Double.parseDouble(num2));
                else if (operator.equals("-"))
                    te = (Double.parseDouble(num1) - Double.parseDouble(num2));
                else if (operator.equals("/"))
                    te = (Double.parseDouble(num1) / Double.parseDouble(num2));
                else
                    te = (Double.parseDouble(num1) * Double.parseDouble(num2));
 
                // convert it to string
                num1 = Double.toString(te);
 
                // place the operator
                operator = input;
 
                // make the operand blank
                num2 = "";
            }
 
            // set the value of text
            textField.setText(num1 + operator + num2);
        }
    }
}