package ru.gb.family_tree.model;

import java.util.Comparator;

public class FamilyTreeComparatorBuName implements Comparator<Human>{
    @Override
    public int compare(Human o1, Human o2){
        return o1.getFIO().compareTo(o2.getFIO());
    }

}
