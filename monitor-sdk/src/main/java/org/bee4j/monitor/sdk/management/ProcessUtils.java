package org.bee4j.monitor.sdk.management;

import lombok.extern.slf4j.Slf4j;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * 服务进程工具类
 *
 * @author bee4j
 */
@Slf4j
public class ProcessUtils {

    public static int getProcessId() {

        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();

        String name = runtimeMXBean.getName();
        LOGGER.info("进程名称:{}", name);
        LOGGER.info("虚拟机名称:{}", runtimeMXBean.getVmName());
        LOGGER.info("虚拟机版本:{}", runtimeMXBean.getVmVersion());
        LOGGER.info("加载类目录:{}", runtimeMXBean.getClassPath());
        LOGGER.info("二方库目录:{}", runtimeMXBean.getLibraryPath());
        LOGGER.info("虚拟机目录:{}", runtimeMXBean.getBootClassPath());
        LOGGER.info("Management版本:{}", runtimeMXBean.getManagementSpecVersion());
        int idxOfAt = name.indexOf('@');
        if (idxOfAt > 0) {
            String strId = name.substring(0, idxOfAt);
            return Integer.parseInt(strId);
        }

        throw new RuntimeException("can not get processId");
    }

}
