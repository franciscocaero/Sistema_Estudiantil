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

        // segunda materia

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

        // tercera materia

        System.out.println("Ingrese el nombre de la tercera materia: ");
        String materia3=miVariable.nextLine();
        miEstudiante.setNomMateria3(materia3);
        System.out.println("Ingrese la nota del primer bimestre de la materia: "+miEstudiante.getNomMateria3());
        nota1=miVariable3.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre de la materia: "+miEstudiante.getNomMateria3());
        nota2=miVariable3.nextDouble();
        notaFinal=(nota1+nota2)/2;
        miEstudiante.setMateria3(notaFinal);
        System.out.println("Nota final de "+miEstudiante.getNomMateria3()+" : "+ miEstudiante.getMateria3());
        System.out.println(miEstudiante.promedio3(miEstudiante.materia3));

        // cuarta materia

        System.out.println("Ingrese el nombre de la cuarta materia: ");
        String materia4=miVariable.nextLine();
        miEstudiante.setNomMateria4(materia4);
        System.out.println("Ingrese la nota del primer bimestre de la materia: "+miEstudiante.getNomMateria4());
        nota1=miVariable3.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre de la materia: "+miEstudiante.getNomMateria4());
        nota2=miVariable3.nextDouble();
        notaFinal=(nota1+nota2)/2;
        miEstudiante.setMateria4(notaFinal);
        System.out.println("Nota final de "+miEstudiante.getNomMateria4()+" : "+ miEstudiante.getMateria4());
        System.out.println(miEstudiante.promedio4(miEstudiante.materia4));

        // quinta materia

        System.out.println("Ingrese el nombre de la quinta materia: ");
        String materia5=miVariable.nextLine();
        miEstudiante.setNomMateria5(materia5);
        System.out.println("Ingrese la nota del primer bimestre de la materia: "+miEstudiante.getNomMateria5());
        nota1=miVariable3.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre de la materia: "+miEstudiante.getNomMateria5());
        nota2=miVariable3.nextDouble();
        notaFinal=(nota1+nota2)/2;
        miEstudiante.setMateria5(notaFinal);
        System.out.println("Nota final de "+miEstudiante.getNomMateria5()+" : "+ miEstudiante.getMateria5());
        System.out.println(miEstudiante.promedio5(miEstudiante.materia5));
        //Estudiante 2
        System.out.println(miEstudiante2.getNombre());
        System.out.println("Ingrese el nombre de la primera materia: ");
        materia1=miVariable.nextLine();
        miEstudiante2.setNomMateria1(materia1);
        System.out.println("Ingrese la nota del primer bimestre de la materia: "+miEstudiante2.getNomMateria1());
        nota1=miVariable2.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre de la materia: "+miEstudiante2.getNomMateria1());
        nota2=miVariable3.nextDouble();
        notaFinal=(nota1+nota2)/2;
        miEstudiante2.setMateria1(notaFinal);
        System.out.println("Nota final de "+miEstudiante2.getNomMateria1()+" : "+ miEstudiante2.getMateria1());
        System.out.println(miEstudiante2.promedio1(miEstudiante2.materia1));
        System.out.println("Ingrese el nombre de la segunda materia: ");
        materia2=miVariable.nextLine();
        miEstudiante2.setNomMateria2(materia2);
        System.out.println("Ingrese la nota del primer bimestre de la materia: "+miEstudiante2.getNomMateria2());
        nota1=miVariable2.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre de la materia: "+miEstudiante2.getNomMateria2());
        nota2=miVariable3.nextDouble();
        notaFinal=(nota1+nota2)/2;
        miEstudiante2.setMateria2(notaFinal);
        System.out.println("Nota final de "+miEstudiante2.getNomMateria2()+" : "+ miEstudiante2.getMateria2());
        System.out.println(miEstudiante2.promedio2(miEstudiante2.materia2));
        System.out.println("Ingrese el nombre de la tercera materia: ");
        materia3=miVariable.nextLine();
        miEstudiante2.setNomMateria3(materia3);
        System.out.println("Ingrese la nota del primer bimestre de la materia: "+miEstudiante2.getNomMateria3());
        nota1=miVariable2.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre de la materia: "+miEstudiante2.getNomMateria3());
        nota2=miVariable3.nextDouble();
        notaFinal=(nota1+nota2)/2;
        miEstudiante2.setMateria3(notaFinal);
        System.out.println("Nota final de "+miEstudiante2.getNomMateria3()+" : "+ miEstudiante2.getMateria3());
        System.out.println(miEstudiante2.promedio3(miEstudiante2.materia3));
        System.out.println("Ingrese el nombre de la cuarta materia: ");
        materia4=miVariable.nextLine();
        miEstudiante2.setNomMateria4(materia4);
        System.out.println("Ingrese la nota del primer bimestre de la materia: "+miEstudiante2.getNomMateria4());
        nota1=miVariable2.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre de la materia: "+miEstudiante2.getNomMateria4());
        nota2=miVariable3.nextDouble();
        notaFinal=(nota1+nota2)/2;
        miEstudiante2.setMateria4(notaFinal);
        System.out.println("Nota final de "+miEstudiante2.getNomMateria4()+" : "+ miEstudiante2.getMateria4());
        System.out.println(miEstudiante2.promedio4(miEstudiante2.materia4));
        System.out.println("Ingrese el nombre de la quinta materia: ");
        materia5=miVariable.nextLine();
        miEstudiante2.setNomMateria5(materia5);
        System.out.println("Ingrese la nota del primer bimestre de la materia: "+miEstudiante2.getNomMateria5());
        nota1=miVariable2.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre de la materia: "+miEstudiante2.getNomMateria5());
        nota2=miVariable3.nextDouble();
        notaFinal=(nota1+nota2)/2;
        miEstudiante2.setMateria5(notaFinal);
        System.out.println("Nota final de "+miEstudiante2.getNomMateria5()+" : "+ miEstudiante2.getMateria5());
        System.out.println(miEstudiante2.promedio5(miEstudiante2.materia5));


    }
}