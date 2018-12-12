package com.ryunen344.demo

import com.ryunen344.demo.controller.Customer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {

    /*
    //変数宣言
    val s: String = "hoge"
    val t: String = s

    println(t)

    //primitive
    val a = 23
    println(a.toString())

    //if文
    val foo = if(a<43){
        "small"
    }else{
        "large"
    }

    println(foo)

    for(i in 0 until a) println("i = " + i)

    val nama:String = """エスケープが聞かなくなるよ、もちろん改行も
        ね
    """
    println(nama)

    val i = 10
    val str = "i = $i, i x 2 = ${i * 2}"

    println(str)

    val c0 = nama[0]
    println(c0)

    for(chr in str){
        println(chr)
    }

    val asc = Array(5,{ix -> (ix*ix).toString() })

    for(tr in asc) println(tr)
    */

    val hoge = Customer("bunjiro")

    println(hoge.customerKey)


    println(double(34))


    println("main method runs")
    runApplication<DemoApplication>(*args)
}

fun double(x: Int): Int = x * 2

fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = true,
             wordSeparator: Char = 'a') {

}
