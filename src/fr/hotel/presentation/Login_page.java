package fr.hotel.presentation;

import fr.hotel.model.Receptionniste;
import fr.hotel.model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Login_page extends JFrame{
    // public c1;
    static User logperson;
    JPanel p1;
    Container c;

    private JLabel name,email_id,password;
    private JTextField n;
    private JPasswordField p;
    private JButton login,clear;

    public Login_page()
    {
        setTitle("Se connecter ! ");
        c=getContentPane();
        c.setLayout(new BoxLayout(c,3));

        p1=new JPanel();
        p1.setLayout(new GridLayout(6,2,10,10));
        setSize(400,400); setVisible(true);
        name=new JLabel("Name");
        n=new JTextField(40);
        password=new JLabel("Password");
        p=new JPasswordField(8);
        p.setEchoChar('*');

        login=new JButton("Log in");
        clear=new JButton("Clear all");
        JLabel l1=new JLabel("");
        JLabel l2=new JLabel("");

        p1.add(l1);
        p1.add(l2);
        p1.add(name);p1.add(n);
        p1.add(password);p1.add(p);
        p1.add(login);p1.add(clear);
        c.add(p1);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ex) {
                n.setText("");
                p.setText("");
            }});
        login.addActionListener(new ActionListener()
        {
            //Code for saving log in details to file
            public void actionPerformed(ActionEvent ex)
            {
                int flag1=0;

                try
                {
                    FileInputStream fis1 = new FileInputStream("newPerson.dat");
                    ObjectInputStream ois1 = new ObjectInputStream(fis1);
                    User c1;
                    while((c1 = (User) ois1.readObject()) != null)
                    {
                        if(c1.getname().equals(n.getText()) && c1.getpassword().equals(new String(p.getPassword())))
                        {flag1=1;
                            logperson=c1;
                            break;
                        }
                    }
                    ois1.close();
                    fis1.close();
                }
                catch(EOFException e) {}
                catch(ClassNotFoundException ex2){}
                catch(IOException e) {}
                catch(NullPointerException np){
                }

                if(flag1==1)
                {dispose();
                    JOptionPane.showMessageDialog(null, n.getText()+
                                    ", you have succesfully logged in ","Message",
                            JOptionPane.INFORMATION_MESSAGE);
                    After_login al=new After_login();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, n.getText()+
                                    ", Invalid name/password ","Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }}

