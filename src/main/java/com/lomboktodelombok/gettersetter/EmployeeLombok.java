package com.lomboktodelombok.gettersetter;

import lombok.Getter;
import lombok.Setter;

public class EmployeeLombok {

    @Getter
    private int id;

    @Getter
    private String name;

    @Setter
    private double salary;

    @Getter @Setter
    private String jobTitle;
}
