package com.evan.efficient.farewell996.lambda.cart;

import com.alibaba.fastjson.JSON;
import com.evan.efficient.farewell996.lamda.cart.CartService;
import com.evan.efficient.farewell996.lamda.cart.Sku;
import com.evan.efficient.farewell996.lamda.cart.SkuPredicate;
import org.junit.Test;

import java.util.List;

public class Version5Test {

    @Test
    public void filterSkus() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 过滤商品单价大于1000的商品
        List<Sku> result = CartService.filterSkus(
                cartSkuList, new SkuPredicate() {
                    @Override
                    public boolean test(Sku sku) {
                        return sku.getSkuPrice() > 1000;
                    }
                });

        System.out.println(JSON.toJSONString(
                result, true));
    }

}
