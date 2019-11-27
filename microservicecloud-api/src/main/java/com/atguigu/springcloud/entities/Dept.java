package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor//无参构造
//@AllArgsConstructor//原参构造
@Data//getste 方法
@Accessors(chain = true)//链式调用
public class Dept implements Serializable {

    public long deptno;//主键

    public String dname; //部门名称

    public String db_source;//数据库名称



    public Dept(String dname){
        super();
        this.dname = dname;
    }
}