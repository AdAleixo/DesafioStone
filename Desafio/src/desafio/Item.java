/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desafio;

/**
 *
 * @author u657486
 */
public class Item {

    public Item(String item, int quantidadeItem, int preco) {
        this.item = item;
        this.quantidadeItem = quantidadeItem;
        this.preco = preco;
    }
    
    
    private String item;
    private int quantidadeItem;
    private int preco;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    
    
}
