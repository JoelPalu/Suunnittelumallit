import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private String log;
    private BufferedWriter writer;

    private static Logger instance;

    private Logger() {
        if (log == null) {
            log = "log.txt";
        }
        this.log = log;
        openLogFile();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void write(String message) {
        try {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setFileName(String log) {
        close();
        this.log = log;
        openLogFile();
    }

    public void close() {
        instance=null;
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void openLogFile() {
        try {
            writer = new BufferedWriter(new FileWriter(log, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
