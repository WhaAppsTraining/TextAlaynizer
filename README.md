# TextAlaynizer
Membuat String jadi alay

Contoh:
 * text -> t3xt
 * saya anak alay -> 54y4 4n4k 4l4y

## Cara pakai
Tambahkan kode di bawah pada project-level build.gradle
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Tambahkan dependency pada app-level build.gradle
```gradle
dependencies {
		implementation 'com.github.User:Repo:Tag'
	}
 ```
 Bikin String jadi alay!
 ```java
String textBiasa = "Saya orang ganteng, tapi alay!";
String textAlay = AlayHelper.alaynize(textBiasa);
 ```

## Bagian dari bahan pembelajaran untuk http://whaapps.com/
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
