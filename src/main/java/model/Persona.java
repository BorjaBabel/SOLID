package model;

public abstract class Persona {
    private int idPersona;
    private String name;
    //Habria que poner mas datos, pero para este ejemplo básico me los ahorro


    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
