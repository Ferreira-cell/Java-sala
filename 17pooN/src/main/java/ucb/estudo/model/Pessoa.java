package ucb.estudo.model;

public class Pessoa {
    private String nome;
    private double altura;
    private String cpf;
    private int peso;

    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String CPF, double altura, int peso){
        this.nome = nome;
        this.cpf = cpf;
        this.altura = altura;
        this.peso = peso;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void exibirIMC(){
        double imc = peso / (altura * altura);
        System.out.println("O seu IMC h: " + imc);
    }
}
