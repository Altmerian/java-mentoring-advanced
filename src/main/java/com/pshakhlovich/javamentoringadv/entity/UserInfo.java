package com.pshakhlovich.javamentoringadv.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


@Getter
@Setter
@ToString
@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private LocalDate birthday;

    public UserInfo() {
    }

    public UserInfo(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private String surname;
        private LocalDate birthday;

        UserBuilder() {
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public UserInfo build() {
            return new UserInfo(name, surname, birthday);
        }
    }
}
