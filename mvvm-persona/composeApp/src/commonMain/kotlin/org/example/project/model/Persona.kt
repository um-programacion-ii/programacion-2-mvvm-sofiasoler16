package org.example.project.model

/**
 * Clase de datos que representa a una Persona.
 *
 * Esta clase es inmutable y se utiliza para almacenar información básica de una persona.
 * En el patrón MVVM, esta clase actúa como el modelo de datos que el ViewModel manipula.
 *
 * @property nombre El nombre de la persona. No puede ser nulo o vacío.
 * @property apellido El apellido de la persona. No puede ser nulo o vacío.
 * @property edad La edad de la persona en años. Debe ser un número positivo.
 */
data class Persona(
    val nombre: String,
    val apellido: String,
    val edad: Int
) {
    /**
     * Valida que los datos de la persona sean correctos.
     *
     * @return true si todos los campos son válidos, false en caso contrario.
     */
    fun esValida(): Boolean {
        return nombre.isNotBlank() &&
                apellido.isNotBlank() &&
                edad > 0
    }

    /**
     * Crea una representación en cadena de la persona.
     *
     * @return Una cadena con el formato "Nombre Apellido, Edad años".
     */
    override fun toString(): String {
        return "$nombre $apellido, $edad años"
    }
}