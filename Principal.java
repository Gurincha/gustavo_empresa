public class Principal{
    public static void main(String[] args) {
        Vendedor v=new Vendedor();
        v.setNome("Maria");
		v.setDataDeEntrada("10/01/2010");
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setRg("45");


        Gerente g=new Gerente();
        g.setNome("Marcelo");

		g.setDepartamento ("Vendas");
		g.setDataDeEntrada  ("03/02/1990");
		g.setEstaNaEmpresa  (true);
		g.setRg ("48");
		g.setSalario  (3500.0);



        Supervisor s=new Supervisor();
        s.setNome("Rodrigo");
        s.setDepartamento  ("Supervisor");
		s.setDataDeEntrada ("23/08/2000");
		s.setEstaNaEmpresa (true);
		s.setRg  ("48");
		s.setSalario ( 4280.0);


    }
}