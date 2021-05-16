package com.ilminsky.server;

import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public Server() {
        ExecutorService service = Executors.newFixedThreadPool(4);
        try (ServerSocket server = new ServerSocket(9876)){
            server.accept();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
