# Logger [![](https://jitpack.io/v/kelinZhou/Logger.svg)](https://jitpack.io/#kelinZhou/Logger)

Logger组件，可以区分不同的开发者，使用简单。

### Step 1. Add the JitPack repository to your build file
```gradle
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
  }
}
```

### Step 2. Add the dependency
dependencies {
        implementation 'com.github.kelinZhou:Logger:Tag'
}

### Step 3. Get the developer name in gradle
```gradle
android{
  //... some codes.
  buildTypes{
    release{
      //... some codes.
      buildConfigField 'String', "DEVELOPER_NAME", "\"${System.properties['user.name']}\""  // Get the name of computer.
    }

    debug{
      //... some codes.
      buildConfigField 'String', "DEVELOPER_NAME", "\"${System.properties['user.name']}\""   // Get the name of computer.
    }
  }
}
```

### Step 4. Init The Logger
```kotlin
LogOption.init(BuildConfig.DEVELOPER_NAME, false)
```

### Step 5. Use it
```kotlin
Logger.system(TAG)?.i("This is a log.")
```
