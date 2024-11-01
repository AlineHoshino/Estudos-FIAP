// C++ code
//

float entrada;
int led=10;
float saida;
void setup()
{
  Serial.begin(9600); //modulo serial
  pinMode(led,OUTPUT);
}

void loop()
{
	entrada= analogRead(A0);
  	saida= map(entrada, 0, 1023,0,255);
  	analogWrite(led,saida);
    Serial.print("Entrada : ");
    Serial.print(entrada );
    Serial.print("Saída: ");
    Serial.println(saida);
  	delay(1000); // Wait for 1000 millisecond(s)
}