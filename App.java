public class App 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("briscolata");

        Giocatori g1 = new Giocatori ("franco");
        Giocatori g2 = new Giocatori ("alfredo");
        Giocatori g3 = new Giocatori ("domenico");

        g1.start();
        g2.start();
        g3.start();

        g1.join();
        g2.join();
        g3.join();

        if(g1.getCarta() > g2.getCarta() && g1.getCarta() > g3.getCarta())
        {
            System.out.println(g1.getNome() + " : è il vincitore \n  FINE DELLA PARTITA!");
        }
        else if(g2.getCarta() > g3.getCarta())
        {
            System.out.println(g2.getNome() + " : è il vincitore \n  FINE DELLA PARTITA!");
        }
        else if(g3.getCarta() > g2.getCarta())
        {
            System.out.println(g3.getNome() + " : è il vincitore \n  FINE DELLA PARTITA!");
        }

        if(g1.getCarta() == g2.getCarta() && g1.getCarta() > g3.getCarta())
        {
            System.out.println(g1.getNome() + " e " + g2.getNome() + " : hanno pareggiato \n FINE DELLA PARTITA!");
        }
        else if(g2.getCarta() == g3.getCarta() && g2.getCarta() > g1.getCarta())
        {
            System.out.println(g2.getNome() + " e " + g3.getNome() + " : hanno pareggiato \n FINE DELLA PARTITA!");
        }
        else if(g3.getCarta() == g1.getCarta() && g3.getCarta() > g2.getCarta())
        {
            System.out.println(g3.getNome() + " e " + g1.getNome() + " : hanno pareggiato \n FINE DELLA PARTITA!");
        }
        else if(g1.getCarta() == g2.getCarta() && g1.getCarta() == g3.getCarta())
        {
            System.out.println(g2.getNome() + " , " + g2.getNome() + "e" + g3.getNome() + " : hanno pareggiato \n FINE DELLA PARTITA!");
        }

    }
}
