import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        ODB odb = ODBFactory.open("neodatis.test");
        Date fecha1 = new Date(2015,12,12);
        Departamento rrhh = new Departamento(1,"Recursos Humanos","Avenida Bienvenida");
        Empleado emp1 = new Empleado(1,"Torrus","Javier","Granjero",600, 3.4f,fecha1,rrhh);
    }
}
