package ucb.edu.bo.exam2


interface IContract {
    interface View{
        fun showError(message: String)
        fun showSuccessful(message: String)
        fun showErrorYear(message: Int)
        fun showErrorURL(message: String)
        //fun goToLista()

    }
    interface Presentador {
        fun addbook(title: String, year: String, URL: String)
    }
}