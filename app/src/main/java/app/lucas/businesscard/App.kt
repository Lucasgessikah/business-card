package app.lucas.businesscard

import android.app.Application
import app.lucas.businesscard.data.AppDatabase
import app.lucas.businesscard.data.BusinessCardRepository

class App: Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}