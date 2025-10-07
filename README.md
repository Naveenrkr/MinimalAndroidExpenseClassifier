# MinimalAndroidExpenseClassifier

Offline Android app to read bank statements and use AI to classify expenses into categories like food, bills, OTT platforms, etc.

## 📋 Table of Contents
- [Features](#features)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Features Breakdown](#features-breakdown)
- [Technologies](#technologies)
- [Contributing](#contributing)
- [License](#license)

## ✨ Features

- 📱 **Offline First**: All processing happens locally on device
- 🤖 **AI-Powered Classification**: Intelligent expense categorization using on-device ML
- 📄 **Bank Statement Reading**: Parse PDF/text bank statements
- 📊 **Category Management**: Organize expenses into customizable categories
- 🔒 **Privacy Focused**: No data leaves your device
- 💾 **Local Storage**: Secure local database for expense history

## 📁 Project Structure

```
MinimalAndroidExpenseClassifier/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/expense/classifier/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── data/          # Data models and repositories
│   │   │   │   ├── di/            # Dependency injection
│   │   │   │   └── utils/         # Utility classes
│   │   │   ├── res/               # Resources (layouts, drawables, etc.)
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── models/
│   ├── expense_classifier.tflite   # TensorFlow Lite model
│   ├── model_info.json             # Model metadata
│   └── README.md                    # Model documentation
├── ai/
│   ├── training/                    # Training scripts and notebooks
│   ├── preprocessing/               # Data preprocessing utilities
│   └── README.md                    # AI module documentation
├── readers/
│   ├── PDFReader.kt                 # PDF parsing logic
│   ├── TextReader.kt                # Text extraction utilities
│   ├── StatementParser.kt           # Bank statement parser
│   └── README.md                    # Reader documentation
├── ui/
│   ├── screens/
│   │   ├── home/                    # Home screen composables
│   │   ├── classification/          # Classification UI
│   │   ├── history/                 # Expense history
│   │   └── settings/                # Settings screen
│   ├── components/                  # Reusable UI components
│   ├── theme/                       # App theming
│   └── README.md                    # UI documentation
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── README.md
```

## 🚀 Setup Instructions

### Prerequisites
- **Android Studio**: Iguana (2023.2.1) or later
- **JDK**: 17 or higher
- **Android SDK**: API 24 (Android 7.0) minimum, API 34+ recommended
- **Gradle**: 8.0+

### Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/Naveenrkr/MinimalAndroidExpenseClassifier.git
   cd MinimalAndroidExpenseClassifier
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select `File > Open`
   - Navigate to the cloned repository
   - Wait for Gradle sync to complete

3. **Configure the project**
   - Ensure you have the required SDK versions installed
   - Sync project with Gradle files
   - Build the project to download dependencies

4. **Add ML Model**
   - Place your TensorFlow Lite model in `models/` directory
   - Update `model_info.json` with model specifications

5. **Run the app**
   - Connect an Android device or start an emulator
   - Click `Run` or press `Shift + F10`

### Project Configuration

```gradle
android {
    compileSdk = 34
    defaultConfig {
        minSdk = 24
        targetSdk = 34
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}
```

## 🔧 Features Breakdown

### 1. Statement Reading (`readers/`)
- PDF bank statement parsing
- Text extraction from various formats
- Transaction data normalization
- Multi-bank format support

### 2. AI Classification (`ai/` & `models/`)
- On-device TensorFlow Lite inference
- Pre-trained expense categorization model
- Category confidence scores
- Custom category training support

### 3. User Interface (`ui/`)
- Material Design 3 implementation
- Jetpack Compose UI
- Dark/Light theme support
- Intuitive navigation

### 4. Data Management (`app/data/`)
- Room database for local storage
- Repository pattern implementation
- Transaction history tracking
- Category management

### 5. Core Features
- **Import**: Upload bank statements (PDF/TXT)
- **Parse**: Extract transaction data automatically
- **Classify**: AI-powered expense categorization
- **Review**: Manual correction and confirmation
- **Analyze**: View spending patterns and insights

## 🛠 Technologies

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM + Clean Architecture
- **DI**: Hilt/Dagger
- **Database**: Room
- **ML Framework**: TensorFlow Lite
- **PDF Processing**: Apache PDFBox / iText
- **Build System**: Gradle (Kotlin DSL)

## 🤝 Contributing

We welcome contributions! Here's how you can help:

### How to Contribute

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Make your changes**
   - Follow Kotlin coding conventions
   - Add tests for new features
   - Update documentation as needed
4. **Commit your changes**
   ```bash
   git commit -m "Add: Brief description of your changes"
   ```
5. **Push to your fork**
   ```bash
   git push origin feature/your-feature-name
   ```
6. **Create a Pull Request**

### Contribution Guidelines

- **Code Style**: Follow [Kotlin coding conventions](https://kotlinlang.org/docs/coding-conventions.html)
- **Commits**: Use clear, descriptive commit messages
- **Testing**: Add unit tests for new functionality
- **Documentation**: Update README and inline documentation
- **Issues**: Check existing issues before creating new ones

### Areas for Contribution

- 🐛 Bug fixes and issue resolution
- ✨ New features and enhancements
- 📝 Documentation improvements
- 🧪 Test coverage expansion
- 🌐 Multi-language support
- 🏦 Additional bank format support
- 🤖 ML model improvements

### Code of Conduct

Please be respectful and constructive in all interactions. We're building an inclusive community.

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 📧 Contact

For questions or suggestions, please open an issue on GitHub.

---

**Note**: This is an open-source project under active development. Features and structure may evolve.
