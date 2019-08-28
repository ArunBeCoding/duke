import java.text.ParseException;

public class Task {
    protected String command; protected Boolean done;
    public Task(String command){
        this.command = command;
        this.done = false;
    }
    public String printer(){
        if(done){
            String result = "[✓] " + command;
            return result;
        }else{
            String result = "[✗]" + command;
            return result;
        }
    }

    public String printToOutput(){
        return "";
    }


    public void taskDone(){
        done = true;
    }
}