package com.github.collection;

import java.util.Collection;
import java.util.Map;

/**
 * Collection utilities
 *
 * @author Galaxy9572
 */
public class CollectionUtils {

    /**
     * Judge if the giving collection is null or have no elements
     *
     * @param collection Collection to be judged
     * @return Return true if is empty, otherwise return false
     */
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * Judge if the giving map is null or have no elements
     *
     * @param map Map to be judged
     * @return Return true if is empty, otherwise return false
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

}
