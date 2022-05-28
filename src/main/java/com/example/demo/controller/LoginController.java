package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ログイン画面コントローラークラス
 * @author ryosei
 *
 */
@Controller
public class LoginController {

	/**
	 * ログイン画面の表示
	 * @param model
	 * @return
	 */
	@GetMapping(value = "/login")
	public String loginDisp(Model model) {
		//model.addAttribute("userRequest", new UserRequest());
		return "login";
	}

	/**
	 * ログイン処理を行う
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String loginUser(Model model) {
		return "home";
	}
}
