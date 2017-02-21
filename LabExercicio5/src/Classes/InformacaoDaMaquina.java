package Classes;

import labexercicio5.Interfaces.IInformacaoDaMaquina;

public class InformacaoDaMaquina<T> implements IInformacaoDaMaquina 
{
    private int usoRAM;
    private int usoHD;
    private int usoCPU;
    private double clockCPU;

    @Override
    public int getUsoRAM()
    {
        return usoRAM;
    }

    @Override
    public void setUsoRAM(int _usoRAM)
    {
        this.usoRAM = _usoRAM;
    }

    @Override
    public int getUsoHD() {
        return usoHD;
    }

    @Override
    public void setUsoHD(int _usoHD)
    {
        this.usoHD = _usoHD;
    }

    @Override
    public int getUsoCPU()
    {
        return usoCPU;
    }

    @Override
    public void setUsoCPU(int _usoCPU)
    {
        this.usoCPU = _usoCPU;
    }

    @Override
    public double getClockCPU()
    {
        return clockCPU;
    }

    @Override
    public void setClockCPU(int _clockCPU)
    {
        this.clockCPU = _clockCPU;
    }

    public boolean checarEntrada(int _entrada)
    {
        if((_entrada >= 0) && (_entrada <= 100))
            return true;
        else
            return false;
    }
}
