package com.example.demo.DTO;

import lombok.Data;

@Data
public class ResponseDTO {
	private String code;
	private String massage;
	private Object data;

}
