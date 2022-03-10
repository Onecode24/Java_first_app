import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiProject implements ActionListener{
    int count=0;
    JLabel label;
    JFrame frame;
    JPanel panel;

    public  guiProject(){
        frame=new JFrame();//Pour gerer l'architecture des composants
        panel= new JPanel();//c'est est conteneur qui peut contenir d'autre composants
        label=new JLabel("Numbers of clicks: 0");
        JButton button= new JButton();



        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));//Delimiter le conteneur principal
        panel.setLayout(new GridLayout(0,1));
        panel.add(button); //Pour ajouter le button dans le conteneur principal
        button.addActionListener(this);
        panel.add(label);

        //Mise en forme du button
        button.setBackground(Color.gray);
        button.setText("Click me");

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First GUI App");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new guiProject();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Numbers of clicks: "+count);
    }
}
