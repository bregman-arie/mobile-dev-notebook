## Android Cheat Sheet

### Main Activity

* To see main activity (UI) go to res -> layout -> activity_main.xml

### Text

* Center text: `Attributes -> gravity -> center`

### Buttons

* Run function upon clicking on a button

Note: onClick is set to "change"

```
fun change(view: View) {

    }
```

* Change image upon clicking on a button with the id "change"

Note: onClick is set to "change"

```
fun change(view: View) {
    imageView.setImageResource(R.drawable.<image_name>)
}
```

* Change text upon clicking on a button (the text ID is "textView")

```
fun update(view: View) {
    textView.text = "text changed! :)"
}
```

### Input

* Add input field

```
Palette -> Text -> Plain Text
```

* Change input type: `Attributes -> inputType`

* Hint (input text disappears as soon as the user starts typing)

```
Attributes -> EditText -> hint -> put your text
Attributes -> TextView -> text -> remove text
```
