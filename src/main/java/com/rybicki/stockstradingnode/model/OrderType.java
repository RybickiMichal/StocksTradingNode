package com.rybicki.stockstradingnode.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum OrderType {
    BUY("buy"),
    SELL("sell");

    @Getter
    private final String type;
}
