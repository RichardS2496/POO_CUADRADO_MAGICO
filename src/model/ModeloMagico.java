package model;

import java.util.List;

public class ModeloMagico{

    private int numeroMagico, n;
    private int [][] matrizMagica;

    public ModeloMagico(int n){
        this.n = n;
        this.matrizMagica= new int [n][n];
        this.numeroMagico= (n*(n*n+1))/2;
    }

    public int getNumeroMagico(){
        return numeroMagico;
    }

    public int [][] getMatrizMagica(){
        return matrizMagica;
    }

    public int getN(){
        return n;
    }

    public void generarMatriz(List<Integer> numerosAleatorios){
        int index = 0;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrizMagica[i][j] = numerosAleatorios.get(index++);
            }
        }
    }

    public boolean validarFilas(){
        for (int i = 0 ; i <n ; i++){
            int suma =0;

            for (int j=0; j<n; j++){
                suma+= matrizMagica[i][j];
            }

            if(suma!= numeroMagico){
                return false;
            }
        }
        return true;
    }

    public boolean validarColumnas(){
        for(int j=0; j<n ; j++){
            int suma=0;

            for (int i =0 ; i<n ; i++){
                suma+= matrizMagica[i][j];
            }
            if(suma!= numeroMagico){
                return false;
            }
        }
        return true;
    }

    public boolean validarDiagonales(){
           int sumDP=0, sumDS=0;
        for(int i=0; i <n; i++){
            sumDP+=matrizMagica[i][i];
            sumDS+=matrizMagica[i][n-1-i];

        }

        return (sumDP==numeroMagico) && (sumDS==numeroMagico);
    }

}
