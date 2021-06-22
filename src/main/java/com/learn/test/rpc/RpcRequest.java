package com.learn.test.rpc;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Bai
 * @date 2021/6/8 23:24
 */
@Data
public class RpcRequest implements Serializable {
	private Long serialVersionUID = -8134568914670722616L;
	private String className;
	private String method;
	private Object[] args;
}
