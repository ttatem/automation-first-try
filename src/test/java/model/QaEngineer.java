package model;

public class QaEngineer {
    public String currentPosition;
    public int yearsOfExperience;
    public boolean automationKnowledge;
    public int IQ;
    public long expectedAnnualSalary;

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isAutomationKnowledge() {
        return automationKnowledge;
    }

    public void setAutomationKnowledge(boolean automationKnowledge) {
        this.automationKnowledge = automationKnowledge;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public long getExpectedAnnualSalary() {
        return expectedAnnualSalary;
    }

    public void setExpectedAnnualSalary(long expectedAnnualSalary) {
        this.expectedAnnualSalary = expectedAnnualSalary;
    }
}
