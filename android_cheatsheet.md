## Android Cheat Sheet

### First steps in "Empty Activity"

Create a layout:

1. Right click on "res" folder  -> new -> Android resource directory.
2. Name it "layout" and also change its type to "layout". Click on "OK" which should create the layout directory

Next create a basic activity

1. Right click on the new "layout" directory ->  new -> Activity -> Empty Activity

Add default activity to manifest:

1. Click on Manifests directory -> AndroidManifest.xml
2. Insert the following :

```kotlin
<activity android:name=".MainActivity">
    <intent-filter>
        <action android:name="android.intent.action.MAIN"/>
        <category android:name="android.intent.category.LAUNCHER"/>
    </intent-filter>
</activity>
```

### Main Activity

* To see main activity (UI) go to res -> layout -> activity_main.xml

### Gradle

* Apply changes: click on terminal -> insert `gradlew clean` and press ctrl + enter

### Text

* Change text: `textID.text = "some text"`
* Center text: in the IDE menu click on`Attributes -> gravity -> center`

### Buttons

##### Run function upon clicking on a button - UI way

In the UI, set onClick to "change" and add the following function

```
fun change(view: View) {

    }
```

##### Run code upon clicking on a button - Listener way (Preferred)

Go to main activity and under the main activity class, add this

```kotlin
<button_id>.setOnClickListener{
    // Add code to execute when the button is clicked on
}
```

##### Change image upon clicking on a button with the id "change"

Note: onClick is set to "change"

```
fun change(view: View) {
    imageView.setImageResource(R.drawable.<image_name>)
}
```

##### Change text upon clicking on a button (the text ID is "textView")

```
fun update(view: View) {
    textView.text = "text changed! :)"
}
```

##### Layout Width

* wrap content - the width of the button will be set based on the content (length of the text for example)
* match parent - the width will be based on the width of the parent in component tree
* Use "pt" measurement for setting the width or height of components (e.g. 30pt)

### Input

##### Add input field 

```
Palette -> Text -> Plain Text
```

* Change input type: `Attributes -> inputType`

* Hint (input text disappears as soon as the user starts typing)

```
Attributes -> EditText -> hint -> put your text
Attributes -> TextView -> text -> remove text
```

##### Get text from input field

The id of the input field is x

```
// string
val userInput = x.text.toString()
// integer
val userInput = Integer.parseInt(x.text.toString())
```

### Date

##### Get current year

```kotlin
import java.util.*
val currentYear = Calendar.getInstance().get(Calendar.YEAR)
```

### Debugging

##### Basic

1. You click on the line number to add a breakpoint
2. Click on "debug" button to start running

### Logging

You can log messages and see them when clicking on "Logcat" in the IDE.

```kotlin
import android.util.Log
Log.d("Log Tag", "Hey, you logged this line")
```

### Table

##### Center all the elements in a table row

```kotlin
<TableRow
    android:gravity="center"
    ...
// Same can be added to table layout to center everything in a table
```

### Colors

##### Define a new color

1. Go to res -> values -> colors.xml
2. Add a new line like: `<color name="colorAccent">#03DAC5</color>`
3. You can now use reference it this way: `"@color/colorAccent"`

### Toasts (AKA small popup?)

##### Show toast for a long time

````kotlin
Toast.makeText(this, "Wow!", Toast.LENGTH_LONG).show()
````

