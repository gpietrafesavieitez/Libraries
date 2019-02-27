/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package utilidades;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PedirDatos {
    static Scanner sc = new Scanner(System.in);
    
    public static String tipoString(String msg){
        System.out.println(msg);
        return sc.next();
    }
    
    public static String tipoString(boolean interfaz,String msg){
        if(interfaz){
            return JOptionPane.showInputDialog(msg);
        }
        System.out.println(msg);
        return sc.next();
    }
    
    public static int tipoInt(String msg){
        System.out.println(msg);
        return sc.nextInt();
    }
    
    public static int tipoInt(boolean interfaz,String msg){
        if(interfaz){
            return Integer.parseInt(JOptionPane.showInputDialog(msg));
        }
        System.out.println(msg);
        return sc.nextInt();
    }
    
    public static float tipoFloat(String msg){
        System.out.println(msg);
        return sc.nextFloat();
    }
    
    public static float tipoFloat(boolean interfaz,String msg){
        if(interfaz){
            return Float.parseFloat(JOptionPane.showInputDialog(msg));
        }
        System.out.println(msg);
        return sc.nextFloat();
    }
    
    public static double tipoDouble(String msg){
        System.out.println(msg);
        return sc.nextDouble();
    }    
    
    public static double tipoDouble(boolean interfaz,String msg){
        if(interfaz){
            return Float.parseFloat(JOptionPane.showInputDialog(msg));
        }
        System.out.println(msg);
        return sc.nextDouble();
    }
    
    public static boolean tipoBoolean(boolean interfaz,String msg){
        if(interfaz){
            return Boolean.parseBoolean(JOptionPane.showInputDialog(msg));
        }
        System.out.println(msg);
        return sc.nextBoolean();
    }
    
    public static boolean tipoBoolean(String msg){
        System.out.println(msg);
        return sc.nextBoolean();
    }
    
    public static short tipoShort(boolean interfaz,String msg){
        if(interfaz){
            return Short.parseShort(JOptionPane.showInputDialog(msg));
        }
        System.out.println(msg);
        return sc.nextShort();
    }  
    
    public static short tipoShort(String msg){
        System.out.println(msg);
        return sc.nextShort();
    }
    
    public static long tipoLong(String msg){
        System.out.println(msg);
        return sc.nextLong();
    }
    
    public static long tipoLong(boolean interfaz,String msg){
        if(interfaz){
            return Long.parseLong(JOptionPane.showInputDialog(msg));
        }
        System.out.println(msg);
        return sc.nextLong();
    }
    
    public static byte tipoByte(String msg){
        System.out.println(msg);
        return sc.nextByte();
    }
    
    public static byte tipoByte(boolean interfaz,String msg){
        if(interfaz){
            return Byte.parseByte(JOptionPane.showInputDialog(msg));
        }
        System.out.println(msg);
        return sc.nextByte();
    }
}