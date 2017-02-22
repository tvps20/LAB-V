import Classes.BufferCircular;
import Classes.InformacaoDaMaquina;
import Interfaces.IBufferCircular;
import Interfaces.IInformacaoDaMaquina;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClasseDeTestes {
    
    private IBufferCircular<IInformacaoDaMaquina> novoBuffer = new BufferCircular<IInformacaoDaMaquina>(4);   
    private InformacaoDaMaquina novaInformacao = new InformacaoDaMaquina();
        
    @Test
    public void saberSeEstaVazio()
    {
        assertTrue(novoBuffer.estaVazio());
    }
    
   
    @Test
    public void SaberSeEntradaEstaCorreta()
    {
        novaInformacao.setUsoRAM(88);
        boolean adicionado = false;
        if(novaInformacao.getUsoRAM() != 0)
            adicionado = true;
        
        assertEquals(true, adicionado);       
    }
    
    @Test
    public void SaberSeTemElemento()
    {
        novoBuffer.adicionar(novaInformacao);
        boolean adicionado = false;
        if(novoBuffer.numeroDeElementos() != 0)
            adicionado = true;
        
        assertEquals(true, adicionado);
    }
    
    @Test
    public void ConferirTamanho()
    {
        boolean tamanhoCerto = true;
        if(novoBuffer.tamanhoMaximo() != 4)
            tamanhoCerto = false;
        
        assertEquals(true, tamanhoCerto);
    }
    
    
}
