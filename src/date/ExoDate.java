/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tkint
 */
public class ExoDate {

    private Calendar calendar;

    public ExoDate(Date date) {
        this.calendar = Calendar.getInstance();
        this.calendar.setTime(date);
    }

    public void addDays(int days) {
        this.calendar.add(Calendar.DAY_OF_MONTH, days);
    }

    public void display(String text) {
        System.out.println(text + " : " + format());
    }

    private String format() {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        return formater.format(this.calendar.getTime());
    }
}
