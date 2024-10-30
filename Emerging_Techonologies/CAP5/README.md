include é como o import no python 
Dados primitivos - tipo inteiro, float , char 
unsigned - não aceita valores negativos
printf(%d)- imprimir variavel tipo inteiro
%f quando for float
%c - caracter

para rodar gcc ex3.c -o nome qualuqer
scanf - leitura de dados pelo teclado 
scanf("%d", &x); - & - endereço de memoria

a função scanf() não apenas lê um valor digitado no teclado e o armazena em uma variavel de programa, mas tambem realiza a conversao de tipo em funçao da especificação do programador
função getchar()- obter caracteres

Uma string em C é um vetor de caracteres.
biblioteca string.h - tem concatenação

struct - é uma variável nova, quando usa vetor eles tem o mesmo tipo, struct armazena diversos tipos de dados diferentes
atof converte sring para float

variável do tipo ponteiro recebe um endereço de memória
variavel com asterisco é do tipo ponteiro 
int *printf
ptr = &x;  

Como a função do tipo void nao tem retorno, NÃO pode fazer assim: algo = exemplo(a, &d, &m)
só pode ser assim: exemplo(a, &d, &m)

(*p_cad).cod - atualizando o struct através do ponteiro, outro jeito de fazer : &p_cad->cod