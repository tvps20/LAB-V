import Classes.BufferCircular;
import Classes.InformacaoDaMaquina;
import Interfaces.IInformacaoDaMaquina;

public class Main {
   
    public static void main(String[] args) 
    {
        BufferCircular<IInformacaoDaMaquina> novoBuffe = new BufferCircular<IInformacaoDaMaquina>(4);

        InformacaoDaMaquina novaInformacao1 = new InformacaoDaMaquina();
        //InformacaoDaMaquina novaInformacao2 = new InformacaoDaMaquina();
        //InformacaoDaMaquina novaInformacao3 = new InformacaoDaMaquina();
        //InformacaoDaMaquina novaInformacao4 = new InformacaoDaMaquina();
        //InformacaoDaMaquina novaInformacao5 = new InformacaoDaMaquina();

        novoBuffe.adicionar(novaInformacao1);
        //novoBuffe.adicionar(novaInformacao2);
        //novoBuffe.adicionar(novaInformacao3);
        //novoBuffe.adicionar(novaInformacao4);
        //novoBuffe.adicionar(novaInformacao5);
        
        novoBuffe.remover();
    }
    
}
