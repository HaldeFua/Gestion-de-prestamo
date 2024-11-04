package view;

public abstract class Vista {

    public static String inicio(){
        return "Seleccionar una opción:\n"
                +"1 Registrarse\n" +
                "2 Iniciar sesión\n" +
                "3 Salir";
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
