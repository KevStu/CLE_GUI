import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hardware Till");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelOne = new JPanel(new GridLayout(3,2,5,5));

        final JButton button1 = new JButton("1/4 (4ft x 8ft) Plywood");
        final JButton button2 = new JButton("Kitchen Sink");
        final JButton button3 = new JButton("Cement Bag");
        final JButton button4 = new JButton("2inch Nails");
        final JButton button5 = new JButton("Cordless Drill Set");
        final JButton button6 = new JButton("PVC pipe (76mm)");

        panelOne.setBounds(10,10, 380,250);
        panelOne.setBackground(Color.lightGray);

        button1.setBounds(5,5,50,20);
        button2.setBounds(5,5,50,20);
        button3.setBounds(5,10,50,20);
        button4.setBounds(5,5,50,20);
        button5.setBounds(5,5,50,20);
        button6.setBounds(5,5,50,20);

        panelOne.add(button1);
        panelOne.add(button2);
        panelOne.add(button3);
        panelOne.add(button4);
        panelOne.add(button5);
        panelOne.add(button6);

        frame.add(panelOne);
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button1) {
                    JOptionPane.showMessageDialog(null, "₱ 405 ");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button2){
                    JOptionPane.showMessageDialog(null,"₱ 750 ");
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button3){
                    JOptionPane.showMessageDialog(null,"₱ 250 ");
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button4){
                    JOptionPane.showMessageDialog(null,"₱ 50/kg");
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button5) {
                    JOptionPane.showMessageDialog(null, "₱ 12,000");
                }
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button6) {
                    JOptionPane.showMessageDialog(null, "₱ 500");
                }
            }
        });
    }
}
