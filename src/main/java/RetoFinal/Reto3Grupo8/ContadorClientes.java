/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetoFinal.Reto3Grupo8;

/**
 *
 * @author waldo
 */
public class ContadorClientes {
    private Long total;
    private Cliente Client;

    public ContadorClientes(Long total, Cliente Client) {
        this.total = total;
        this.Client = Client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Cliente getClient() {
        return Client;
    }

    public void setClient(Cliente Client) {
        this.Client = Client;
    }
    
}
