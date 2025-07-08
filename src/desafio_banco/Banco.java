package desafio_banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private String codigo;
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
        conta.getCliente().adicionarConta(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void listarClientes() {
        System.out.println("Clientes do banco " + this.nome + ":");
        for (Cliente cliente : clientes) {
            System.out.println(" - " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")");
        }
    }

    public void listarContas() {
        System.out.println("Contas do banco " + this.nome + ":");
        for (Conta conta : contas) {
            System.out.println(" - " + conta.getClass().getSimpleName() + 
                              " Nº " + conta.getNumero() + 
                              " - Cliente: " + conta.getCliente().getNome());
        }
    }

    public Cliente buscarClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", totalClientes=" + clientes.size() +
                ", totalContas=" + contas.size() +
                '}';
    }
}