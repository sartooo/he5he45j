public class Giocatori extends Thread 
{
    public String nome;
    public int carta;

    public Giocatori(String nome)
    {
        this.nome = nome;
    }

    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " : "+ nome + " : sta giocando");
        carta = (int) (10*Math.random() + 1);
        System.out.println(nome + " ha pescato : " + carta);
    }

    public String getNome() 
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getCarta() 
    {
        return this.carta;
    }

    public void setCarta(int carta) 
    {
        this.carta = carta;
    }



}
