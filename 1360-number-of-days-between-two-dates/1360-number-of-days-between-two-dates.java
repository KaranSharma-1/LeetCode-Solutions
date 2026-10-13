class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(toDays(date2) - toDays(date1));
    }

    int toDays(String date) {
        String[] arr = date.split("-");

        int year = Integer.parseInt(arr[0]);
        int months = Integer.parseInt(arr[1]);
        int days = Integer.parseInt(arr[2]);

        int totalDays = (year - 1900) * 365;
        int leap = 0;

        for (int i = 1900; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                leap++;
            }
        }

        totalDays += leap;

        for (int i = 1; i < months; i++) {
            switch (i) {
                case 1, 3, 5, 7, 8, 10:
                    totalDays += 31;
                    break;

                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        totalDays += 29;
                    } else {
                        totalDays += 28;
                    }
                    break;

                default:
                    totalDays += 30;
                    break;
            }
        }

        totalDays += days;
        return totalDays;
    }
}