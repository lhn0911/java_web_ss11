package com.rikkei.ss11.model;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bai1 {
    @NotBlank(message="Tên không được để trống")
    @Size(min = 2, max = 30, message="Độ dài phải từ 2 đến 30 kí tự")
    private String name;

    @Email(message = "Email phải đúng định dạng")
    @Pattern(regexp = "^[\\w.-]+@gmail\\.com$", message = "Email phải có đuôi @gmail.com")
    @NotBlank(message="Email không được để trống")
    @Size(min = 2, max = 30, message="Độ dài phải từ 2 đến 30 kí tự")
    private String email;

    @NotBlank(message="Số điện thoại không được để trống")
    @Size(min = 2, max = 30, message="Độ dài phải từ 2 đến 30 kí tự")
    private String phone;

    @NotBlank(message="Mật khẩu không được để trống")
    @Size(min = 2, max = 30, message="Độ dài phải từ 2 đến 30 kí tự")
    private String password;

    private Boolean status;
}
