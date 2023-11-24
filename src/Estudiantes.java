public class Estudiantes {
    public String nombre;
    public int id;
    public String nomMateria1;
    public double materia1;
    public String nomMateria2;
    public double materia2;
    public String nomMateria3;
    public double materia3;
    public String nomMateria4;
    public double materia4;
    public String nomMateria5;
    public double materia5;
    public Estudiantes(String nuevoNombre, int nuevoId){
        nombre=nuevoNombre;
        id=nuevoId;
    }
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
    public String getNomMateria1() {
        return nomMateria1;
    }
    public double getMateria1() {
        return materia1;
    }
    public String getNomMateria2() {
        return nomMateria2;
    }
    public double getMateria2() {
        return materia2;
    }
    public String getNomMateria3() {
        return nomMateria3;
    }
    public double getMateria3() {
        return materia3;
    }
    public String getNomMateria4() {
        return nomMateria4;
    }
    public double getMateria4() {
        return materia4;
    }
    public String getNomMateria5() {
        return nomMateria5;
    }
    public double getMateria5() {
        return materia5;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }


    public void setId(int newId) {
        this.id = newId;
    }

    public void setNomMateria1(String newNomMateria1) {
        this.nomMateria1 = newNomMateria1;
    }

    public void setMateria1(double newMateria1) {
        this.materia1 = newMateria1;
    }

    public void setNomMateria2(String newNomMateria2) {
        this.nomMateria2 = newNomMateria2;
    }

    public void setMateria2(double newMateria2) {
        this.materia2 = newMateria2;
    }

    public void setNomMateria3(String newNomMateria3) {
        this.nomMateria3 = newNomMateria3;
    }

    public void setMateria3(double newMateria3) {
        this.materia3 = newMateria3;
    }

    public void setNomMateria4(String newNomMateria4) {
        this.nomMateria4 = newNomMateria4;
    }

    public void setMateria4(double newMateria4) {
        this.materia4 = newMateria4;
    }

    public void setNomMateria5(String newNomMateria5) {
        this.nomMateria5 = newNomMateria5;
    }

    public void setMateria5(double newMateria5) {
        this.materia5 = newMateria5;
    }
    public String promedio1(double materia1){
        if (materia1<14){
            return "Supletorio";
        }else {
            return"Pasaste";
        }
    }
    public String promedio2(double materia2){
        if (materia2<14){
            return "Supletorio";
        }else {
            return"Pasaste";
        }
    }
    public String promedio3(double materia3){
        if (materia3<14){
            return "Supletorio";
        }else {
            return"Pasaste";
        }
    }
    public String promedio4(double materia4){
        if (materia4<14){
            return "Supletorio";
        }else {
            return"Pasaste";
        }
    }
    public String promedio5(double materia5){
        if (materia5<14){
            return "Supletorio";
        }else {
            return"Pasaste";
        }
    }
}
