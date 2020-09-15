package com.rybicki.stockstradingnode.repository;

import com.rybicki.stockstradingnode.model.OrderDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<OrderDTO, String> {}