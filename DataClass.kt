package com.example.test

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)

//데이터 클래스 : 데이터를 담는 클래스
/*
    변수선언을 통해 properties 처럼 사용이 가능하다.
    toString(), hashCode(), equals(), copy() 메소드를 데이터 클래스를 사용하면 컴파일시 자동으로 만들어진다.
    data class 말고 class 선언 시 위 메소드는 나오지 않는다.
 */
fun main(){
    val ticketA = Ticket("KoreanAir", "EunJiKim", "2022-07-02", 14)

    println(ticketA)
}