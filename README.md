# BottomAppBar
Example project to show how to handle BottomAppBar


## Usage

- **App level `build.gradle`**
```gradle
dependencies {
    implementation 'com.android.support:design:28.0.0-alpha3'
}
```

## Examples

- Basic

![Image](https://github.com/lucaslima777/BottomAppBar/blob/master/app/img/basic.png?raw=true)
```xml
<android.support.design.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.design.bottomappbar.BottomAppBar
            android:id="@+id/bottom_app_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            app:backgroundTint="@color/colorPrimary"
            app:fabAlignmentMode="center"
            app:fabAttached="true"
            app:navigationIcon="@drawable/back" />


        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/plus"
            app:layout_anchor="@id/bottom_app_bar" />

    </android.support.design.widget.CoordinatorLayout>
```
##
- Duo

![Image](https://github.com/lucaslima777/BottomAppBar/blob/master/app/img/duo.png?raw=true)
```xml
<android.support.design.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.design.bottomappbar.BottomAppBar
            android:id="@+id/bottom_app_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            app:backgroundTint="@color/colorPrimary"
            app:fabAlignmentMode="center"
            app:fabAttached="true"
            app:navigationIcon="@drawable/back" />


        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/plus"
            app:layout_anchor="@id/bottom_app_bar" />

    </android.support.design.widget.CoordinatorLayout>
```

menu
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/settings"
        android:icon="@drawable/settings"
        android:title="@string/action_favorite"
        android:visible="true"
        app:showAsAction="ifRoom"/>

</menu>
```

kotlin
```kotlin
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_1, menu)
        return true
    }
```
##
- Options

![Image](https://github.com/lucaslima777/BottomAppBar/blob/master/app/img/options.png?raw=true)
```xml
<android.support.design.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.design.bottomappbar.BottomAppBar
            android:id="@+id/bottom_app_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            app:backgroundTint="@color/colorPrimary"
            app:fabAlignmentMode="center"
            app:fabAttached="true"
            app:navigationIcon="@drawable/back" />


        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/plus"
            app:layout_anchor="@id/bottom_app_bar" />

    </android.support.design.widget.CoordinatorLayout>
```

menu
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/option_1"
        android:title="Option 1"
        app:showAsAction="never"/>

    <item
        android:id="@+id/option_2"
        android:title="Option 2" />

    <item
        android:id="@+id/option_3"
        android:title="Option 3" />

    <item
        android:id="@+id/option_4"
        android:title="Option 4" />

</menu>
```

kotlin
```kotlin
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_2, menu)
        return true
    }
```
##
- Right

![Image](https://github.com/lucaslima777/BottomAppBar/blob/master/app/img/right.png?raw=true)
```xml
<android.support.design.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.design.bottomappbar.BottomAppBar
            android:id="@+id/bottom_app_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            app:backgroundTint="@color/colorPrimary"
            app:fabAlignmentMode="end"
            app:fabAttached="true"
            app:navigationIcon="@drawable/back" />


        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/plus"
            app:layout_anchor="@id/bottom_app_bar" />

    </android.support.design.widget.CoordinatorLayout>
```
##
- Out

![Image](https://github.com/lucaslima777/BottomAppBar/blob/master/app/img/out.png?raw=true)
```xml
<android.support.design.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.design.bottomappbar.BottomAppBar
            android:id="@+id/bottom_app_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            app:backgroundTint="@color/colorPrimary"
            app:fabAlignmentMode="end"
            app:fabAttached="true"
            app:fabCradleVerticalOffset="60dp"
            app:navigationIcon="@drawable/back" />


        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/plus"
            app:layout_anchor="@id/bottom_app_bar" />

    </android.support.design.widget.CoordinatorLayout>
```
##
- Side

![Image](https://github.com/lucaslima777/BottomAppBar/blob/master/app/img/side.png?raw=true)
```xml
<android.support.design.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.design.bottomappbar.BottomAppBar
            android:id="@+id/bottom_app_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            app:backgroundTint="@color/colorPrimary"
            app:fabAlignmentMode="end"
            app:fabAttached="true"
            app:fabCradleVerticalOffset="20dp"
            app:navigationIcon="@drawable/back" />


        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/plus"
            app:layout_anchor="@id/bottom_app_bar" />

    </android.support.design.widget.CoordinatorLayout>
```
##
- Radius max

![Image](https://github.com/lucaslima777/BottomAppBar/blob/master/app/img/radius%20max.png?raw=true)
```xml
<android.support.design.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.design.bottomappbar.BottomAppBar
            android:id="@+id/bottom_app_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            app:backgroundTint="@color/colorPrimary"
            app:fabAlignmentMode="center"
            app:fabAttached="true"
            app:fabCradleRoundedCornerRadius="100dp"
            app:navigationIcon="@drawable/back" />


        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/plus"
            app:layout_anchor="@id/bottom_app_bar" />

    </android.support.design.widget.CoordinatorLayout>
```
##
- Radius min

![Image](https://github.com/lucaslima777/BottomAppBar/blob/master/app/img/radius%20min.png?raw=true)
```xml
<android.support.design.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.design.bottomappbar.BottomAppBar
            android:id="@+id/bottom_app_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            app:backgroundTint="@color/colorPrimary"
            app:fabAlignmentMode="center"
            app:fabAttached="true"
            app:fabCradleRoundedCornerRadius="0dp"
            app:navigationIcon="@drawable/back" />


        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/plus"
            app:layout_anchor="@id/bottom_app_bar" />

    </android.support.design.widget.CoordinatorLayout>
```
##
- Colored

![Image](https://github.com/lucaslima777/BottomAppBar/blob/master/app/img/colored.png?raw=true)
```xml
<android.support.design.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.design.bottomappbar.BottomAppBar
            android:id="@+id/bottom_app_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            android:backgroundTint="#f12711"
            app:backgroundTint="@color/colorPrimary"
            app:fabAlignmentMode="end"
            app:fabAttached="true" />


        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/back_bottom"
            app:layout_anchor="@id/bottom_app_bar" />

    </android.support.design.widget.CoordinatorLayout>
```

kotlin
```kotlin
    val fab = findViewById(R.id.fab) as FloatingActionButton
    fab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#f5af19")));
```
##
- Padding

![Image](https://github.com/lucaslima777/BottomAppBar/blob/master/app/img/padding.png?raw=true)
```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="10dp">

    <android.support.design.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.design.bottomappbar.BottomAppBar
            android:id="@+id/bottom_app_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            android:backgroundTint="#6A82FB"
            app:backgroundTint="@color/colorPrimary"
            app:fabAlignmentMode="end"
            app:fabAttached="true" />


        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/back_bottom"
            app:layout_anchor="@id/bottom_app_bar" />

    </android.support.design.widget.CoordinatorLayout>

</android.support.constraint.ConstraintLayout>
```
##
- Icon

![Image](https://github.com/lucaslima777/BottomAppBar/blob/master/app/img/icon.png?raw=true)
```xml
<android.support.design.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.design.bottomappbar.BottomAppBar
            android:id="@+id/bottom_app_bar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            android:backgroundTint="#0b8793"
            app:backgroundTint="@color/colorPrimary"
            app:fabAlignmentMode="center"
            app:fabAttached="true"
            app:navigationIcon="@drawable/back" />


        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:elevation="50dp"
            android:src="@drawable/search"
            app:layout_anchor="@id/bottom_app_bar" />

    </android.support.design.widget.CoordinatorLayout>
```

menu
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/email"
        android:icon="@drawable/email"
        android:title="email"
        android:visible="true"
        app:showAsAction="ifRoom"/>

    <item
        android:id="@+id/trash"
        android:icon="@drawable/trash"
        android:title="trashh"
        android:visible="true"
        app:showAsAction="ifRoom"/>

    <item
        android:id="@+id/download"
        android:icon="@drawable/download"
        android:title="download"
        android:visible="true"
        app:showAsAction="ifRoom"/>

</menu>
```

kotlin
```kotlin
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_3, menu)
        return true
    }
```
##

# Developed By

* Lucas Lima 
 * :email: e-mail: lucaslimatorre@gmail.com
 
 [![LinkedIn](https://img.shields.io/badge/LinkedIn-LucasLima-blue.svg)](https://www.linkedin.com/in/lucas-lima-torre/)
 


![GitHub issue age](https://img.shields.io/badge/language-kotlin-blue.svg)

![GitHub issue age](https://img.shields.io/badge/build-design%3A28.0.0--alpha3-red.svg)


 





# License

    Copyright 2018 Lucas Lima

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
