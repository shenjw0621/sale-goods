package com.tt.sale.goods;

import com.tt.sale.goods.dao.mapper.AccountMapper;
import com.tt.sale.goods.entity.Account;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SpringBootApplication
@MapperScan(basePackages = {"com.tt.sale.goods.dao.mapper"})
@Controller
public class SaleGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaleGoodsApplication.class);
    }

    @Autowired
    private AccountMapper mapper;

    @RequestMapping("/hhh")
    @ResponseBody
    private List<Account> getAccoutn() {
        return mapper.getAll();
    }


}
