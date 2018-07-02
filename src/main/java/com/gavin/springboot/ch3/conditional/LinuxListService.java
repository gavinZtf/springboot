package com.gavin.springboot.ch3.conditional;

/**
 * @author Gavin
 * @date 2018年7月2日
 */
public class LinuxListService implements ListService {

    @Override
    public String showListCmd() {
        return "LS";
    }

}
