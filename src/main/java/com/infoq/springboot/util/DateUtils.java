package com.infoq.springboot.util;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by longshasha on 16/3/19.
 */
public class DateUtils {
    /**
     * 获取可以推送的时间
     * @param date
     * @return
     */
    public static Date get(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        if(hour>=23){
            cal.add(Calendar.DATE,1);
            cal.set(Calendar.HOUR_OF_DAY,8);
            cal.set(Calendar.MINUTE,15);
        }
        if(hour<8){
            cal.set(Calendar.HOUR_OF_DAY,8);
            cal.set(Calendar.MINUTE,15);
        }
        Date canPushDate = cal.getTime();
        return canPushDate;
    }

    /**
     * 获取 minutes 后 可push的时间
     * @param date
     * @return
     */
    public static Date getMinLater(Date date,int minutes) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE,minutes);

        Date canPushDate = get(cal.getTime());
        return canPushDate;
    }

    /**
     * 获取 h 小时后可push的时间
     * @param date
     * @param h
     * @return
     */
    public static Date getHourLater(Date date,int h) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY,h);

        Date canPushDate = get(cal.getTime());
        return canPushDate;
    }

    /**
     * 根据日期判断是否能够推送
     * @param date
     * @return
     */
    public static Boolean canPush(Date date, int start, int end) {
        Boolean canPush = true;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        if(hour>=end || hour<start){
            canPush = false;
        }
        return canPush;
    }

}
