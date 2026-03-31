

public static void main() {

  Scanner sc = new Scanner(System.in);
  int temp = sc.nextInt();

  switch (temp)
  {
    case 1:
      System.out.println("\nEx1:");
      System.out.println(" +\"\"\"\"\"+ ");
      System.out.println("[| o o |]");
      System.out.println(" |  ^  | ");
      System.out.println(" | '-' | ");
      System.out.println(" +-----+ ");
      break;

    case 2:
      System.out.println("\nEx2:");

      double x1 = Math.toRadians(25);
      double y1 = Math.toRadians(35);
      double x2 = Math.toRadians(35.5);
      double y2 = Math.toRadians(25.5);
      double raio = 6371.01;

      double d = raio * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

      System.out.println("\nDistância: " + d + " km");
      break;

    case 3:
      System.out.println("\nEx3:");
      System.out.print("Digite algo: ");
      sc.nextLine();
      String texto = sc.nextLine();

      int letras = 0;
      int espaco = 0;
      int numero = 0;
      int caracter = 0;

      for (int i = 0; i < texto.length(); i++)
      {
        char c = texto.charAt(i);

        if (Character.isLetter(c))
          letras++;
        else if (Character.isDigit(c))
          numero++;
        else if (c == ' ')
          espaco++;
        else
          caracter++;
      }

      System.out.println("Letras: " + letras);
      System.out.println("Nums: " + numero);
      System.out.println("Espaços: " + espaco);
      System.out.println("Outros: " + caracter);
      break;

    case 4:
      System.out.println("\nEx4:");

      int tentativas = 0;
      boolean acertou = false;

      while (tentativas < 3 && !acertou)
      {
        System.out.println("\nA) if roda se for true");
        System.out.println("B) if roda se for false");
        System.out.println("C) while não repete");
        System.out.println("D) switch usa condição");
        System.out.println("E) switch usa double");
        System.out.print("Resposta: ");

        String resposta = sc.next();

        switch (resposta)
        {
          case "A", "a":
            System.out.println("Acertou!");
            acertou = true;
            break;

          case "B", "b":
          case "C", "c":
          case "D", "d":
          case "E", "e":
            tentativas++;

            if (tentativas < 3)
              System.out.println("Errou, tenta dnv");
            else
              System.out.println("Errou tudo 😅");
            break;

          default:
            System.out.println("Inválido");
        }

        System.out.println("Tentativas: " + tentativas + "/3");
      }
  }
}