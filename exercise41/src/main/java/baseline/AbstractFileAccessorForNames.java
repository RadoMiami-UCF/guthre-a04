/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.File;
import java.util.List;

abstract class AbstractFileAccessorForNames {
    protected File fileToAccess;
    protected List<String> arrayListToAccess;

    protected AbstractFileAccessorForNames(List<String> inArrayList, File fileToAccessIn) {
        //Set arrayListToAccess to inArrayList.
        arrayListToAccess = inArrayList;
        //Set fileToAccess to fileToAccessIn.
        fileToAccess = fileToAccessIn;
    }
}
