package com.github;

import com.github.collection.CollectionUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * @author Galaxy9572
 */
public class CollectionUtilsTest {

    @Test
    public void testIsEmpty() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        assertTrue(!CollectionUtils.isEmpty(map));
        map.remove("1");
        assertTrue(CollectionUtils.isEmpty(map));
        map = null;
        assertTrue(CollectionUtils.isEmpty(map));

        List<String> list = new ArrayList<>();
        list.add("1");
        assertTrue(!CollectionUtils.isEmpty(list));
        list.clear();
        assertTrue(CollectionUtils.isEmpty(list));
        list = null;
        assertTrue(CollectionUtils.isEmpty(list));
    }

}
