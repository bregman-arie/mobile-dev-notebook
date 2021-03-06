## Kotlin CheatSheet

* [Comments][#Comments]
* [Print](#Print)
* [Varibles](#Variables)
* [Input](#Input)
* [Array](#Array)
* [ArrayList](#ArrayList)
* [LinkedList](#LinkedList)
* [Set](#Set)
* [Hashmap](#Hashmap)
* [Operators](#Operators)
* [Strings](#Strings)
* [Conditionals](#Conditionals)
* [Collections](#Collections)
* [Classes](#Classes)
* [Calendar](#Calendar)
* [Package](#Package)
* [Constructor](#Constructor)
* [Conversion](#Conversion)



#### Hello World

```
fun main() {
    // this is a comment
    println("Hello world!")
}
```

### Comments

```
// This is a single line comment in Kotlin
```

```
/*
This is a
multiline comment
*/
```

### Print

```
println("Print with a new line at the end")
print("Print without a new line at the end")
```

### Variables

```
val a: Int = 1
val b = 2
val c: Int
c = 3 
d = null
```

```
/* When using `val` you can't change the variable later.
   If you need to change it, use `var` */
var x = 3
x += 1
var y:String? // Without setting a value
```

```
// Increment count variable value by one
count += 1
// Decrement count variable value by two
count -= 2
```

### Input

```
val name:String = readLine()!!.toString()
val age:Int = readLine()!!.toInt()
val grade = readLine()!!.toDouble()
```

### Array

```
var someArray = arrayOfNulls<String>(4) // An array with the length of 4
var anotherArray:Array<String> = Array(4){""}

someArray[0] = "Mario"
someArray[1] = "Luigi"
```

```
var anotherArray = intArrayOf(1, 2, 3)

println(anotherArray.size)

anotherArray.set(1, 100)  // first param is index, second param is the new value in this index
anotherArray.get(2) // result is 3
println(anotherArray[2]) // same as above
```

```
var listOfStrings:Array<String> = Array(3){""}
for(i in 0..2){
    listofStrings[i] = readLine()!!.toString()
}

for(i in 0..4){
    println("String $i: ${listOfStrings[i]}")
}
```

The problem with Array = limited capacity. Use instead lists.

### ArrayList

```
val myList = ArrayList<String>()

myList.add("Mario")
myList.add("Luigi") // ["Mario", "Luigi"]

myList.add(1, "Peach") // ["Mario", "Peach", "Luigi"]

// Array Size
myList!!.size
```

### LinkedList

```
val myList = LinkedList<String>()

myList.add("Mario")
myList.add("Luigi") // ["Mario", "Luigi"]

myList.add(1, "Peach") // ["Mario", "Peach", "Luigi"]
```

### Set

Unique values

```
val mySet = HashSet<String>()

mySet.add("item") // ["item"]
mySet.add("item") // ["item"]

mySet.size // 1
```

### HashMap

Store key value items. Also called in other languages "Dictionary".

```
val myMap = HashMap<String, String>()

myMap.put("one", "1")
myMap.put("two", "2")

println(myMap["one"]) // "1"

// The following will have the same effect as the code above
myMap["one"] = "1"
myMap["two"] = "2"

println("${myMap["one"]}") // "1"

// Print each key,value in the HashMap
for (key in myMap.keys)
println("$key: ${myMap[key]}")
```

### Operators

```
var x = 1
x = x + 1 // x -> 2
x++ // x -> 3
x-- // x -> 2

var y = 0
println(x > y) // true
println(y > x) // false
```

### Strings

```
var message = "Hello World"
var anotherMessage = "Have a nice day"
println("The message is: $message")
val y = "The message is: $message"

val newMessage = message + anotherMessage
val newMessage = "$message,$anotherMessage"

println(newMessage[0]) // will print "H"
println(newMessage[1]) // will print "e"

println(newMessage.toLowerCase())
println(newMessage.toUpperCase())
println(newMessage.trim())

val tokens = message.split(" ")
```

### Logic Statements

```
var statement = (10>2) // statement = true
println(10>2) // ture
println(10!=2) // true
println(10==5) // false
val num = 5
println(num>=2 && num <=7) // true
println(num==2 || num <=3) // false
println(!(num==10)) // true
println(num in 1..10)) // true
```

### Conditionals

#### Numbers

```
val num = 10
if (num > 1){
    println("num is greater than 1")
}

if (num in 1..10){
    printlin("It's somewhere between 1 to 10")
}
else if(num in 10..20){
    printlin("It's somewhere between 10 to 20")
}
else {
    print("It's not between 1 to 20")
}
```

```
fun getMax(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else if (b > a) {
        return b
    } else {
        print("equal")
        return a
    }
}
```

Or as an expression:

```
fun getMax(a: Int, b: Int) = if (a > b) a else b
```

```
val x = true
val y = 2

val z = if (x==true && y>=1) 1 else 0 // 1
```

Return null if x is not an Integer

```
fun get(x: String): Int? {
    // ...
}
```

```
if (some_string!!.contains("some_word")){
    print("It contains it")
}
```

#### Booleans

```kotlin
// if a is true
if (a) {
    ...
}
```

### Switch case: when

"when" is the equivalent of switch operator in Kotlin

```
val number = readLine()!!.toInt()

when (num) {

    1 -> number = "1"
    2 -> number = "2"
    3 -> number "3"
    else -> number = 0
}
```

```
fun get(obj: Any): String =
    when (obj) {
        1          -> "One"
        "2"        -> "Two"
        !is String -> "Not a string"
        else       -> "Unknown"
    }
```

```
val x = readLine()!!.toInt()

when(x){

1 -> {
    print("You got 1")
    print("Exciting")
}

5 -> {
    print("You got 5!")
}

else -> {
  print("Not 1, neither 5")
}
```

```
val x = 1
val y = when(x){
    1 -> true
    2 -> false
}
```

### Functions

```
fun test() {
    val x = 5 * 4
    println(x)
}
```

* Sum of two numbers

```
fun sum(a: Int, b: Int): Int {
    return a + b
}
```
OR

```
fun sum(a: Int, b: Int) = a + b
```

### For Loops

```
val someNumbers = intArrayOf(1, 2, 3)

for (number in someNumbers) {
    val x = number * 2
    println(x)
}
```

```
val someNumbers = intArrayOf(1, 2, 3)

for (i in someNumbers.indices) {
    val y = someNumbers[i] * 2
    println(y)
}
```

```
for (x in 0..5) {
    val y = x * 2
    println(y)
}
```

```
for (x in 1..100 step 2){
    printlin("Number: $x")
}
```

```
for (x in 100 downTo 0 step 2){
    printlin("Number: $x")
}
```

```
val items = listOf("x", "y", "z")
for (item in items) {
    println(item)
}
```

### While Loops

```
var x = 0
while (x < 10) {
    val y = x * 2
    println(y)
    x++
}
```

```
val items = listOf("x", "y", "z")
var i = 0
while (i < items.size) {
    println("item is ${items[i]}")
    i++
}
```

```
i = 1
do{
    printlin("Number: $i")
    i += 3
}while (i<=20)
```

### Continue

```
for (num in 3..6){
    if(num == 4){
        continue // if num is 4, it will not be printed and the loop will continue to the next number
    }
    println(num)
}
```

### Break

```
for (num in 3..6){
    if(num == 4){
        break // if num is 4, the loop will break and will not continue to the next number
    }
    println(num)
}
```

```
loop@ for (num in 3..6){
    println("Outer loop number: $num")
    for (innerNum in 7..10){
        println("Inner loop number: $innerNum")
        if(innerNum==8){
            break@loop // break outer loop
        }
    }
}
```

### Ranges

* Check if number in range

```
if (5 in 1..10) {
    println("in range")
}
```

* Check if out of range

```
if (11 !in 1..10) {
    println("11 is out of range")
}
```

* Iterating over a range with 2 steps

```kotlin
for (x in 1..10 step 2) {
    print(x)
}
```

### Collections

* Iterating over a collection

```
for (item in items) {
    println(item)
}
```

* Check if a collection contains an item

```
when {
    "witcher" in items -> println("good game")
    "smb" in items -> println("smb is the best")
}
```

* Filter and map collections

```
val games = listOf("smb", "starcraft", "witcher")
games
  .filter { it.startsWith("g") }
  .sortedBy { it }
  .map { it.toUpperCase() }
  .forEach { println(it) }
```

### Classes

* Create a class

```kotlin
class Person(var name:String, var age:Int) {
}
```

* Create an instance

```kotlin
val person = Person("Arie", 52)
prrintln(person.name)
```

* Class with a method

```kotlin
class Person(var name:String, var surname:String, var age:Int) {
    init {
        println("Created an object class")
    }
    
    fun getFullName():String{
        return "$this.name $this.surname"
    }
}

fun main() {
    val person = Person("John Lon", 29)
    println(person.getFullName())
}
```

### Calendar

```kotlin
import java.util.*
Calendar.getInstnace().get(Calendar.YEAR) // Get current year
Calendar.getInstnace().get(Calendar.MONTH) // Get current month
Calendar.getInstnace().get(Calendar.DAY) // Get current day
```

### Package

```kotlin
// To create one in the IDE
// Click on src directory -> New -> Package -> Name: com.box.a
// Next you can create a class
// Click on the package -> New -> Class -> Name: Box
// In the class write the following

package com.box.a

class Box {
    init {
    println("Created an object class")
    }
}

fun main () {
    val box = Box()
}
```

### Constructor

```kotlin
class Person(){
    var name:String?=null
    var surname:String?=null
    var age:Int?=null
    constructor(name:String, surname:String, age:Int):this(){
        this.name = name
        this.surname = surname
        this.age = age
    }
    constructor(name:String, surname:String):this(){
        this.name = name
        this.surname = surname
    }
}
```

### Conversion

```kotlin
// String to Integer
Integer.parse("some text")
```







