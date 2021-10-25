package Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.NavigationUI;
import View.RegistrationUI;
import View.loginPage;


/**
 *
 * @author fdadebo
 */
public class LoginController implements ActionListener{
    private NavigationController navCntrl;
    private AdminNavigationController adminNavCntrl;
    private loginPage loginUI;
    private LoginController loginCntrl;
    private RegistrationController registraCntrl;


    /**
     * Constructor for login controller
     */
    public LoginController() {
        loginUI = new loginPage(this);
        loginUI.loginButton.addActionListener(this);
        loginUI.adminLogin.addActionListener(this);
        loginUI.signUpButtonL.addActionListener(this);
        loginUI.setVisible(true);
     };
    
    /**
     * Method to 'connect' to our user
     * @param loginInterface a user interface which can view the login
     * @return the connection status
     */    
    public boolean connectedUserClient(loginPage loginInterface) {
        loginUI = loginInterface;
        return true;
    }
    
    /**
     * Action Events for buttons
     * @param e representing an Action Event
     * returns void
     */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == loginUI.loginButton)
        {
            navCntrl = new NavigationController();
            loginUI.setVisible(false);
        } else if (obj == loginUI.adminLogin) {
            adminNavCntrl = new AdminNavigationController();
            loginUI.setVisible(false);
        }else if (obj == loginUI.signUpButtonL){
            registraCntrl = new RegistrationController();
            loginUI.setVisible(false);
            
        }
    }
}
