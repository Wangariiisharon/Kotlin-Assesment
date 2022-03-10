fun main(){
text()
    var x=modulus(50,3)
    println(x)
    var intro=statement("Marina",21)
    println(intro)
    var y =word("Wairimu")
    println(y)
}
fun text(){
    var txt="codeHive"
    print(txt[4])
    print(txt[5])
    print(txt[6])
    println(txt[7])
}
fun modulus(num1:Int,num2:Int):Int{
    var remainder=num1%num2
    return remainder
}
fun statement(name:String,age:Int):String{
    var stmnt ="Hi my name is $name and I am $age years old"
    return stmnt
}
fun word(wrd:String):Int{
    var answer=wrd.length
    return answer

}


