package ucb.edu.bo.exam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create_book.*

class CreateBook : AppCompatActivity(), IContract.View {
    lateinit var presenter: IContract.Presentador
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_book)

        presenter = CBPresentador(this, applicationContext)

        AddBtn.setOnClickListener{
            presenter.addbook(editTextTitle.text.toString(), editTextYear.text.toString(), editTextURL.text.toString())
        }

    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()

    }

    override fun showErrorURL(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()

    }

    override fun showSuccessful(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()

        }

    override fun showErrorYear(message: Int) {
        editTextYear.error = getString(message)
    }

    //override fun goToLista() {
    //    startActivity(Intent(this, listaLibros::class.java))
    //}
}
