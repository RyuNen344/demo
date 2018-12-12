package com.ryunen344.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("greeting")
class GreetingController {

    @GetMapping("/hello")
    fun hello(
            @RequestParam(value = "name", required = false, defaultValue = "world") name: String,
            model: Model): String {
        model.addAttribute("name", name)
        return "greeting"
    }
}

class Customer(name: String) {
    // 初期化処理はinitブロックの中に書く
    init {
        // プライマリコンストラクタの引数がこの中で使える
        println("Customer initialized with value ${name}")
    }

    // プライマリコンストラクタの引数がプロパティの初期化でも使える
    val customerKey = name.toUpperCase()

    // セカンダリコンストラクタ
    constructor(firstName: String, lastName: String)
    // プライマリがある場合、セカンダリは必ずプライマリを呼び出す
            : this("$firstName $lastName") {
        println("firstName = $firstName, lastName = $lastName")
    }
}