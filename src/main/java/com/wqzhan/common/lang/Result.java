package com.wqzhan.common.lang;

import com.baomidou.mybatisplus.extension.api.R;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private int code; //200正常，非200访问异常
    private String msg;
    private Object data;

    public static Result succ(Object data){
        Result r=succ(200,"操作成功",data);
        return r;
    };
    public static Result succ(int code,String msg,Object data){
        Result r=new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
    public static Result fail(String msg,Object data){
        Result r=fail(400,msg,data);
        return r;
    }
    public static Result fail(String msg){
        Result r=fail(400,msg,null);
        return r;
    }
    public static Result fail(int code,String msg,Object data){
        Result r=new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
