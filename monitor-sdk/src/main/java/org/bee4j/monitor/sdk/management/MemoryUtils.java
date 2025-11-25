package org.bee4j.monitor.sdk.management;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

/**
 *
 *
 * @author bee4j
 * @date 2024-09-07 02:09
 */
public class MemoryUtils {

    public static String getMemoryUsage() {

        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();

        return memoryMXBean.getHeapMemoryUsage().toString();
    }

}
