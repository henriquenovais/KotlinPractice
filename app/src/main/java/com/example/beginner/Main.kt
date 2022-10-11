package com.example.beginner

import java.util.*

fun main (args:Array<String>){
    val sc = Scanner(System.`in`)

    val a: String = sc.next()
    val b: String = sc.next()

    problem2_level1_extremely_basic(a,b)
}

fun problem1_level1_hello_world(){
    println("Hello World!")
}

fun problem2_level1_extremely_basic(a: String, b: String){
    println("X = " + (a.toInt() + b.toInt()))
}