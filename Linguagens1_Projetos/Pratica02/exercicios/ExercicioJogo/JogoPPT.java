package ExercicioJogo;

public class JogoPPT {
    //Atributos da classe
    public String pos1,pos2;
    public Jogador j1,j2;
    public int res;

    //Métodos da classe
    int possibilidades(String pos1, String pos2){ 
        //retorna 1 se argumento 1 ganhar, 0 se perder, 
        //2 se for empate e -1 para erro
        pos1 = pos1.toLowerCase();
        pos2 = pos2.toLowerCase();

        if(pos1.equals("pedra")){
            if(pos2.equals("tesoura"))
                return 1;
            else if(pos2.equals("pedra"))
                return 2;
            return 0;
        }
        else if(pos1.equals("papel")){
            if(pos2.equals("pedra"))
                return 1;
            if(pos2.equals("papel"))
                return 2;
            return 0;
        }
        else if(pos1.equals("tesoura")){
            if(pos2.equals("papel"))
                return 1;
            if(pos2.equals("tesoura"))
                return 2;
            return 0;
        }
        else return -1;
    }
    void visualizarJogador(Jogador j1){
        
        System.out.println("Nome: " + j1.nome);
        System.out.println("Jogada: "+ j1.jogada);
    }
    void jogo(Jogador j1,Jogador j2){
        res = possibilidades(j1.jogada,j2.jogada);
        if(res == 1){
            System.out.println("Jogador 1 venceu: ");
            visualizarJogador(j1);
        }
        if(res == 0){
            System.out.println("Jogador 2 venceu: ");
            visualizarJogador(j2);
        }
        else{
            System.out.println("Empate!");
        }
        
    }


}