package Controller;

import View.CreditCardInputView;
import View.TicketOrderUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * this will control the purchase gui
 * @author hayde
 */
public class TicketsOrderController implements ActionListener {
    private TicketOrderUI ticketOrder;
    private CreditCardInputView purchaseTix;
    private ViewTicketsController viewTix;
    private NavigationController navCntrl;

    public TicketsOrderController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       public TicketsOrderController(NavigationController navCntrl) {
        this.navCntrl = navCntrl;
        purchaseTix = new CreditCardInputView();
        purchaseTix.myTicketsBuy.addActionListener(this);
        purchaseTix.submitBuyTickets.addActionListener(this);
        purchaseTix.setVisible(true);
        
    }

    public TicketOrderUI getTicketOrder() {
        return ticketOrder;
    }

    public void setTicketOrder(TicketOrderUI ticketOrder) {
        this.ticketOrder = ticketOrder;
    }

    public CreditCardInputView getPurchaseTix() {
        return purchaseTix;
    }

    public void setPurchaseTix(CreditCardInputView purchaseTix) {
        this.purchaseTix = purchaseTix;
    }

    public NavigationController getNavCntrl() {
        return navCntrl;
    }

    public void setNavCntrl(NavigationController navCntrl) {
        this.navCntrl = navCntrl;
    }
    /**
     * getter for view tickets controller
     * @return (gets an instance of the view tickets controller)
     */
    public ViewTicketsController getViewTix() {
        return viewTix;
    }

    /**
     * setter for view tickets
     * @param viewTix sets variable of ViewTicketsController type
     */
    public void setViewTix(ViewTicketsController viewTix) {
        this.viewTix = viewTix;
    }
    
    /**
     * create the purchase tickets gui
     */
 

    /**
     * Action Events for buttons
     * @param e the command line arguments
     */
    @Override
    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == purchaseTix.myTicketsBuy)
        {
            viewTix = new ViewTicketsController(navCntrl);
            purchaseTix.setVisible(false);
        }
        if(obj == purchaseTix.submitBuyTickets)
        {
            navCntrl = new NavigationController();
            purchaseTix.setVisible(false);
            
        }
        
    }

    public boolean connectedUserClient(CreditCardInputView purchaseUI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
