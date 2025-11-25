package org.bee4j.monitor.sdk.test.management;

import org.bee4j.monitor.sdk.management.ThreadUtils;
import org.junit.Test;

import java.util.Arrays;

/**
 *
 *
 * @author bee4j
 * @date 2024-09-07 01:43
 */
public class ThreadTest {

    @Test
    public void testThread(){
        System.out.println("------->" + Arrays.toString(ThreadUtils.getAllThreadIds()));
    }

}
