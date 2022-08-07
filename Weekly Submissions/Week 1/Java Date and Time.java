

class Result 
{


     public static String getDay(int month, int day, int yr)
     {
        Calendar cal = Calendar.getInstance();
        cal.set(yr, month-1, day);
        
        String days[]={"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[cal.get(Calendar.DAY_OF_WEEK)-1];
     }

    public static String findDay(int month, int day, int year) 
    {
        String str=getDay(month, day, year);
        return str;
    }
}

