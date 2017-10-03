package gradebook;

public class GradeBook {
    
    private String nomeDisciplina;
    private int [] notasDosAlunos;
    
    public GradeBook (String nomeDisciplina, int [] vetorDeNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.notasDosAlunos = vetorDeNotas;
    }
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    
    public void mostraMensagem () {
        System.out.printf ("Nome do Curso: %s\n\n", this.nomeDisciplina);
    } 
    
    public void processaNotas () {
        
        System.out.printf ("\nA média da turma é: %f\n", calculaMedia());
        
        System.out.printf ("A menor nota é %d\nA maior nota é %d\n\n", menorNota(), maiorNota());
        
        exibeGraficoBarras ();
        
    }
    
    public float calculaMedia () {
        
        float media = (float) 0.0;
        
        for (int nota : notasDosAlunos) {
            
            media += nota;
            
        }
        
        media /= notasDosAlunos.length;
        
        return media;
        
    }
    
    public int menorNota () {
        
        int menor = notasDosAlunos [0];
        
        for (int nota : notasDosAlunos) {
            
            if (nota < menor) menor = nota;
            
        }
        
        return menor;
        
    }
    
    public int maiorNota () {
        
        int maior = notasDosAlunos [0];
        
        for (int nota : notasDosAlunos) {
            
            if (nota > maior) maior = nota;
            
        }
        
        return maior;
    }
    
    public void exibeGraficoBarras () {
        
        System.out.println ("Distribuição das Notas");
        System.out.println ("----------------------\n\n");
        
        int [] frequencia = new int [11];
        
        for (int nota : notasDosAlunos) {
            
            ++ frequencia [nota / 10];
            
        }
        
        for (int i = 0; i < frequencia.length; ++ i) {
            
            if (i == 10)
                
                System.out.printf ("%5d: ", 100);
            
            else
                
                System.out.printf ("%02d-%02d: ", 
                        i * 10,
                        i * 10 + 9);
            
            for (int asterisco = 0; asterisco < frequencia [i]; ++ asterisco)
                System.out.print ("*");
            
            System.out.println ();
            
        }
    }
    
    public void imprimeNotas () {
        
        System.out.println ("As notas são:\n");
        
        for (int i = 0; i < notasDosAlunos.length; ++ i) {
            
            System.out.printf ("Estudante %2d: %3d\n",
                    i + 1, 
                    notasDosAlunos [i]);
            
        }
    }
    
}
