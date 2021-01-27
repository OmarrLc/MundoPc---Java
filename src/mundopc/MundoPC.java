
package mundopc;

import com.mundopc.*;


public class MundoPC {
    public static void main(String[] args) {
       Monitor monitorHP  = new Monitor ("HP", 13 );
       Teclado tecladoHP = new Teclado ("Bluetooth", "HP");
       Raton ratonHP = new Raton("Bluetooth", "HP");
       Computadora computadoraHP = new Computadora ("Computadora HP", monitorHP, ratonHP, tecladoHP);
       
       Monitor monitorDell  = new Monitor ("Dell", 15 );
       Teclado tecladoDell = new Teclado ("Bluetooth", "Dell");
       Raton ratonDell = new Raton("Bluetooth", "Dell");
       Computadora computadoraDell = new Computadora ("Computadora HP", monitorDell, ratonDell, tecladoDell);
       
       Computadora computadoraMixta = new Computadora ("Computadora Mixta", monitorDell, ratonHP, tecladoHP);
       
       Orden orden1 = new Orden();
       orden1.agregarComputadora(computadoraHP);
       orden1.agregarComputadora(computadoraHP);
       orden1.agregarComputadora(computadoraHP);
       orden1.agregarComputadora(computadoraHP);
       orden1.agregarComputadora(computadoraHP);
       
        Orden orden2 = new Orden();
       orden2.agregarComputadora(computadoraHP);
       orden2.agregarComputadora(computadoraMixta);
        orden2.agregarComputadora(computadoraMixta);
       
       orden1.mostrarOrden();
       orden2.mostrarOrden();
    }
}
