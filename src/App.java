
import Controllers.PersonaController;
import Models.Persona;

public class App {
        public static void main(String[] args) throws Exception {
                Persona[] personas = {
                                new Persona("Anais", 25),
                                new Persona("Luis", 32),
                                new Persona("Carlos", 40),
                                new Persona("María", 19),
                                new Persona("José", 45),
                                new Persona("Laura", 30),
                                new Persona("Pedro", 28),
                                new Persona("Marta", 35),
                                new Persona("Jorge", 50),
                                new Persona("Sofía", 22),
                                new Persona("Raúl", 18),
                                new Persona("Patricia", 29),
                                new Persona("Andrés", 41),
                                new Persona("Elena", 24),
                                new Persona("Manuel", 38),
                                new Persona("Isabel", 34),
                                new Persona("Gabriel", 42),
                                new Persona("Claudia", 26),
                                new Persona("Fernando", 31),
                                new Persona("Paula", 20),
                                new Persona("Diego", 36),
                                new Persona("Rosa", 27),
                                new Persona("Rubén", 44),
                                new Persona("Teresa", 33),
                                new Persona("Iván", 17),
                                new Persona("Julia", 21),
                                new Persona("Adriana", 39),
                                new Persona("Sergio", 48),
                                new Persona("Lorena", 23),
                                new Persona("Miguel", 52)
                };

                /// TODOS los métodos deben ser implementados en la clase PersonaController
                // Crear una instancia de la clase PersonaController y llamar a los métodos
                // NO usar metodos estaticos

                // 1 - Implementar un método para ordenar las personas por edad en orden
                // desecendente tipo selección

                // 1.2 - Buscar a la persona con las sigueintes edaddes en el arreglo de
                // personas ya ordenarod por edad
                // - 25
                // - 70

                // 2 - Implementar un método para ordenar las personas por su nombre en orden
                // ascendente tipo inserción

                // 2.2 - Buscar a la persona con los sigueintes nombres en el arreglo de
                // personas ya ordenarod por nombre
                // - "Anais"
                // - "Miguel"

                // Imprimir:
                // el arreglo ordenado para cada punto 1 y 2
                // Si encontró a la persona en el arreglo de personas los datos de dicha persona
                // y su posición
                // Si no encontró a la persona en el arreglo de personas


                PersonaController controller = new PersonaController();

                controller.ordenarPorEdadAscendente(personas);
                System.out.println("Personas ordenadas por edad (descendente):");
                controller.imprimirArreglo(personas);



                int[] edadBuscada = {25,70};
                for (int edad : edadBuscada) {
                        Persona encontradaPorEdad = controller.buscarPorEdad(personas, edad);
                        System.out.println(encontradaPorEdad != null ?
                        "Encontrado: " + encontradaPorEdad.getNombre() + " - " + encontradaPorEdad.getEdad() :
                        "No se encontró una persona con la edad " + edad);
                }

                controller.ordenarPorNombreAscendente(personas);
                System.out.println("\nPersonas ordenadas por nombre (ascendente):");
                controller.imprimirArreglo(personas);


                String[] nombreBuscado ={"Anais","Miguel"};
                for (String nombre : nombreBuscado) {
                        Persona encontradaPorNombre = controller.buscarPorNombre(personas, nombre);
                        System.out.println(encontradaPorNombre != null ?
                        "Encontrado: " + encontradaPorNombre.getNombre() + " - " + encontradaPorNombre.getEdad() :
                        "No se encontró una persona con el nombre " + nombre);
                }





        }
}