import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.*;

public class Prueba {
    public static void main(String[] args) throws IOException {


        Auto bmw = new Auto("BMW", "MCZ", "rojo", 32, 25);

        String marca = JOptionPane.showInputDialog("marca: ");
        JOptionPane.showMessageDialog(null, "muy buena marca");


        
        System.out.println("La marca es: " + bmw.getMarca());

        System.out.println("bmw.verdetalle = \n" + bmw.verDetalle());

        System.out.println("bmw.acelerar = " + bmw.acelerar());
        System.out.println("bmw.fremar = " + bmw.frenar(80));
        System.out.println("bmw.capavodadTamque = " + bmw.capacidadTanque(40, 0.7f));
        System.out.println("bmw:capacidadtanque = " + bmw.capacidadTanque(40, 90f) );



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*bmw.setMarca("BMW");
        bmw.setModelo ("i320");
        bmw.setColor("Negro");
        bmw.setCilindraje (3); */
        String var1;
        System.out.print("Modelo: ");
        var1 = br.readLine();
        System.out.println("");
        bmw.setModelo(var1);
        System.out.println("bmw.getModelo () =" + var1);

        int var2;
        System.out.print("Cilindraje : ");
        var2 = Integer.parseInt(br.readLine());
        System.out.println("");
        bmw.setModelo(String.valueOf(String.valueOf(var2)));
        System.out.println("bmw.getCilindraje() = " + var2);

        String var3;
        System.out.println("Color");
        var3 = br.readLine();
        bmw.setColor(var3);
        JOptionPane.showMessageDialog( null, "El color es : " + var3);

        System.out.println("bmw.verdetalle: " + bmw.verDetalle());

    }
}
