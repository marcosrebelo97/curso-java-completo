package entities;

import entities.enums.WorkLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkLevel workLevel;
    private Double baseSalary;

    private Department department;
    private List<HourContract> hourContractList = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkLevel workLevel, Double baseSalary, Department department) {
        this.name = name;
        this.workLevel = workLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getWorkLevel() {
        return workLevel;
    }

    public void setWorkLevel(WorkLevel workLevel) {
        this.workLevel = workLevel;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getHourContractList() {
        return hourContractList;
    }

    public void addContract (HourContract contract){
        hourContractList.add(contract);
    }

    public void removeContract (HourContract contract){
        hourContractList.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for(HourContract contract : hourContractList){
            calendar.setTime(contract.getDate());
            int c_year = calendar.get(Calendar.YEAR);
            int c_month = 1 + calendar.get(Calendar.MONTH);
            if(year == c_year && month == c_month){
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}
