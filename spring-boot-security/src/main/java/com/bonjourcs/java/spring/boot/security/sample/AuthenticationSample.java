package com.bonjourcs.java.spring.boot.security.sample;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Liang Chenghao
 * Description: authentication sample
 * Date: 2019/3/5
 */
public class AuthenticationSample {


    private AuthenticationManager authenticationManager = new SampleAuthenticationManager();

    public static void main(String... args) throws IOException {

        AuthenticationSample sample = new AuthenticationSample();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Please input your username: ");
            String name = reader.readLine();

            System.out.println("Please input your password: ");
            String password = reader.readLine();

            try {
                Authentication request = new UsernamePasswordAuthenticationToken(name, password);
                Authentication result = sample.authenticationManager.authenticate(request);
                SecurityContextHolder.getContext().setAuthentication(result);
            } catch (Exception e) {
                System.out.println("Authentication failed: " + e.getMessage());
            }

            System.out.println(SecurityContextHolder.getContext().getAuthentication());

        }
    }


    class SampleAuthenticationManager implements AuthenticationManager {

        final List<GrantedAuthority> AUTHORITIES = new ArrayList<>();

        {
            AUTHORITIES.add(new SimpleGrantedAuthority("ROLE_USER"));
        }

        @Override
        public Authentication authenticate(Authentication authentication) throws AuthenticationException {

            if (authentication.getName().equals(authentication.getCredentials())) {
                return new UsernamePasswordAuthenticationToken(authentication.getName(),
                        authentication.getPrincipal(), AUTHORITIES);
            }

            throw new BadCredentialsException("Bad Credentials");
        }

    }
}
