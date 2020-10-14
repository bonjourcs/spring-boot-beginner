package com.bonjourcs.java.spring.boot.web.config.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/4/10
 */
@Data
@Component
@ConfigurationProperties("env")
public class EnvProperties {

    private String name;

    private int maxLength;

    private boolean require;

    private Security security;

    public static class Security {

        private String username;

        private String password;

        private List<String> roles = new ArrayList<>(Collections.singletonList("USER"));

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }
    }

}
