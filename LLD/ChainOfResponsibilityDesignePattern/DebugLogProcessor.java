package ChainOfResponsibilityDesignePattern;

public class DebugLogProcessor extends LogProcessor{
    
    public DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int loglevel , String message){
        if(loglevel == DEBUG){
            System.out.println("DEBUG : "+message);
        }
        else{
            super.log(loglevel, message);
        }
    }
}
