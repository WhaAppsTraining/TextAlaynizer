# TextAlaynizer
Membuat String jadi alay

## Belajar cara membuat library sendiri(project library, network library dengan menggunakan jitpack.io)
 * Step 1: Buat project android seperti biasa.
 * Step 2: Buat module library dengan cara: File -> New -> New Module -> Android Library
 * Step 3: Buat semua fungsi/fitur yang dibutuhkan oleh library
 * Step 4: Masuk ke project-level build.gradle dan masukkan dependency 'com.github.dcendents:android-maven-gradle-plugin:x.x', dimana x.x adalah versi dependency-nya. Yang terbaru saat ini adalah 2.0
 ```gradle
buildscript {

      dependencies {
          classpath 'com.android.tools.build:gradle:x.x.x'
          classpath 'com.github.dcendents:android-maven-gradle-plugin:x.x'
```          
 * Step 5: Masuk ke module-level build.gradle untuk library dan masukkan
 ```gradle
  apply plugin: 'com.android.library'
  apply plugin: 'com.github.dcendents.android-maven'
  group='com.github.xxx' // xxx = username github kita

  // kode yang lain

  // ini di bagian paling bawah
  task sourcesJar(type: Jar) {
      from android.sourceSets.main.java.srcDirs
      classifier = 'sources'
  }
  artifacts {
      archives sourcesJar
  }
```
 * Step 6: Upload ke github
 * Step 7: Buat release
 * Step 8: Ke http://jitpack.io dan masukkan url github library kita
