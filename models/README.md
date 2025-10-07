# Models Directory

This directory contains the machine learning models for expense classification.

## Contents

- **expense_classifier.tflite** - TensorFlow Lite model for on-device expense categorization
- **model_info.json** - Model metadata including version, input/output specifications, and category labels

## Model Information

The expense classifier model uses Natural Language Processing to categorize transaction descriptions into expense categories.

### Categories

- Food & Dining
- Transportation
- Utilities & Bills
- OTT Platforms & Entertainment
- Shopping
- Healthcare
- Education
- Others

## Usage

Place your trained TensorFlow Lite model file (`.tflite`) in this directory and update the `model_info.json` file with the model specifications.

## Model Training

For information on training custom models, see the `ai/` directory.
