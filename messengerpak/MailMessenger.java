package messengerpak;

public class MailMessenger implements Messenger {
    boolean isSuccess = false ;
    boolean isConnectedToServer = false;
    
    public void connect(){
        System.out.println("Connected.");
        isConnectedToServer = true;
    }
    
    public void disconnect(){
        System.out.println("Disonnected.");
        isConnectedToServer = false;
    }
    
    
    @Override
    public boolean sendMessege(String reciever, String subject, String messege) {
        if(isConnectedToServer == true){
            System.out.println("Message Sent.");
            return isSuccess = true;
        }
        else{
            System.out.println("Message Not Sent. Can't Connect to Server.");
            return isSuccess = false;
        }
        
    }
}