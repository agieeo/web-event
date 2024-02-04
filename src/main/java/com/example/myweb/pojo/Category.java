package com.example.myweb.pojo;

import lombok.Data;

import java.time.LocalDateTime;
@Data               // 自动生成getter/setter/toString/equals/hashCode
public class Category {
    private Integer id;//主键ID
    private String categoryName;//分类名称
    private String categoryAlias;//分类别名
    private Integer createUser;//创建人ID
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
}
