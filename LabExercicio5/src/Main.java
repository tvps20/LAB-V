import Classes.BufferCircular;
import Classes.InformacaoDaMaquina;
import Interfaces.IBufferCircular;
import Interfaces.IInformacaoDaMaquina;

public class Main {
   
    public static void main(String[] args) 
    {
        IBufferCircular<IInformacaoDaMaquina> novoBuffe = new BufferCircular<IInformacaoDaMaquina>(4);

        InformacaoDaMaquina novaInformacao1 = new InformacaoDaMaquina();
        //InformacaoDaMaquina novaInformacao2 = new InformacaoDaMaquina();
        //InformacaoDaMaquina novaInformacao3 = new InformacaoDaMaquina();
        //InformacaoDaMaquina novaInformacao4 = new InformacaoDaMaquina();
        //InformacaoDaMaquina novaInformacao5 = new InformacaoDaMaquina();

        novaInformacao1.setUsoRAM(150);
        //System.out.println(novaInformacao1.getUsoRAM());
        //novoBuffe.adicionar(novaInformacao1);
        //novoBuffe.adicionar(novaInformacao2);
        //novoBuffe.adicionar(novaInformacao3);
        //novoBuffe.adicionar(novaInformacao4);
        //novoBuffe.adicionar(novaInformacao5);
        
        //novoBuffe.remover();
              
        System.out.println( novoBuffe.estaVazio());
        System.out.println(novoBuffe.numeroDeElementos());
        System.out.println(novoBuffe.tamanhoMaximo());
        
        for(int i=0; i<5; i++)
        {
            InformacaoDaMaquina novaInformacao = new InformacaoDaMaquina();
            novoBuffe.adicionar(novaInformacao);
        }
    }
    
}
