package com.company;

public class Main {

    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto","Uzumaki");
        ninja.train();
        AcadedmicStudent academicStudent = new AcadedmicStudent("Sazuke","Uchiha");
        academicStudent.train();
        Chuunin chuunin = new Chuunin("Chuunin","nome","missao");
        chuunin.train();
        chuunin.goToMission();
        Jounin jounin = new Jounin("jounin","famm","dahora");
        jounin.train();
    }
    // pegar no git o fim do codigo -- eh para falar q da para usar
    // o resto q eh Ninja como Ninja ninja
}
