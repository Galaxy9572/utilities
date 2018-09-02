package com.github;

import com.github.time.TimeUtils;
import org.junit.Test;


/**
 * @author LJY
 */
public class TimeUtilsTest {

    @Test
    public void currentTimeInSecond() {
        long now = TimeUtils.currentTimeInSecond();
        System.out.println(now);
    }

    @Test
    public void formatToString() {
        String format = TimeUtils.formatToString(TimeUtils.currentTimeInSecond(), "yyyy-MM-dd HH:mm:ss");
        System.out.println(format);

        String defaultFormat = TimeUtils.formatToString(TimeUtils.currentTimeInSecond());
        System.out.println(defaultFormat);
    }

    @Test
    public void todayStartTimeInSecond() {
        long startTimeInSecond = TimeUtils.todayStartTimeInSecond();
        String string = TimeUtils.formatToString(startTimeInSecond);
        System.out.println(string);
    }

    @Test
    public void todayEndTimeInSecond() {
        long endTimeInSecond = TimeUtils.todayEndTimeInSecond();
        String string = TimeUtils.formatToString(endTimeInSecond);
        System.out.println(string);
    }

}
