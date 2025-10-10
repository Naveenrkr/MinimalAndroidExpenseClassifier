package com.expense.classifier.readers

import java.io.InputStream

class TextReader {

    fun extractText(inputStream: InputStream): String {
        return inputStream.bufferedReader().use { it.readText() }
    }
}
