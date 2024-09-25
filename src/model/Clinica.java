package model;

public class Clinica {
    public static class Paciente {
        // Atributos
        private String nombre;
        private String correo;
        private String telefono;
        private String direccion;
        private String fechaNacimiento;
        private String horarioCita;
        private String motivoVisita;
        private int numeroConsultas;
        private String doctor;

        // Constructor
        public Paciente(String nombre, String correo, String telefono, String direccion, String fechaNacimiento,
                        String horarioCita, String motivoVisita, int numeroConsultas, String doctor) {
            this.nombre = nombre;
            this.correo = correo;
            this.telefono = telefono;
            this.direccion = direccion;
            this.fechaNacimiento = fechaNacimiento;
            this.horarioCita = horarioCita;
            this.motivoVisita = motivoVisita;
            this.numeroConsultas = numeroConsultas;
            this.doctor = doctor;
        }

        @Override
        public String toString() {
            return "Paciente{" +
                    "nombre='" + nombre + '\'' +
                    ", correo='" + correo + '\'' +
                    ", telefono='" + telefono + '\'' +
                    ", direccion='" + direccion + '\'' +
                    ", fechaNacimiento='" + fechaNacimiento + '\'' +
                    ", horarioCita='" + horarioCita + '\'' +
                    ", motivoVisita='" + motivoVisita + '\'' +
                    ", numeroConsultas=" + numeroConsultas +
                    ", doctor='" + doctor + '\'' +
                    '}';
        }
    }
}
