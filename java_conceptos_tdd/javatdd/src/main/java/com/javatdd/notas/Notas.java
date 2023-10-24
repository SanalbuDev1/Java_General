package com.javatdd.notas;

import java.util.function.Predicate;

/**
 * Clase que representa una nota de una asignatura.
 */
public class Notas {
    private double valor;
    private String asignatura;

    /**
     * Constructor de la clase Notas.
     * 
     * @param valor      Valor de la nota.
     * @param asignatura Asignatura a la que pertenece la nota.
     */
    public Notas(double valor, String asignatura) {
        this.valor = valor;
        this.asignatura = asignatura;
    }

    /**
     * Método que indica si dos notas tienen la misma asignatura.
     * 
     * @param otraNota Otra nota a comparar.
     * @return true si ambas notas tienen la misma asignatura, false en caso
     *         contrario.
     */
    public boolean esMismaAsignatura(Notas otraNota) {
        return this.asignatura.equals(otraNota.getAsignatura());
    }

    /**
     * Método que indica si la asignatura de una nota cumple con una condición dada.
     * 
     * @param funcNotas Función que representa la condición a cumplir.
     * @param otraNota  Otra nota a comparar.
     * @return true si la asignatura de la otra nota cumple con la condición, false
     *         en caso contrario.
     */
    public static boolean esMismaAsignaturaFunc(Predicate<String> funcNotas, Notas otraNota) {
        boolean esMisma = funcNotas.test(otraNota.getAsignatura());
        return esMisma == true ? true : false;
    }

    /**
     * Método que indica si la nota actual es mayor que otra nota dada.
     * 
     * @param otraNota Otra nota a comparar.
     * @return true si la nota actual es mayor que la otra nota, false en caso
     *         contrario.
     */
    public boolean esMayor(Notas otraNota) {
        return this.valor > otraNota.getValor();
    }

    /**
     * Método que sobrescribe el método hashCode para poder comparar objetos de la
     * clase Notas correctamente.
     * 
     * @return El hash code del objeto.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(valor);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((asignatura == null) ? 0 : asignatura.hashCode());
        return result;
    }

    /**
     * Método que sobrescribe el método equals para poder comparar objetos de la
     * clase Notas correctamente.
     * 
     * @param obj Objeto a comparar.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notas other = (Notas) obj;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        if (asignatura == null) {
            if (other.asignatura != null)
                return false;
        } else if (!asignatura.equals(other.asignatura))
            return false;
        return true;
    }

    /**
     * Método getter para el atributo valor.
     * 
     * @return El valor de la nota.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Método setter para el atributo valor.
     * 
     * @param valor El nuevo valor de la nota.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Método getter para el atributo asignatura.
     * 
     * @return La asignatura de la nota.
     */
    public String getAsignatura() {
        return asignatura;
    }

    /**
     * Método setter para el atributo asignatura.
     * 
     * @param asignatura La nueva asignatura de la nota.
     */
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

}
