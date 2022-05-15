package com.example.test


//자바의 static 대신 정적 메소드를 선언한다.
            //다른 곳에서 생성 못하게 끔
class Book private constructor(val id : Int, val name : String){
    companion object BookFactory : IdProvider {
        override fun getId(): Int {
            return 444
        }
        val myBook = "new book"
        fun create() = Book(Book.getId(), myBook)
    }
}

interface IdProvider{
    fun getId() : Int
}

fun main(){
    val book = Book.create()
    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
    println(bookId)
}