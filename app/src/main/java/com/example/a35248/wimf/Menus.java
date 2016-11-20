package com.example.a35248.wimf;

/**
 * Created by 35248 on 19/11/2016.
 */
public class Menus {

        private int ID;
        private String Establecimiento;
        private String Comida;
        private Double Precio;
        private String Imagen;

        public String getEstablecimiento() {
            return Establecimiento;
        }

        public void setEstablecimiento(String establecimiento) {
            Establecimiento = establecimiento;
        }

        public String getComida() {
            return Comida;
        }

        public void setComida(String comida) {
            Comida = comida;
        }


        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public Double getPrecio() {
            return Precio;
        }

        public void setPrecio(Double precio) {
            Precio = precio;
        }

        public String getImagen() {
            return Imagen;
        }

        public void setImagen(String imagen) {
            Imagen = imagen;
        }

}
