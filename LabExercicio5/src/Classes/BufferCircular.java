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
        fim = 1;
    }

    @Override
    public void adicionar(T info)
    {
        if(inicio == 0)
        {
            buffer[0] = info;
            inicio++;
            fim++;
        }
        else if(fim > buffer.length)
        {
            buffer[0] = info;
            inicio = 0;
            fim = 1;
        }
        else
        {
            buffer[inicio] = info;
            inicio++;
            fim++;
        }
    }

    @Override
    public T remover()
    {
        T aux = null;
        if(fim < buffer.length)
            buffer[inicio] = null;
        else
            aux = buffer[0];
            buffer[0] = null;
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
