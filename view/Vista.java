package view;

public abstract class Vista {

    public static String principal(){
        return "BIENVENIDO, SELECCIONE UNA OPCIÓN:" +
                "\n1. Estudiante de ingeniería" +
                "\n2. Estudiante de diseño" +
                "\n3. Imprimir inventario total" +
                "\n4. Salir del programa";
    }

    public static String inicio(){
        return "Seleccionar una opción:\n"
                +"1 Registrarse\n" +
                "2 Iniciar sesión\n" +
                "3 Volver";
    }

    public static String tipoEstudiante(){
        return "Seleccionar una opción:\n" +
                "1 Estudiante Ingeniería\n" +
                "2 Estudiante Diseño\n" +
                "3 Volver";
    }

    public static String menuIngenieria(String nombreUsuario){
        return "\n---- BIENVENIDO " + nombreUsuario + " ----\n" +
                "1. Registrar préstamo de equipo\n" +
                "2. Modificar préstamo de equipo (por serial o cédula)\n" +
                "3. Devolución de equipo (por serial o cédula)\n" +
                "4. Buscar equipo (por serial o cédula)\n" +
                "5. Cerrar sesión";
    }

    public static String menuDisenio(String nombreUsuario){
        return "\n---- BIENVENIDO " + nombreUsuario + "----\n" +
                "1. Registrar préstamo de equipo" +
                "2. Modificar préstamo de equipo (por serial o cédula)" +
                "3. Devolución de equipo (por serial o cédula)" +
                "4. Buscar equipo (por serial o cédula)" +
                "5. Cerrar sesión";
    }

}
