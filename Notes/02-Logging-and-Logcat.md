# Logging and Logcat in Android

## 1. Renaming variables properly

When a variable or resource is used in many places, renaming it manually can cause mistakes.

Android Studio provides a safer option:

```text
Refactor > Rename
```

Shortcut:

```text
Shift + F6
```

This changes the name everywhere it is used in the project.

---

## 2. What is Logcat?

Logcat is the console used to view messages from an Android app while it is running.

It is useful for checking:

- if a function was called
- if a button was clicked
- what value a variable has
- whether something went wrong
- the order in which parts of the app are running

These messages are shown in Android Studio, not on the phone screen.
---

## 3. Importing Log

To use logging, import:

```kotlin
import android.util.Log
```
---

## 4. TAG

A `TAG` is a label used to identify where a log message came from.

Example:

```kotlin
private val TAG = "MainActivity"
```

Then it can be used like this:

```kotlin
Log.d(TAG, "Button clicked")
```

The tag helps filter messages in Logcat.
---

## 5. Log levels

```

| Method | Meaning | Use |
| --- | --- | --- |
| `Log.v()` | Verbose | Very detailed information |
| `Log.d()` | Debug | General debugging |
| `Log.i()` | Information | Normal information |
| `Log.w()` | Warning | Something unusual happened |
| `Log.e()` | Error | Something went wrong |

For normal debugging, `Log.d()` is commonly used.
```

---

## 6. Structure of a log message

```kotlin
Log.d(TAG, "Button clicked")
```

This contains two main parts:

```text
Log.d(TAG, "Button clicked")
      |          |
     Tag       Message
```

- `TAG` identifies where the message came from
- `"Button clicked"` is the message we want to display

---

A function can be created to test the different log levels:

```kotlin
private fun demoLogcat() {
    Log.v(TAG, "Verbose")
    Log.d(TAG, "Debug")
    Log.i(TAG, "Information")
    Log.w(TAG, "Warning")
    Log.e(TAG, "Error")
}
```

It can then be called inside `onCreate()`:

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    demoLogcat()

    setContent {
        // UI code
    }
}
```

When the app starts, the messages will appear in Logcat.


---