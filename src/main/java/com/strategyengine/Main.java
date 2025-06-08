package com.strategyengine;

import com.strategyengine.engine.StrategyEngine;
import com.strategyengine.ws.TickClient;

import java.net.URI;

public class Main {
    public static void main(String args[]) throws Exception{
        URI uri = new URI("ws://localhost:7070/ws/marketdata");
        StrategyEngine strategyEngine = new StrategyEngine();
        TickClient client = new TickClient(uri, strategyEngine);
        client.connect();
    }
}
