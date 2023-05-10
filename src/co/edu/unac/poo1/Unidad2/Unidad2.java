package co.edu.unac.poo1.Unidad2;

import co.edu.unac.poo1.clientes.Cliente;
import co.edu.unac.poo1.clientes.Nacionalidad;
import co.edu.unac.poo1.relojes.RelojPulso;
import co.edu.unac.poo1.relojes.Smartwhach;

import java.time.LocalDate;
import java.util.*;

public class Unidad2 {

    public static void MenuParaColombianos() {
        Cliente cliente1 = new Cliente(null, null, null, Nacionalidad.COLOMBIANO);

        String nombre;
        if (cliente1.getNacionalidad() == Nacionalidad.COLOMBIANO) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Porfavor completa los siguientes datos ");
            System.out.println("Ingrese su nombre");
            cliente1.setNombreCompleto(scanner.nextLine());
            System.out.println("porfavor ingrese su cedula  ");
            cliente1.setNumeroDeCedula(scanner.nextLine());

            System.out.println("Bienevenido a la tienda de relojeria ");
            System.out.println("Porfavor digite su nacionalidad ");
            System.out.println("1. colombiano \n 2. frances \n 3. peruano \n 4.Aregntino \n 5. Aleman ");
            System.out.println("usuario:   \n   " + cliente1.getNombreCompleto() + " id:  \n   " + cliente1.getNumeroDeCedula() + "  Nacionalidad  " + cliente1.getNacionalidad());
            carritocompra();
        }
    }




    private static List<RelojPulso> obtenerListaRelojes() {

        RelojPulso relojPulso1 = new RelojPulso("113b", " smartwhach CASIO", 130F, LocalDate.MAX, "cuero", 185F);
        RelojPulso relojPulso2 = new RelojPulso("167b", " smartwhach Q&Q", 200F, LocalDate.MAX, "acero", 185F);
        RelojPulso relojPulso3 = new RelojPulso("154b", " smartwhach Rolex", 430F, LocalDate.MAX, "oro", 185F);
        RelojPulso relojPulso4 = new RelojPulso("11b", " smartwhach Invicta", 710F, LocalDate.MAX, "platino", 185F);
        RelojPulso relojPulso5 = new RelojPulso("23b", " smartwhach Nautica", 980F, LocalDate.MAX, "titanio", 185F);

        List<RelojPulso> listaRelojs = new ArrayList<>();
        listaRelojs.add(relojPulso1);
        listaRelojs.add(relojPulso2);
        listaRelojs.add(relojPulso3);
        listaRelojs.add(relojPulso4);
        listaRelojs.add(relojPulso5);

        return listaRelojs;

    }


    private static List<Smartwhach> obtenerListaSmartwhach() {

        Smartwhach smartwhach1 = new Smartwhach("134b", " reloj casio", 145F, LocalDate.MAX, "cuero", 156F, 1.4, "XiaomiCol");
        Smartwhach smartwhach2 = new Smartwhach("204b", " reloj Q&Q", 200F, LocalDate.MAX, "cuero", 156F, 1.4, "XiaomiCol");
        Smartwhach smartwhach3 = new Smartwhach("454b", "reloj Rolex", 185F, LocalDate.MAX, "cuero", 156F, 1.4, "XiaomiCol");
        Smartwhach smartwhach4 = new Smartwhach("35b", " reloj Invicta", 130F, LocalDate.MAX, "cuero", 156F, 1.4, "XiaomiCol");
        Smartwhach smartwhach5 = new Smartwhach("78b", " reloj Nautica", 156F, LocalDate.MAX, "cuero", 156F, 1.4, "XiaomiCol");

        List<Smartwhach> listaSmartwhach = new ArrayList<>();
        listaSmartwhach.add(smartwhach1);
        listaSmartwhach.add(smartwhach2);
        listaSmartwhach.add(smartwhach3);
        listaSmartwhach.add(smartwhach4);
        listaSmartwhach.add(smartwhach5);

        return listaSmartwhach;

    }

    public static void verMenuRelojes(List<RelojPulso> listaRelojPulso ){
        listaRelojPulso.sort(Comparator.comparing(RelojPulso ::getNuemeroSerial).reversed());
        for (int i = 0; i < listaRelojPulso.size(); i++) {
            System.out.println((i + 1) + "---" );
            System.out.println("serie " + listaRelojPulso.get(i).getNuemeroSerial() );
            System.out.println("costo " + listaRelojPulso.get(i).getPrecio() );
            System.out.println("marca " + listaRelojPulso.get(i).getMarca() );

        }

    }
    public static void VermenuSmartwhachs (List<Smartwhach> listaSmartwhach ){
        listaSmartwhach.sort(Comparator.comparing(RelojPulso ::getNuemeroSerial).reversed());
        for (int i = 0; i < listaSmartwhach.size(); i++) {
            System.out.println((i + 6) + "---" );
            System.out.println("serie " + listaSmartwhach.get(i).getNuemeroSerial() );
            System.out.println("costo " + listaSmartwhach.get(i).getPrecio() );
            System.out.println("marca " + listaSmartwhach.get(i).getMarca() );

        }

    }

    public static void carritocompra(){
        Float ValorCarrito = 0F;
        int OpcionMenu = 1;
        Scanner scanner = new Scanner(System.in);

        List<RelojPulso> List1RelojPulso = obtenerListaRelojes();
        List<Smartwhach> List1Smartwhach = obtenerListaSmartwhach();

        System.out.println("Escoge el reloj que deseas comprar, cuando finalices tu compre digita el numero 0");
        do{
            verMenuRelojes(List1RelojPulso);
            VermenuSmartwhachs(List1Smartwhach);
            OpcionMenu = scanner.nextInt();

            if(OpcionMenu >= 1 && OpcionMenu <= 5) {
                ValorCarrito += List1RelojPulso.get(OpcionMenu -1 ).getPrecioPulso();
            }
            if (OpcionMenu >= 6 && OpcionMenu <= 10){
                ValorCarrito += List1Smartwhach.get(OpcionMenu -6).getPrecio();

            }
            if (OpcionMenu == 0){
                System.out.println("Haz finalizado tu compra ");
            }else {
                System.out.println("Costo total de su compra " + ValorCarrito);
            }
        }while (OpcionMenu != 0);

        System.out.println("Costo total de su compra : " + ValorCarrito);

    }

    public static void EjercicioDos(){

    }

}

