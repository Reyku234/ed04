package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Esta clase llamada Agenda, contiene una lista de contactos y métodos
 * para añadir nuevos contactos, eliminar contactos existentes dentro
 * de la lista de contactos y modificar el número de teléfono de un contacto concreto.
 *
 * @since 2024
 * @author Miguel Angel Solis
 */
public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método para añadir un contacto.
     * @param name
     * @param phone
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método para eliminar un contacto.
     * @param name
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Método para modificar un numero de telefono.
     * @param name
     * @param oldPhone
     * @param newPhone
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Método getName que obtiene el contacto.
     * @return devuelve el contacto.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}