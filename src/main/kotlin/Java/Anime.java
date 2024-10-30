package Java;

class Anime {
    private String nombre;
    private int episodios;
    private String genero;

    public Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Kotlin.Java.Anime{" +
                "nombre='" + nombre + '\'' +
                ", episodios=" + episodios +
                ", genero='" + genero + '\'' +
                '}';
    }
}
