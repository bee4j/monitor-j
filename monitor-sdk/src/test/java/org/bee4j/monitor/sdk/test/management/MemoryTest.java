package org.bee4j.monitor.sdk.test.management;

import org.bee4j.monitor.sdk.management.MemoryUtils;
import org.junit.Test;

/**
 *
 *
 * @author bee4j
 * @date 2024-09-07 01:43
 */
public class MemoryTest {

    @Test
    public void testMemory(){
        System.out.println("------->" + MemoryUtils.getMemoryUsage());
    }

}
