package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase llamada Contacto, que contiene dos atributos:
 * el nombre del contacto y un listado de teléfonos
 * asociados a dicho contacto.
 * @since 2024
 * @author Miguel Angel Solis
 */

class Persona {
    private String name;
    private List<String> phones;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    /**
     * Método Contacto que guarda una serie de datos.
     * @param name El nombre del contacto.
     * @param phone El número del contacto.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Método getName que obtiene el nombre del contacto.
     * @return devuelve el nombre del contacto.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Método getPhones que obtiene el número del contacto.
     * @return devuelve el número del contacto.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}