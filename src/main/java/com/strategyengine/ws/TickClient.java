package com.strategyengine.ws;

import com.strategyengine.engine.StrategyEngine;
import com.strategyengine.model.Tick;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

public class TickClient extends WebSocketClient{

    private final StrategyEngine strategyEngine;

    public TickClient(URI serverUri, StrategyEngine strategyEngine){
        super(serverUri);
        this.strategyEngine = strategyEngine;
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        System.out.println("✅ Connected to tick stream");
    }

    @Override
    public void onMessage(String message) {
//        Tick tick = Tick.fromJson(message);  // Parse JSON into Tick object
//        strategyEngine.onTick(tick);         // Send tick to strategy engine
        System.out.println("Received Tick"+message);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("❌ Disconnected: " + reason);
    }

    @Override
    public void onError(Exception ex) {
        ex.printStackTrace();
    }
}
