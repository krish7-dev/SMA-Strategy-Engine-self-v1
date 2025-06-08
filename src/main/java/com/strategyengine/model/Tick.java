package com.strategyengine.model;

public class Tick {
    private final String symbol;
    private final double price;
    private final double volume;
    private final long timestamp;

    public Tick(String symbol, double price, double volume, long timestamp) {
        this.symbol = symbol;
        this.price = price;
        this.volume = volume;
        this.timestamp = timestamp;
    }

    public String getSymbol() { return symbol; }
    public double getPrice() { return price; }
    public double getVolume() { return volume; }
    public long getTimestamp() { return timestamp; }
}
