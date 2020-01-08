package com.example.execl;

import com.github.houbb.iexcel.annotation.ExcelField;

/**
 * Created by Administrator on 2018/12/20.
 */
public class TestCode {
    @ExcelField
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
