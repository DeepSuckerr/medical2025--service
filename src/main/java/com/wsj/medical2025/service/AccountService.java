package com.wsj.medical2025.service;

import com.wsj.medical2025.commons.JSONResult;
import com.wsj.medical2025.dto.AccountDTO;


public interface AccountService {
    JSONResult login(AccountDTO accountDTO);

    JSONResult register(AccountDTO accountDTO);

    JSONResult findUserByName(String uname);
}
