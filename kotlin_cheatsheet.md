## Kotlin Examples

* Hello World

```
fun main() {
    // this is a comment
    println("Hello world!")
}
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
```

### Array

```
var someArray = arrayOfNulls<String>(4) // An array with the length of 4

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

The problem with Array = limited capacity. Use instead lists.

### List

val myList = ArrayList<String>()

myList.add("Mario")
myList.add("Luigi") // ["Mario", "Luigi"]

myList.add(1, "Peach") // ["Mario", "Peach", "Luigi"]

### Set

Unique values

```
val mySet = HashSet<String>()

mySet.add("item") // ["item"]
mySet.add("item") // ["item"]

mySet.size // 1
```

### Map

Store key value items. Also called in other languages "Dictionary".

```
val myMap = HashMap<String, String>()

myMap.put("one", "1")
myMap.put("two", "2")

println(myMap["one"]) // "1"
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

### String Templates

```
var x = 1
val y = "x is $x" 
```

### Conditionals

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

Return null if x is not an Integer

```
fun get(x: String): Int? {
    // ...
}
```

### Switch case: when

"when" is the equivalent of switch operator in Kotlin

```
number = ""

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

```
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

```
class Person(var name:String, var age:Int) {

}
```

* Create an instance

```
val rectangle = Rectangle(9.0, 8.0)
```
