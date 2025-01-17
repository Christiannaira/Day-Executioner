import java.util.ArrayList;
import java.util.Scanner;

public class CalendarData {

    String theMonth;

    //Class Constructor
    public CalendarData(String month) {
        theMonth = month;
    }

    static boolean sunday(int userDay, int... days) {

        ArrayList<Integer> sunday = new ArrayList<Integer>();
        for (int day : days) {

            sunday.add(day);

        }

        return sunday.contains(userDay);

    }

    static boolean monday(int userDay, int... days) {

        ArrayList<Integer> monday = new ArrayList<Integer>();
        for (int day : days) {

            monday.add(day);

        }

        return monday.contains(userDay);

    }

    static boolean tuesday(int userDay, int... days) {

        ArrayList<Integer> tuesday = new ArrayList<Integer>();
        for (int day : days) {

            tuesday.add(day);

        }

        return tuesday.contains(userDay);

    }

    static boolean wednesday(int userDay, int... days) {

        ArrayList<Integer> wednesday = new ArrayList<Integer>();
        for (int day : days) {

            wednesday.add(day);

        }

        return wednesday.contains(userDay);

    }

    static boolean thursday(int userDay, int... days) {

        ArrayList<Integer> thursday = new ArrayList<Integer>();
        for (int day : days) {

            thursday.add(day);

        }

        return thursday.contains(userDay);

    }

    static boolean friday(int userDay, int... days) {

        ArrayList<Integer> friday = new ArrayList<Integer>();
        for (int day : days) {

            friday.add(day);

        }

        return friday.contains(userDay);

    }

    static boolean saturday(int userDay, int... days) {

        ArrayList<Integer> saturday = new ArrayList<Integer>();
        for (int day : days) {

            saturday.add(day);

        }

        return saturday.contains(userDay);

    }

    void askDay(int[] sundayLists, int[] mondayLists, int[] tuesdayLists, int[] wednesdayLists, int[] thursdayLists, int[] fridayLists, int[] saturdayLists, ArrayList<String> calendarMonth, boolean singleValue, ArrayList<String> dateExecuted){

        Scanner askUser = new Scanner(System.in);
        System.out.print("\t\t\t\t\tSelect the Day you want to execute: ");

        int askDay = askUser.nextInt();

        if (sunday(askDay,sundayLists)) {
            System.out.println("sunday");
        } else if (monday(askDay, mondayLists)) {
            System.out.println("monday");
        } else if (tuesday(askDay,tuesdayLists)) {
            System.out.println("tuesday");
        } else if (wednesday(askDay, wednesdayLists)) {
            System.out.println("wednesday");
        } else if (thursday(askDay, thursdayLists)) {
            System.out.println("thursday");
        } else if (friday(askDay,fridayLists)) {
            System.out.println("friday");
        } else if (saturday(askDay,saturdayLists)) {
            System.out.println("saturday");
        }

        String replacement;

        for (int i = 0; i < calendarMonth.size(); i++) {

            int theIndex = calendarMonth.get(i).indexOf(String.valueOf(askDay));

            if (theIndex == -1) {

                //nothing will happen

            } else if (String.valueOf(askDay).length() == 1) {

                if (!dateExecuted.contains(String.valueOf(askDay))) {

                    if (calendarMonth.get(i).substring(theIndex, theIndex+1).trim().equals(String.valueOf(askDay)) && singleValue) {

                        replacement = calendarMonth.get(i).replace(calendarMonth.get(i).substring(theIndex, theIndex + 1), "X");
                        dateExecuted.add(calendarMonth.get(i).substring(theIndex,theIndex + 1));
                        calendarMonth.set(i, replacement);
                        singleValue = false;

                    }

                }

            } else if (String.valueOf(askDay).length() == 2) {

                if (!dateExecuted.contains(String.valueOf(askDay))) {

                    replacement  = calendarMonth.get(i).replace(calendarMonth.get(i).substring(theIndex, theIndex + 2), "XX");
                    dateExecuted.add(calendarMonth.get(i).substring(theIndex,theIndex + 2));
                    calendarMonth.set(i, replacement);

                }

            }

        }

        for (String calendar: calendarMonth) {

            System.out.println(calendar);

        }



    }

//    public void calendarTweFive() {
//
//        switch (theMonth) {
//
//            case "January":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t  1   \t  2   \t  3   \t  4   \n");
//                System.out.println("\t\t\t\t\t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \n");
//                System.out.println("\t\t\t\t\t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \n");
//                System.out.println("\t\t\t\t\t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \n");
//                System.out.println("\t\t\t\t\t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \t       \n");
//
//                int[] sundayListsJ = {5, 12, 19, 26};
//                int[] mondayListsJ = {6, 13, 20, 27};
//                int[] tuesdayListsJ = {7, 14, 21, 28};
//                int[] wednesdayListsJ = {1, 8, 15, 22, 29};
//                int[] thursdayListsJ = {2, 9, 16, 23, 30};
//                int[] fridayListsJ = {3, 10, 17, 24, 31};
//                int[] saturdayListsJ = {4, 11, 18, 25};
//
//                askDay(sundayListsJ, mondayListsJ, tuesdayListsJ, wednesdayListsJ, thursdayListsJ, fridayListsJ, saturdayListsJ);
//
//                break;
//            case "February":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t      \t      \t  1   \n");
//                System.out.println("\t\t\t\t\t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \n");
//                System.out.println("\t\t\t\t\t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \n");
//                System.out.println("\t\t\t\t\t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \n");
//                System.out.println("\t\t\t\t\t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \t       \n");
//
//                int[] sundayListsF = {2, 9, 16, 23};
//                int[] mondayListsF = {3, 10, 17, 24};
//                int[] tuesdayListsF = {4, 11, 18, 25};
//                int[] wednesdayListsF = {5, 12, 19, 26};
//                int[] thursdayListsF = {6, 13, 20, 27};
//                int[] fridayListsF = {7, 14, 21, 28};
//                int[] saturdayListsF = {1, 8, 15, 22};
//
//                askDay(sundayListsF, mondayListsF, tuesdayListsF, wednesdayListsF, thursdayListsF, fridayListsF, saturdayListsF);
//
//                break;
//
//            case "March":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t      \t      \t  1   \n");
//                System.out.println("\t\t\t\t\t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \n");
//                System.out.println("\t\t\t\t\t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \n");
//                System.out.println("\t\t\t\t\t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \n");
//                System.out.println("\t\t\t\t\t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \t  29   \n");
//                System.out.println("\t\t\t\t\t  30   \t  31   \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsM = {2, 9, 16, 23, 30};
//                int[] mondayListsM = {3, 10, 17, 24, 31};
//                int[] tuesdayListsM = {4, 11, 18, 25};
//                int[] wednesdayListsM = {5, 12, 19, 26};
//                int[] thursdayListsM = {6, 13, 20, 27};
//                int[] fridayListsM = {7, 14, 21, 28};
//                int[] saturdayListsM = {1, 8, 15, 22, 29};
//
//                askDay(sundayListsM, mondayListsM, tuesdayListsM, wednesdayListsM, thursdayListsM, fridayListsM, saturdayListsM);
//
//                break;
//
//            case "April":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t  1   \t  2   \t  3   \t  4   \t  5   \n");
//                System.out.println("\t\t\t\t\t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \n");
//                System.out.println("\t\t\t\t\t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \n");
//                System.out.println("\t\t\t\t\t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \n");
//                System.out.println("\t\t\t\t\t  27   \t  28   \t  29   \t  30   \t       \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsA = {6, 13, 20, 27};
//                int[] mondayListsA = {7, 14, 21, 28};
//                int[] tuesdayListsA = {1, 8, 15, 22, 29};
//                int[] wednesdayListsA = {2, 9, 16, 23, 30};
//                int[] thursdayListsA = {3, 10, 17, 24};
//                int[] fridayListsA = {4, 11, 18, 25};
//                int[] saturdayListsA = {5, 12, 19, 26};
//
//                askDay(sundayListsA, mondayListsA, tuesdayListsA, wednesdayListsA, thursdayListsA, fridayListsA, saturdayListsA);
//
//                break;
//
//            case "May":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t  1   \t  2   \t  3   \n");
//                System.out.println("\t\t\t\t\t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \n");
//                System.out.println("\t\t\t\t\t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \n");
//                System.out.println("\t\t\t\t\t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \n");
//                System.out.println("\t\t\t\t\t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsMy = {4, 11, 18, 25};
//                int[] mondayListsMy = {5, 12, 19, 26};
//                int[] tuesdayListsMy = {6, 13, 20, 27};
//                int[] wednesdayListsMy = {7, 14, 21, 28};
//                int[] thursdayListsMy = {1, 8, 15, 22, 29};
//                int[] fridayListsMy = {2, 9, 16, 23, 30};
//                int[] saturdayListsMy = {3, 10, 17, 24, 31};
//
//                askDay(sundayListsMy, mondayListsMy, tuesdayListsMy, wednesdayListsMy, thursdayListsMy, fridayListsMy, saturdayListsMy);
//
//                break;
//
//            case "June":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \n");
//                System.out.println("\t\t\t\t\t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \n");
//                System.out.println("\t\t\t\t\t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \n");
//                System.out.println("\t\t\t\t\t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \n");
//                System.out.println("\t\t\t\t\t  29   \t  30   \t       \t       \t       \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsJu = {1, 8, 15, 22, 29};
//                int[] mondayListsJu = {2, 9, 16, 23, 30};
//                int[] tuesdayListsJu = {3, 10, 17, 24};
//                int[] wednesdayListsJu = {4, 11, 18, 25};
//                int[] thursdayListsJu = {5, 12, 19, 26};
//                int[] fridayListsJu = {6, 13, 20, 27};
//                int[] saturdayListsJu = {7, 14, 21, 28};
//
//                askDay(sundayListsJu, mondayListsJu, tuesdayListsJu, wednesdayListsJu, thursdayListsJu, fridayListsJu, saturdayListsJu);
//
//                break;
//
//            case "July":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t  1   \t  2   \t  3   \t  4   \t  5   \n");
//                System.out.println("\t\t\t\t\t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \n");
//                System.out.println("\t\t\t\t\t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \n");
//                System.out.println("\t\t\t\t\t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \n");
//                System.out.println("\t\t\t\t\t  27   \t  28   \t  29   \t  30   \t  31   \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsJy = {6, 13, 20, 27};
//                int[] mondayListsJy = {7, 14, 21, 28};
//                int[] tuesdayListsJy = {1, 8, 15, 22, 29};
//                int[] wednesdayListsJy = {2, 9, 16, 23, 30};
//                int[] thursdayListsJy = {3, 10, 17, 24, 31};
//                int[] fridayListsJy = {4, 11, 18, 25};
//                int[] saturdayListsJy = {5, 12, 19, 26};
//
//                askDay(sundayListsJy, mondayListsJy, tuesdayListsJy, wednesdayListsJy, thursdayListsJy, fridayListsJy, saturdayListsJy);
//
//                break;
//
//            case "August":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t      \t  1   \t  2   \n");
//                System.out.println("\t\t\t\t\t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \n");
//                System.out.println("\t\t\t\t\t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \n");
//                System.out.println("\t\t\t\t\t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \n");
//                System.out.println("\t\t\t\t\t  24   \t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \n");
//                System.out.println("\t\t\t\t\t  31   \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsAug = {3, 10, 17, 24, 31};
//                int[] mondayListsAug = {4, 11, 18, 25};
//                int[] tuesdayListsAug = {5, 12, 19, 26};
//                int[] wednesdayListsAug = {6, 13, 20, 27};
//                int[] thursdayListsAug = {7, 14, 21, 28};
//                int[] fridayListsAug = {1, 8, 15, 22, 29};
//                int[] saturdayListsAug = {2, 9, 16, 23, 30};
//
//                askDay(sundayListsAug, mondayListsAug, tuesdayListsAug, wednesdayListsAug, thursdayListsAug, fridayListsAug, saturdayListsAug);
//
//                break;
//
//            case "September":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \n");
//                System.out.println("\t\t\t\t\t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \n");
//                System.out.println("\t\t\t\t\t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \n");
//                System.out.println("\t\t\t\t\t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \n");
//                System.out.println("\t\t\t\t\t  28   \t  29   \t  30   \t       \t       \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsSep = {7, 14, 21, 28};
//                int[] mondayListsSep = {1, 8, 15, 22, 29};
//                int[] tuesdayListsSep = {2, 9, 16, 23, 30};
//                int[] wednesdayListsSep = {3, 10, 17, 24};
//                int[] thursdayListsSep = {4, 11, 18, 25};
//                int[] fridayListsSep = {5, 12, 19, 26};
//                int[] saturdayListsSep = {6, 13, 20, 27};
//
//                askDay(sundayListsSep, mondayListsSep, tuesdayListsSep, wednesdayListsSep, thursdayListsSep, fridayListsSep, saturdayListsSep);
//
//                break;
//
//            case "October":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t  1   \t  2   \t  3   \t  4   \n");
//                System.out.println("\t\t\t\t\t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \n");
//                System.out.println("\t\t\t\t\t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \n");
//                System.out.println("\t\t\t\t\t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \n");
//                System.out.println("\t\t\t\t\t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsOc = {5, 12, 19, 26};
//                int[] mondayListsOc = {6, 13, 20, 27};
//                int[] tuesdayListsOc = {7, 14, 21, 28};
//                int[] wednesdayListsOc = {1, 8, 15, 22, 29};
//                int[] thursdayListsOc = {2, 9, 16, 23, 30};
//                int[] fridayListsOc = {3, 10, 17, 24, 31};
//                int[] saturdayListsOc = {4, 11, 18, 25};
//
//                askDay(sundayListsOc, mondayListsOc, tuesdayListsOc, wednesdayListsOc, thursdayListsOc, fridayListsOc, saturdayListsOc);
//
//                break;
//
//            case "November":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t      \t      \t  1   \n");
//                System.out.println("\t\t\t\t\t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \n");
//                System.out.println("\t\t\t\t\t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \n");
//                System.out.println("\t\t\t\t\t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \n");
//                System.out.println("\t\t\t\t\t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \t  29   \n");
//                System.out.println("\t\t\t\t\t  30   \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsNov = {2, 9, 16, 23, 30};
//                int[] mondayListsNov = {3, 10, 17, 24};
//                int[] tuesdayListsNov = {4, 11, 18, 25};
//                int[] wednesdayListsNov = {5, 12, 19, 26};
//                int[] thursdayListsNov = {6, 13, 20, 27};
//                int[] fridayListsNov = {7, 14, 21, 28};
//                int[] saturdayListsNov = {1, 8, 15, 22, 29};
//
//                askDay(sundayListsNov, mondayListsNov, tuesdayListsNov, wednesdayListsNov, thursdayListsNov, fridayListsNov, saturdayListsNov);
//
//                break;
//
//            case "December":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \n");
//                System.out.println("\t\t\t\t\t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \n");
//                System.out.println("\t\t\t\t\t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \n");
//                System.out.println("\t\t\t\t\t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \n");
//                System.out.println("\t\t\t\t\t  28   \t  29   \t  30   \t  31   \t       \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsDec = {7, 14, 21, 28};
//                int[] mondayListsDec = {1, 8, 15, 22, 29};
//                int[] tuesdayListsDec = {2, 9, 16, 23, 30};
//                int[] wednesdayListsDec = {3, 10, 17, 24, 31};
//                int[] thursdayListsDec = {4, 11, 18, 25};
//                int[] fridayListsDec = {5, 12, 19, 26};
//                int[] saturdayListsDec = {6, 13, 20, 27};
//
//                askDay(sundayListsDec, mondayListsDec, tuesdayListsDec, wednesdayListsDec, thursdayListsDec, fridayListsDec, saturdayListsDec);
//
//                break;
//
//        }
//
////        Scanner askUser = new Scanner(System.in);
////        System.out.print("\t\t\t\t\tSelect the Day you want to execute: ");
////        int askDay = askUser.nextInt();
////
////        System.out.println(askDay);
//
//
//
//    }

//    public void calendarTweSix() {
//
//        switch (theMonth) {
//
//            case "January":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t  1   \t  2   \t  3   \n");
//                System.out.println("\t\t\t\t\t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \n");
//                System.out.println("\t\t\t\t\t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \n");
//                System.out.println("\t\t\t\t\t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \n");
//                System.out.println("\t\t\t\t\t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \n");
//
//                int[] sundayListsJ = {4, 11, 18, 25};
//                int[] mondayListsJ = {5, 12, 19, 26};
//                int[] tuesdayListsJ = {6, 13, 20, 27};
//                int[] wednesdayListsJ = {7, 14, 21, 28};
//                int[] thursdayListsJ = {1, 8, 15, 22, 29};
//                int[] fridayListsJ = {2, 9, 16, 23, 30};
//                int[] saturdayListsJ = {3, 10, 17, 24, 31};
//
//                askDay(sundayListsJ, mondayListsJ, tuesdayListsJ, wednesdayListsJ, thursdayListsJ, fridayListsJ, saturdayListsJ);
//
//                break;
//            case "February":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \n");
//                System.out.println("\t\t\t\t\t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \n");
//                System.out.println("\t\t\t\t\t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \n");
//                System.out.println("\t\t\t\t\t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsF = {1, 8, 15, 22};
//                int[] mondayListsF = {2, 9, 16, 23};
//                int[] tuesdayListsF = {3, 10, 17, 24};
//                int[] wednesdayListsF = {4, 11, 18, 25};
//                int[] thursdayListsF = {5, 12, 19, 26};
//                int[] fridayListsF = {6, 13, 20, 27};
//                int[] saturdayListsF = {7, 14, 21, 28};
//
//                askDay(sundayListsF, mondayListsF, tuesdayListsF, wednesdayListsF, thursdayListsF, fridayListsF, saturdayListsF);
//
//                break;
//
//            case "March":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \n");
//                System.out.println("\t\t\t\t\t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \n");
//                System.out.println("\t\t\t\t\t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \n");
//                System.out.println("\t\t\t\t\t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \n");
//                System.out.println("\t\t\t\t\t  29   \t  30   \t  31   \t       \t       \t       \t       \n");
//
//                int[] sundayListsM = {1, 8, 15, 22, 29};
//                int[] mondayListsM = {2, 9, 16, 23, 30};
//                int[] tuesdayListsM = {3, 10, 17, 24, 31};
//                int[] wednesdayListsM = {4, 11, 18, 25};
//                int[] thursdayListsM = {5, 12, 19, 26};
//                int[] fridayListsM = {6, 13, 20, 27};
//                int[] saturdayListsM = {7, 14, 21, 28};
//
//                askDay(sundayListsM, mondayListsM, tuesdayListsM, wednesdayListsM, thursdayListsM, fridayListsM, saturdayListsM);
//
//                break;
//
//            case "April":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t  1   \t  2   \t  3   \t  4   \n");
//                System.out.println("\t\t\t\t\t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \n");
//                System.out.println("\t\t\t\t\t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \n");
//                System.out.println("\t\t\t\t\t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \n");
//                System.out.println("\t\t\t\t\t  26   \t  27   \t  28   \t  29   \t  30   \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsA = {5, 12, 19, 26};
//                int[] mondayListsA = {6, 13, 20, 27};
//                int[] tuesdayListsA = {7, 14, 21, 28};
//                int[] wednesdayListsA = {1, 8, 15, 22, 29};
//                int[] thursdayListsA = {2, 9, 16, 23, 30};
//                int[] fridayListsA = {3, 10, 17, 24};
//                int[] saturdayListsA = {4, 11, 18, 25};
//
//                askDay(sundayListsA, mondayListsA, tuesdayListsA, wednesdayListsA, thursdayListsA, fridayListsA, saturdayListsA);
//
//                break;
//
//            case "May":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t      \t  1   \t  2   \n");
//                System.out.println("\t\t\t\t\t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \n");
//                System.out.println("\t\t\t\t\t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \n");
//                System.out.println("\t\t\t\t\t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \n");
//                System.out.println("\t\t\t\t\t  24   \t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \n");
//                System.out.println("\t\t\t\t\t  31   \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsMy = {3, 10, 17, 24, 31};
//                int[] mondayListsMy = {4, 11, 18, 25};
//                int[] tuesdayListsMy = {5, 12, 19, 26};
//                int[] wednesdayListsMy = {6, 13, 20, 27};
//                int[] thursdayListsMy = {7, 14, 21, 28};
//                int[] fridayListsMy = {1, 8, 15, 22, 29};
//                int[] saturdayListsMy = {2, 9, 16, 23, 30};
//
//                askDay(sundayListsMy, mondayListsMy, tuesdayListsMy, wednesdayListsMy, thursdayListsMy, fridayListsMy, saturdayListsMy);
//
//                break;
//
//            case "June":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \n");
//                System.out.println("\t\t\t\t\t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \n");
//                System.out.println("\t\t\t\t\t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \n");
//                System.out.println("\t\t\t\t\t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \n");
//                System.out.println("\t\t\t\t\t  28   \t  29   \t  30   \t       \t       \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsJu = {7, 14, 21, 28};
//                int[] mondayListsJu = {1, 8, 15, 22, 29};
//                int[] tuesdayListsJu = {2, 9, 16, 23, 30};
//                int[] wednesdayListsJu = {3, 10, 17, 24};
//                int[] thursdayListsJu = {4, 11, 18, 25};
//                int[] fridayListsJu = {5, 12, 19, 26};
//                int[] saturdayListsJu = {6, 13, 20, 27};
//
//                askDay(sundayListsJu, mondayListsJu, tuesdayListsJu, wednesdayListsJu, thursdayListsJu, fridayListsJu, saturdayListsJu);
//
//                break;
//
//            case "July":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t  1   \t  2   \t  3   \t  4   \n");
//                System.out.println("\t\t\t\t\t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \n");
//                System.out.println("\t\t\t\t\t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \n");
//                System.out.println("\t\t\t\t\t  19   \t  20   \t  21   \t  22  \t  23   \t  24   \t  25   \n");
//                System.out.println("\t\t\t\t\t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsJy = {5, 12, 19, 26};
//                int[] mondayListsJy = {6, 13, 20, 27};
//                int[] tuesdayListsJy = {7, 14, 21, 28};
//                int[] wednesdayListsJy = {1, 8, 15, 22, 29};
//                int[] thursdayListsJy = {2, 9, 16, 23, 30};
//                int[] fridayListsJy = {3, 10, 17, 24, 31};
//                int[] saturdayListsJy = {4, 11, 18, 25};
//
//                askDay(sundayListsJy, mondayListsJy, tuesdayListsJy, wednesdayListsJy, thursdayListsJy, fridayListsJy, saturdayListsJy);
//
//                break;
//
//            case "August":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t      \t      \t  1   \n");
//                System.out.println("\t\t\t\t\t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \n");
//                System.out.println("\t\t\t\t\t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \n");
//                System.out.println("\t\t\t\t\t  16   \t  17   \t  18   \t  19   \t  20   \t  21  \t  22   \n");
//                System.out.println("\t\t\t\t\t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \t  29  \n");
//                System.out.println("\t\t\t\t\t  30   \t  31   \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsAug = {2, 9, 16, 23, 30};
//                int[] mondayListsAug = {3, 10, 17, 24, 31};
//                int[] tuesdayListsAug = {4, 11, 18, 25};
//                int[] wednesdayListsAug = {5, 12, 19, 26};
//                int[] thursdayListsAug = {6, 13, 20, 27};
//                int[] fridayListsAug = {7, 14, 21, 28};
//                int[] saturdayListsAug = {1, 8, 15, 22, 29};
//
//                askDay(sundayListsAug, mondayListsAug, tuesdayListsAug, wednesdayListsAug, thursdayListsAug, fridayListsAug, saturdayListsAug);
//
//                break;
//
//            case "September":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t  1   \t  2   \t  3   \t  4   \t  5   \n");
//                System.out.println("\t\t\t\t\t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \n");
//                System.out.println("\t\t\t\t\t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \n");
//                System.out.println("\t\t\t\t\t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \n");
//                System.out.println("\t\t\t\t\t  27   \t  28   \t  29   \t  30   \t       \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsSep = {6, 13, 20, 27};
//                int[] mondayListsSep = {7, 14, 21, 28};
//                int[] tuesdayListsSep = {1, 8, 15, 22, 29};
//                int[] wednesdayListsSep = {2, 9, 16, 23, 30};
//                int[] thursdayListsSep = {3, 10, 17, 24};
//                int[] fridayListsSep = {4, 11, 18, 25};
//                int[] saturdayListsSep = {5, 12, 19, 26};
//
//                askDay(sundayListsSep, mondayListsSep, tuesdayListsSep, wednesdayListsSep, thursdayListsSep, fridayListsSep, saturdayListsSep);
//
//                break;
//
//            case "October":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t  1   \t  2   \t  3   \n");
//                System.out.println("\t\t\t\t\t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \n");
//                System.out.println("\t\t\t\t\t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \n");
//                System.out.println("\t\t\t\t\t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \n");
//                System.out.println("\t\t\t\t\t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsOc = {4, 11, 18, 25};
//                int[] mondayListsOc = {5, 12, 19, 26};
//                int[] tuesdayListsOc = {6, 13, 20, 27};
//                int[] wednesdayListsOc = {7, 14, 21, 28};
//                int[] thursdayListsOc = {1, 8, 15, 22, 29};
//                int[] fridayListsOc = {2, 9, 16, 23, 30};
//                int[] saturdayListsOc = {3, 10, 17, 24, 31};
//
//                askDay(sundayListsOc, mondayListsOc, tuesdayListsOc, wednesdayListsOc, thursdayListsOc, fridayListsOc, saturdayListsOc);
//
//                break;
//
//            case "November":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \n");
//                System.out.println("\t\t\t\t\t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \n");
//                System.out.println("\t\t\t\t\t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \n");
//                System.out.println("\t\t\t\t\t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \n");
//                System.out.println("\t\t\t\t\t  29   \t  30   \t       \t       \t       \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsNov = {1, 8, 15, 22, 29};
//                int[] mondayListsNov = {2, 9, 16, 23, 30};
//                int[] tuesdayListsNov = {3, 10, 17, 24};
//                int[] wednesdayListsNov = {4, 11, 18, 25};
//                int[] thursdayListsNov = {5, 12, 19, 26};
//                int[] fridayListsNov = {6, 13, 20, 27};
//                int[] saturdayListsNov = {7, 14, 21, 28};
//
//                askDay(sundayListsNov, mondayListsNov, tuesdayListsNov, wednesdayListsNov, thursdayListsNov, fridayListsNov, saturdayListsNov);
//
//                break;
//
//            case "December":
//
//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t  1   \t  2   \t  3   \t  4   \t  5   \n");
//                System.out.println("\t\t\t\t\t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \n");
//                System.out.println("\t\t\t\t\t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \n");
//                System.out.println("\t\t\t\t\t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \n");
//                System.out.println("\t\t\t\t\t  27   \t  28   \t  29   \t  30   \t  31   \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");
//
//                int[] sundayListsDec = {6, 13, 20, 27};
//                int[] mondayListsDec = {7, 14, 21, 28};
//                int[] tuesdayListsDec = {1, 8, 15, 22, 29};
//                int[] wednesdayListsDec = {2, 9, 16, 23, 30};
//                int[] thursdayListsDec = {3, 10, 17, 24, 31};
//                int[] fridayListsDec = {4, 11, 18, 25};
//                int[] saturdayListsDec = {5, 12, 19, 26};
//
//                askDay(sundayListsDec, mondayListsDec, tuesdayListsDec, wednesdayListsDec, thursdayListsDec, fridayListsDec, saturdayListsDec);
//
//                break;
//
//        }
//
//    }

    public void calendarTweSeven() {

        switch (theMonth) {

            case "January":

                ArrayList<String> calendarJan = new ArrayList<>();
                calendarJan.add("\n\t\t\t\t\t==================================================\n");
                calendarJan.add("\t\t\t\t\t=> " + theMonth + "\n");
                calendarJan.add("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                calendarJan.add("\t\t\t\t\t      \t      \t      \t      \t      \t  1   \t  2   \n");
                calendarJan.add("\t\t\t\t\t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \n");
                calendarJan.add("\t\t\t\t\t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \n");
                calendarJan.add("\t\t\t\t\t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \n");
                calendarJan.add("\t\t\t\t\t  24   \t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \n");
                calendarJan.add("\t\t\t\t\t  31   \t       \t       \t       \t       \t       \t       \n");

                ArrayList<String> dateExecutedJan = new ArrayList<>();

                for (String jan : calendarJan) {
                    System.out.println(jan);
                }

                int[] sundayListsJ = {3, 10, 17, 24, 31};
                int[] mondayListsJ = {4, 11, 18, 25};
                int[] tuesdayListsJ = {5, 12, 19, 26};
                int[] wednesdayListsJ = {6, 13, 20, 27};
                int[] thursdayListsJ = {7, 14, 21, 28};
                int[] fridayListsJ = {1, 8, 15, 22, 29};
                int[] saturdayListsJ = {2, 9, 16, 23, 30};

                int countJan = 0;
                while(countJan < 1000) {
                    boolean singleValue = true;
                    askDay(sundayListsJ, mondayListsJ, tuesdayListsJ, wednesdayListsJ, thursdayListsJ, fridayListsJ, saturdayListsJ, calendarJan, singleValue, dateExecutedJan);
                    countJan++;
                }

                break;


            case "February":

                ArrayList<String> calendarFeb = new ArrayList<>();
                calendarFeb.add("\n\t\t\t\t\t==================================================\n");
                calendarFeb.add("\t\t\t\t\t=> " + theMonth + "\n");
                calendarFeb.add("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                calendarFeb.add("\t\t\t\t\t      \t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \n");
                calendarFeb.add("\t\t\t\t\t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \n");
                calendarFeb.add("\t\t\t\t\t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \n");
                calendarFeb.add("\t\t\t\t\t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \n");
                calendarFeb.add("\t\t\t\t\t  28   \t       \t       \t       \t       \t       \t       \n");

                ArrayList<String> dateExecutedFeb = new ArrayList<>();

//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \n");
//                System.out.println("\t\t\t\t\t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \n");
//                System.out.println("\t\t\t\t\t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \n");
//                System.out.println("\t\t\t\t\t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \n");
//                System.out.println("\t\t\t\t\t  28   \t       \t       \t       \t       \t       \t       \n");

                for (String feb : calendarFeb) {
                    System.out.println(feb);
                }

                int[] sundayListsF = {7, 14, 21, 28};
                int[] mondayListsF = {1, 8, 15, 22};
                int[] tuesdayListsF = {2, 9, 16, 23};
                int[] wednesdayListsF = {3, 10, 17, 24};
                int[] thursdayListsF = {4, 11, 18, 25};
                int[] fridayListsF = {5, 12, 19, 26};
                int[] saturdayListsF = {6, 13, 20, 27};

                int countFeb = 0;
                while (countFeb < 1000) {

                    boolean singleValue = true;
                    askDay(sundayListsF, mondayListsF, tuesdayListsF, wednesdayListsF, thursdayListsF, fridayListsF, saturdayListsF, calendarFeb, singleValue, dateExecutedFeb);
                    countFeb++;
                }

                break;

            case "March":

                ArrayList<String> calendarMarch = new ArrayList<>();
                calendarMarch.add("\n\t\t\t\t\t==================================================\n");
                calendarMarch.add("\t\t\t\t\t=> " + theMonth + "\n");
                calendarMarch.add("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                calendarMarch.add("\t\t\t\t\t      \t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \n");
                calendarMarch.add("\t\t\t\t\t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \n");
                calendarMarch.add("\t\t\t\t\t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \n");
                calendarMarch.add("\t\t\t\t\t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \n");
                calendarMarch.add("\t\t\t\t\t  28   \t  29   \t  30   \t  31   \t       \t       \t       \n");

                ArrayList<String> dateExecutedMarch = new ArrayList<>();

//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \n");
//                System.out.println("\t\t\t\t\t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \n");
//                System.out.println("\t\t\t\t\t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \n");
//                System.out.println("\t\t\t\t\t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \n");
//                System.out.println("\t\t\t\t\t  28   \t  29   \t  30   \t  31   \t       \t       \t       \n");

                for (String march : calendarMarch) {
                    System.out.println(march);
                }

                int[] sundayListsM = {7, 14, 21, 28};
                int[] mondayListsM = {1, 8, 15, 22, 29};
                int[] tuesdayListsM = {2, 9, 16, 23, 30};
                int[] wednesdayListsM = {3, 10, 17, 24, 31};
                int[] thursdayListsM = {4, 11, 18, 25};
                int[] fridayListsM = {5, 12, 19, 26};
                int[] saturdayListsM = {6, 13, 20, 27};

                int countMarch = 0;
                while (countMarch < 1000) {

                    boolean singleValue = true;
                    askDay(sundayListsM, mondayListsM, tuesdayListsM, wednesdayListsM, thursdayListsM, fridayListsM, saturdayListsM, calendarMarch, singleValue, dateExecutedMarch);
                    countMarch++;
                }

                break;

            case "April":

                ArrayList<String> calendarApril = new ArrayList<>();
                calendarApril.add("\n\t\t\t\t\t==================================================\n");
                calendarApril.add("\t\t\t\t\t=> " + theMonth + "\n");
                calendarApril.add("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                calendarApril.add("\t\t\t\t\t      \t      \t      \t      \t  1   \t  2   \t  3   \n");
                calendarApril.add("\t\t\t\t\t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \n");
                calendarApril.add("\t\t\t\t\t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \n");
                calendarApril.add("\t\t\t\t\t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \n");
                calendarApril.add("\t\t\t\t\t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \t       \n");
                calendarApril.add("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                ArrayList<String> dateExecutedApril = new ArrayList<>();

//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t  1   \t  2   \t  3   \n");
//                System.out.println("\t\t\t\t\t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \n");
//                System.out.println("\t\t\t\t\t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \n");
//                System.out.println("\t\t\t\t\t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \n");
//                System.out.println("\t\t\t\t\t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                for (String april : calendarApril) {
                    System.out.println(april);
                }

                int[] sundayListsA = {4, 11, 18, 25};
                int[] mondayListsA = {5, 12, 19, 26};
                int[] tuesdayListsA = {6, 13, 20, 27};
                int[] wednesdayListsA = {7, 14, 21, 28};
                int[] thursdayListsA = {1, 8, 15, 22, 29};
                int[] fridayListsA = {2, 9, 16, 23, 30};
                int[] saturdayListsA = {3, 10, 17, 24};

                int countApril = 0;
                while(countApril < 1000) {

                    boolean singleValue = true;
                    askDay(sundayListsA, mondayListsA, tuesdayListsA, wednesdayListsA, thursdayListsA, fridayListsA, saturdayListsA, calendarApril, singleValue, dateExecutedApril);
                    countApril++;
                }

                break;

            case "May":

                ArrayList<String> calendarMay = new ArrayList<>();
                calendarMay.add("\n\t\t\t\t\t==================================================\n");
                calendarMay.add("\t\t\t\t\t=> " + theMonth + "\n");
                calendarMay.add("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                calendarMay.add("\t\t\t\t\t      \t      \t      \t      \t      \t      \t  1   \n");
                calendarMay.add("\t\t\t\t\t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \n");
                calendarMay.add("\t\t\t\t\t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \n");
                calendarMay.add("\t\t\t\t\t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \n");
                calendarMay.add("\t\t\t\t\t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \t  29   \n");
                calendarMay.add("\t\t\t\t\t  30   \t  31   \t       \t       \t       \t       \t       \n");

                ArrayList<String> dateExecutedMay = new ArrayList<>();

//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t      \t      \t  1   \n");
//                System.out.println("\t\t\t\t\t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \t  8   \n");
//                System.out.println("\t\t\t\t\t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \t  15   \n");
//                System.out.println("\t\t\t\t\t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \t  22   \n");
//                System.out.println("\t\t\t\t\t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \t  29   \n");
//                System.out.println("\t\t\t\t\t  30   \t  31   \t       \t       \t       \t       \t       \n");

                for (String may : calendarMay) {
                    System.out.println(may);
                }

                int[] sundayListsMy = {2, 9, 16, 23, 30};
                int[] mondayListsMy = {3, 10, 17, 24, 31};
                int[] tuesdayListsMy = {4, 11, 18, 25};
                int[] wednesdayListsMy = {5, 12, 19, 26};
                int[] thursdayListsMy = {6, 13, 20, 27};
                int[] fridayListsMy = {7, 14, 21, 28};
                int[] saturdayListsMy = {1, 8, 15, 22, 29};

                int countMay = 0;
                while (countMay < 1000) {

                    boolean singleValue = true;
                    askDay(sundayListsMy, mondayListsMy, tuesdayListsMy, wednesdayListsMy, thursdayListsMy, fridayListsMy, saturdayListsMy, calendarMay, singleValue, dateExecutedMay);
                    countMay++;
                }

                break;

            case "June":

                ArrayList<String> calendarJune = new ArrayList<>();
                calendarJune.add("\n\t\t\t\t\t==================================================\n");
                calendarJune.add("\t\t\t\t\t=> " + theMonth + "\n");
                calendarJune.add("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                calendarJune.add("\t\t\t\t\t      \t      \t  1   \t  2   \t  3   \t  4   \t  5   \n");
                calendarJune.add("\t\t\t\t\t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \n");
                calendarJune.add("\t\t\t\t\t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \n");
                calendarJune.add("\t\t\t\t\t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \n");
                calendarJune.add("\t\t\t\t\t  27   \t  28   \t  29   \t  30   \t       \t       \t       \n");
                calendarJune.add("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                ArrayList<String> dateExecutedJune = new ArrayList<>();

//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t  1   \t  2   \t  3   \t  4   \t  5   \n");
//                System.out.println("\t\t\t\t\t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \n");
//                System.out.println("\t\t\t\t\t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \n");
//                System.out.println("\t\t\t\t\t  20   \t  21   \t  22   \t  23  \t   24   \t  25   \t  26   \n");
//                System.out.println("\t\t\t\t\t  27   \t  28   \t  29   \t  30   \t       \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                for (String june : calendarJune) {
                    System.out.println(june);
                }

                int[] sundayListsJu = {6, 13, 20, 27};
                int[] mondayListsJu = {7, 14, 21, 28};
                int[] tuesdayListsJu = {1, 8, 15, 22, 29};
                int[] wednesdayListsJu = {2, 9, 16, 23, 30};
                int[] thursdayListsJu = {3, 10, 17, 24};
                int[] fridayListsJu = {4, 11, 18, 25};
                int[] saturdayListsJu = {5, 12, 19, 26};

                int countJune = 0;
                while (countJune < 1000) {

                    boolean singleValue = true;
                    askDay(sundayListsJu, mondayListsJu, tuesdayListsJu, wednesdayListsJu, thursdayListsJu, fridayListsJu, saturdayListsJu, calendarJune, singleValue, dateExecutedJune);
                    countJune++;
                }

                break;

            case "July":

                ArrayList<String> calendarJuly = new ArrayList<>();
                calendarJuly.add("\n\t\t\t\t\t==================================================\n");
                calendarJuly.add("\t\t\t\t\t=> " + theMonth + "\n");
                calendarJuly.add("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                calendarJuly.add("\t\t\t\t\t      \t      \t      \t      \t  1   \t  2   \t  3   \n");
                calendarJuly.add("\t\t\t\t\t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \n");
                calendarJuly.add("\t\t\t\t\t  11  \t  12  \t  13  \t  14  \t  15   \t  16   \t  17   \n");
                calendarJuly.add("\t\t\t\t\t  18  \t  19  \t  20  \t  21  \t  22   \t  23   \t  24   \n");
                calendarJuly.add("\t\t\t\t\t  25  \t  26  \t  27  \t  28  \t  29   \t  30   \t  31   \n");
                calendarJuly.add("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                ArrayList<String> dateExecutedJuly = new ArrayList<>();


//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t  1   \t  2   \t  3   \n");
//                System.out.println("\t\t\t\t\t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \n");
//                System.out.println("\t\t\t\t\t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \n");
//                System.out.println("\t\t\t\t\t  18   \t  19   \t  20   \t  21  \t  22   \t  23   \t  24   \n");
//                System.out.println("\t\t\t\t\t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                for (String july : calendarJuly) {
                    System.out.println(july);
                }

                int[] sundayListsJy = {4, 11, 18, 25};
                int[] mondayListsJy = {5, 12, 19, 26};
                int[] tuesdayListsJy = {6, 13, 20, 27};
                int[] wednesdayListsJy = {7, 14, 21, 28};
                int[] thursdayListsJy = {1, 8, 15, 22, 29};
                int[] fridayListsJy = {2, 9, 16, 23, 30};
                int[] saturdayListsJy = {3, 10, 17, 24, 31};

                int countJuly = 0;
                while (countJuly < 1000) {

                    boolean singleValue = true;
                    askDay(sundayListsJy, mondayListsJy, tuesdayListsJy, wednesdayListsJy, thursdayListsJy, fridayListsJy, saturdayListsJy, calendarJuly, singleValue, dateExecutedJuly);
                    countJuly++;
                }

                break;

            case "August":

                ArrayList<String> calendarAugust = new ArrayList<>();
                calendarAugust.add("\n\t\t\t\t\t==================================================\n");
                calendarAugust.add("\t\t\t\t\t=> " + theMonth + "\n");
                calendarAugust.add("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                calendarAugust.add("\t\t\t\t\t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \n");
                calendarAugust.add("\t\t\t\t\t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \n");
                calendarAugust.add("\t\t\t\t\t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \t  21  \n");
                calendarAugust.add("\t\t\t\t\t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \n");
                calendarAugust.add("\t\t\t\t\t  29   \t  30   \t  31   \t       \t       \t       \t      \n");
                calendarAugust.add("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                ArrayList<String> dateExecutedAugust = new ArrayList<>();

//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \n");
//                System.out.println("\t\t\t\t\t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \n");
//                System.out.println("\t\t\t\t\t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \t  21  \n");
//                System.out.println("\t\t\t\t\t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \n");
//                System.out.println("\t\t\t\t\t  29   \t  30   \t  31   \t       \t       \t       \t      \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                for (String august : calendarAugust) {
                    System.out.println(august);
                }

                int[] sundayListsAug = {1, 8, 15, 22, 29};
                int[] mondayListsAug = {2, 9, 16, 23, 30};
                int[] tuesdayListsAug = {3, 10, 17, 24, 31};
                int[] wednesdayListsAug = {4, 11, 18, 25};
                int[] thursdayListsAug = {5, 12, 19, 26};
                int[] fridayListsAug = {6, 13, 20, 27};
                int[] saturdayListsAug = {7, 14, 21, 28};

                int countAugust = 0;
                while (countAugust < 1000) {

                    boolean singleValue = true;
                    askDay(sundayListsAug, mondayListsAug, tuesdayListsAug, wednesdayListsAug, thursdayListsAug, fridayListsAug, saturdayListsAug, calendarAugust, singleValue, dateExecutedAugust);
                    countAugust++;
                }

                break;

            case "September":

                ArrayList<String> calendarSeptember = new ArrayList<>();
                calendarSeptember.add("\n\t\t\t\t\t==================================================\n");
                calendarSeptember.add("\t\t\t\t\t=> " + theMonth + "\n");
                calendarSeptember.add("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                calendarSeptember.add("\t\t\t\t\t      \t      \t  1   \t  2   \t  3   \t  4   \t  5   \n");
                calendarSeptember.add("\t\t\t\t\t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \n");
                calendarSeptember.add("\t\t\t\t\t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \n");
                calendarSeptember.add("\t\t\t\t\t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \n");
                calendarSeptember.add("\t\t\t\t\t  27   \t  28   \t  29   \t  30   \t       \t       \t       \n");
                calendarSeptember.add("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                ArrayList<String> dateExecutedSeptember = new ArrayList<>();

//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t  1   \t  2   \t  3   \t  4   \t  5   \n");
//                System.out.println("\t\t\t\t\t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \n");
//                System.out.println("\t\t\t\t\t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \n");
//                System.out.println("\t\t\t\t\t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \n");
//                System.out.println("\t\t\t\t\t  27   \t  28   \t  29   \t  30   \t       \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                for (String september : calendarSeptember) {
                    System.out.println(september);
                }

                int[] sundayListsSep = {6, 13, 20, 27};
                int[] mondayListsSep = {7, 14, 21, 28};
                int[] tuesdayListsSep = {1, 8, 15, 22, 29};
                int[] wednesdayListsSep = {2, 9, 16, 23, 30};
                int[] thursdayListsSep = {3, 10, 17, 24};
                int[] fridayListsSep = {4, 11, 18, 25};
                int[] saturdayListsSep = {5, 12, 19, 26};

                int countSeptember = 0;
                while (countSeptember < 1000) {

                    boolean singleValue = true;
                    askDay(sundayListsSep, mondayListsSep, tuesdayListsSep, wednesdayListsSep, thursdayListsSep, fridayListsSep, saturdayListsSep, calendarSeptember, singleValue, dateExecutedSeptember);
                    countSeptember++;
                }

                break;

            case "October":

                ArrayList<String> calendarOctober = new ArrayList<>();
                calendarOctober.add("\n\t\t\t\t\t==================================================\n");
                calendarOctober.add("\t\t\t\t\t=> " + theMonth + "\n");
                calendarOctober.add("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                calendarOctober.add("\t\t\t\t\t      \t      \t      \t      \t  1   \t  2   \t  3   \n");
                calendarOctober.add("\t\t\t\t\t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \n");
                calendarOctober.add("\t\t\t\t\t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \n");
                calendarOctober.add("\t\t\t\t\t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \n");
                calendarOctober.add("\t\t\t\t\t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \n");
                calendarOctober.add("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                ArrayList<String> dateExecutedOctober = new ArrayList<>();

//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t      \t      \t      \t      \t  1   \t  2   \t  3   \n");
//                System.out.println("\t\t\t\t\t  4   \t  5   \t  6   \t  7   \t  8   \t  9   \t  10   \n");
//                System.out.println("\t\t\t\t\t  11   \t  12   \t  13   \t  14   \t  15   \t  16   \t  17   \n");
//                System.out.println("\t\t\t\t\t  18   \t  19   \t  20   \t  21   \t  22   \t  23   \t  24   \n");
//                System.out.println("\t\t\t\t\t  25   \t  26   \t  27   \t  28   \t  29   \t  30   \t  31   \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                for (String october : calendarOctober) {
                    System.out.println(october);
                }

                int[] sundayListsOc = {4, 11, 18, 25};
                int[] mondayListsOc = {5, 12, 19, 26};
                int[] tuesdayListsOc = {6, 13, 20, 27};
                int[] wednesdayListsOc = {7, 14, 21, 28};
                int[] thursdayListsOc = {1, 8, 15, 22, 29};
                int[] fridayListsOc = {2, 9, 16, 23, 30};
                int[] saturdayListsOc = {3, 10, 17, 24, 31};

                int countOctober = 0;
                while (countOctober < 1000) {

                    boolean singleValue = true;
                    askDay(sundayListsOc, mondayListsOc, tuesdayListsOc, wednesdayListsOc, thursdayListsOc, fridayListsOc, saturdayListsOc, calendarOctober, singleValue, dateExecutedOctober);
                    countOctober++;
                }

                break;

            case "November":

                ArrayList<String> calendarNovember = new ArrayList<>();
                calendarNovember.add("\n\t\t\t\t\t==================================================\n");
                calendarNovember.add("\t\t\t\t\t=> " + theMonth + "\n");
                calendarNovember.add("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                calendarNovember.add("\t\t\t\t\t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \n");
                calendarNovember.add("\t\t\t\t\t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \n");
                calendarNovember.add("\t\t\t\t\t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \n");
                calendarNovember.add("\t\t\t\t\t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \n");
                calendarNovember.add("\t\t\t\t\t  29   \t  30   \t       \t       \t       \t       \t       \n");
                calendarNovember.add("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                ArrayList<String> dateExecutedNovember = new ArrayList<>();

//                System.out.println("\n\t\t\t\t\t==================================================\n");
//                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
//                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
//                System.out.println("\t\t\t\t\t  1   \t  2   \t  3   \t  4   \t  5   \t  6   \t  7   \n");
//                System.out.println("\t\t\t\t\t  8   \t  9   \t  10   \t  11   \t  12   \t  13   \t  14   \n");
//                System.out.println("\t\t\t\t\t  15   \t  16   \t  17   \t  18   \t  19   \t  20   \t  21   \n");
//                System.out.println("\t\t\t\t\t  22   \t  23   \t  24   \t  25   \t  26   \t  27   \t  28   \n");
//                System.out.println("\t\t\t\t\t  29   \t  30   \t       \t       \t       \t       \t       \n");
//                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                for (String november : calendarNovember) {
                    System.out.println(november);
                }

                int[] sundayListsNov = {1, 8, 15, 22, 29};
                int[] mondayListsNov = {2, 9, 16, 23, 30};
                int[] tuesdayListsNov = {3, 10, 17, 24};
                int[] wednesdayListsNov = {4, 11, 18, 25};
                int[] thursdayListsNov = {5, 12, 19, 26};
                int[] fridayListsNov = {6, 13, 20, 27};
                int[] saturdayListsNov = {7, 14, 21, 28};

                int countNovember = 0;
                while (countNovember < 1000) {

                    boolean singleValue = true;
                    askDay(sundayListsNov, mondayListsNov, tuesdayListsNov, wednesdayListsNov, thursdayListsNov, fridayListsNov, saturdayListsNov, calendarNovember, singleValue, dateExecutedNovember);
                    countNovember++;
                }

                break;

            case "December":

                System.out.println("\n\t\t\t\t\t==================================================\n");
                System.out.println("\t\t\t\t\t=> " + theMonth + "\n");
                System.out.println("\t\t\t\t\t  S   \t  M   \t  T   \t  W   \t  T   \t  F   \t  S   \n");
                System.out.println("\t\t\t\t\t      \t      \t  1   \t  2   \t  3   \t  4   \t  5   \n");
                System.out.println("\t\t\t\t\t  6   \t  7   \t  8   \t  9   \t  10   \t  11   \t  12   \n");
                System.out.println("\t\t\t\t\t  13   \t  14   \t  15   \t  16   \t  17   \t  18   \t  19   \n");
                System.out.println("\t\t\t\t\t  20   \t  21   \t  22   \t  23   \t  24   \t  25   \t  26   \n");
                System.out.println("\t\t\t\t\t  27   \t  28   \t  29   \t  30   \t  31   \t       \t       \n");
                System.out.println("\t\t\t\t\t       \t       \t       \t       \t       \t       \t       \n");

                int[] sundayListsDec = {6, 13, 20, 27};
                int[] mondayListsDec = {7, 14, 21, 28};
                int[] tuesdayListsDec = {1, 8, 15, 22, 29};
                int[] wednesdayListsDec = {2, 9, 16, 23, 30};
                int[] thursdayListsDec = {3, 10, 17, 24, 31};
                int[] fridayListsDec = {4, 11, 18, 25};
                int[] saturdayListsDec = {5, 12, 19, 26};

//                askDay(sundayListsDec, mondayListsDec, tuesdayListsDec, wednesdayListsDec, thursdayListsDec, fridayListsDec, saturdayListsDec);

                break;

        }

    }


}
