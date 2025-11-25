package org.bee4j.monitor.sdk.test.management;

import org.bee4j.monitor.sdk.management.ProcessUtils;
import org.junit.Test;

/**
 *
 *
 * @author bee4j
 * @date 2024-09-07 01:43
 */
public class RuntimeTest {

    @Test
    public void testProcess(){
        System.out.println("------->" + ProcessUtils.getProcessId());
    }

}
