package Calcul;

import Trace.Operation;

import java.io.Serializable;

public class Calcul implements Serializable {

    private char op;
    private int opg;
    private int opd;
    private int res;
    private Operation trace;


    public void setTrace(Operation trace) { this.trace=trace; }
    public void setOp(char op)
    {
        this.op=op;
    }
    public void setOpg(int opg)
    {
        this.opg=opg;
    }
    public void setOpd(int opd)
    {
        this.opd=opd;
    }
    public void setRes(int res)
    {
        this.res=res;
    }

    public char getOp()
    {
        return this.op;
    }

    public Operation getTrace()
    {
        return this.trace;
    }


    public int somme(int c, int d)
    {
        int a=c,b=d;
        this.getTrace().savop('s',a,b,a+b);
        return c+d;
    }

    public int prod(int c, int d)
    {
        int a=c,b=d;
        this.getTrace().savop('p',a,b,a*b);
        return c*d;
    }

    public int fact(int n)
    {
        int r, x=n;
        if (n<=1) r=1;
            else r=n*fact(n-1);
        this.getTrace().savop('f',x,0,r);
        return (r);
    }


}
