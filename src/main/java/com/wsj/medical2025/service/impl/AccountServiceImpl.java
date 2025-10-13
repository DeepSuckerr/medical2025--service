package com.wsj.medical2025.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wsj.medical2025.commons.JSONResult;
import com.wsj.medical2025.dto.AccountDTO;
import com.wsj.medical2025.mapper.AccountMapper;
import com.wsj.medical2025.pojo.Account;
import com.wsj.medical2025.service.AccountService;
import com.wsj.medical2025.utils.DM5Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    public JSONResult login(AccountDTO accountDTO) {
        if (accountDTO.getUname() == null || accountDTO.getPwd() == null) {
            return new JSONResult(201,"登录信息必填",null);
        }
        if ("".equals(accountDTO.getUname()) || accountDTO.getUname()==null) {
            return new JSONResult(202,"请输入用户名",null);
        }
        if ("".equals(accountDTO.getPwd()) || accountDTO.getPwd()==null) {
            return new JSONResult(203,"请输入密码",null);
        }

        // 根据用户名查询账户
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uname", accountDTO.getUname());
        Account account = accountMapper.selectOne(queryWrapper);

        // 验证用户是否存在
        if (account == null) {
            return new JSONResult(204,"请检查用户名或密码是否正确",null);
        }
//        // 使用MD5验证密码
//        if (!DM5Password.verify(accountDTO.getPwd(), account.getPwd())) {
//            return new JSONResult(204,"请检查用户名或密码是否正确",null);
//        }

        return new JSONResult(200,"登录成功",account);
    }

    @Override
    public JSONResult register(AccountDTO accountDTO) {
        // 参数校验
        if (accountDTO.getUname() == null || accountDTO.getPwd() == null) {
            return new JSONResult(201,"注册信息必填",null);
        }
        if ("".equals(accountDTO.getUname()) || accountDTO.getUname()==null) {
            return new JSONResult(202,"请输入用户名",null);
        }
        if ("".equals(accountDTO.getPwd()) || accountDTO.getPwd()==null) {
            return new JSONResult(203,"请输入密码",null);
        }

        // 检查用户名是否已存在
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uname", accountDTO.getUname());
        Account existingAccount = accountMapper.selectOne(queryWrapper);
        if (existingAccount != null) {
            return new JSONResult(205,"用户名已存在",null);
        }

        // 创建新账户
        Account account = new Account();
        account.setUname(accountDTO.getUname());
        // 对密码进行MD5加密
        account.setPwd(DM5Password.encrypt(accountDTO.getPwd()));
        account.setPhoneNumber(accountDTO.getPhoneNumber());
        account.setUType(accountDTO.getUType());
        account.setRealName(accountDTO.getRealName());

        // 保存到数据库
        int result = accountMapper.insert(account);
        if (result > 0) {
            return new JSONResult(200,"注册成功",account);
        } else {
            return new JSONResult(500,"注册失败",null);
        }
    }

    @Override
    public JSONResult findUserByName(String uname) {
        System.out.println("Searching for username: " + uname);
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uname",uname);
        Account account = accountMapper.selectOne(queryWrapper);

        if (account == null) {
            return new JSONResult(201,"查询失败，未查到该用户",null);
        }else {
            return new JSONResult(200,"查询成功",account);
        }

    }


}