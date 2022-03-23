package com.qf.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Shop {
    private Integer shopId;

    private String shopName;

    private Integer shopPrice;

    private String shopDesc;
}
