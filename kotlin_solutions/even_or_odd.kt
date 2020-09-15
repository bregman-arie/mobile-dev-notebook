fun main(){

    print("Insert a number: ")
    var x = readLine()!!.toInt()
    if (x%2 == 0){
        print("$x is even")   
    }
    else {
        print("$x is odd")
    }
}
