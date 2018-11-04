package me.silverhyuk.springbootsecuritysample02.runner;

import me.silverhyuk.springbootsecuritysample02.account.Account;
import me.silverhyuk.springbootsecuritysample02.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    private AccountService accountService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account silverhyuk = accountService.createAccount("eunhyuk", passwordEncoder.encode("1234"));
        System.out.println(silverhyuk.getUsername() + " password: "+ silverhyuk.getPassword());
    }
}
