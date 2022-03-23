package com.qf.service.impl;

import com.qf.mapper.ShopMapper;
import com.qf.pojo.Shop;
import com.qf.service.ShopService;

import java.util.List;

public class ShopServiceImpl implements ShopService {
    private ShopMapper shopMapper;
    public ShopMapper getShopMapper(){
        return shopMapper;
    }
    public void setShopMapper(ShopMapper shopMapper){
        this.shopMapper = shopMapper;
    }

    @Override
    public List<Shop> getAllShop() {
        List<Shop> list = shopMapper.findAll();
        if(list != null){
            return list;
        }
        return null;
    }
}
