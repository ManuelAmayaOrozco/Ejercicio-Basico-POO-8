fun main() {
    val libro1 = Libro("Libraco", "Señor random", 666, 8)
    val libro2 = Libro("Librito", "No se xd", 5, 3)

    val conjuntolibros = ConjuntoLibros()
    conjuntolibros.nuevoLibro(libro1)
    conjuntolibros.nuevoLibro(libro2)

    conjuntolibros.eliminarLibroAutor("Señor random")
    conjuntolibros.eliminarLibroNombre("Librito")

    conjuntolibros.nuevoLibro(libro1)

    println(conjuntolibros)
}