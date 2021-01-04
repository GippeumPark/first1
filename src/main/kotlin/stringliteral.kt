//String 대신에 str 을 사용하는 것이 가능 (별명)
typealias str = String

fun main(args:Array<String>){
    var temp : str = "Hello Typeaias"

    //raw String
    var msg = "Hello\nKotlin"
    println(msg)
    //이런 형태를 rew string 이라고 함
    msg = """Hello
        Kotlin
    """
    println(msg)

    val n1 = 10
    val n2 = 20

    //10 + 20 = 30 이런 형태로 출력
    //이렇게 문자열 안에 수식이나 변수를 출력하는 것을 문자열 템플릿이라고 함
    msg = "${n1} + ${n2} = ${n1 + n2}"
    println(msg)

    //숫자를 이용해서 문자 생성
    var ch : Char = 65.toChar()
    println(ch) //A
    ch = '\uD55C' //한이라는 글자를 유니코드로 삽입
    println(ch)
    ch = '\\' //제어문자를 이용해서 삽입
    println(ch)

    var x : Int = 20
    var y : Int = 3
    x %= y
    println("결과는 ${x}")
}