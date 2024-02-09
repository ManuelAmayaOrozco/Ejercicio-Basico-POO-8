import kotlin.math.max

class ConjuntoLibros() {


    val listaLibros = arrayOfNulls<Libro>(LIMITE_LIBROS)
    var numeroDeConjuntos = 0

    fun nuevoLibro(libro: Libro) {
        if (LIMITE_LIBROS != numeroDeConjuntos) {
            listaLibros[numeroDeConjuntos] = libro
            numeroDeConjuntos++
        }
    }

    fun eliminarLibroNombre(titulo: String) {
        val libro = listaLibros.find{ it?.titulo == titulo }
        val pos = listaLibros.indexOf(libro)
        listaLibros[pos] = null
    }

    fun eliminarLibroAutor(autor: String) {
        val libro = listaLibros.find{ it?.autor == autor }
        val pos = listaLibros.indexOf(libro)
        listaLibros[pos] = null
    }

    fun mayorCalificacion() {
        var max = 0
        var maxLibro: Libro? = null
        for (libro in listaLibros) {
            if (libro != null) {
                if (libro.calificacion > max) {
                    max = libro.calificacion
                    maxLibro = libro
                }
            }
        }
        println("El libro con mayor calificación es $maxLibro")
    }

    fun menorCalificacion() {
        var min = 10
        var minLibro: Libro? = null
        for (libro in listaLibros) {
            if (libro != null) {
                if (libro.calificacion < min) {
                    min = libro.calificacion
                    minLibro = libro
                }
            }
        }
        println("El libro con menor calificación es $minLibro")
    }

    override fun toString(): String {
        var listring = ""
        for (libro in listaLibros) {
            listring += "$libro\n"
        }
        return listring
    }

    companion object {
        const val LIMITE_LIBROS = 5
    }
}