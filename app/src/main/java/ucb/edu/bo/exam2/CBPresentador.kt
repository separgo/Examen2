package ucb.edu.bo.exam2

import android.content.Context


class CBPresentador(val view: IContract.View, val context: Context): IContract.Presentador {
    override fun addbook(title: String, year: String, url: String) {

        when{
            title.isEmpty()->
                view.showError(context.getString(R.string.create_title_isempty))
            year.isEmpty()->
                view.showErrorYear(R.string.create_year_isempty)
            url.isEmpty()->
                view.showError(context.getString(R.string.create_url_isempty))
            else -> {
                view.showSuccessful(context.getString(R.string.successfull))
                //view.goToLista()
            }
        }



    }

}

