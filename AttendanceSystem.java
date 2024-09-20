import java.text.SimpleDateFormat;
import java.util.Date;
public class AttendanceSystem {
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    Date date = new Date();
    public void markAttendance(){
        System.out.println("Attendance Marked: " + formatter.format(date));
    }
}
