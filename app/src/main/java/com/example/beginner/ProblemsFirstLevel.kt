package com.example.beginner

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*
import kotlin.math.pow

fun main (args:Array<String>){
    val sc = Scanner(System.`in`)

    val r: String = sc.next()
    //val b: String = sc.next()

    problem3Level1AreaOfACircle(r)
}

fun problem1Level1HelloWorld(){
    println("Hello World!")
}

fun problem2Level1ExtremelyBasic(a: String, b: String){
    println("X = " + (a.toInt() + b.toInt()))
}

fun problem3Level1AreaOfACircle(r: String){
    val result = BigDecimal(r.toDouble().pow(2)*3.14159).setScale(4, RoundingMode.HALF_EVEN)
    println("A=${result}")
}
