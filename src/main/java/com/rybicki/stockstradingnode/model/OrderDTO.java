package com.rybicki.stockstradingnode.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class OrderDTO {
    private OrderType orderType;
    private String userId;
    private String companyIndex;
    private Money money;

}
