
import java.util.ArrayList;
import java.util.List;

public class MessagingService {
    ArrayList<Message>msg;
    public MessagingService(){
        this.msg=new ArrayList<>();
    }
    public void add(Message message){
        if(message.getContent().length()<=280){
            msg.add(message);
        }
    }
    public ArrayList<Message> getMessages(){
        ArrayList<Message>msg=(ArrayList<Message>) this.msg;
        return (msg);
    }
}
