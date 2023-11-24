import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Estudiantes miEstudiante;
        Estudiantes miEstudiante2;
        Estudiantes miEstudiante3;
        miEstudiante=new Estudiantes("Francisco",36541);
        miEstudiante2=new Estudiantes("Juan",12345);
        miEstudiante3=new Estudiantes("Marta",87541);
        Scanner miVariable=new Scanner(System.in);
        Scanner miVariable2=new Scanner(System.in);
        Scanner miVariable3=new Scanner(System.in);
        System.out.println(miEstudiante.getNombre());
        System.out.println("Ingrese el nombre de la primera materia: ");
        String materia1=miVariable.nextLine();
        miEstudiante.setNomMateria1(materia1);
        System.out.println("Ingrese la nota del primer bimestre de la materia: "+miEstudiante.getNomMateria1());
        double nota1=miVariable2.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre de la materia: "+miEstudiante.getNomMateria1());
        double nota2=miVariable3.nextDouble();
        double notaFinal=(nota1+nota2)/2;
        miEstudiante.setMateria1(notaFinal);
        System.out.println("Nota final de "+miEstudiante.getNomMateria1()+" : "+ miEstudiante.getMateria1());
        System.out.println(miEstudiante.promedio1(miEstudiante.materia1));
        System.out.println("Ingrese el nombre de la segunda materia: ");
        String materia2=miVariable.nextLine();
        miEstudiante.setNomMateria2(materia2);
        System.out.println("Ingrese la nota del primer bimestre de la materia: "+miEstudiante.getNomMateria2());
        nota1=miVariable2.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre de la materia: "+miEstudiante.getNomMateria2());
        nota2=miVariable3.nextDouble();
        notaFinal=(nota1+nota2)/2;
        miEstudiante.setMateria2(notaFinal);
        System.out.println("Nota final de "+miEstudiante.getNomMateria2()+" : "+ miEstudiante.getMateria2());
        System.out.println(miEstudiante.promedio2(miEstudiante.materia2));

    }
}