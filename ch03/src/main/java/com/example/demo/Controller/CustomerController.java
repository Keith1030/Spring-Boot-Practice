package com.example.demo.Controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.*;

@RestController
public class CustomerController {

	@PostMapping("/cust")
	public CustomerResponse getCoustomer(@RequestBody CustomerRequest request) {
		CustomerResponse response = new CustomerResponse();
		
		CustomerResponseHeader header = new CustomerResponseHeader();
		header.setMsgId("1");
		header.setTxnSeq("2");
		header.setBranchId("3");
		header.setClientIp("4");
		CustomerResponseBody body = new CustomerResponseBody();
		body.setCustomerId(request.getBody().getCustomerId());
		body.setName("John");
		body.setAge(BigDecimal.valueOf(10));
		body.setTel("0912345678");
		body.setAddr("地址");
		
		response.setHeader(header);
		response.setBody(body);
		
		String custId = request.getBody().getCustomerId();
		System.err.print("custId = " + custId);
		
		return response;
	}
}