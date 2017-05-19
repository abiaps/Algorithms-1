/**
 * Created by abiaps on 5/18/2017.
 */
public class StudentAttendanceRecordI {
    public static boolean checkRecord(String s) {
        int[] record = {0, 0};
        for (int i = 0; i < s.length(); i++) {
            if (record[0] > 1 || record[1] == 3)
                break;
            if (s.charAt(i) == 'A')
                record[0]++;
            else if (s.charAt(i) == 'L') {
                record[1]++;
                continue;
            }
            record[1] = 0;
        }
        if (record[1] > 2 || record[0] > 1) return false;
        return true;
    }

    public static void main(String[] args) {
        String input = "AA";
        System.out.println(checkRecord(input));
    }
}
