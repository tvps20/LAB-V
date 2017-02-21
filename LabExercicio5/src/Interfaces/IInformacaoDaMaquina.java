package Interfaces;

public interface IInformacaoDaMaquina 
{
    int getUsoRAM();

    void setUsoRAM(int _usoRAM);

    int getUsoHD();

    void setUsoHD(int _usoHD);

    int getUsoCPU();

    void setUsoCPU(int _usoCPU);

    double getClockCPU();

    void setClockCPU(int _clockCPU);
}
