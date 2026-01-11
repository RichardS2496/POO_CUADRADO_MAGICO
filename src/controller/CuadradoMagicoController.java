package controller;

import java.util.Collections;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import model.ModeloMagico;



public class CuadradoMagicoController {

    private ModeloMagico modeloMagico;
    private int intentos;

    public void comenzar(int n){
        this.modeloMagico=new ModeloMagico(n);
        this.intentos=0;

        List<Integer> listaNumeros = crearLista(n);

        System.out.println("Buscando cuadrado de "+n+" x "+n);
        System.out.println("El numero magico es: "+modeloMagico.getNumeroMagico());

        boolean encontrado = false;
        while (!encontrado){
            intentos++;

            Collections.shuffle(listaNumeros);
            modeloMagico.generarMatriz(listaNumeros);
            if (modeloMagico.validarFilas() &&
                    modeloMagico.validarColumnas() &&
                    modeloMagico.validarDiagonales()) {

                encontrado = true;
            }

        }
        mostrarMatrizMagica();
    }

    private List<Integer> crearLista(int n){
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= n*n; i++) {

            lista.add(i);

        }

        return lista;
    }

    private void  mostrarMatrizMagica(){
        System.out.println("=== CUADRADO MAGICO ENCONTRADO ===");
        int [][] matrizMagicaGenerada = modeloMagico.getMatrizMagica();
        int n = modeloMagico.getN();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrizMagicaGenerada[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nConstante mágica: " + modeloMagico.getNumeroMagico());
        System.out.println("Total de intentos: " + intentos);
    }






//    public void confirmarNumIngresado (int n){
//        ModeloMagico modeloMagico = new ModeloMagico(n);
//
//        System.out.println("El numero ingresado es: "+modeloMagico.getN());
//    }



}
