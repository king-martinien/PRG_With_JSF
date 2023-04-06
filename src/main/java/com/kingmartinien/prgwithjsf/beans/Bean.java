/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kingmartinien.prgwithjsf.beans;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author kingmartinien
 */
@Named(value = "bean")
@RequestScoped
public class Bean {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Integer> getNumbers() {
        int size = 5;

        List<Integer> numberList = new ArrayList<Integer>(size);
        for (int i = number; i < this.number + size; i++) {
            numberList.add(i);
        }
        return numberList;
    }
}
