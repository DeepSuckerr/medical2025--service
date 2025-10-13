package com.wsj.medical2025.commons;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class JSONResult implements Serializable {

    private Integer code;
    private String msg;
    private Object data;


    public JSONResult(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JSONResult(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

}
