package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        MyList list = new MyList();
        list.add(12);
        list.add(-12);
        list.add(560);
        list.add(-54);
        list.print();

        // Date
        Date date = new Date(); // дефолтный конструктор запишет текущее время ОС
        System.out.println(date);

        date.setTime(1239014);
        System.out.println(date);

        Date date2 = new Date(23212121);
        System.out.println(date2);

        // Форматирование даты
        SimpleDateFormat sdf = new SimpleDateFormat("G YYYY: MMMM: HH:mm:ss:");
        System.out.println(sdf.format(date));

//        sdf = new SimpleDateFormat("MM yy dd");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        Date d = sdf.parse(s);
//        System.out.println(d);

        // Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        c.set(Calendar.MONTH, Calendar.SEPTEMBER);
        c.set(Calendar.DAY_OF_MONTH, 3);
        System.out.println(c);

        c.add(Calendar.YEAR, 1);
        c.add(Calendar.HOUR, -2);
        System.out.println(c);

        Date d = c.getTime();
        System.out.println(sdf.format(d));

        GregorianCalendar gc = new GregorianCalendar();
        gc.isLeapYear(2121);
        System.out.println(gc);
    }
}
