/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.elvador;

/**
 *
 * @author Lucas Elias de Oliveira Gianfaldoni - RA:824139513
 */
public class Elvador {

    private int pessoas;
    private boolean subindo;

    public Elvador() {
        pessoas = 0;
        subindo = false;

    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        if (pessoas >= 0 && pessoas <= 10) {
            this.pessoas = pessoas;
        }
    }

    public boolean getSubindo() {
        return subindo;
    }

    public void setSubindo() {
        //se for true muda para false e vice versa
        subindo = !subindo;
    }

    public void sobe() {
        if (!getSubindo()) {
            subindo = true;
        }
    }

    public void desce() {
        if (getSubindo()) {
            subindo = false;
        }
    }

    public void entrarGente(int pessoas) {
        int ocupacao = getPessoas() + pessoas;
        if (ocupacao >= 0 && ocupacao <= 10) {
            setPessoas(ocupacao);
        }
    }

    public void subirPessoa() {
        int ocupacao = getPessoas() + 1;
        if (ocupacao >= 0 && ocupacao <= 10) {
            setPessoas(ocupacao);
        }
    }

    public void descerPessoa() {
        int ocupacao = getPessoas() - 1;
        if (ocupacao >= 0 && ocupacao <= 10) {
            setPessoas(ocupacao);
        }
    }
}
