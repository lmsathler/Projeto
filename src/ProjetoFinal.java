public class ProjetoFinal {

     public static void main (String [] args) {
         Ave pato = new Ave ();
         Ave galinha = new Ave ();
         Mamifero vaca = new Mamifero ();
         Mamifero morcego = new Mamifero ();
         
         System.out.println("O animal é: PATO\n");
         pato.setCorPena("Bege");
         pato.setVoa(true);
         pato.setSom("Grasnido");
         pato.setIdade(3);
         pato.setTamanho("Medio");
         System.out.println ("O pato voa? " + (pato.isVoa() ? "Voa":"Nao voa"));
         System.out.println ("O som do pato é  " + pato.getSom());
         System.out.println ("A cor da pena do pato é : " + pato.getCorPena());
         pato.mostraDados();
         System.out.println ("\n");     
         
         System.out.println ("O animal é: GALINHA\n");
         galinha.setCorPena("Preto");
         galinha.setSom ("Cacarejo");
         galinha.setIdade(6);
         galinha.setTamanho("Pequeno");
         System.out.println ("A galinha voa? " + (galinha.isVoa() ? "Voa":"Nao voa"));
         System.out.println ("O som da galinha é: " + galinha.getSom());
         System.out.println ("A cor da pena da galinha é: " + galinha.getCorPena() );
         galinha.mostraDados();
         System.out.println ("\n"); 
          
         System.out.println ("O animal é: VACA\n");
         vaca.setCorPelo("Branca");
         vaca.setSom("Mugido");
         vaca.setIdade(4);
         vaca.setTamanho("Grande");
         System.out.println("O som da vaca é: " + vaca.getSom());
         System.out.println ("A cor do pelo da vaca é: " + vaca.getCorPelo() );
         vaca.mostraDados();
         System.out.println ("\n"); 
         
         System.out.println ("O animal é: MORCEGO\n");
         morcego.setCorPelo("Marrom");
         morcego.setVoa(true);
         morcego.setSom("Farfalho");
         morcego.setIdade(5);
         morcego.setTamanho("Pequeno");
         System.out.println("O morcego voa? " + (morcego.isVoa()? "Voa" : "Nao voa"));
         System.out.println ("O som do morcego é: " + morcego.getSom());
         System.out.println ("A cor do pelo do morcego é: "+ morcego.getCorPelo());
         morcego.mostraDados();


     }
}
