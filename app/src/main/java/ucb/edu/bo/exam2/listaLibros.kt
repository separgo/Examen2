package ucb.edu.bo.exam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_lista_libros.*

class listaLibros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_libros)
        val list = arrayListOf<Book>()
        list.add(Book("Rey Blanco", "2020", "https://www.casadellibro.com/libro-rey-blanco/9788466668545/11627801"))
        list.add(Book("The girl with the dragon tattoo", "2010", "https://www.goodreads.com/book/show/2429135.The_Girl_with_the_Dragon_Tattoo"))

        recicleviewBook.adapter = BookListAdapter(list, applicationContext)
        val linearLayoutManager = LinearLayoutManager(applicationContext)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recicleviewBook.layoutManager = linearLayoutManager
    }

    //override fun goToAdd() {
       // startActivity(Intent(this, CreateBook::class.java))}

    //override fun onCreate(savedInstanceState: Bundle?) {
    //    super.onCreate(savedInstanceState)
    //    setContentView(R.layout.activity_main)
//
  //      val picasso = Picasso.get()
    //    picasso.load(
      //      Book.URL)
        //    .into(my_image_view)

    //}

}