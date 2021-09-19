import javax.swing.JOptionPane;


class Main{
    public static void main(String[] args){
            String firstNumber, secondNumber;
            int number1, number2, sum;
            
            firstNumber = JOptionPane.showInputDialog("Enter first number");
            secondNumber = JOptionPane.showInputDialog("Enter second number");
            
            //conversão
            number1 = Integer.parseInt(firstNumber);
            number2 = Integer.parseInt(secondNumber);
            
            //soma
            sum = number1 + number2;
            
            //exibição:
            JOptionPane.showMessageDialog(null, "The sum is "+sum, "Results", JOptionPane.PLAIN_MESSAGE);
            
            System.exit(0); //stop the app
    }
}