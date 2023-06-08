package Ist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContenedorUs {
    private List<Iasesoria> asesorias;

    public ContenedorUs() {
        asesorias = new ArrayList<>();
    }

    public void almacenarCliente() {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();

        cliente.setTipo(1);
        String run;
        do {
            System.out.println("Ingrese run del cliente sin puntos y con guión:");
            run = entrada.nextLine().trim();

            if (Validador.validaRun(run)) {
                cliente.setRun(run);
            } else {
                System.out.println("Rut inválido. Intente nuevamente.");
            }
        } while (!Validador.validaRun(run));


        String nombres;
        do {
            System.out.println("Ingrese nombres del Cliente");
            nombres = entrada.nextLine().trim();

            if (nombres.isEmpty()) {
                System.out.println("El nombre es obligatorio. Por favor, ingrese un dato válido.");
            } else if (nombres.length() < 5 || nombres.length() > 30) {
                System.out.println("El nombre debe tener entre 5 y 30 caracteres. Por favor, ingrese un dato válido.");
            }
        } while (nombres.isEmpty() || nombres.length() < 5 || nombres.length() > 30);

        cliente.setNombres(nombres);

        String apellidos;
        do {
            System.out.println("Ingrese apellidos del cliente");
            apellidos = entrada.nextLine().trim();

            if (apellidos.isEmpty()) {
                System.out.println("El apellido es obligatorio. Por favor, ingrese un dato válido.");
            } else if (apellidos.length() < 5 || apellidos.length() > 30) {
                System.out.println("El apellido debe tener entre 5 y 30 caracteres. Por favor, ingrese un dato válido.");
            }
        } while (apellidos.isEmpty() || apellidos.length() < 5 || apellidos.length() > 30);

        cliente.setApellidos(apellidos);

        String fecha;
        do {
            System.out.println("Ingrese fecha de naciemiento del cliente");
            fecha = entrada.nextLine().trim();

            if (fecha.isEmpty()) {
                System.out.println("La fecha es obligatoria. Por favor, " +
                        "ingrese una fecha válida.");
            }
        } while (fecha.isEmpty());
        cliente.setFechaNac(fecha);


        String telefono;
        do {
            System.out.println("Ingrese telefono del cliente");
            telefono = entrada.nextLine().trim();

            if (telefono.isEmpty()) {
                System.out.println("El telefono es obligatorio. Por favor, ingrese un dato válido.");
            }
        } while (telefono.isEmpty());

        cliente.setTelefono(telefono);

        String afp;
        do {
            System.out.println("Ingrese AFP del cliente");
            afp = entrada.nextLine().trim();

            if (afp.isEmpty()) {
                System.out.println("La AFP es obligatoria. Por favor, ingrese un dato válido.");
            } else if (afp.length() < 4 || afp.length() > 30) {
                System.out.println("La AFP debe tener entre 4 y 30 caracteres. Por favor, ingrese un dato válido.");
            }
        } while (afp.isEmpty() || afp.length() < 4 || afp.length() > 30);

        cliente.setAfp(afp);



        int salud;
        do {
            System.out.println("Ingrese sistema de salud 1. Fonasa / 2. Isapre");
            salud = entrada.nextInt();

            if (salud != 1 && salud != 2) {
                System.out.println("Debe ingrese opción salud 1. Fonasa / 2. Isapre");
            }
        } while (salud != 1 && salud != 2);

        cliente.setSistemaSalud(salud);

        entrada.nextLine();

        String direccion;
        do {
            System.out.println("Ingrese direccion del cliente");
            direccion = entrada.nextLine().trim();

          if (direccion.length() > 70) {
                System.out.println("La dirección no debe ser mayor a 70 caracteres");
            }
        } while (direccion.length() > 70);

        cliente.setDireccion(direccion);


        String comuna;
        do {
            System.out.println("Ingrese comuna del cliente");
            comuna = entrada.nextLine().trim();

            if (comuna.length() > 50) {
                System.out.println("La comuna no debe ser mayor a 50 caracteres");
            }
        } while (comuna.length() > 70);

        cliente.setComuna(comuna);

        int edad;
        do {
            System.out.println("Ingrese edad del cliente");
            edad = entrada.nextInt();

            if (edad < 0  || edad > 150) {
                System.out.println("La edad es obligatoria y debe ser entre 0 y 150 años");

            }
        } while (edad < 0  || edad > 150);

        cliente.setEdad(edad);

        asesorias.add(cliente);
    }

    public void almacenarProfesional(){
        Scanner entrada = new Scanner(System.in);
        Profesional profesional = new Profesional();

        profesional.setTipo(2);

        String run;
        do {
            System.out.println("Ingrese run del profesional sin puntos y con guión:");
            run = entrada.nextLine().trim();

            if (Validador.validaRun(run)) {
                profesional.setRun(run);
            } else {
                System.out.println("Rut inválido. Intente nuevamente.");
            }
        } while (!Validador.validaRun(run));

        String nombres;
        do {
            System.out.println("Ingrese nombres del profesional");
            nombres = entrada.nextLine().trim();

            if (nombres.isEmpty()) {
                System.out.println("El nombre es obligatorio. Por favor, ingrese un valor válido.");
            } else if (nombres.length() < 5 || nombres.length() > 30) {
                System.out.println("El nombre debe tener entre 5 y 30 caracteres. Por favor, ingrese un valor válido.");
            }
        } while (nombres.isEmpty() || nombres.length() < 5 || nombres.length() > 30);

        profesional.setNombres(nombres);


        String apellidos;
        do {
            System.out.println("Ingrese apellidos del profesional");
            apellidos = entrada.nextLine().trim();

            if (apellidos.isEmpty()) {
                System.out.println("El apellido es obligatorio. Por favor, " +
                        "ingrese un valor válido.");
            } else if (apellidos.length() < 5 || apellidos.length() > 30) {
                System.out.println("El apellido debe tener entre 5 y 30 caracteres. " +
                        "Por favor, ingrese un valor válido.");
            }
        } while (apellidos.isEmpty() || apellidos.length() < 5 || apellidos.length() > 30);
        profesional.setApellidos(apellidos);


        String fecha;
        do {
            System.out.println("Ingrese fecha de naciemiento del profesional");
            fecha = entrada.nextLine().trim();

            if (fecha.isEmpty()) {
                System.out.println("La fecha es obligatorio. Por favor, " +
                        "ingrese una fecha válida.");
            }
        } while (fecha.isEmpty());
        profesional.setFechaNac(fecha);


        String titulo;
        do {
            System.out.println("Ingrese título del profesional");
            titulo = entrada.nextLine().trim();

            if (titulo.isEmpty()) {
                System.out.println("El titulo es obligatorio. Por favor, " +
                        "ingrese un dato válido.");
            }
        } while (titulo.isEmpty());
        profesional.setTitulo(titulo);


        String fechaIngreso;
        do {
            System.out.println("Ingrese fecha de ingreso del profesional");
            fechaIngreso = entrada.nextLine().trim();

            if (fechaIngreso.isEmpty()) {
                System.out.println("La fecha de ingreso es obligatorio. Por favor, " +
                        "ingrese una fecha válida.");
            }
        } while (fechaIngreso.isEmpty());
        profesional.setFechaNac(fechaIngreso);
        asesorias.add(profesional);
    }

    public void almacenarAdministrativo(){
        Scanner entrada = new Scanner(System.in);
        Administrativo administrativo = new Administrativo();

        administrativo.setTipo(3);

        String run;
        do {
            System.out.println("Ingrese run del administrativo sin puntos y con guión:");
            run = entrada.nextLine().trim();

            if (Validador.validaRun(run)) {
                administrativo.setRun(run);
            } else {
                System.out.println("Rut inválido. Intente nuevamente.");
            }
        } while (!Validador.validaRun(run));


        String nombres;
        do {
            System.out.println("Ingrese nombres del administrativo");
            nombres = entrada.nextLine().trim();

            if (nombres.isEmpty()) {
                System.out.println("El nombre es obligatorio. Por favor, ingrese un valor válido.");
            } else if (nombres.length() < 5 || nombres.length() > 30) {
                System.out.println("El nombre debe tener entre 5 y 30 caracteres. Por favor, ingrese un dato válido.");
            }
        } while (nombres.isEmpty() || nombres.length() < 5 || nombres.length() > 30);

        administrativo.setNombres(nombres);

        String apellidos;
        do {
            System.out.println("Ingrese apellidos del administrativo");
            apellidos = entrada.nextLine().trim();

            if (apellidos.isEmpty()) {
                System.out.println("El apellido es obligatorio. Por favor, " +
                        "ingrese un dato válido.");
            } else if (apellidos.length() < 5 || apellidos.length() > 30) {
                System.out.println("El apellido debe tener entre 5 y 30 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }
        } while (apellidos.isEmpty() || apellidos.length() < 5 || apellidos.length() > 30);
        administrativo.setApellidos(apellidos);

        String fecha;
        do {
            System.out.println("Ingrese fecha de naciemiento del administrativo");
            fecha = entrada.nextLine().trim();

            if (fecha.isEmpty()) {
                System.out.println("La fecha es obligatorio. Por favor, " +
                        "ingrese una fecha válida.");
            }
        } while (fecha.isEmpty());
        administrativo.setFechaNac(fecha);

        String area;
        do {
            System.out.println("Ingrese area para el administrativo");
            area = entrada.nextLine().trim();

            if (area.isEmpty()) {
                System.out.println("El area es obligatoria. Por favor, " +
                        "ingrese un dato válido.");
            } else if (area.length() < 5 || area.length() > 20) {
                System.out.println("El area debe tener entre 5 y 20 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }
        } while (area.isEmpty() || area.length() < 5 || area.length() > 20);
        administrativo.setArea(area);

        String experiencia;
        do {
            System.out.println("Ingrese experiencia del administrativo");
            experiencia = entrada.nextLine().trim();

            if (experiencia.isEmpty()) {
                System.out.println("La experiencis es obligatoria. Por favor, " +
                        "ingrese experiencia válida.");
            }else if (experiencia.length() > 100) {
                System.out.println("La experiencia no  debe sobrepasar los 100 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }

        } while (experiencia.isEmpty() || experiencia.length() > 100);

        administrativo.setArea(experiencia);

        asesorias.add(administrativo);

    }


    public void eliminarUsuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese run de usuario a eliminar");
        String run = entrada.nextLine();

        for (Iasesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {

                Usuario usuario = (Usuario) asesoria;

                if ((usuario.getRun().equals(run))) {
                    asesorias.remove(asesoria);
                    System.out.println("Eliminado de la lista de usuarios");
                    break;
                }
            }
        }
    }

    public void listarUsuarioTipo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese perfil a listar: 1. Cliente / 2.Profesional / 3.Administrativo");
        int tipo = entrada.nextInt();

        for (Iasesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                if (usuario.getTipo() == tipo) {
                    usuario.analizarUsuario();
                }
            }
        }

    }


    public void listarUsuarios() {
        for (Iasesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                usuario.analizarUsuario();
            }
        }
    }





}
