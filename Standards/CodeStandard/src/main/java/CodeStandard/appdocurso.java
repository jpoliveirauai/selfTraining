package CodeStandard;

public class appdocurso {
    public static void main( String[] args ){

        pessoa jaum = new pessoa();
        jaum.setIdadedapessoaaqui(50);
        jaum.setnomedoindividuo("João");

        System.out.println( "Oi, eu sou o" + jaum.getnomedoindividuo() + ", e tenho " + jaum.getIdadedapessoaaqui() + " anos." );
    }
}
