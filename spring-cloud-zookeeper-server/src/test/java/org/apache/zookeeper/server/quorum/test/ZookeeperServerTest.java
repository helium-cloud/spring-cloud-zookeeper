package org.apache.zookeeper.server.quorum.test;

import org.apache.zookeeper.server.admin.AdminServer;
import org.apache.zookeeper.server.persistence.FileTxnSnapLog;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.apache.zookeeper.server.quorum.ZookeeperServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZookeeperServerTest {
    private static final Logger LOG = LoggerFactory.getLogger(ZookeeperServer.class);

    /**
     * To start the replicated server specify the configuration file name on
     * the command line.
     * @param args path to the configfile
     */
    public static void main(String[] args) {
        ZookeeperServer.start(args);
    }
}
