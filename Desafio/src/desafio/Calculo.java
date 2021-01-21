/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author u657486
 */
public class Calculo {

    int total = 0;

    public void somaItens(List<Item> itens, List<Email> emails) {

        if (emails.isEmpty()) {

            System.out.println("A Lista de email deve conter ao menos um e-mail!");

        } else if (itens.isEmpty()) {

            System.out.println("A Lista de itens deve conter ao menos um item");
        } else {
            for (int i = 0; i < itens.size(); i++) {

                if (itens.get(i).getPreco() < 0) {
                    System.out.println("O preço do item  deve ser um inteiro positivo");
                } else if (itens.get(i).getQuantidadeItem() < 0) {
                    System.out.println("A quantidade de itens  deve ser um inteiro positivo");
                } else {
                    total += itens.get(i).getPreco() * itens.get(i).getQuantidadeItem();
                    System.out.println(total / emails.size());
                }

            }

        }
    }

}
