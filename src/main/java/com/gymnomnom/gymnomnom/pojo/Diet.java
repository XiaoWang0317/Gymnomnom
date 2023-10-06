package com.gymnomnom.gymnomnom.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diet {
    private int id;
    private String date;
    private int age;
    private double fat;
    private double vc;
    private double va;
    private double calories;
    private double protein;
    private double carbs;
}
