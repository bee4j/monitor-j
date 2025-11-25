package org.bee4j.monitor.sdk.test;

import org.bee4j.monitor.sdk.runtime.ServerState;
import org.junit.Test;

/**
 *
 *
 * @author bee4j
 */
public class ServerStateTest {

    @Test
    public void testServerState() throws Exception {
        ServerState serverState = new ServerState();
        serverState.copyTo();
        System.out.println("------>" + serverState.getCpu());
        System.out.println("------>" + serverState.getJvm());
        System.out.println("------>" + serverState.getMem());
        System.out.println("------>" + serverState.getSys());
        System.out.println("------>" + serverState.getSysFiles());
    }

}
