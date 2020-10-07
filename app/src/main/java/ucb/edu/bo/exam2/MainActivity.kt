package ucb.edu.bo.exam2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar.let {
            it?.setDisplayHomeAsUpEnabled(true)
            it?.setDisplayShowHomeEnabled(true)}
        GlobalScope.launch {
            val bookDao = AppRoomDatabase.getDatabase(applicationContext).bookDato()
            val repository = BookRepository(bookDao)
            repository.insert((Book("Rey Blanco", "2020", "https://www.casadellibro.com/libro-rey-blanco/9788466668545/11627801")))
            repository.insert((Book("The girl with the dragon tattoo", "2010", "https://www.goodreads.com/book/show/2429135.The_Girl_with_the_Dragon_Tattoo")))

            val lista =repository.getListBooks()
            lista.forEach {
                Log.d("DBTEST", "Id book = ${it.id}, Title = ${it.title}")
            }
        }


    }
}
