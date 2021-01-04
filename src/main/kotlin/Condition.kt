fun main(args:Array<String>){
    val score : Int = 90
    //score가 90 이상이면 합격 그렇지 않으면 불합격이라고 출력
    if(score >= 90){
        println("합격")
    }else{
        println("불합격")
    }
    //값이 하나 이면 { } 를 생략할 수 있음
    if(score >= 90) println("합격") else println("불합격")
    println("실행"); println("실행")

    var food:String = "떡볶이"
    when(food){
        "떡볶이" -> println("분식")
        "치킨" -> println("야식")
        "초밥" -> println("일식")
        "스테이크" -> println("양식")
        else -> println("한식")
    }
    when(food){
        "떡볶이","순대","어묵" -> println("분식")
        "치킨" -> println("야식")
        "초밥" -> println("일식")
        "스테이크" -> println("양식")
        else -> println("한식")
    }

    //깂에 Boolean 식을 사용하는 것도 가능
    when{
        food is String -> println("food는 문자열")
        else -> println("food는 문자열이 아님")
    }

    val jumsu : Int = 50
    when{
        jumsu in 60..100 -> println("합격")
        else -> println("불합격")
    }
}