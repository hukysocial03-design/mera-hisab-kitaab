package com.merahisabkitab.pro.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "transactions")
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val amount: Double,
    val type: TransactionType, // INCOME, EXPENSE, LENT, BORROWED, REPAYMENT_RECEIVED, REPAYMENT_MADE, TRANSFER
    val categoryId: Int,
    val date: Long = System.currentTimeMillis(),
    val notes: String? = null,
    val accountId: Int, // e.g., Cash, Bank, Wallet
    val relatedPersonId: Int? = null, // For Debts
    val isRecurring: Boolean = false
)

enum class TransactionType {
    INCOME, EXPENSE, LENT, BORROWED, REPAYMENT_RECEIVED, REPAYMENT_MADE, TRANSFER
}
