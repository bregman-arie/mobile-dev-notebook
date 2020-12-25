## Known Issues



### Unable to import from main_activity

Add the following lines in build.gradle (the modules file) right after the plugins section:

```
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'
```

