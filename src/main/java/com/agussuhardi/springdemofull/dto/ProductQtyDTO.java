package com.agussuhardi.springdemofull.dto;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductQtyDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;

    private String productId;

    private BigDecimal qty;

    private BigDecimal adjust;

}
