public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); //instancia de clase
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        System.out.println("Mi pelicula es: " + miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "The Matrix";
        otraPelicula.fechaDeLanzamiento =  1998;
        otraPelicula.duracionEnMinutos = 180;

        System.out.println("Mi otra pelicula es: " + otraPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
    }
}
