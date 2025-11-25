package org.bee4j.monitor.sdk.test;

import org.bee4j.monitor.sdk.management.MemoryUtils;
import org.bee4j.monitor.sdk.management.ProcessUtils;
import org.bee4j.monitor.sdk.management.ThreadUtils;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

/**
 * JDK MXBean Test
 *
 * @author bee4j
 * @date 2024-09-07 01:43
 */
@SpringBootTest(classes = {MemoryUtils.class,ProcessUtils.class,ThreadUtils.class})
public class MXBeanTest {

    @Test
    public void testMemory(){
        System.out.println("------->" + MemoryUtils.getMemoryUsage());
    }

    @Test
    public void testProcess(){
        System.out.println("------->" + ProcessUtils.getProcessId());
    }

    @Test
    public void testThread(){
        System.out.println("------->" + Arrays.toString(ThreadUtils.getAllThreadIds()));
    }

}
