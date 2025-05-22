package com.rikkei.ss11.model;

import com.rikkei.ss11.repository.validationgroup.AdminGroup;
import com.rikkei.ss11.repository.validationgroup.UserGroup;
import com.rikkei.ss11.validator.ValidPhone;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    @NotBlank(message = "Tên không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String name;

    @NotBlank(message = "Email không được để trống", groups = {AdminGroup.class, UserGroup.class})
    @Email(message = "Email không hợp lệ", groups = {AdminGroup.class, UserGroup.class})
    private String email;

    @NotBlank(message = "Mật khẩu không được để trống", groups = {AdminGroup.class, UserGroup.class})
    @Size(min = 8, message = "Mật khẩu phải có ít nhất 8 ký tự", groups = {AdminGroup.class, UserGroup.class})
    private String password;

    @NotBlank(message = "Vai trò không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String role;

    @NotBlank(message = "Admin phải nhập mã xác thực", groups = AdminGroup.class)
    private String adminCode;

    @ValidPhone
    private String phone;
}
