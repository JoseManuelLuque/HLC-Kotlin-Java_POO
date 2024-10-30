package Kotlin

data class Anime(
    val nombre: String,
    val episodios: Int,
    val genero: String
) {
    override fun toString(): String {
        return "El Anime se llama $nombre tiene $episodios episodios y es de género $genero"
    }
}