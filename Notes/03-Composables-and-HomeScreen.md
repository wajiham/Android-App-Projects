# Composables and the UI Added to the App

---

# 1. What is a Composable?

In Jetpack Compose, the user interface is built using Kotlin functions called **composables**. A composable is a function that describes something that should appear on the screen.

Example:

```kotlin
@Composable
fun Greeting() {
    Text("Hello")
}
```

Here:

- `@Composable` tells Android that this function creates UI
- `Greeting()` is the composable function
- `Text("Hello")` displays text on the screen

---

# 2. Visible composables and layout composables

Some composables are directly visible to the user.

Examples:

```kotlin
Text(...)
Image(...)
Button(...)
```

Other composables are mainly used to organize the visible elements.

Examples:

```kotlin
Column(...)
Row(...)
Box(...)
```

These are called layout composables. They are containers that control where their child composables are placed.

---

## Column

A `Column` places its children vertically.

Example:

```kotlin
Column {
    Text("One")
    Text("Two")
    Text("Three")
}
```

The result is:

```text
One
Two
Three
```

So, Column = vertical arrangement

---

## Row

A `Row` places its children horizontally.

Example:

```kotlin
Row {
    Text("One")
    Text("Two")
}
```

The result is:

```text
One   Two
```

So, Row = horizontal arrangement

---

## Box

A `Box` can place composables on top of each other.

So, Box = layered layout

---

# 3. Composable hierarchy

A Compose UI is usually made by putting composables inside other composables.

For example:

```kotlin
Column {
    Image(...)
    Text(...)
}
```

This creates a hierarchy:

```text
Column
├── Image
└── Text
```

The `Column` controls the layout, while `Image` and `Text` are the visible elements. This is important because Android screens are usually built by combining many small composables together.

# 5. Set Content
---
Inside `MainActivity`, the app contains:

```kotlin
setContent {
    Sports_TrackerTheme {
        ...
        HomeScreen()
    }
}
```

`setContent` is where the Compose UI begins.

By calling:

```kotlin
HomeScreen()
```

So the flow is:

```text
MainActivity
    ↓
setContent
    ↓
Sports_TrackerTheme
    ↓
HomeScreen
    ↓
Surface
    ↓
Column
    ↓
Image + Text
```

---

# 20. Why use `Sports_TrackerTheme`?

```kotlin
Sports_TrackerTheme {
    HomeScreen()
}
```

The theme wraps the composable so that the screen can use the colors and styles defined for the app.

That is also why this line works:

```kotlin
MaterialTheme.colorScheme.background
```

The `MaterialTheme` gets its values from the theme that surrounds the screen.

---

# 4. Preview

```kotlin
@Preview
@Composable
fun HomeScreenPreview() {
    Sports_TrackerTheme {
        HomeScreen()
    }
}
```

The preview is not part of the actual app screen.

It is only used inside Android Studio.

`@Preview` lets us see what `HomeScreen` looks like without installing and running the app every time.

We call:

```kotlin
HomeScreen()
```

inside the preview because that is the UI we want Android Studio to display.

We also wrap it in:

```kotlin
Sports_TrackerTheme {
```

so that the preview uses the same theme as the real app.

---

