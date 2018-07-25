package com.github.lang;

/**
 * String Utilities
 *
 * @author Galaxy9572
 */
public class StringUtils {

    /**
     * Judge if the char sequence is null or the length == 0
     *
     * @param chars The char sequence ready to be judged
     * @return Return true if it is empty, otherwise return false
     */
    public static boolean isEmpty(CharSequence chars) {
        return chars == null || chars.length() == 0;
    }

    /**
     * Judge if the char sequence is null or white space
     *
     * @param chars The char sequence ready to be judged
     * @return Return true if it is blank, otherwise return false
     */
    public static boolean isBlank(CharSequence chars) {
        if (isEmpty(chars)) {
            return true;
        }
        for (int i = 0; i < chars.length(); i++) {
            if (!Character.isWhitespace(chars.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Remove the white space of the string at the head and tail
     *
     * @param string string that ready to be handled
     * @return handled string
     */
    public static String trim(String string) {
        if (isEmpty(string)) {
            return string;
        } else {
            return string.trim();
        }
    }

    /**
     * Remove all the white space in the string, include \s \t \r \n
     *
     * @param string string that ready to be handled
     * @return handled string
     */
    public static String removeAllWhiteSpace(String string) {
        if (isEmpty(string)) {
            return string;
        } else {
            return string.replaceAll("\\s|\\t|\\r|\\n", "");
        }
    }

    /**
     * Camel case to underline
     *
     * @param string      string that ready to be handled
     * @param toUpperCase if need to upper case
     * @return handled string
     */
    public static String camelCaseToUnderline(String string, boolean toUpperCase) {
        if (isBlank(string)) {
            return string;
        }
        int length = string.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append("_").append(c);
            } else {
                sb.append(c);
            }
        }
        if (toUpperCase) {
            return sb.toString().toUpperCase();
        }
        return sb.toString().toLowerCase();
    }

    /**
     * Convert a string to camel case string that separated by a separator
     *
     * @param string    string that ready to be handled
     * @param separator separator
     * @return handled string
     */
    public static String toCamelCase(String string, char separator) {
        if (isBlank(string)) {
            return string;
        }
        int length = string.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = string.charAt(i);
            if (c == separator && ++i < length) {
                sb.append(Character.toUpperCase(string.charAt(i)));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
