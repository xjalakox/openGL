package chat;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Gui extends JFrame{

	private JLabel Background;
	public static JTextField Username_field;
	public JPasswordField password_field;
	public JButton login;
	public JLabel register;
	
	
	public static String getJTextField(){
		return Username_field.getText();
	}
	
	public Gui(){
		
		JFrame Mainframe = new JFrame("WeChat");
		Mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Mainframe.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resource/chat32x32.png")));
		Mainframe.setSize(800, 600);
		Mainframe.setLocationRelativeTo(null);
		Mainframe.setResizable(false);
		Mainframe.setVisible(true);
		
		
		
		JLabel Background = new JLabel((new ImageIcon(getClass().getResource("/resource/login.png"))));
		Background.setBounds(0, 0, 800, 600);
		
		JButton login = new JButton("Login");
		login.setBounds(290,410,230,40);
		
		JTextField Username_field = new JTextField("Benutzername"); 
		Username_field.setBounds(290,220,230,40);
		Username_field.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	Username_field.setText("");
            }
        });
		
		
		JPasswordField password_field = new JPasswordField("Passwort"); 
		password_field.setBounds(290,310,230,40);
		password_field.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	password_field.setText("");
            }
        });
		
		
		JLabel register = new JLabel("Noch kein Mitglied? Registriere dich hier!");
		register.setBounds(290,480,235,100);
		register.setVisible(true);
		register.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent e) {
			      if (e.getClickCount() > 0) {
			          if (Desktop.isDesktopSupported()) {
			                Desktop desktop = Desktop.getDesktop();
			                try {
			                    URI uri = new URI("www.java-pokemon.tk");
			                    desktop.browse(uri);
			                } catch (IOException ex) {
			                    ex.printStackTrace();
			                } catch (URISyntaxException ex) {
			                    ex.printStackTrace();
			                }
			        }
			      }
			   }
			});
		
		
		Mainframe.add(Username_field);
		Mainframe.add(password_field);
		Mainframe.add(register);
		Mainframe.add(login);
		Mainframe.add(Background);
		
		setVisible(true);
		Mainframe.repaint();

		
	}	
}
