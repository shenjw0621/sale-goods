package com.tt.sale.goods.dao;

import com.github.pagehelper.PageInfo;
import com.tt.sale.goods.SaleGoodsApplicationTest;
import com.tt.sale.goods.entity.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountDaoTest extends SaleGoodsApplicationTest {

    @Autowired
    private AccountDao dao;

    @Test
    public void pagehelperTest() {
        PageInfo<Account> pageInfo = dao.getPageInfo(3, 1);
        System.out.println(pageInfo);
    }

}
