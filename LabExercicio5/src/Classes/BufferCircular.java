package Classes;

import Interfaces.IBufferCircular;


public class BufferCircular<T> implements IBufferCircular<T> 
{
    private T[] buffer;
    int inicio;
    int fim;

    public BufferCircular(int qtdElementos)
    {
        buffer = (T[])(new Object[qtdElementos]);
        inicio = 0;
        fim = -1;
    }

    @Override
    public void adicionar(T info)
    {
     
        if(fim == buffer.length -1)
            fim = -1;
        fim++;
        buffer[fim] = info;            
    }

    @Override
    public T remover()
    {      
        T aux = buffer[inicio++];

        if(inicio == buffer.length)
            inicio = 0;
        
        return aux;    
    }

    @Override
    public boolean estaVazio()
    {
        if(numeroDeElementos() == 0)
            return true;
        else
            return false;
    }

    @Override
    public int numeroDeElementos()
    {
        int count = 0;

        for(int i=0; i<tamanhoMaximo()-1; i++)
        {
            if(buffer[i] != null)
            {
                count++;
            }
        }

        return count;
    }

    @Override
    public int tamanhoMaximo()
    {
        return buffer.length;
    }
}
