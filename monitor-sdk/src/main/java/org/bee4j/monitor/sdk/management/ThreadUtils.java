package org.bee4j.monitor.sdk.management;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

/**
 * 线程工具类
 *
 * @author bee4j
 */
public class ThreadUtils {

    public static long[] getAllThreadIds() {

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        return threadMXBean.getAllThreadIds();
    }

}
