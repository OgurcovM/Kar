import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.*;
public class Main extends JFrame implements Runnable
{
    static private Socket connection;
    static private ObjectOutputStream output;
    static private ObjectInputStream input;
    int num;

    public static void main (String[] args)
    {
        new Thread(new Main("Test")).start();
        new Thread(new Server()).start();
    }
    public Main(String name)
    {
        super(name);
        setLayout(new FlowLayout());
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        final JTextField t1 = new JTextField(10);
        final JButton b1 = new JButton("=");
        final JButton b2 = new JButton("+");
        b1.addActionListener(new ActionListener()
        {


            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                if(arg0.getSource() == b1)
                {
                    t1.setText(String.valueOf(num + Integer.valueOf(t1.getText())));
                    sendData(t1.getText());
                }
            }
        });

        b2.addActionListener(new ActionListener()
        {


            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                //if(arg0.getSource() == b2)
                //{
                num = Integer.valueOf(t1.getText());
                t1.setText("");
                //}
            }
        });

        add(b2);
        add(t1);
        add(b1);
    }

    @Override
    public void run()
    {
        try
        {
            while(true)
            {
                connection = new Socket(InetAddress.getByName("192.168.0.10"), 1234);
                output = new ObjectOutputStream(connection.getOutputStream());
                input = new ObjectInputStream(connection.getInputStream());
                JOptionPane.showConfirmDialog(null, (String)input.readObject());

            }
        }

        catch (UnknownHostException e)
        {

        }

        catch (IOException e)
        {

        }

        catch (HeadlessException e)
        {

        }

        catch (ClassNotFoundException e)
        {

        }
    }

    private static void sendData(Object obj)
    {
        try
        {
            output.flush();
            output.writeObject(obj);
        }

        catch (Exception e)
        {

        }
    }
}