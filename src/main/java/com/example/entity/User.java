package com.example.entity;

import lombok.Data;
import org.beetl.sql.core.annotatoin.Table;

@Data
@Table(name = "tb_user")
public class User {
    Integer id;
    String userName;
    Integer age;

}
