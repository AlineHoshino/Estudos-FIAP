long readUltrasonicDistance(int pin)
{
  pinMode(pin, OUTPUT);  // limpa o trigger, pin como saida
  digitalWrite(pin, LOW);  // pin em nivel lógico baixo (LOW)
  delayMicroseconds(2);  //delay de 2 micro seg.
  // coloca pin em nivel lógico Alto (HIGH)
  digitalWrite(pin, HIGH);
  delayMicroseconds(10);  // delay de 10micro seg.
  digitalWrite(pin, LOW); //pin em nivel lógico baixo (LOW)
  pinMode(pin, INPUT);  //configura o pin como entrada.
  // Lê o pino e retorna com o tempo de duração do pulso
  return pulseIn(pin, HIGH);
}

void setup()
{
  pinMode(3, INPUT);
  pinMode(5, OUTPUT);
}

void loop()
{
  if (15 > 0.01723 * readUltrasonicDistance(3)) {
    tone(5, 523, 1000); // toca a nota dó (C5 = 523 Hz)
    delay(1000); // delay de 1seg
  }
}