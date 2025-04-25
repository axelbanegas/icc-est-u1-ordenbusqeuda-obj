import controllers.PersonaController;
import models.Persona;
import models.Direccion;
import views.ViewConsole;

public class App {
    public static void main(String[] args) {
    
            
        
           
        Persona[] personas = new Persona[5];

        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5",56,89));
        

        PersonaController controller = new PersonaController();
        ViewConsole view = new ViewConsole();
        Persona pA = new Persona();

        controller.sortByDireccionCodigo(personas);
        view.printArray(personas);

        controller.sortByDireccionCodigo(personas);
        view.printArray(personas);

        Persona pB = controller.findPersonByCodigoDireccion(personas, 56);
        (pB != null) ? System.out.println("Persona encontrada: " + pA.getNombre()) : System.out.println("No se encontró la persona con el código 56");

        
    }
}