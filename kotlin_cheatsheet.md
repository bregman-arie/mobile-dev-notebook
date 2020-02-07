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
    } else {
        return b
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

### Functions

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

### Loops

```
val items = listOf("x", "y", "z")
for (item in items) {
    println(item)
}
```
