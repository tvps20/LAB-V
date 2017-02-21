package Interfaces;



public interface IBufferCircular<T>
{
    void adicionar(T info);
    
    T remover();
    
    boolean estaVazio();
    
    int numeroDeElementos();
    
    int tamanhoMaximo();
    
}
