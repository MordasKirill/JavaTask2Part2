package net.epam.study.entity;

import java.util.ArrayList;
import java.util.List;

public class Appliance {// абсолюьно бесполезная иерехия классов. Мы на код-ревью разбирали эту ошибку, обсуждали, что делать.
    // из-за нее и остальной проект нельзя корректно написать
    List<String> applianceList;

    @Override
    public String toString() {
        return "Appliance: " + applianceList + '.';
    }

    public Appliance(List<String> test){
        this.applianceList = test;
    }

}
