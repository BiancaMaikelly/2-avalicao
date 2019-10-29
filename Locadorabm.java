
public class Locadorabm {

    public static void main(String[] args) {

    Cliente cliente1 = new Cliente();
    cliente1.id = "123456789";
    cliente1.nome ="Doritos";
    cliente1.datadenascimento = "16/01/1992";
    cliente1.cpf = "2424899652";
    cliente1.diasparadevolucao = "24/10/2018";

    

    Cliente cliente2 = new Cliente();
    cliente2.id = "2545851215";
    cliente2.nome = "Fandangos";
    cliente2.datadenascimento = "14/05/2018";
    cliente2.cpf = "5455484548515";
    cliente2.diasparadevolucao = "09/02/2000";


    Cliente cliente3 = new Cliente();
    cliente3.id = "87224545";
    cliente3.nome = "Cheetos";
    cliente3.datadenascimento = "20/05/2001";
    cliente3.cpf = "9922212545";
    cliente3.diasparadevolucao = "28/03/1992";
      

    Cliente cliente4 = new Cliente();
    cliente4.id = "131545548";
    cliente4.nome = "Laka";
    cliente4.datadenascimento = "22/06/1990";
    cliente4.cpf = "5454554454";
    cliente4.diasparadevolucao = "08/12/2050";



    Cliente cliente5 = new Cliente();
    cliente5.id = "988545454";
    cliente5.nome = "Shot";
    cliente5.datadenascimento = "13/08/1770";
    cliente5.cpf = "9954878455";
    cliente5.diasparadevolucao = "88/55/1522";




    Filme filme1 = new Filme("545484514","A morte","08/05/1880", "terror", 10.5,"2");
    

   Filme filme2 = new Filme("55454842","A volta","09/08/1990","Suspense", 5.9, "1");
    

    Filme filme3 = new Filme("54845451212","Socorro", "07/09/1992","Terror", 22.3,"10");
    

    Filme filme4 = new Filme("87841421212","Terra","24/05/2000","Drama", 8.5,"8");
    

    Filme filme5 = new Filme("7754545145","Vida","09/05/2001","Romance",9.9,"4");
    

    Filme filme6 = new Filme("989554522","Vingança","10/10/2002","Suspense",8.4,"3");
    

    Filme filme7 = new Filme("855451213","Bruxa","09/12/2200", "Suspense", 6.6,"2");
    
    
     
    Filme filme8 = new Filme("857442121","Triste", "06/10/2012", "Drama",9.3,"4");
    

    Filme filme9 = new Filme("954421522","Guerreiros","03/04/1999","Ação",2.9,"5");
   

    Filme filme10 = new Filme("98354845121","Tragedia","09/03/20019","Drama", 50.3,"33");
    




    Locação locacao1 = new Locacao("123456",cliente1,"08/05/2002","10/05/2002");


    Locação locacao2 = new Locacao("88454545",cliente2,"05/06/2001","08/06/2001");
    

    Locação locacao3 = new Locacao("87845454",cliente3,"10/10/2010","12/10/2010");
    


    Locação locacao4 = new Locacao("8454551",cliente4,"12/11/1990","14/11/1990");
    
     
    Locação locacao5 = new Locacao("878451221",cliente5,"01/01/2019","03/01/2019");
    



     Filmeslocados filmeslocados1 = new Filmeslocados(locacao1,filme1);
     

     Filmeslocados filmeslocados2 = new Filmeslocados(locacao2,filme2);
     
   
     Filmeslocados filmeslocados3 = new Filmeslocados(locacao3,filme3);
     


     Filmeslocados filmeslocados4 = new Filmeslocados(locacao4,filme4);
     
      
     Filmeslocados filmeslocados5 = new Filmeslocados( locacao5,filme5);
     






        
    }







    
}