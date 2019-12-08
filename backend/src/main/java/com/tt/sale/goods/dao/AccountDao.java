package com.tt.sale.goods.dao;

import com.tt.sale.goods.dao.mapper.AccountMapper;
import com.tt.sale.goods.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDao {
    @Autowired
    private AccountMapper mapper;

    public List<Account> search(){
        List<Account> accountList = mapper.selectAll();
        return accountList;
    }
}
