import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TesteVeiculo {
    private static Veiculo gm;

    @BeforeAll
    public static void iniciaTudo(){
        gm = new Veiculo();
        gm.setModelo("Cruze");
        gm.setCor("Preto");
        gm.setAno("2020");
    }

    @Test
    public void testeCor(){
        Assertions.assertEquals("Cruze",gm.getModelo(),"ERROU.");
        //System.out.println("Modelo: "+gm.getModelo()+"\nCor: "+gm.getCor()+"\nAno: "+gm.getAno());
    }
}
