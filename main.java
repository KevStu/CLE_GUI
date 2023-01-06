import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Crystal Gems");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pOne = new JPanel(new FlowLayout());
        JPanel pTwo = new JPanel(new GridLayout(3,3,1,1));
        JPanel pThree = new JPanel(new FlowLayout());
        JButton b1 = new JButton("Compute");

        pOne.setBounds(10,10,360,60);
        pTwo.setBounds(10,100,360,90);
        pThree.setBounds(10,200,360,40);

       // pOne.setBackground(Color.lightGray);
       // pTwo.setBackground(Color.BLACK);
        pThree.setBackground(Color.lightGray);

        JLabel lOne, lTwo, lThree;

        lOne = new JLabel("Gem/24ct", JLabel.CENTER);
        lTwo = new JLabel("Medium:");
        lThree = new JLabel("Gem:");

       // lOne.setForeground(Color.white);//color for letter

        lOne.setBounds(10,10,90,20);
        lTwo.setBounds(10,60,90,20);
        lThree.setBounds(10,10,150,50);

        pOne.add(lOne);
        pTwo.add(lTwo);

        String[] Medium = {"Necklace" , "Ring" , "Bracelet"};
        final JComboBox drop1 = new JComboBox(Medium);
        drop1.setBounds(100,140,80,25);
        pTwo.add(drop1);
        pTwo.add(lThree);

       //lTwo.setForeground(Color.white);
        //lThree.setForeground(Color.white);

        String[] Gem = {"Peridot" , "Amethyst" , "Sapphire"};
        final JComboBox drop2 = new JComboBox(Gem);
        drop2.setBounds(100,140,80,25);
        pTwo.add(drop2);

        b1.setBounds(10,10,90,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = Compute.PriceCompute((String) drop1.getSelectedItem(),(String) drop2.getSelectedItem());
                Compute.displayResult(String.valueOf(result));
            }
        });
        pTwo.add(b1);


        frame.add(pOne);
        frame.add(pTwo);
        frame.add(pThree);
        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
    }
}

abstract class Price {
    public void displayMessage() {
        System.out.println("Hold");
    }
}
class Compute extends Price {
    public static int PriceCompute(String value1, String value2) {

        String[] drop1 = {"Necklace", "Ring", "Bracelet"};
        String[] drop2 = {"Peridot" , "Amethyst" , "Sapphire"};

        int[] box1price = {16000, 18000, 10000};
        int[] box2price = {25121, 66984, 669888};

        int labor = 5000;
        int overhead = 5000;
        int price1, price2;

        String MediumType = value1;
        String Gem = value2;

        if (MediumType == drop1[0]) {
            price1 = box1price[0];
        } else if (MediumType == drop1[1]) {
            price1 = box1price[1];
        } else if (MediumType == drop1[2]) {
            price1 = box1price[2];
        } else if (MediumType == drop1[3]) {
            price1 = box1price[3];
        } else if (MediumType == drop1[4]) {
            price1 = box1price[4];
        } else {
            price1 = box1price[5];
        }

        if (Gem == drop2[0]) {
            price2 = box2price[0];
        } else if (Gem == drop2[1]) {
            price2 = box2price[1];
        } else {
            price2 = box2price[2];
        }
        int cost = (price1 + price2 + labor + overhead);
        int itemprice = cost;
        return itemprice;
    }
    public static void displayResult (String itemprice){
        int ayitemprice = Integer.parseInt(String.valueOf(itemprice));
        double wprice = (ayitemprice * 0.5);
        double rprice = (wprice * 0.5);
        JOptionPane.showMessageDialog(null, "Wholesale Price: ₱" + wprice +
                        "\n Retail Price: " + rprice, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
