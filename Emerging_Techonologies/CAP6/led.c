// C++ code
//
void setup()
{
  pinMode(LED_BUILTIN, OUTPUT); // configura pino de saída
  pinMode(9, OUTPUT);
}

void loop()
{
  digitalWrite(LED_BUILTIN, HIGH); // acende o led
  digitalWrite(9, HIGH); // acende o led
  delay(500); // Wait for 1000 millisecond(s)
  digitalWrite(LED_BUILTIN, LOW); // apaga o LED
  digitalWrite(9, LOW); // apaga o LED
  delay(250); // Wait for 1000 millisecond(s)
}