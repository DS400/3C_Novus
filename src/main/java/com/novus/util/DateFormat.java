package com.novus.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {

    /**
     * 例：
     * input: 19990601
     * output: 平成11年12月1日
     * */
    public static String number2Name(String num) throws ParseException {
        SimpleDateFormat seirekiFormat = new SimpleDateFormat("yyyyMMdd", Locale.JAPAN);
        Date date = seirekiFormat.parse(num);
        SimpleDateFormat warekiFormat = new SimpleDateFormat(
                "GGGGyyyy年M月d日",
                new Locale("ja", "JP", "JP"));
        return warekiFormat.format(date);
    }
    /**
     * 例：
     * input: 平成11年12月1日
     * output: 19990601
     * */
    public static String name2Number(String name) throws ParseException {
        SimpleDateFormat seirekiFormat = new SimpleDateFormat("yyyyMMdd", Locale.JAPAN);
        SimpleDateFormat warekiFormat = new SimpleDateFormat(
                "GGGGyyyy年M月d日",
                new Locale("ja", "JP", "JP"));
        Date date = warekiFormat.parse(name);
        return seirekiFormat.format(date);
    }

    /**
     * ２４時間表記を12に変更
     * @return
     */
    public static String to12hour(String _24){
        int __24 = Integer.parseInt(_24);
        if(__24 > 24|| __24<0)
            throw new IllegalArgumentException("0～24以内で入力してください");
        if(__24 < 12)
            return __24 + "AM";
        else
            return (__24 - 12) + "PM";
    }


}
