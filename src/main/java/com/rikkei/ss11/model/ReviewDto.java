package com.rikkei.ss11.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReviewDto {

    @NotNull(message = "Tên không được để trống")
    private String name;

    @NotNull(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String email;

    @NotNull(message = "Vui lòng chọn số sao đánh giá")
    @Min(value = 1, message = "Đánh giá tối thiểu là 1 sao")
    @Max(value = 5, message = "Đánh giá tối đa là 5 sao")
    private Integer rating;

    @Size(max = 200, message = "Bình luận tối đa 200 ký tự")
    private String comment;
}
