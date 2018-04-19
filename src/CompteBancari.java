/**
 * Esta clase define funciones y atributos que tendrán los objetos de tipo CompteBancari que nos servirán para almacenar los datos de una cuenta, como el nombre del titular su pin secreto y el saldo.
 * @version 1.0 10-04-18
 * @author Jotxee
 * 
 */
public class CompteBancari {
    /**
     * Son las variables que útilizará la clase: 
     * nom = Contendra el nombre de la cuenta
     * numSecret = Será el pin de la cuenta
     * saldoInicial = El saldo que se asignará a la variable 'saldo'  al crear la cuenta/objeto
     * Saldo = El saldo de la cuenta.
     */
    private String nom;
    private int numSecret;
    private static float saldoInicial = (float) 100.0;
    private float saldo;
    
    /**
     * Constructor de la clase al que se le han de pasar el nombre del titular de la cuenta y su número secreto.
     * @param nom Nombre de la cuenta que se instanciará en el objeto.
     * @param numSecret Pin que se asignará a la instancia del objeto.
     */
    public CompteBancari(String nom, int numSecret) {
        this.nom = nom;
        this.numSecret = numSecret;
        this.saldo = CompteBancari.saldoInicial;
    }

    /**
     * Método para obtener el nombre de la cuenta.
     * @return Devuleve el nombre de la cuenta de tipo String.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Método para obtener el número secreto de la cuenta.
     * @return Devuelve el pin de la cuenta de tipo int.
     */
    public int getNumSecret() {
        return this.numSecret;
    }
    
    /**
     * Método para consultar el saldo de la cuenta.
     * @return Delvuelve el saldo de la cuenta de tipo float.
     */
    public float consultarSaldo() {
        return this.saldo;
    }
    
    /**
     * Método para consultar el saldoInicial de la cuenta.
     * @return Devuelve el saldoInicial de la clase.
     */
    public static float getSaldoInicial() {
        return CompteBancari.saldoInicial;
    }

    /**
     * Método para modificar la variable saldoInicial.
     * @param saldoIncial valor que se asigna a saldo inicial.
     */
    public static void setSaldoInicial(float saldoIncial) {
        CompteBancari.saldoInicial = saldoIncial;
    }

    /**
     * Método para mostrar los datos de la cuenta.
     * @return devuelve un string con el valor de diferentes atributos de la clase.
     */
    public String mostrarDades() {
        return ("El propietari es diu: " + this.nom + " amb número secret: "
                + this.numSecret + ". El saldo actual es: " + this.saldo);
    }

    /**
     * Método que comprueba si el valor a ingresar es válido, comprobando si es positivo el valor.
     * @param quantitat float de la cantidad 
     * @return True si es válido o False si no es un valor positivo ó 0.
     */
    public boolean ingressar(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo + quantitat;
            resultat = true;
        }
        return resultat;
    }
    
    /**
     * Método para sacar dinero de la cuenta, la funcion es restar una cantidad tipo float al saldo.
     * @param quantitat es el valor tipo float de la cantidad que se quiere sacar de la cuenta y que se restará.
     * @return devuelve True si el valor es positivo o igual a 0. Puedes sacar a crédito. 
     */
    public boolean extreure(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo - quantitat;
            resultat = true;
        }
        return resultat;
    }
    
    public void saludo2(){
        System.out.println("Hola, soy Marc Boule!!!");
    }
}
