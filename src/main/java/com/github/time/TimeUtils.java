package com.github.time;

import com.github.lang.StringUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author LJY
 */
public class TimeUtils {

    private static final String DEFAULT_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * Returns the current time in second
     *
     * @return Current time in second
     */
    public static long currentTimeInSecond() {
        return Instant.now().getEpochSecond();
    }

    /**
     * Returns today's start time in second
     *
     * @return today's start time in second
     */
    public static long todayStartTimeInSecond() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MIN).toEpochSecond(getStandardOffset());
    }

    /**
     * Returns today's end time in second
     *
     * @return today's end time in second
     */
    public static long todayEndTimeInSecond() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MAX).toEpochSecond(getStandardOffset());
    }

    /**
     * Returns the time as string using the given pattern
     *
     * @param unixTimeInSecond Unix time in second
     * @return time string
     */
    public static String formatToString(long unixTimeInSecond) {
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(unixTimeInSecond), ZoneOffset.systemDefault());
        return DateTimeFormatter.ofPattern(DEFAULT_TIME_PATTERN).format(dateTime);
    }

    /**
     * Returns the time as string using the given pattern
     *
     * @param unixTimeInSecond Unix time in second
     * @param pattern          pattern, such as "yyyy-MM-dd HH:mm:ss"
     * @return time string
     */
    public static String formatToString(long unixTimeInSecond, String pattern) {
        if (StringUtils.isBlank(pattern)) {
            pattern = DEFAULT_TIME_PATTERN;
        }
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(unixTimeInSecond), ZoneOffset.systemDefault());
        return DateTimeFormatter.ofPattern(pattern).format(dateTime);
    }

    private static ZoneOffset getStandardOffset() {
        return ZoneOffset.systemDefault().getRules().getStandardOffset(Instant.now());
    }

}
