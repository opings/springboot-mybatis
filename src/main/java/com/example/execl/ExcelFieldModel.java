package com.example.execl;

import com.github.houbb.iexcel.annotation.ExcelField;

/**
 * Created by Administrator on 2018/12/18.
 */
public class ExcelFieldModel {
    @ExcelField
    private String name;

//    @ExcelField(headName = "年龄")
//    private String age;
//
//    @ExcelField(mapKey = "EMAIL", writeRequire = false, readRequire = false)
//    private String email;
//
//    @ExcelField(mapKey = "ADDRESS", headName = "地址", writeRequire = true)
//    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getAge() {
//        return age;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
}
