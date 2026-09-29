public static void main(String[] args) {

        Mago mago = new Mago("Merlin", 5, 80, 100);
        Guerreiro guerreiro = new Guerreiro("Arthur", 7, 95, 90);
        Personagem invocador = new Personagem("Maelis", 1, 50);


        IO.println(mago);
        IO.println(guerreiro);
        IO.println(invocador);

        IO.println("ATAQUES)");
        mago.atacar();
        guerreiro.atacar();
        invocador.atacar();

        IO.println("REGRAS");

        mago.setVida(150);
        guerreiro.setNivel(-3);

        IO.println(mago.getNome() + " teve sua vida ajustada para: " + mago.getVida());
        IO.println(guerreiro.getNome() + " teve seu nível ajustado para: " + guerreiro.getNivel());
        IO.println(invocador.getNome() + " teve sua vida ajustada para:" + invocador.getVida());
    }
