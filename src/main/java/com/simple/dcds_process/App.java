package com.simple.dcds_process;

import com.simple.transformations.Transformations;
import com.simple.utils.CustomUtils;

public class App{


    public static void main( String[] args ){
        CustomUtils utils = new CustomUtils();
        Transformations tf = new Transformations();
        tf.myCounter();

        // First transformation
        utils.writeParquetFiles(tf.tf1(1), "tempPath");
    }


}
