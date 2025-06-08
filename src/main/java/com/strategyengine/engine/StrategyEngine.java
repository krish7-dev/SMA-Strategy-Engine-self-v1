package com.strategyengine.engine;

import com.strategyengine.model.Tick;

public class StrategyEngine {
    public void onTick(Tick tick){
        System.out.println("📩 Tick: " + tick);
    }
}
