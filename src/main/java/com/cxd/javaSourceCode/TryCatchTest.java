package com.cxd.javaSourceCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by childe on 16/11/8.
 */
public class TryCatchTest {

    public static void main(String[] args) {
        System.out.println(sum().size() + "");
    }

    private static Set<String> sum() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 2; i++) {
            try {
                set.add("1");
            } catch (Exception e) {
                set.add("2");
            } finally {
                i=3;
            }
        }

        return set;
    }
}
