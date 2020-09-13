fun main(){

    print("Enter a number: ")
    var x = readLine()!!.toInt()
    print("Enter another number: ")
    var y = readLine()!!.toInt()
    println("x is $x and y is $y")

    x = x + y
    y = x -y
    x = x - y

    print("x is $x and y is $y")
}
