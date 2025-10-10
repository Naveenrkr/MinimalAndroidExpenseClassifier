package com.expense.classifier.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.expense.classifier.data.Expense

@Composable
fun ExpenseCard(expense: Expense, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = expense.description,
                style = MaterialTheme.typography.bodyLarge
            )
            Row {
                Text(
                    text = "Amount: $${expense.amount}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "Category: ${expense.category}",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
            Text(
                text = expense.date,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
