package gradebook;

public class GradeBookTest {

    public static void main (String [] args) {
        
        int [] vetorDeNotas = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        
        GradeBook minhasNotas = new GradeBook ("LTP I", vetorDeNotas);
        
        minhasNotas.mostraMensagem();
        
        minhasNotas.imprimeNotas();
        
        minhasNotas.processaNotas();
        
    }
    
}
