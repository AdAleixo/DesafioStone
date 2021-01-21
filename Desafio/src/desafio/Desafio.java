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
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item item = new Item("maçã", -3, -2);
        List<Item> itens = new ArrayList();
        List<Email> emails = new ArrayList();

        itens.add(item);

        Email email = new Email();
        Email email2 = new Email();
        email.setEmail("Isaac.Aleixo@Gmail.com");
        email2.setEmail("Isaac@Gmail.com");
        emails.add(email);
        emails.add(email2);

        Calculo calculo = new Calculo();

        calculo.somaItens(itens, emails);

    }

}
