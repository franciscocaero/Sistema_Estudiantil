import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Estudiantes> estudiantesList = new ArrayList<>();
        Estudiantes miEstudiante1;
        Estudiantes miEstudiante2;
        Estudiantes miEstudiante3;
        Estudiantes miEstudiante4;
        Estudiantes miEstudiante5;
        Estudiantes miEstudiante6;
        Estudiantes miEstudiante7;
        Estudiantes miEstudiante8;
        Estudiantes miEstudiante9;
        Estudiantes miEstudiante10;
        miEstudiante1=new Estudiantes("Francisco",36541);
        miEstudiante2=new Estudiantes("Juan",12345);
        miEstudiante3=new Estudiantes("Marta",87541);
        miEstudiante4=new Estudiantes("Raul",54126);
        miEstudiante5=new Estudiantes("Luis",45718);
        miEstudiante6=new Estudiantes("Sofia",78541);
        miEstudiante7=new Estudiantes("Manuel",78451);
        miEstudiante8=new Estudiantes("Ana",14598);
        miEstudiante9=new Estudiantes("Roberto",12784);
        miEstudiante10=new Estudiantes("Cristiano",32178);
        estudiantesList.add(miEstudiante1);
        estudiantesList.add(miEstudiante2);
        estudiantesList.add(miEstudiante3);
        estudiantesList.add(miEstudiante4);
        estudiantesList.add(miEstudiante5);
        estudiantesList.add(miEstudiante6);
        estudiantesList.add(miEstudiante7);
        estudiantesList.add(miEstudiante8);
        estudiantesList.add(miEstudiante9);
        estudiantesList.add(miEstudiante10);
        Scanner miVariable = new Scanner(System.in);
        Scanner miVariable2 = new Scanner(System.in);
        Scanner miVariable3 = new Scanner(System.in);
        for (Estudiantes estudiante : estudiantesList) {
            System.out.println("\n*Estudiante: "+estudiante.getNombre()+"  *ID: "+estudiante.getId());
            System.out.println("\nIngrese el nombre de la primera materia: ");
            String materia1=miVariable.nextLine();
            estudiante.setNomMateria1(materia1);
            System.out.println("Ingrese la nota del primer bimestre de la materia: "+estudiante.getNomMateria1());
            double nota1=miVariable2.nextDouble();
            System.out.println("Ingrese la nota del segundo bimestre de la materia: "+estudiante.getNomMateria1());
            double nota2=miVariable3.nextDouble();
            double notaFinal=(nota1+nota2)/2;
            estudiante.setMateria1(notaFinal);
            System.out.println("Nota final de "+estudiante.getNomMateria1()+" : "+ estudiante.getMateria1());
            System.out.println(estudiante.promedio1(estudiante.materia1));
            // Segunda materia
            System.out.println("Ingrese el nombre de la segunda materia: ");
            String materia2=miVariable.nextLine();
            estudiante.setNomMateria2(materia2);
            System.out.println("Ingrese la nota del primer bimestre de la materia: "+estudiante.getNomMateria2());
            nota1=miVariable2.nextDouble();
            System.out.println("Ingrese la nota del segundo bimestre de la materia: "+estudiante.getNomMateria2());
            nota2=miVariable3.nextDouble();
            notaFinal=(nota1+nota2)/2;
            estudiante.setMateria2(notaFinal);
            System.out.println("Nota final de "+estudiante.getNomMateria2()+" : "+ estudiante.getMateria2());
            System.out.println(estudiante.promedio2(estudiante.materia2));
            // Tercera materia
            System.out.println("Ingrese el nombre de la tercera materia: ");
            String materia3=miVariable.nextLine();
            estudiante.setNomMateria3(materia3);
            System.out.println("Ingrese la nota del primer bimestre de la materia: "+estudiante.getNomMateria3());
            nota1=miVariable2.nextDouble();
            System.out.println("Ingrese la nota del segundo bimestre de la materia: "+estudiante.getNomMateria3());
            nota2=miVariable3.nextDouble();
            notaFinal=(nota1+nota2)/2;
            estudiante.setMateria3(notaFinal);
            System.out.println("Nota final de "+estudiante.getNomMateria3()+" : "+ estudiante.getMateria3());
            System.out.println(estudiante.promedio3(estudiante.materia3));
            // Cuarta materia
            System.out.println("Ingrese el nombre de la cuarta materia: ");
            String materia4=miVariable.nextLine();
            estudiante.setNomMateria4(materia4);
            System.out.println("Ingrese la nota del primer bimestre de la materia: "+estudiante.getNomMateria4());
            nota1=miVariable2.nextDouble();
            System.out.println("Ingrese la nota del segundo bimestre de la materia: "+estudiante.getNomMateria4());
            nota2=miVariable3.nextDouble();
            notaFinal=(nota1+nota2)/2;
            estudiante.setMateria4(notaFinal);
            System.out.println("Nota final de "+estudiante.getNomMateria4()+" : "+ estudiante.getMateria4());
            System.out.println(estudiante.promedio4(estudiante.materia4));
            // Quinta materia
            System.out.println("Ingrese el nombre de la quinta materia: ");
            String materia5=miVariable.nextLine();
            estudiante.setNomMateria5(materia5);
            System.out.println("Ingrese la nota del primer bimestre de la materia: "+estudiante.getNomMateria5());
            nota1=miVariable2.nextDouble();
            System.out.println("Ingrese la nota del segundo bimestre de la materia: "+estudiante.getNomMateria5());
            nota2=miVariable3.nextDouble();
            notaFinal=(nota1+nota2)/2;
            estudiante.setMateria5(notaFinal);
            System.out.println("Nota final de "+estudiante.getNomMateria5()+" : "+ estudiante.getMateria5());
            System.out.println(estudiante.promedio5(estudiante.materia5));
        }
    }
}
