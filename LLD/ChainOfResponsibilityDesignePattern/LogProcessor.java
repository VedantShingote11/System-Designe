package ChainOfResponsibilityDesignePattern;

public abstract class LogProcessor{

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor loggerProcessor){
        this.nextLogProcessor = loggerProcessor;
    }

    public void log(int loglevel , String message){
        if(nextLogProcessor != null){
            nextLogProcessor.log(loglevel, message);
        }
    }

}
