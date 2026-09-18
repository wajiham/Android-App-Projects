# Android Project Structure - Basic Notes

Before working on an Android app, it helps to know where the main files are and what they are used for.

## 1. AndroidManifest.xml

Location:

```text
app/manifests/AndroidManifest.xml
```

The manifest contains basic information about the app. It is also where we declare permissions that the app needs. For example:

- Camera
- Microphone
- GPS / location
- Body sensors

---

## 2. kotlin+java

Location:

```text
app/kotlin+java/
```

This is where the main **source code** of the application is stored.

For a Kotlin project, files such as `MainActivity.kt` are found here. `MainActivity` is usually one of the first classes that runs when the app is opened.

There may also be a `ui.theme` folder. It contains files related to the appearance of the app, such as its theme and colors.


---

## 3. res

Location:

```text
app/res/
```

`res` stands for **resources**. This folder contains things used by the app that are not the main Kotlin code.

Some important folders inside it are:

### drawable

```text
app/res/drawable/
```

Used for visual resources such as:

- Images
- Icons
- Shapes
- Backgrounds

Android can also use different drawable folders for different screen densities (resolutions), for example `hdpi`, `mdpi`, and `xhdpi`.

### values

```text
app/res/values/
```

Used for reusable values such as:

- Strings
- Colors
- Themes
- Dimensions

For example, instead of writing the app name everywhere, it can be stored as a string resource.

```xml
<string name="app_name">My App</string>
```

---

## 4. Gradle Scripts

Gradle is the build system used by the Android project.

It tells Android Studio how the project should be built. It is also where things such as dependencies and Android API settings are defined.

When we press **Run**, Gradle helps compile the code and resources into an Android application.

---

## Basic Project View

```text
app/
├── manifests/
│   └── AndroidManifest.xml
│
├── kotlin+java/
│   ├── MainActivity.kt
│   └── ui.theme/
│
└── res/
    ├── drawable/
    └── values/

Gradle Scripts/
```

