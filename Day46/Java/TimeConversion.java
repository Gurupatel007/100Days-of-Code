public class TimeConversion {
    public static String timeConversion(String s) {
        String amPm = s.substring(s.length() - 2);
        // Extract the hour part of the string
        int hour = Integer.parseInt(s.substring(0, 2));
        
        // Convert hour based on AM/PM
        if(amPm.equals("AM")) {
            if(hour == 12) { // Convert 12AM to 00
                s = "00" + s.substring(2, s.length() - 2);
            } else { // Keep other AM hours as is, just remove AM
                s = s.substring(0, s.length() - 2);
            }
        } else if(amPm.equals("PM")) {
            if(hour != 12) { // Convert PM hours to 24-hour format, except for 12 PM
                hour += 12;
                s = hour + s.substring(2, s.length() - 2);
            } else { // Keep 12 PM as is, just remove PM
                s = s.substring(0, s.length() - 2);
            }
        }
        
        return s;
    }
    public static void main(String[] args) {
        String s = "07:05:45PM";
        System.out.println(timeConversion(s));
        
    }
}