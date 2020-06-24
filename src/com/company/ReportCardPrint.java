package com.company;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;

public class ReportCardPrint extends ArrayList<ReportCard> {


    public static void main(String[] args) {

        ArrayList<ReportCard> cards = new ArrayList<>();
        cards.add(new ReportCard("Azamat",56,69,80));
        cards.add(new ReportCard("Nurik",25,45,100));
        cards.add(new ReportCard("Kamaz Driver",34,55,70));
        cards.add(new ReportCard("John",70,80,90));
        cards.add(new ReportCard("Bermet",65,65,95));

        for (ReportCard el: cards ) {
            System.out.println(el.toString());
        }

        cards.get(1).setEnglishGrade(90);

        System.out.println("Nurik's English grade is changed!!!");
        System.out.println("***********************************");

        for (ReportCard el: cards ) {
            System.out.println(el.toString());
        }

    }
}
