package com.CodeWithDanny.LoginAndEmailVerification.request;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    // TODO 全部欄位上再加上兩個annotation  >  @column 和 @schema 並了解用法及用途
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
