package fundamentos;
import java.util.ArrayList;

public class message {
    
    private String name;
 
    public message(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Message sms = new Message("SMS");
        Message mms = new Message("MMS");
        
        System.out.println(sms.equals(sms));
        System.out.println(sms.equals(mms));
        
        ArrayList<Message> messages = new ArrayList<>();
        if (!messages.contains(sms)) {
            messages.add(sms);
        }
        
        if (!messages.contains(sms)) {
            messages.add(sms);
        }
        
        if (!messages.contains(new Message("SMS"))) {
            messages.add(sms);
        }
        
        System.out.println(messages.size());
    }

    public String getName() {
        return name;
    }
    
}

