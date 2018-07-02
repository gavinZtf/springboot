package com.gavin.springboot.ch3.conditional;

/**
 * @author Gavin
 * @date 2018年7月2日
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
         return "CMD";
    }

}
