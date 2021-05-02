package fr.hotel.presentation;

import fr.hotel.metier.MetierImpl;
import fr.hotel.model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PageReservation extends JFrame {

    private String[] month = {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    private String[] date = {"Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String[] room = {"0", "1", "2", "3", "4", "5"};
    private String[] year = {"Year", "2019", "2020", "2021"};
    private JTextField tmonthin = new JTextField(15);
    private JTextField tdatein = new JTextField(15);
    private JTextField tyearin = new JTextField(15);
    private JComboBox cyearin = new JComboBox();
    private JComboBox cdatein = new JComboBox();
    private JComboBox cmonthin = new JComboBox();
    private JTextField tmonthout = new JTextField(15);
    private JTextField tdateout = new JTextField(15);
    private JTextField tyearout = new JTextField(15);
    private JComboBox cyearout = new JComboBox();
    private JComboBox cdateout = new JComboBox();
    private JComboBox cmonthout = new JComboBox();

    private JButton checkin = new JButton("Voir disponibilités");
    private JButton viewcal = new JButton("Afficher Calendrier");
    private JButton pay = new JButton("Payer la facture");
    private JButton amt = new JButton("afficher le Montant de la facture");

    public String monthin, monthout, datein, dateout, yearin, yearout;
    Integer diffDays;


    int bookingflag = 0;

    public void book() throws AssertionError, ParseException {

        setSize(1600, 1000);

        setVisible(true);
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        add(background);

            JLabel in = new JLabel("CheckIn", JLabel.CENTER);
            in.setOpaque(false);
            in.setBounds(50, 50, 150, 30);
            in.setFont(new Font("Times New Roman", Font.BOLD, 30));
            background.add(in);

                JLabel out = new JLabel("CheckOut", JLabel.CENTER);
                out.setOpaque(false);
                out.setBounds(600, 50, 150, 30);
                out.setFont(new Font("Times New Roman", Font.BOLD, 30));
                background.add(out);

        checkin.setBounds(130, 500, 450, 50);
        background.add(checkin);
        viewcal.setBounds(800, 150, 200, 50);
        background.add(viewcal);
        viewcal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalendarProgram cal = new CalendarProgram();
                cal.calendar();
            }
        });
        background.add(checkin);
        viewcal = new JButton("afficher Calendrier");
        tdatein.setBounds(250, 75, 100, 25);
        background.add(tdatein);
        cdatein.setBounds(250, 50, 100, 25);
        background.add(cdatein);
        tmonthin.setBounds(350, 75, 100, 25);
        background.add(tmonthin);
        cmonthin.setBounds(350, 50, 100, 25);
        background.add(cmonthin);
        tyearin.setBounds(450, 75, 100, 25);
        background.add(tyearin);
        cyearin.setBounds(450, 50, 100, 25);
        background.add(cyearin);

        for (int i = 0; i < 13; i++) {
            cmonthin.addItem(month[i]);
        }
        tmonthin.setEditable(false);

        for (int i = 0; i < 31; i++) {
            cdatein.addItem(date[i]);
        }
        tdatein.setEditable(false);

        for (int i = 0; i < 4; i++) {
            cyearin.addItem(year[i]);
        }
        tyearin.setEditable(false);

        cdatein.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tdatein.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
                datein = tdatein.getText();
            }
        });

        cmonthin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tmonthin.setText((((JComboBox) e.getSource()).getSelectedItem().toString()) + "");
                monthin = tmonthin.getText();
            }
        });
        cyearin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tyearin.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
                yearin = tyearin.getText();
            }
        });
        tdateout.setBounds(800, 75, 100, 25);
        background.add(tdateout);
        cdateout.setBounds(800, 50, 100, 25);
        background.add(cdateout);
        tmonthout.setBounds(900, 75, 100, 25);
        background.add(tmonthout);
        cmonthout.setBounds(900, 50, 100, 25);
        background.add(cmonthout);
        background.add(pay);

        tyearout.setBounds(1000, 75, 100, 25);
        background.add(tyearout);
        cyearout.setBounds(1000, 50, 100, 25);
        background.add(cyearout);

        for (int i = 0; i < 32; i++) {
            cdateout.addItem(date[i]);
        }
        tdateout.setEditable(false);

        for (int i = 0; i < 13; i++) {
            cmonthout.addItem(month[i]);
        }
        tmonthout.setEditable(false);

        for (int i = 0; i < 4; i++) {
            cyearout.addItem(year[i]);
        }
        tyearout.setEditable(false);

        cdateout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tdateout.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
                dateout = tdateout.getText();
            }
        });
        cmonthout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tmonthout.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
                monthout = tmonthout.getText();
            }
        });

        cyearout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tyearout.setText("" + ((JComboBox) e.getSource()).getSelectedItem());
                yearout = tyearout.getText();
            }
        });

        //   checkin.addActionListener(new ActionListener() {
        //
        //   }


        MetierImpl mi = new MetierImpl();
        //mi.ajouterNouvelleChambreSimple();

        //
        // mi.modifierPrixChambreDouble();
        mi.suprimerChambreSuitePresidentielle();

        //mi.ajouterNouvelleChambreSimple();


    }

}
