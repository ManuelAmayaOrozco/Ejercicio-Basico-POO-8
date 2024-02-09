class Libro (val titulo: String, val autor: String, val numPaginas: Int, val calificacion: Int) {

    init {
        require(calificacion in 0..10) { "La calificación no puede ser menor que 0 ni mayor que 10." }
        require(numPaginas > 0) { "El número de páginas no puede ser 0 ni negativo." }
    }

    override fun toString(): String {
        return "Título: $titulo, Autor: $autor, Número de páginas: $numPaginas, Calificación: $calificacion"
    }

}