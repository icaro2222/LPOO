package ControleDeEstoque;

import static ControleDeEstoque.ControleDeEstoque.funcao;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Funcoes {
    
    static Variaveis variaveis = new Variaveis();
    
    static int contador = variaveis.getContador();
    static String nome = variaveis.getNome();
    static String[] nomeClientes = variaveis.getNomeClientes();
    static String[] nomeProduto= variaveis.getNomeProduto();
    static int[] quantidadeProduto = variaveis.getQuantidadeProduto();
    static double[] valorProduto = variaveis.getValorProduto();
    static double valorEmCaixa = variaveis.getValorEmCaixa();

    public static String[] getNomeClientes() {
        return nomeClientes;
    }
    static String senha = variaveis.getSenha();
    
    public void VenderProdutos() throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
                     
            LimparTela();
            System.out.println("Informe o ID do produto que deseja comprar:");
            String idproduto = scan.nextLine();
            int idprodutoint = Integer.parseInt(idproduto);
            idprodutoint--;

            System.out.println("Qual a quantidade que deseja comprar?");
            String quant = scan.nextLine();
            
            int quantint = Integer.parseInt(quant);

            if(quantint > quantidadeProduto[idprodutoint]){
                System.out.println("\nNão a essa quantidade, Restão apenas " + 
                        quantidadeProduto[idprodutoint] + " no estoque\n");
            }else if( quantint < 0){
                System.out.println("\nSó é aceito valor positivos!\n");
            }else{
                
                LimparTela();
                DateTimeFormatter data_venda = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                DateTimeFormatter hora_venda = DateTimeFormatter.ofPattern("HH:mm");
                System.out.println("\n--------------RECIBO-------------" +
                                   "\nProduto:" + 
                                    nomeProduto[idprodutoint] +
                                   "\nPreço unidade" +
                                     valorProduto[idprodutoint] +
                                   "\nQuantidade sendo comprada: " +
                                    quantint +
                                   "\nValor a pagar R$ " +
                                    (quantint * valorProduto[idprodutoint]) +
                                   "\nData: " + 
                                    data_venda.format(LocalDateTime.now()) +
                                   "\nHora: " + 
                                    hora_venda.format(LocalDateTime.now()) +
                                   "\n---------------------------------" +
                                   "\nConfirma a compra??" +
                                   "\n0-Sim 1-Não\n(para cancelar a compra):");
                
                String confirma = scan.nextLine();
                int confirmaint = Integer.parseInt(confirma);

                while(true){

                    if(confirmaint == 1){
                            break;
                    }

                    System.out.println("Informe o código válido do cliente:");
                    confirma = scan.nextLine();
                    confirmaint = Integer.parseInt(confirma);

                    contador = 10;
                    for(String y:nomeClientes){
                        if(y.equals(" ")){
                            contador--;
                        }
                    }

                    if(confirmaint > 0 && confirmaint <= contador){

                        System.out.println("\n------------CLIENTE-------------");
                        System.out.println("ID:" + (confirmaint) +
                                           " - Cliente:" +
                                           nomeClientes[confirmaint-1]);
                        quantidadeProduto[idprodutoint] -= quantint;
                        valorEmCaixa += (quantint * valorProduto[idprodutoint]);
                        
                        GerarNotaFiscal(idprodutoint, quantint, confirmaint);
                        break;
                    }else{
                        System.out.println("\nUsuario não cadastrado!\n");
                    }
                }

                for(int y =0; y ==0;){

                    System.out.println("Deseja realizar outra comprar? 1 = Sim | 2 = Não: ");
                    confirma = scan.nextLine();
                    confirmaint = Integer.parseInt(confirma);

                    if(confirmaint == 2 || confirmaint == 1){
                        break;
                    }else{
                         System.out.println("Opcao Invalida!");
                    }
                }
                
                if(confirmaint == 2){
                    break;
                }
            }
        }
        SalvaDados("BDadmin.txt");
    }

    public int Menu() {
        
        Scanner scan = new Scanner(System.in);
        
	System.out.println("------------------------------------------");
	DateTimeFormatter data_venda = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	DateTimeFormatter hora_venda = DateTimeFormatter.ofPattern("HH:mm");
	System.out.println("Data: " + data_venda.format(LocalDateTime.now()));
	System.out.println("Hora: " + hora_venda.format(LocalDateTime.now()));
        
        System.out.println("- - - - - - MENU - - - - - - ");
        System.out.println("1 - Mostar Produtos em Estoque");
        System.out.println("2 - Mostrar Clientes");
        System.out.println("3 - Cadastrar Novo Cliente");
        System.out.println("4 - Mostrar Dinheiro em Caixa");
        System.out.println("5 - Vender Produtor");
        System.out.println("6 - Limpar tela");
        System.out.println("7 - Modificar Usuario");
        System.out.println("8 - Deletar Usuario");
        System.out.println("9 - Sair");
        System.out.println("- - - - - - - - - - - - - - ");
        System.out.println("O que você deseja fazer? Escolha:");
	System.out.print(">>> ");
        int opcao = scan.nextInt();
    
    return opcao;
    }

    public boolean Logar() {
        
        Scanner scan = new Scanner(System.in);
        
        boolean logado = false;
        String nomeUsuario, senhaUsuario;
        
        System.out.println("- - - Logar no Sistema - - - ");
        
        System.out.println("Informe o seu nome:");
        nomeUsuario = scan.nextLine();
        System.out.println("Informe a sua senha:");
        senhaUsuario = scan.nextLine();
        
        if(nomeUsuario.equals(nome)&& senhaUsuario.equals(senha)){
            logado = true;
        }else{
            LimparTela();
            System.out.println("Usuario Incorreto ou Senha Incorreta!!!\n\n");
            return Logar();
        }
        
    return logado;
    }
    
    public void LimparTela() {
        
//        try{
//            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    public void MostrarProdutosEmEstoque() {
    
        Scanner scan = new Scanner(System.in);
        
        contador = 10;
        for(String y:nomeProduto){
            if(y.equals(" ")){
                contador--;
            }
        }
        LimparTela();

        System.out.println("\n--------------PRODUTOS-------------");
        for(int x = 0; x <contador; x++){
            System.out.println("ID:" + (x+1) +
                               " - Produto:" +
                               nomeProduto[x] +
                               " - Preço: R$" + 
                               valorProduto[x] +
                               " - Quantidade em estoque: " +
                               quantidadeProduto[x]);
            }  
        System.out.println("\n---------------------------------");
        System.out.println("Pressione 1 para sair do programa");
        System.out.println("Pressione 0 para voltar ao menu.");
        System.out.println("Escolha:");
        int opcao = scan.nextInt();
        
        if(opcao == 1){
            LimparTela();
            Logar();
        }

    }
    
    public void ValorEmCaixa() {
        System.out.println("Valor em CAIXA: R$ " + valorEmCaixa + "\n");
    }
    
    static void SalvaDados(String arq) throws IOException {
        
        try{
            FileWriter escrever = new FileWriter(arq);
            FileWriter bd = new FileWriter("BD.txt");
            
            escrever.write("\n--------------LOGIN-------------\n");
            
            escrever.write("\nUsuario: ");
            bd.write("\n");
            escrever.write(nome);
            bd.write(nome);
            escrever.write("\nSenha: ");
            bd.write("\n");
            escrever.write(senha);
            bd.write(senha);
            
            escrever.write("\n\n-------------USUARIOS------------\n");
            
            for(int x = 0; x < 10; x++){
                escrever.write("\nUsuario " + x + ": ");
                bd.write("\n");
                escrever.write(nomeClientes[x]);
                bd.write(nomeClientes[x]);
            }
            
            escrever.write("\n\n-------------PRODUTOS--------------\n");
            
            for(int x = 0; x < 10; x++){
            escrever.write("\nProduto " + x +
                           ": " + nomeProduto[x] + " Quantidade: " + 
                           " " + quantidadeProduto[x] + " Valor: " +
                           " " + valorProduto[x] +
                           " R$");
            }
            for(int i = 0; i < 10; i++){
                bd.write("\n" + nomeProduto[i]);
            }
            for(int i = 0; i < 10; i++){
                bd.write("\n" + quantidadeProduto[i]);
            }
            for(int i = 0; i < 10; i++){
                bd.write("\n" + valorProduto[i]);
            }
            
            escrever.write("\n\n------------VALOR EM CAIXA------------\n\n" + 
                    valorEmCaixa + "\n");
            
            bd.write("\n" + valorEmCaixa);
            
            escrever.close();
            bd.close();
        }catch(Exception e){
            System.out.println("Erro ao cescrever");
            e.printStackTrace();
        }
    }
    
    static void LerArquivoSalvo(String arq) {
        
        try{
            File ler = new File(arq);
            Scanner leitor = new Scanner(ler);
            String linha[] = new String[60];
            int x = 0;
            while(leitor.hasNextLine()){
                linha[x] = leitor.nextLine();
                x++;
            }
            
            nome = linha[1];
            senha = linha[2];
            for(x = 0; x<10; x++){
                nomeClientes[x] = linha[x+3];
            }
            
            for(x = 0; x<10; x++){
                nomeProduto[x] = linha[x+13];
            }
            
            for(x = 0; x<10; x++){
                String quantidadeproduto = linha[x+23];
                quantidadeProduto[x] = Integer.parseInt(quantidadeproduto);
            }
            
            
            for(x = 0; x<10; x++){
                String valorproduto = linha[x+33];
                valorProduto[x] = Double.parseDouble(valorproduto);
            }
            
            String nome = linha[43];
            valorEmCaixa = Double.parseDouble(nome);
                
            leitor.close();
        }catch(FileNotFoundException e){
            System.out.println("Erro ao cescrever");
            e.printStackTrace();
        }
    }

    void CriarArquivo(String arq) {
        
        File BDadmin = new File(arq);
        File BD = new File(arq);
        
        try{
            if(BD.createNewFile()){
                System.out.println("Sucesso");
            }
        }catch(Exception e){
            System.out.println("Erro ao criar");
            e.printStackTrace();
        }
    }

    private void GerarNotaFiscal(int idproduto, int quantint, int idcliente) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja gerar nota fiscal?\n1-SIM\n2-NÃO");
        System.out.print(">>> ");
        int opcao = scan.nextInt();
        
        if(opcao == 1){
            SalvarNotaNoBanco(idproduto, quantint, idcliente);
        }
    }

    private void SalvarNotaNoBanco(int idproduto, int quantint, int idcliente) throws IOException {
        
        CriarArquivo("NotaFiscal.txt");
        FileWriter escrever = new FileWriter("NotaFiscal.txt", true);
        DateTimeFormatter data_venda = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter hora_venda = DateTimeFormatter.ofPattern("HH:mm");
        
        escrever.write("\n--------------LOGIN-------------\n");

        escrever.write("\nAtendente: ");
        escrever.write(nome);
        
        escrever.write("\n\n-------------USUARIOS------------\n");
        
        escrever.write(nomeClientes[idcliente]);      
        
        escrever.write("\n\n--------------RECIBO-------------" +
                           "\nProduto:" + 
                            nomeProduto[idproduto] +
                           "\nPreço unidade" +
                             valorProduto[idproduto] +
                           "\nQuantidade sendo comprada: " +
                            quantint +
                           "\nValor a pagar R$ " +
                            (quantint * valorProduto[idproduto]) +
                           "\nData: " + 
                            data_venda.format(LocalDateTime.now()) +
                           "\nHora: " + 
                            hora_venda.format(LocalDateTime.now()) +
                           "\n---------------------------------\n\n");
        
        escrever.close();
    }
    
}
