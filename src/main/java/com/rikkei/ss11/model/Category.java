package com.rikkei.ss11.model;

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
public class Category {
    private int id;
    @NotBlank(message = "Tên danh mục không được để trống")
    @Size(max = 50, message = "Tên danh mục tối đa 50 ký tự")
    private String categoryName;
    private boolean status = true;
}
