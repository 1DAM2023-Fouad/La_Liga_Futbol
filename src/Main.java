import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Crear presidente
        Presidente presidente = new Presidente();
        presidente.setDni("12462963-R");
        presidente.setNombre("Paul");
        presidente.setApellidos("Gasol desel");
        presidente.setProfesion("Administrativo");

        //Crear entrenador
        Entrenador entrenador = new Entrenador();
        entrenador.setDni("21649220-J");
        entrenador.setNombre("Faustino");
        entrenador.setApellidos("Garrido Jimenez");
        entrenador.setAñoNacimiento("19/05/1976");

        //Crear jugadores
        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Felipe");
        jugador1.setApellidos("Garzón");
        jugador1.setNumCamiseta("07");

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Michel");
        jugador2.setApellidos("Francis");
        jugador2.setNumCamiseta("21");

        // juador3, jugador4....

        //Array List de jugadores
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        Equipo.setJugadores(jugadores);
        // El Array list también podría ir debajo del objeto equipo

        //Crear partido
        Partido partido = new Partido();
        partido.setCodigoPartido("#438");
        partido.setFechaPartido("29/11/2023");
        partido.setEquipoLocal(partido.getEquipoLocal());
        partido.setEquipoVisitante(partido.getEquipoVisitante());


        //Crear equipo
        Equipo equipo = new Equipo();
        equipo.setCodigoEquipo("#4547");
        equipo.setNombreEquipo("FC Avila");
        equipo.setTelefono("9987463");
        equipo.setDireccion("Hervenias Bajas");
        equipo.setPresidente(presidente);
        equipo.setEntrenador(entrenador);


        System.out.println("Busqueda de un equipo a través de su código: " + equipo.getCodigoEquipo());
        System.out.println("");
        System.out.println("DATOS DEL EQUIPO");
        imprimir(equipo);
    }

    public static void imprimir(Equipo equipo) {
        System.out.println("Código del equipo: " + equipo.getCodigoEquipo());
        System.out.println("Nombre del equipo: " + equipo.getNombreEquipo());
        System.out.println("Teléfono: " + equipo.getTelefono());
        System.out.println("Presidente: " + equipo.getPresidente());
        System.out.println("Entrendador: " + equipo.getEntrenador());
        System.out.println("Jugador: " + equipo.getJugadores());
    }

}