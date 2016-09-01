package com.reborne.light.security;

import com.reborne.light.model.Account;
import com.reborne.light.model.Role;
import com.reborne.light.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class AccountUserDetailsService implements UserDetailsService {

    @Autowired
    private AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Account account = accountService.findByUsername(username);
        if(account == null) {
            return null;
        }

        Collection<GrantedAuthority> userGrantedAuthority = new ArrayList<GrantedAuthority>();
        for(Role role : account.getRoles()) {
            userGrantedAuthority.add(
                    new SimpleGrantedAuthority(role.getCode()));
        }

        User userDetails = new User(
                account.getUsername(),
                account.getPassword(),
                account.isExpired(),
                account.isLocked(),
                account.isCredentialExpired(),
                account.isEnabled(),
                userGrantedAuthority
        );
        return userDetails;
    }
}
