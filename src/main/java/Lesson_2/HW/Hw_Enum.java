package Lesson_2.HW;

public class Hw_Enum {

    public static void main (String[] args){


        System.out.println(Days.MONDAY.hours);


    }


    public enum Days {

        MONDAY(40), TUESDAY(32), WEDNESDAY(24), THIRSDAY(16),FRIDAY(8),SATURDAY(0),SUNDAY(0);

        Days( int hours) {
            this.hours = hours;
        }

        private int hours;

        public int getWorkingHours() {
            return hours;
        }
    }


}
