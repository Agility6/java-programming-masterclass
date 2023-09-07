package polymorphism;

public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws"); // 向上转型
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws"); // 向下转型
        jaws.watchAdventure();

        // 编译器只知道 comedy 是一个 Object 类型的引用
        Object comedy = Movie.getMovie("C", "Airplane");

        // 需要在进行向下转型
        Comedy comedyMovie = (Comedy) comedy;

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");

        Object unknowObject = Movie.getMovie("S", "Star Wars");
        if (unknowObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknowObject;
            c.watchComedy();
        } else if (unknowObject instanceof Adventure) {
            ((Adventure) unknowObject).watchAdventure();
        } else if (unknowObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
