package com.example.challenger;

public class ChallengerDTO {


    private String number = "";
    private Integer value = 0;

    /*
     * Chamada do metodo contrutor passando como parametro uma Classe
     *
     * e já settando toda a lógica no momento de intanciacao da Classe.
     *
     */

    public ChallengerDTO(Challenger challenger) {

        setNumber(challenger.getText());
    }


    public String getNumber() {
        return number;
    }


    public Integer getValue() {
        return value;
    }



    /*
     * Transformar toda a String em que nao for encontrado o padrao de valores
     *
     * em numeral romano, trocando todas as letras por "-", exceto I, V, X, L, C, D, M
     *
     */

    private String setStringToRomanFormat(String number) { return number.replaceAll("[^IVXLCDM]", "-"); }

    /*
     *
     * Checa o valor de um dado numero, ou numeros romanos
     *
     *
     */


    private static int checkValueOfRomanLetters(int maxValue1, String numbers) {
        for (int i = 0; i < numbers.length(); i++) {

            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(numbers.charAt(i));

            if(stringBuilder.toString().contains("I")) { maxValue1 += 1; }
            if(stringBuilder.toString().contains("V")) { maxValue1 += 5; }
            if(stringBuilder.toString().contains("X")) { maxValue1 += 10; }
            if(stringBuilder.toString().contains("L")) { maxValue1 += 50; }
            if(stringBuilder.toString().contains("C")) { maxValue1 += 100; }
            if(stringBuilder.toString().contains("D")) { maxValue1 += 500; }
            if(stringBuilder.toString().contains("M")) { maxValue1 += 1000; }

        }
        return maxValue1;
    }

    /*
     * Compara os valores para settar o maior valor
     *
     */
    public void setNumber(String number) {

        String newFormatString = setStringToRomanFormat(number);

        int maxValue1 = 0;
        int maxValueCompare = 0;

        String[] numberSplit = newFormatString.split("-");


        for(String numbers : numberSplit) {

            maxValue1 = checkValueOfRomanLetters(maxValue1, numbers);

            if(maxValue1 > maxValueCompare) {
                this.number = numbers;
                maxValueCompare = maxValue1;
                maxValue1 = 0;
            }


        }

        this.value = maxValueCompare;

    }



}
