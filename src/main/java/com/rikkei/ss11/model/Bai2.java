package com.rikkei.ss11.model;

import com.rikkei.ss11.validator.ValidEmail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bai2 {
    @NotBlank(message = "Tên không được để trống")
    private String name;

    @NotBlank(message = "Email không được để trống")
    @ValidEmail
    private String email;

    @NotBlank(message = "Mật khẩu không được để trống")
    @Size(min = 8, message = "Mật khẩu phải có ít nhất 8 ký tự")
    private String password;
}
