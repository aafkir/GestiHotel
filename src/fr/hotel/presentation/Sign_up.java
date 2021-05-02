package fr.hotel.presentation;

import fr.hotel.model.Receptionniste;
import fr.hotel.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Sign_up extends JFrame {

    JPanel p1;
    Container c;

    private JLabel name, email_id, password;
    private JTextField n, e;
    private JPasswordField p;
    private JButton signup, clear;

    public Sign_up() {
        setTitle("Enregitrer un nouveau utilisateur ");
        c = getContentPane();
        c.setLayout(new BoxLayout(c, 3));

        p1 = new JPanel();
        p1.setLayout(new GridLayout(6, 2, 10, 10));
        setSize(400, 400);
        setVisible(true);

        name = new JLabel("Nom");
        n = new JTextField(40);

        password = new JLabel("Mot de passe");
        p = new JPasswordField(8);
        p.setEchoChar('*');

        email_id = new JLabel("Adresse Email");
        e = new JTextField(20);

        signup = new JButton("Sign up");
        clear = new JButton("Clear all");
        JLabel l1 = new JLabel("");
        JLabel l2 = new JLabel("");

        p1.add(l1);
        p1.add(l2);
        p1.add(name);
        p1.add(n);
        p1.add(password);
        p1.add(p);
        p1.add(email_id);
        p1.add(e);
        p1.add(signup);
        p1.add(clear);

        c.add(p1);

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ex) {
                n.setText("");
                p.setText("");
                e.setText("");
            }
        });
        signup.addActionListener(new ActionListener() {
            //Code for saving signup details to file
            public void actionPerformed(ActionEvent ex) {
                ArrayList<User> al = new ArrayList();

                int flag = 0;
                try {
                    FileInputStream fis = new FileInputStream("newPerson.dat");
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    User c;
                    while ((c = (User) ois.readObject()) != null) {
                        if (c.getname().equals(n.getText())) {
                            flag = 1;
                            break;
                        }
                        al.add(c);
                    }
                    ois.close();
                    fis.close();
                }
                catch(FileNotFoundException e)
                {}
                catch (EOFException e) {
                } catch (ClassNotFoundException ex2) {
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (flag == 0) {
                    //write to file only if name doesn't exist
                    User p2 = new User();
                    char[] ch = p.getPassword();
                    String s = new String(ch);
                    p2.signup(n.getText(), e.getText(), s);

                    al.add(p2);
                    try {
                        FileOutputStream fos;
                        ObjectOutputStream oos;
                        fos = new FileOutputStream("newPerson.dat");
                        oos = new ObjectOutputStream(fos);

                        User c;
                        Iterator i = al.iterator();
                        while (i.hasNext()) {
                            c = (User) i.next();
                            oos.writeObject(c);

                        }

                        fos.close();
                        oos.close();
                        dispose();
                        JOptionPane.showMessageDialog(null, "Welcome to HASISA " + '\n'
                                        + n.getText() + "," + "\nYou have succesfully signed up ", "Message",
                                JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException e) {
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "SORRY" + '\n'
                                    + n.getText() + ", Already exists!\n Try again. ",
                            "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });

    }
}
