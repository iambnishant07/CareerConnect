# CareerConnect – LinkedIn-Style Job Search App

CareerConnect is an Android application built with **Kotlin, XML, and Material 3**, designed to provide a modern LinkedIn-inspired job search experience. The app demonstrates clean architecture principles, SOLID design, and Android development best practices.

---

## ✨ Features

- **🔐 Login & Authentication**  
  Modern login screen with email validation, remember me option, and password recovery link.

- **💼 Job Feed**  
  Scrollable list of trending job opportunities with company, role, tags, and apply/save buttons.

- **📚 Career Tips & Insights**  
  Curated list of professional growth tips to guide users in career development.

- **👤 Profile Page**  
  Structured profile view with skills, professional experience, and job preferences.

- **⬆️ Top App Bar Actions**  
  Quick access to **Profile** and **Logout** via toolbar icons.

---

## 🛠️ Tech Stack

- **Language**: Kotlin  
- **UI**: XML + Material 3 Components  
- **Architecture**: Repository pattern with SOLID principles  
- **UI Binding**: ViewBinding  
- **Lists**: RecyclerView + Adapters  

---

## 📂 Project Structure

```
app/
 └── src/main/java/com/example/careerconnect/
      ├── HomeActivity.kt
      ├── LoginActivity.kt
      ├── ProfileActivity.kt
      ├── adapters/
      │    ├── JobAdapter.kt
      │    └── TipAdapter.kt
      ├── data/
      │    ├── JobRepository.kt
      │    ├── TipRepository.kt
      │    ├── RepositoryProvider.kt
      │    └── impl/
      │         ├── InMemoryJobRepository.kt
      │         └── InMemoryTipRepository.kt
      └── models/
           ├── Job.kt
           └── Tip.kt
```

---

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/CareerConnect.git
   ```
2. Open the project in **Android Studio (Giraffe/Koala or later)**.  
3. Build and run on **Android Emulator** or a real device (minSdk 24, targetSdk 34).  

---

## 🧩 SOLID Principles in Action

- **SRP** – Activities only handle UI; repositories handle data.  
- **OCP/DIP** – Data layer uses interfaces, so in-memory repositories can easily be swapped for API or DB.  
- **ISP/LSP** – Clean separation of contracts, ensuring replaceable components.  

---

## 📸 Screenshots

_Add your screenshots here (place PNG/JPG files inside `/screenshots` and reference them):_

| Login | Home | Profile |
|-------|------|---------|
| ![Login](screenshots/login.png) | ![Home](screenshots/home.png) | ![Profile](screenshots/profile.png) |

---

## 📜 License

This project is licensed under the **MIT License** – feel free to use, modify, and distribute.  

---

### 💡 Contributions
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
