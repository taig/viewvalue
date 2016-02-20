# ViewValue
Android View API helper

## Dependencies

**Support for basic widgets** (such as `TextView`)

````scala
"io.taig.android.viewvalue" %% "core" % "1.2.0-SNAPSHOT"
````

**Support for design library widgets** (such as `TextInputLayout`)

````scala
"io.taig.android.viewvalue" %% "design" % "1.2.0-SNAPSHOT"
````

## Usage

````scala
import android.widget.TextView
import io.taig.android.viewvalue.implicits._

val tv: TextView = new TextView( context )

val c1 = tv.value[String]
val c2 = tv.value[Option[String]]

tv.value = "foo"
tv.value = Some( "foo" )
tv.value = None

tv.error = Some( "my error message" )
tv.error = "my error message"
tv.error = None
````

## Supported widgets

### Core

 - `CompoundButton`  
 **Injection & Extraction** → `Boolean` (Checked state)
 - `ImageView`  
 **Injection & Extraction** → `Drawable`  
 **Injection** → `Bitmap`, `Int`, `Uri`
 - `RadioGroup`  
 **Injection & Extraction** → `Int`, `Option[Int]` (Selected item id)
 - `TextView`  
 **Injection & Extraction** → `String`, `Option[String]` (Text value)  
 **Injection** → `Int` (Resource id)

### Design

 - `TextInputLayout`  
 **Injection & Extraction** → `String`, `Option[String]` (Text value)  
 **Injection** → `Int` (Resource id)