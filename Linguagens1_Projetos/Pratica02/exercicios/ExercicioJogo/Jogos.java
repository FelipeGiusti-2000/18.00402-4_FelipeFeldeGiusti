package ExercicioJogo;

public class Jogos {
    //Atributos da classe
    public Jogador j1,j2;
    public int res;

    //Métodos da classe
    int possibilidadesRPS(Jogador j1, Jogador j2){ 
        //retorna 1 se argumento 1 ganhar, 0 se perder, 
        //2 se for empate e -1 para erro
        j1.jogada = j1.jogada.toLowerCase();
        j2.jogada = j2.jogada.toLowerCase();

        if(j1.jogada.equals("pedra")||j1.jogada.equals("rock")){
            if(j2.jogada.equals("tesoura")||j2.jogada.equals("scissors"))
                return 1;
            else if(j2.jogada.equals("pedra")||j2.jogada.equals("rock"))
                return 2;
            else if(j2.jogada.equals("papel")||j2.jogada.equals("paper"))
                return 0;
            return -1;
        }
        else if(j1.jogada.equals("papel")||j1.jogada.equals("paper")){
            if(j2.jogada.equals("pedra")||j2.jogada.equals("rock"))
                return 1;
            else if(j2.jogada.equals("papel")||j2.jogada.equals("paper"))
                return 2;
            else if(j2.jogada.equals("tesoura")||j2.jogada.equals("scissors"))
                return 0;
            return -1;
        }
        else if(j1.jogada.equals("tesoura")||j1.jogada.equals("scissors")){
            if(j2.jogada.equals("papel")||j2.jogada.equals("paper"))
                return 1;
            else if(j2.jogada.equals("tesoura")||j2.jogada.equals("scissors"))
                return 2;
            else if(j2.jogada.equals("pedra")||j2.jogada.equals("rock"))
                return 0;
            return -1;
        }
        return -1;
    }
    
    boolean jogoRPS(Jogador j1,Jogador j2){
        //retorna falso quando o jogo acaba
        res = possibilidadesRPS(j1,j2);
        if(res == 1){
            System.out.println("Jogador 1 venceu: "+ j1.nome);
            return false;
        }
        else if(res == 0){
            System.out.println("Jogador 2 venceu: " +j2.nome);
            return false;
        }
        else if(res == 2){
            System.out.println("Empate!");
            return true;
        }
        else{
            System.out.println("Erro de digitação");
            return true;
        }
    }

    int possibilidadesRPSLS(Jogador j1, Jogador j2){
        //retorna 1 se argumento 1 ganhar, 0 se perder, 
        //2 se for empate e -1 para erro
        j1.jogada = j1.jogada.toLowerCase();
        j2.jogada = j2.jogada.toLowerCase();

        //j1 joga pedra
        if(j1.jogada.equals("pedra")||j1.jogada.equals("rock")){
            if(j2.jogada.equals("tesoura")||j2.jogada.equals("scissors"))
                return 1;
            else if(j2.jogada.equals("lagarto")||j2.jogada.equals("lizard"))
                return 1;
            else if(j2.jogada.equals("spoke"))
                return 0;
            else if(j2.jogada.equals("papel")||j2.jogada.equals("paper"))
                return 0;
            else if(j2.jogada.equals("pedra")||j2.jogada.equals("rock"))            
                return 2;
            return -1;
        }
        //j1 joga papel
        else if(j1.jogada.equals("papel")||j1.jogada.equals("paper")){
            if(j2.jogada.equals("pedra")||j2.jogada.equals("rock"))
                return 1;
            else if(j2.jogada.equals("spoke"))
                return 1;
            else if(j2.jogada.equals("lagarto")||j2.jogada.equals("lizard"))
                return 0;
            else if(j2.jogada.equals("tesoura")||j2.jogada.equals("scissors"))
                return 0;
            else if(j2.jogada.equals("papel")||j2.jogada.equals("paper"))
                return 2;
            return -1;
        }
        //j1 joga tesoura
        else if(j1.jogada.equals("tesoura")||j1.jogada.equals("scissors")){
            if(j2.jogada.equals("papel")||j2.jogada.equals("paper"))
                return 1;
            else if(j2.jogada.equals("lagarto")||j2.jogada.equals("lizard"))
                return 1;
            else if(j2.jogada.equals("spoke"))
                return 0;
            else if(j2.jogada.equals("pedra")||j2.jogada.equals("rock"))
                return 0;  
            else if(j2.jogada.equals("tesoura")||j2.jogada.equals("scissors"))          
                return 2;
            return -1;
        }
        //j1 joga lizard
        else if(j1.jogada.equals("lagarto")||j1.jogada.equals("lizard")){
            if(j2.jogada.equals("spoke"))
                return 1;
            else if(j2.jogada.equals("papel")||j2.jogada.equals("paper"))
                return 1;
            else if(j2.jogada.equals("tesoura")||j2.jogada.equals("scissors"))
                return 0;
            else if(j2.jogada.equals("pedra")||j2.jogada.equals("rock"))
                return 0;            
            else if(j2.jogada.equals("lagarto")||j2.jogada.equals("lizard"))
                return 2;
            return -1;
        }
        //j1 joga spoke
        else if(j1.jogada.equals("spoke")){
            if(j2.jogada.equals("tesoura")||j2.jogada.equals("scissors"))
                return 1;
            else if(j2.jogada.equals("pedra")||j2.jogada.equals("rock"))
                return 1;
            else if(j2.jogada.equals("papel")||j2.jogada.equals("paper"))
                return 0;
            else if(j2.jogada.equals("lagarto")||j2.jogada.equals("lizard"))
                return 0;
            else if(j2.jogada.equals("spoke"))
                return 2;
            return -1;
        }
        return -1;
    }
    boolean jogoRPSLS(Jogador j1,Jogador j2){
        //retorna falso quando o jogo acaba
        res = possibilidadesRPSLS(j1, j2);
        if(res == 1){
            System.out.println("Jogador 1 venceu: " + j1.nome);
            return false;
        }
        else if(res == 0){
            System.out.println("Jogador 2 venceu: " + j2.nome);
            return false;
        }
        else if(res == 2){
            System.out.println("Empate!");
            return true;
        }
        else{
            System.out.println("Erro de digitação");
            return true;
        }
    }


}