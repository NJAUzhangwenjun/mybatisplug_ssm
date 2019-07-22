package com.njau.controller;


import com.njau.entity.Account;
import com.njau.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-23
 */
@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("success")
    public String success() {
        return "success";
    }

    @RequestMapping("toInsert")
    public String toInsert() {
        return "addAccount";
    }


    @RequestMapping("findAll")
    public String findAll(Model model) {
        List<Account> all = accountService.list();
        model.addAttribute("accounts", all);
        return "account";
    }


    @RequestMapping("insert")
    public String insert(Account account) {
        accountService.save(account);
        return "success";
    }
}

