package com.demo.controller.zyf;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginHander {
	@RequestMapping("/login")
	public String name(HttpServletRequest request) {
		String path = request.getContextPath();
		String basePath = ((ServletRequest) request.getSession()).getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		System.out.println(basePath);
		return "";
	}
}
