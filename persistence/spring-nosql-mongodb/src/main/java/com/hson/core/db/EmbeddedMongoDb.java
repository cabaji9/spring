package com.hson.core.db;

import java.io.IOException;

import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;

public class EmbeddedMongoDb {

    private int port;
    
    private MongodProcess process;
         
    public EmbeddedMongoDb() {
        this.port = 27017;
    }
    
    public EmbeddedMongoDb(int port) {
        this.port = port;
    }
    
    public void start() throws IOException {
       MongodStarter starter = MongodStarter.getDefaultInstance();
       MongodExecutable executable = starter.prepare(new MongodConfigBuilder()
           .version(Version.Main.PRODUCTION)
           .net(new Net(port,Network.localhostIsIPv6()))
           .build());
       process = executable.start();
    }
    
    public void stop() {
        process.stop();
    }
}