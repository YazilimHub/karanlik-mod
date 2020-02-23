# Karanlık Mod Yapımı





### Yüklenişi:
Repoların sonuna jitpack ekleyin

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
2.Adım:
Repo kodunu ekleyin

	dependencies {
	        compile 'com.github.Mahfa:DayNightSwitch:1.2'
	}
## Kullanımı:
Xml Dosyasına şu kodları ekleyin

    <com.mahfa.dnswitch.DayNightSwitch
        android:id="@+id/day_night_switch"
        android:layout_width="76dp"
        android:layout_height="40dp"
        android:layout_gravity="center"/>
	
	
