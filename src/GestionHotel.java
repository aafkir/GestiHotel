import fr.hotel.presentation.Login_page;
import fr.hotel.presentation.Sign_up;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class GestionHotel {
    public static void main(String[] args) {
        PageAcceuil s = new PageAcceuil();
        s.setupscreen();
    }
}
class PageAcceuil extends JFrame {
    JButton login = new JButton("Log in");
    JButton signup = new JButton("Sign Up");

        JLabel bh1 = new JLabel("1 - La gestion des chambres");
        JLabel bh2 = new JLabel("2 - La gestion des clients");
        JLabel bh3 = new JLabel("3 - La gestion des réservations");
        JLabel bh4 = new JLabel("4 - La gestion des séjours");

    void setupscreen() {
        JPanel pane = new JPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pane.setLayout(null);

            JLabel p1 = new JLabel(new ImageIcon("fr/hotel/presentation/images/iconChambre.png"));
           JLabel p2 = new JLabel(new ImageIcon("fr/hotel/presentation/images/iconClients.png"));
           JLabel p3 = new JLabel(new ImageIcon("fr/hotel/presentation/images/iconReservation.png"));
           JLabel p4 = new JLabel(new ImageIcon("fr/hotel/presentation/images/iconSejour.png"));

        JLabel background = new JLabel(new ImageIcon("fr/hotel/presentation/images/background.jpg"));
        add(background);

        login.setBounds(1100, 10, 95, 20);
        background.add(login);
        signup.setBounds(1200, 10, 95, 20);
        background.add(signup);

            bh1.setBounds(100, 300, 500, 30);
            background.add(bh1);
            bh1.setFont(new Font("Times New Roman", Font.BOLD, 20));
            bh1.setForeground(Color.BLACK);
            p1.setBounds(50, 300, 100, 100);
            background.add(p1);

                bh2.setBounds(100, 350, 500, 30);
                background.add(bh2);
                bh2.setFont(new Font("Times New Roman", Font.BOLD, 20));
                bh2.setForeground(Color.BLACK);
                p2.setBounds(50, 350, 100, 100);
                background.add(p2);

                    bh3.setBounds(100, 400, 500, 30);
                    background.add(bh3);
                    bh3.setFont(new Font("Times New Roman", Font.BOLD, 20));
                    bh3.setForeground(Color.BLACK);
                    p3.setBounds(50, 400, 100, 100);
                    background.add(p3);

                bh4.setBounds(100, 450, 500, 30);
                background.add(bh4);
                bh4.setFont(new Font("Times New Roman", Font.BOLD, 20));
                bh4.setForeground(Color.BLACK);
                p4.setBounds(50, 450, 100, 100);
                background.add(p4);

        JLabel label = new JLabel(" Projet 7 | Gestion de l'hôtels ", JLabel.CENTER);
        label.setBounds(420, 30, 500, 100);
        label.setOpaque(false);
        background.add(label);
        label.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label.setForeground(Color.BLUE);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Login_page lp = new Login_page();
            }
        });

        signup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sign_up lp = new Sign_up();
            }
        });

        this.setSize(1800, 1850);
        this.setVisible(true);
    }

}
//testing
/*
    public static void main(String[] args) {
        //Vector<Chambre> listeChambres = new Vector<>();

        // 1. La gestion des chambres (saisies, modification)
        Hotel h1 = new Hotel("IBIS","Rue de la chapelle Paris 08","07 72 73 74 75", 5);
        Chambre c1 = new ChambreDouble(h1,1,1,true,2,100);
        Chambre c2 = new ChambreDouble(h1,2,1,true,2,100);
        Chambre c3 = new ChambreSimple(h1,3,1,true,2,100);
        Chambre c4 = new ChambreSimple(h1,4,1,true,2,100);
        Chambre c5 = new ChambreSuiteNormale(h1,5,1,true,2,100);
        Chambre c6 = new ChambreSuitePresidentielle(h1,5,1,true,2,100);

        MetierImpl mi = new MetierImpl();
        mi.ajouterNouvelleChambreSimple(h1,1,1,true,2,100);
        mi.ajouterNouvelleChambreDouble(h1,1,1,true,2,100);

        System.out.println("Affichage liste " +mi.listeChambres);


    }


}


 */


