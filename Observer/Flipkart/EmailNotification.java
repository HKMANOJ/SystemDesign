package Observer.Flipkart;

public class EmailNotification {

    String EmailId;

    public EmailNotification(String emailId) {
        EmailId = emailId;
    }

    public void update(){
        System.out.println("New stock arrived kindly check"+EmailId);

    }

    public void  sendEmail(){
        System.out.println("mail sent"+EmailId);
    }
}
