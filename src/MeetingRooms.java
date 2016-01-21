/**
 * Created by hazai on 20/01/16.
 */

import java.util.Arrays;

/*Given an array of meeting time intervals consisting of start and end times
 [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.

For example,
        Given [[0, 30],[5, 10],[15, 20]],
        return false.*/
public class MeetingRooms {
    public static boolean canAttendMeetings(Interval[] intervals) {
        int [] start = new int[intervals.length];
        int [] end = new int[intervals.length];
        for (int i = 0; i < intervals.length;i++) {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);

        for (int c = 1; c < start.length;c++){
            if (start[c] < end[c-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Interval one = new Interval(0,30);
        Interval two = new Interval(5,10);
        Interval three = new Interval(15,20);
        Interval[] first = {one, two, three};
        Interval one2 = new Interval(0,10);
        Interval two2 = new Interval(15,20);
        Interval three2 = new Interval(25,30);
        Interval[] second = {one2, two2, three2};
        System.out.println(canAttendMeetings(first));
        System.out.println(canAttendMeetings(second));
    }

    private static class Interval{
        int start;
        int end;
        public Interval(int x, int y) {
            start = x;
            end = y;
        }
    }
}
