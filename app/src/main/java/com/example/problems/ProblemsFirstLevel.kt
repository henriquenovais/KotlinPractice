package com.example.problems

import android.icu.math.BigDecimal
import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main (args:Array<String>){
//    val sc = Scanner(System.`in`)
//
//    val a: String = sc.next()
//    val b: String = sc.next()

    problem6Level1Average1("5.0","7.1")
}

//fun problem1Level1HelloWorld(){
//    println("Hello World!")
//}
//
//fun problem2Level1ExtremelyBasic(a: String, b: String){
//    println("X = " + (a.toInt() + b.toInt()))
//}
//
//@RequiresApi(Build.VERSION_CODES.N)
//fun problem3Level1AreaOfACircle(r: String){
//    val result = BigDecimal(r.toDouble().pow(2)*3.14159).setScale(4, BigDecimal.ROUND_HALF_EVEN)
//    println("A=${result}")
//}
//
//fun problem4Level1SimpleSum(a: String, b: String){
//    val result = a.toInt() + b.toInt()
//    println("SOMA = ${result}")
//}
//
//fun problem5Level1SimpleProduct(a: String, b: String){
//    val result = a.toInt() * b.toInt()
//    println("PROD = ${result}")
//}

@RequiresApi(Build.VERSION_CODES.N)
fun problem6Level1Average1(a:String, b: String){
    val result = (a.toDouble() + b.toDouble())/2
    val resultParsed = BigDecimal(result).setScale(4, BigDecimal.ROUND_HALF_EVEN)
    println("MEDIA = ${resultParsed}")
}
