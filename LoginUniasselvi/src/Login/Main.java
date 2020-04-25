package Login;

import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner ler = new Scanner(System.in);
	static String acd = "1 - Acadêmico ";
	static String acdav = "2 - Acadêmico Aula Virtual ";
	static String clb = "3 - Colaborador";
	static String emp = "4 - Empresa ";
	static String cmnd = "5 - Comunidade ";
	static String opcaoEscolhida = "";
	static int opcaoMenu = 0;
	
	public static void main(String[] args) {
		
		System.out.print("Seja Bem Vindo ao Gioconda portal de Educação da Uniasselvi \r\n");
		System.out.print("Por vafor, selecione o seu tipo de login abaixo: \r\n");
		System.out.print(acd + "| " + acdav + "| " + clb + "| " + emp + "| " + cmnd + "\r\n");
		
		opcaoMenu = ler.nextInt();
		
		switch (opcaoMenu) {
		  case 1:
			  opcaoEscolhida = acd;
		    break;
		  case 2:
			  opcaoEscolhida = acdav;
		    break;
		  case 3:
			  opcaoEscolhida = clb;
		    break;
		  case 4:
			  opcaoEscolhida = emp;
		    break;
		  case 5:
			  opcaoEscolhida = cmnd;
		    break;
		}
		
		System.out.print("Muito bem, você escolheu a opção: " + opcaoEscolhida + "\r\n" + "\r\n");
		System.out.print(getPrint(opcaoMenu) + "\r\n" + "\r\n");
		System.out.print("Antes de prosseguirmos, você precisará responder a umas perguntinhas básicas, vamos lá: \r\n");
		
		switch (opcaoMenu) {
		
		case 1: 		
			Academico academico =  new Academico();
			
			  System.out.print("Qual o seu nome? ");
			  ler.nextLine();
			  academico.setNome(ler.nextLine());	
			  System.out.print("################################ " + academico.getNome()+ "\r\n" + "\r\n");
			
			  System.out.print("Qual o seu sobrenome? ");
			  academico.setSobrenome(ler.nextLine());
			  System.out.print("################################ " + academico.getSobrenome()+ "\r\n" + "\r\n");
			  
			  System.out.print("Qual a sua idade? ");
			  academico.setIdade(ler.nextInt());		
			  System.out.print("################################ " + academico.getIdade()+ "\r\n" + "\r\n");
			  
			  ler.nextLine();
			  
			  System.out.print("Qual o seu e-mail? ");
			  academico.setEmail(ler.nextLine());			  
			  System.out.print("################################ " + academico.getEmail()+ "\r\n" + "\r\n");
			  
			  System.out.print("Qual o seu CPF? ");
			  academico.setCpf(ler.nextLine());	  			  
			  System.out.print("################################ " + academico.getCpf()+ "\r\n" + "\r\n");
			  
			  System.out.print("Qual o seu RG? ");
			  academico.setRg(ler.nextLine());
			  System.out.print("################################ " + academico.getRg()+ "\r\n" + "\r\n");
			 		  
			  System.out.print("Qual o seu curso? ");
			  academico.setCurso(ler.nextLine());
			  System.out.print("################################ " + academico.getcurso()+ "\r\n" + "\r\n");		  		 						
			  	  
			  academico.setSenha(getRandomPass(5));	    
			  academico.setLogin(getRandomLogin(5));
			  	  								
			  System.out.print("Cadastro realizado com sucesso, seu login é: " + academico.getLogin() + " e a sua senha é: " + academico.getSenha() + " vamos retornar ao sistema. " + "\r\n" + "\r\n");			  
			  System.out.print("Por favor, Digite o seu login: " + "\r\n" + "\r\n");
			  
			  String loginAcademico = ler.nextLine();
			  
			  System.out.print("Por favor, Digite a sua senha : " + "\r\n" + "\r\n");
			  
			  String senhaAcademico = ler.nextLine();
			  
			  boolean retornaLoginAcademico = academico.verificalogin(loginAcademico, senhaAcademico);
			  
			  if (retornaLoginAcademico == true){
				  System.out.print("Login Efetuado com Sucesso." + "\r\n" + "\r\n");
				  System.out.print("Por favor, agora que você está logado, deve alterar sua senha, digite uma nova senha: " + "\r\n");
				  
				  academico.setSenha(ler.nextLine());
				  
				  System.out.print("Senha modificada com sucesso, sua nova senha é: " + academico.getSenha() + "Seja Bem Vindo!" +  "\r\n");
			  }
			  else{
				  System.out.print("Login e Senha não conferem, tente novamente. : " + "\r\n" + "\r\n");
			  }
			  
			  break;
		case 2:	
			Academico academicoVirtual =  new Academico();
			
			  System.out.print("Qual o seu nome? ");
			  ler.nextLine();
			  academicoVirtual.setNome(ler.nextLine());	
			  System.out.print("################################ " + academicoVirtual.getNome()+ "\r\n" + "\r\n");
			
			  System.out.print("Qual o seu sobrenome? ");
			  academicoVirtual.setSobrenome(ler.nextLine());
			  System.out.print("################################ " + academicoVirtual.getSobrenome()+ "\r\n" + "\r\n");
			  
			  System.out.print("Qual a sua idade? ");
			  academicoVirtual.setIdade(ler.nextInt());		
			  System.out.print("################################ " + academicoVirtual.getIdade()+ "\r\n" + "\r\n");
			  
			  ler.nextLine();
			  
			  System.out.print("Qual o seu e-mail? ");
			  academicoVirtual.setEmail(ler.nextLine());			  
			  System.out.print("################################ " + academicoVirtual.getEmail()+ "\r\n" + "\r\n");
			  
			  System.out.print("Qual o seu CPF? ");
			  academicoVirtual.setCpf(ler.nextLine());	  			  
			  System.out.print("################################ " + academicoVirtual.getCpf()+ "\r\n" + "\r\n");
			  
			  System.out.print("Qual o seu RG? ");
			  academicoVirtual.setRg(ler.nextLine());
			  System.out.print("################################ " + academicoVirtual.getRg()+ "\r\n" + "\r\n");
			 		  
			  System.out.print("Qual os seus cursos? ");
			  academicoVirtual.setCurso(ler.nextLine());
			  System.out.print("################################ " + academicoVirtual.getcurso()+ "\r\n" + "\r\n");		  		 						
			  	  
			  academicoVirtual.setSenha(getRandomPass(5));	    
			  academicoVirtual.setLogin(getRandomLogin(5));
			  	  								
			  System.out.print("Cadastro realizado com sucesso, seu login é: " + academicoVirtual.getLogin() + " e a sua senha é: " + academicoVirtual.getSenha() + " vamos retornar ao sistema. " + "\r\n" + "\r\n");			  
			  System.out.print("Por favor, Digite o seu login: " + "\r\n" + "\r\n");
			  
			  String loginAcademicoVirt = ler.nextLine();
			  
			  System.out.print("Por favor, Digite a sua senha : " + "\r\n" + "\r\n");
			  
			  String senhaAcademicoVirt = ler.nextLine();
			  
			  boolean retornaLoginAcademicoVirt = academicoVirtual.verificalogin(loginAcademicoVirt, senhaAcademicoVirt);
			  
			  if (retornaLoginAcademicoVirt == true){
				  System.out.print("Login Efetuado com Sucesso." + "\r\n" + "\r\n");
				  System.out.print("Por favor, agora que você está logado, deve alterar sua senha, digite uma nova senha: " + "\r\n");
				  
				  academicoVirtual.setSenha(ler.nextLine());
				  
				  System.out.print("Senha modificada com sucesso, sua nova senha é: " + academicoVirtual.getSenha() + "Seja Bem Vindo!" +  "\r\n");
			  }
			  else{
				  System.out.print("Login e Senha não conferem, tente novamente. : " + "\r\n" + "\r\n");
			  }
			  
			  break;
	  case 3: 
		  Colaborador colaborador =  new Colaborador();
			
		  System.out.print("Qual o seu nome? ");
		  ler.nextLine();
		  colaborador.setNome(ler.nextLine());	
		  System.out.print("################################ " + colaborador.getNome()+ "\r\n" + "\r\n");
		
		  System.out.print("Qual o seu sobrenome? ");
		  colaborador.setSobrenome(ler.nextLine());
		  System.out.print("################################ " + colaborador.getSobrenome()+ "\r\n" + "\r\n");
		  
		  System.out.print("Qual a sua idade? ");
		  colaborador.setIdade(ler.nextInt());		
		  System.out.print("################################ " + colaborador.getIdade()+ "\r\n" + "\r\n");
		  
		  ler.nextLine();
		  
		  System.out.print("Qual o seu e-mail? ");
		  colaborador.setEmail(ler.nextLine());			  
		  System.out.print("################################ " + colaborador.getEmail()+ "\r\n" + "\r\n");
		  
		  System.out.print("Qual o seu CPF? ");
		  colaborador.setCpf(ler.nextLine());	  			  
		  System.out.print("################################ " + colaborador.getCpf()+ "\r\n" + "\r\n");
		  
		  System.out.print("Qual o seu RG? ");
		  colaborador.setRg(ler.nextLine());
		  System.out.print("################################ " + colaborador.getRg()+ "\r\n" + "\r\n");
		 		  
		  System.out.print("Qual seu cargo? ");
		  colaborador.setCargo(ler.nextLine());
		  System.out.print("################################ " + colaborador.getCargo()+ "\r\n" + "\r\n");		  		 						
		  	  
		  colaborador.setSenha(getRandomPass(5));		    
		  colaborador.setLogin(getRandomLogin(5));
		  	  								
		  System.out.print("Cadastro realizado com sucesso, seu login é: " + colaborador.getLogin() + " e a sua senha é: " + colaborador.getSenha() + " vamos retornar ao sistema. " + "\r\n" + "\r\n");			  
		  System.out.print("Por favor, Digite o seu login: " + "\r\n" + "\r\n");
		  
		  String loginColaborador = ler.nextLine();
		  
		  System.out.print("Por favor, Digite a sua senha : " + "\r\n" + "\r\n");
		  
		  String senhaColaborador = ler.nextLine();
		  
		  boolean retornaLoginColaborador = colaborador.verificalogin(loginColaborador, senhaColaborador, colaborador.getCpf());
		  
		  if (retornaLoginColaborador == true){
			  System.out.print("Login Efetuado com Sucesso." + "\r\n" + "\r\n");
			  System.out.print("Por favor, agora que você está logado, deve alterar sua senha, digite uma nova senha: " + "\r\n");
			  
			  colaborador.setSenha(ler.nextLine());
			  
			  System.out.print("Senha modificada com sucesso, sua nova senha é: " + colaborador.getSenha() + "Seja Bem Vindo!" +  "\r\n");
		  }
		  else{
			  System.out.print("Login e Senha não conferem, tente novamente. : " + "\r\n" + "\r\n");
		  }
	  case 4:
		  Empresa empresa = new Empresa();
		  
		  System.out.print("Qual o seu nome fantasia? ");
		  ler.nextLine();
		  empresa.setNome(ler.nextLine());
		  System.out.print("################################ " + empresa.getNome()+ "\r\n" + "\r\n");		 
		  
		  System.out.print("A quanto tempo você está no mercado de trabalho? ");
		  empresa.setIdade(ler.nextInt());
		  System.out.print("################################ " + empresa.getIdade()+ "\r\n" + "\r\n");
		  
		  ler.nextLine();
		  
		  System.out.print("Qual o seu e-mail? ");
		  empresa.setEmail(ler.nextLine());System.out.print("################################ " + empresa.getEmail()+ "\r\n" + "\r\n");
		  
		  System.out.print("Qual o seu CNPJ? ");
		  empresa.setCnpj(ler.nextLine());
		  System.out.print("################################ " + empresa.getCnpj()+ "\r\n" + "\r\n");
		  	  
		  ler.nextLine();
		  
		  System.out.print("Qual o seu IE? ");
		  empresa.setIe(ler.nextLine());
		  System.out.print("################################ " + empresa.getIe()+ "\r\n" + "\r\n");				  
		  
		  System.out.print("Qual o seu número de funcionários? ");
		  empresa.setNumeroFuncionarios(ler.nextLine());
		  System.out.print("################################ " + empresa.getNumeroFuncionarios()+ "\r\n" + "\r\n");
		  	  
		  empresa.setSenha(getRandomPass(5));
		  empresa.setLogin(getRandomLogin(5));
		  
		  System.out.print("Cadastro realizado com sucesso, seu login é: " + empresa.getLogin() + " e a sua senha é: " + empresa.getSenha() + " vamos retornar ao sistema. " + "\r\n" + "\r\n");			  
		  System.out.print("Por favor, Digite o seu login: " + "\r\n" + "\r\n");
		  
		  String loginEmpresa = ler.nextLine();
		  
		  System.out.print("Por favor, Digite a sua senha : " + "\r\n" + "\r\n");
		  
		  String senhaEmpresa = ler.nextLine();
		  
		  boolean retornaLoginEmpresa = empresa.verificalogin(loginEmpresa, senhaEmpresa);
		  
		  if (retornaLoginEmpresa == true){
			  System.out.print("Login Efetuado com Sucesso." + "\r\n" + "\r\n");
			  System.out.print("Por favor, agora que você está logado, deve alterar sua senha, digite uma nova senha: " + "\r\n");
			  
			  empresa.setSenha(ler.nextLine());
			  
			  System.out.print("Senha modificada com sucesso, sua nova senha é: " + empresa.getSenha() + "Seja Bem Vindo!" +  "\r\n");
		  }
		  else{
			  System.out.print("Login e Senha não conferem, tente novamente. : " + "\r\n" + "\r\n");
		  }
	   case 5:		
		   Colaborador comunidade =  new Colaborador();
			
			  System.out.print("Qual o seu nome? ");
			  ler.nextLine();
		      comunidade.setNome(ler.nextLine());	
			  System.out.print("################################ " + comunidade.getNome()+ "\r\n" + "\r\n");
			
			  System.out.print("Qual o seu sobrenome? ");
			  comunidade.setSobrenome(ler.nextLine());
			  System.out.print("################################ " + comunidade.getSobrenome()+ "\r\n" + "\r\n");
			  
			  System.out.print("Qual a sua idade? ");
			  comunidade.setIdade(ler.nextInt());		
			  System.out.print("################################ " + comunidade.getIdade()+ "\r\n" + "\r\n");
			  
			  ler.nextLine();
			  
			  System.out.print("Qual o seu e-mail? ");
			  comunidade.setEmail(ler.nextLine());			  
			  System.out.print("################################ " + comunidade.getEmail()+ "\r\n" + "\r\n");
			  
			  System.out.print("Qual o seu CPF? ");
			  comunidade.setCpf(ler.nextLine());	  			  
			  System.out.print("################################ " + comunidade.getCpf()+ "\r\n" + "\r\n");
			  
			  System.out.print("Qual o seu RG? ");
			  comunidade.setRg(ler.nextLine());
			  System.out.print("################################ " + comunidade.getRg()+ "\r\n" + "\r\n");			 		  		 						
			  	  
			  comunidade.setSenha(getRandomPass(5));
			  System.out.print("################################ " + comunidade.getSenha()+ "\r\n" + "\r\n");
			    
			  comunidade.setLogin(getRandomLogin(5));
			  System.out.print("################################ " + comunidade.getLogin()+ "\r\n" + "\r\n");
			  	  								
			  System.out.print("Cadastro realizado com sucesso, seu login é: " + comunidade.getLogin() + " e a sua senha é: " + comunidade.getSenha() + " vamos retornar ao sistema. " + "\r\n" + "\r\n");			  
			  System.out.print("Por favor, Digite o seu login: " + "\r\n" + "\r\n");
			  
			  String loginComunidade = ler.nextLine();
			  
			  System.out.print("Por favor, Digite a sua senha : " + "\r\n" + "\r\n");
			  
			  String senhaComunidade = ler.nextLine();
			  
			  boolean retornaLoginComunidade = comunidade.verificalogin(loginComunidade, senhaComunidade, comunidade.getCpf());
			  
			  if (retornaLoginComunidade == true){
				  System.out.print("Login Efetuado com Sucesso." + "\r\n" + "\r\n");
				  System.out.print("Por favor, agora que você está logado, deve alterar sua senha, digite uma nova senha: " + "\r\n");
				  
				  comunidade.setSenha(ler.nextLine());
				  
				  System.out.print("Senha modificada com sucesso, sua nova senha é: " + comunidade.getSenha() + "Seja Bem Vindo!" +  "\r\n");
			  }
			  else{
				  System.out.print("Login e Senha não conferem, tente novamente. : " + "\r\n" + "\r\n");
			  }
	}	
}
	
	private static String getPrint(int opcao) {
		String print = "";
		
		switch (opcao) {
		  case 1:
			  print = "Para que você acadêmico possa logar em nosso sistema, iremos gerar uma senha temporária que você irá alterar em seu proximo login,\r\n " +
			  		  "seu login também será gerado automaticamente pelo sistema.";
		    break;
		  case 2:
			  print = "Para que você acadêmico aula virtual possa logar em nosso sistema, sua senha será sua Primeira letra do nome em maiúscula + seu CPF,\r\n " +
	  		  "seu login será o seu e-mail.";
		    break;
		  case 3:
			  print = "Para que você colaborador possa logar em nosso sistema, iremos gerar uma senha temporária que você irá alterar em seu proximo login,\r\n " +
	  		  "seu login também será gerado automaticamente pelo sistema, e você também precisará informar o seu CPF.";
		    break;
		  case 4:
			  print = "Para que você empresa possa logar em nosso sistema, iremos gerar uma senha temporária que você irá alterar em seu proximo login,\r\n " +
	  		  "seu login também será gerado automaticamente pelo sistema.";
		    break;
		  case 5:
			  print = "Para que você comunidade possa logar em nosso sistema, iremos gerar uma senha temporária que você irá alterar em seu proximo login,\r\n " +
	  		  "seu login também será gerado automaticamente pelo sistema, e você também precisará informar o seu CPF.";
		    break;
		}
		return print;	
	}
	public static String getRandomPass(int len){
		char[] chart ={'0','1','2','3','4','5','6','7','8','9','a','b','c',
					   'd','e','f','g','h','i','j','k','l','m','n','o','p',
					   'q','r','s','t','u','v','w','x','y','z','A','B','C',
					   'D','E','F','G','H','I','J','K','L','M','N','O','P',
					   'Q','R','S','T','U','V','W','X','Y','Z'};

		char[] senha = new char[len];

		int chartLenght = chart.length;
		Random rdm = new Random();

		for (int x=0; x<len; x++)
		senha[x] = chart[rdm.nextInt(chartLenght)];

		return new String(senha);
		}
	
	public static String getRandomLogin(int len){
		char[] chart ={'0','1','2','3','4','5','6','7','8','9'};

		char[] senha = new char[len];

		int chartLenght = chart.length;
		Random rdm = new Random();

		for (int x=0; x<len; x++)
		senha[x] = chart[rdm.nextInt(chartLenght)];

		return new String (senha);
		}
}
