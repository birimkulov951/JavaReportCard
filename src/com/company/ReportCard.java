package com.company;

public class ReportCard {

    String name;
    int englishGrade;
    int historyGrade;
    int mathGrade;

    public ReportCard(String name, int englishGrade, int historyGrade, int mathGrade) {
        this.name = name;
        this.englishGrade = englishGrade;
        this.historyGrade = historyGrade;
        this.mathGrade = mathGrade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = historyGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    @Override
    public String toString (){
        return "Name: " + name + ". English Grade: " + gradeView(getEnglishGrade()) +
                ". History Grade: " + gradeView(getHistoryGrade()) + ". Math Grade: " + gradeView(getMathGrade());
    }

    private String gradeView(int grade){

        if (grade>=90){
            return "AA";
        } else if (grade>=80) {
            return "BB";
        } else if (grade>=70) {
            return "CC";
        } else if (grade>=60) {
            return "DD";
        } else {
            return "FAILED";
        }
    }

}
