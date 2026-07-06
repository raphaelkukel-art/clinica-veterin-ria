public class main {
    public static void main(String[] args) {
        
        //polimorfismo
        animal animal1 = new cachorro(
            Nome: "Bolinha",
            Especie: "Mamifero",
            Idade: 3,
            Pelagem: "curto e Liso",
            Patas: 4
        );

        animal animal2 = new papagaio(
            "Pirata",
            "ave",
            7,
            "medio e afinado",
        );
    }
}
public class Main {

    public static void main(String[] args) {

        Animal animal2 = new Papagaio(
                "Pirata",
                "Ave",
                7,
                "Médio e afinado",
                "Saudável",
                "Saudável"
        );

        Animal animal3 = new Peixe(
                "Nemo",
                "Tilápia",
                1,
                "Escamas",
                "Cauda"
        );

        Animal[] acervo = {animal1, animal2, animal3};

        for (Animal animal : acervo) {
            animal.exibirInformacoes();
            System.out.println(x: "---------------");
        }
    }
}
