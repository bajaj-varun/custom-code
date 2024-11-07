package com.simple.utils;

import com.simple.dcds_process.SparkSessionWrapper;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

import java.util.List;

public class CustomUtils implements SparkSessionWrapper {

    /**
     * TODO: Parquet read
     * @param path
     * @return
     */
    public Dataset<Row> readParquetFiles(String path){
        return spark.read()
                .option("header","true")
                .csv(path);
    }

    public void writeParquetFiles(Dataset<Row> df, String path){
        // TODO: Exception handling
        System.out.println("Implementation is pending");
    }
}
