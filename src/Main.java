
// Clase abstracta Vehiculo
        abstract class Vehiculo {
        abstract void arrancar();
    }
// Interfaz para vehículos eléctricos
    interface Electrico {
        void cargarBateria();
    }

// Interfaz para vehículos de gasolina
    interface Combustible {
        void llenarTanque();
    }

// Clase para carros eléctricos
    class CarroElectrico extends Vehiculo implements Electrico {
        @Override
        void arrancar() {
            System.out.println("El carro eléctrico enciende silenciosamente.");
        }

        @Override
        public void cargarBateria() {
            System.out.println("Conectando el carro eléctrico a la estación de carga.");
        }
    }

// Clase para carros a gasolina
    class CarroGasolina extends Vehiculo implements Combustible {
        @Override
        void arrancar() {
            System.out.println("El carro a gasolina arranca con un rugido del motor.");
        }

        @Override
        public void llenarTanque() {
            System.out.println("Llenando el tanque con gasolina.");
        }
    }

// Clase principal con el main
    public class Main {
        public static void main(String[] args) {
            CarroElectrico tesla = new CarroElectrico();
            CarroGasolina mustang = new CarroGasolina();

            // métodos de cada vehículo
            tesla.arrancar();
            tesla.cargarBateria();

            System.out.println("----------------------");
            mustang.arrancar();
            mustang.llenarTanque();
        }
    }
