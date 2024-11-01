//** Definições **//
int vermelho=7;  //definição da porta para o led vermelho
int amarelo=4;  //definição da porta para o led amarelo
int verde=2;    //definição da porta para o led verde
//** Programa **//
void setup() {
 pinMode(verde,OUTPUT);  //direcionar a porta verde         pinMode(amarelo,OUTPUT); //direcionar a porta amarela  pinMode(vermelho,OUTPUT); //direcionar a porta vermelha
}
void loop() {
 digitalWrite(verde,HIGH); //acender o led verde
 delay(5000);               //esperar 5 segundos
 digitalWrite(verde,LOW);   //apagar o led verde
 delay(500);
 digitalWrite(verde,HIGH);  //acender o led verde
 delay(500);                //esperar meio segundo
 digitalWrite(verde,LOW);   //apagar o led verde
 delay(500);                //aguardar meio segundo
 digitalWrite(verde,HIGH);  //acender o led verde
 delay(500);                //esperar meio segundo
 digitalWrite(verde,LOW);   //apagar o led verde
 delay(500);                //esperar meio segundo

 digitalWrite(amarelo,HIGH); //acender o led amarelo
 delay(500);                 //esperar meio segundo
 digitalWrite(amarelo,LOW);  //apagar o led amarelo
 delay(500);                 //aguardar meio segundo
 digitalWrite(amarelo,HIGH); //acender o led amarelo
 delay(500);                 //aguardar meio segundo
 digitalWrite(amarelo,LOW);  //apagar o led amarelo
 delay(500);                 //aguardar meio segundo
 digitalWrite(amarelo,HIGH); //acender o led amarelo
 delay(500);
 digitalWrite(amarelo,LOW);  //apagar o led amarelo
 delay(500);                 //aguardar meio segundo
 digitalWrite(vermelho,HIGH);//acender o led vermelho
 delay(5000);                //esperar 5 segundos
 digitalWrite(vermelho,LOW); //apagar o led vermelho
 delay(500);                 //aguardar meio segundo
}