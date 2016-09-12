/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Camilo_Escobar
 */
public class clase {
    
    private double real;
    private double imag;
    
    public clase(Double real,double imag){
        this.real=real;
        this.imag=imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    
    public clase sumar(clase c2){
        clase c;
        double real,imag;
        real=(this.real+c2.real);
        imag=(this.imag+c2.imag);
        c=new clase(real,imag);
        return c;
        
    }
    public clase restar(clase c2){
        clase c;
        double real,imag;
        real=(this.real-c2.real);
        imag=(this.imag-c2.imag);
        c=new clase(real,imag);
        return c;
        
    }
    public clase multiplicar(clase c2){
        clase c;
        double real,imag;
        real=(this.real*c2.real)-(this.imag*c2.imag);
        imag=(this.real*c2.imag)+(this.imag*c2.real);
        c=new clase(real,imag);
        return c;
        
    }
    public clase dividir(clase c2) throws ComplejosDivisionCeroException{
        clase c;
        double real,imag;
        if ((c2.real==0)||(c2.imag==0)) {
            throw new ComplejosDivisionCeroException();
        }
       real=((this.real*c2.real)+(this.imag*c2.imag))/((c2.real*c2.real)+(c2.imag*c2.imag));
        imag=((-this.real*c2.imag)+(this.imag*c2.real))/((c2.real*c2.real)+(c2.imag*c2.imag));
        c=new clase(real,imag);
        return c;
        
    }
}
