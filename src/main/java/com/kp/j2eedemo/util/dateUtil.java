package com.kp.j2eedemo.util;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dateUtil {
    public static final String SHORTDATETYPE="yyyy年MM月dd日";
    public static final String LONGDATETYPE="yyyy年MM月dd日 HH:mm:ss";

    public static String getStringDate(Date date,String dateStringType){
        if (date==null&&date instanceof Data==false){
            return null;
        }else {
            SimpleDateFormat sdf = new SimpleDateFormat(dateStringType);
            return sdf.format(date);
        }
    }
    public static Date GetDate(String value) {
        if(null==value || "".equals(value.trim())) return null;
        //参数字符串是否长整型毫秒数
        if (value.indexOf("-")<0 && value.indexOf(" ")<0){
            return new Date(Long.valueOf(value));
        }
        DateFormat df = null;
        try {
            if (value != null && value.length() <= 10) {
                df = new SimpleDateFormat("yyyy-MM-dd");
                return df.parse(value);
            }
            if (value != null && value.length() >= 11 && value.length() <= 20) {
                df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                return df.parse(value);
            }
            if (value != null && value.length() > 20) {
                Date date1 = null;
                DateFormat df2 = null;
                try {
                    df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                    Date date = df.parse(value);
                    SimpleDateFormat df1 = new SimpleDateFormat ("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK);
                    date1 = df1.parse(date.toString());
                    df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return df2.parse(df2.format(date1));
            }
            return null;
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }
}
