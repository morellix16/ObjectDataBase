import java.sql.Date;

public class Empleado {

    int empNo;
    String apellido,nombre,oficio;
    float salario,comision;
    Date fechaAlta;
    Departamento departamento;

    public Empleado(int empNo, String apellido, String nombre, String oficio, float salario, float comision, Date fechaAlta, Departamento departamento) {
        this.empNo = empNo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.oficio = oficio;
        this.salario = salario;
        this.comision = comision;
        this.fechaAlta = fechaAlta;
        this.departamento = departamento;
    }



    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento depertamento) {
        this.departamento = depertamento;
    }



}
