package controller;

public class Fatorial {
    public Fatorial(){
        super();
    }

    public int Func_Fatorial(int N){
        //Condição de parada: Quando N for igual a 1, retorna 1. Ou seja, quando N chegar a 1, a função para de chamar ela mesma,
        //e retorna o resultado de toda a pilha de processos (chamadas) e finaliza a função
        if(N==1){
            return 1;
        }
        return N * Func_Fatorial(N-1);

        /*
         * Fatorial na matemática já funciona de forma recursiva, onde N! seria: n * (n-1) * (n-2) ... etc
         * Diante disso, a função recebe como parâmetro o número que o usuário deseja ver o resultado de seu fatorial.
         * Assim, a função retorna N (O valor digitado pelo usuário) multiplicado pela própria função, chamando ela mesma
         * porém, diminuíndo o valor de N a cada chamada (N-1), até chegar na condição de parada, onde N seja igual 1, então
         * a função só retorna 1, finilizando a fila e multiplicando todos valores anteriores, e retornando o resultado final
         * do fatorial de N no console.
         */
    }
}
