package com.tt.sale.goods.controller;

import com.tt.sale.goods.dao.AccountDao;
import com.tt.sale.goods.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountDao accountDao;

    @RequestMapping("/all")
    @ResponseBody
    private List<Account> getAccoutn() {
        return accountDao.search();
    }
}
