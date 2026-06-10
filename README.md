
# ShaktiSetu

> **Developed by Akanksha** — Empowering safety, one tap at a time.

ShaktiSetu is an Android safety application focused on emergency response and personal security. It provides fast SOS activation, emergency contact workflows, live location sharing, and safety utilities like fake calls and evidence capture.

---

## ✨ Key Features

- 🆘 **One-tap SOS flow** with countdown and PIN-based dismiss
- 📍 **Emergency SMS alerts** with live OpenStreetMap location links
- 🔥 **Live SOS status sync** to Firebase Firestore
- 📸 **Automatic evidence capture** (photo + audio) during SOS
- 👥 **Emergency contacts management** using local Room database
- 📞 **Fake call simulation** for unsafe situations
- 🚨 **Quick emergency dialing** — Police, Ambulance & Women Helpline
- 🔔 **Push notifications** using Firebase Cloud Messaging
- 🔐 **Authentication** with Email/Password and Google Sign-In

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Kotlin |
| UI | Jetpack Compose + ViewBinding (Hybrid) |
| Architecture | AndroidX Lifecycle |
| Local Storage | Room Database |
| Backend | Firebase Auth, Firestore, Storage, FCM |
| Location & Maps | Google Play Services, osmdroid (OpenStreetMap) |
| Camera / Media | CameraX, MediaRecorder |
| Build System | Gradle (Kotlin DSL) |

---

## 📋 Requirements

- Android Studio (latest stable)
- Android SDK: `compileSdk = 35`, `minSdk = 29`, `targetSdk = 35`
- JDK 21
- Firebase project configured for Android

---

## 🚀 Project Setup

1. **Clone the repository** and open in Android Studio
2. **Firebase Setup**
   - Create or choose a Firebase project
   - Register Android app with package name: `com.example.shaktisetu`
   - Place `google-services.json` inside the `/app` directory
3. **Maps Configuration**
   - Add your Google Maps API key in `AndroidManifest.xml`
4. **Sync Gradle** from Android Studio
5. **Run on a real device** (recommended for SMS, calls, location & camera)

---

## 🔧 Build & Run

```bash
./gradlew assembleDebug
```

Or run directly from Android Studio using the **Run** button.

### Useful Gradle Commands

```bash
./gradlew test          # Run unit tests
./gradlew lint          # Run lint checks
./gradlew assembleDebug # Build debug APK
```

---

## 🔑 Permissions Used

| Permission | Purpose |
|---|---|
| Internet / Network | Firebase & location sync |
| Fine & Coarse Location | Live location sharing |
| SMS & Phone Calls | Emergency alerts & dialing |
| Camera & Audio | Evidence capture during SOS |
| Notifications | Push alerts via FCM |
| Vibration | SOS feedback |

> Grant all runtime permissions for full emergency functionality.

---

## ⚠️ Important Notes

- This app is **safety-critical** — test all emergency flows carefully before production use
- SMS, call, location, and background features work best on **physical devices**
- Review Firebase security rules before any public release

---

## 📦 Package Name

`com.example.shaktisetu`

---

## 👩‍💻 Developer

**Akanksha** — Built with purpose, passion, and care for women's safety.

---

*ShaktiSetu — Bridging the gap between danger and safety.*
