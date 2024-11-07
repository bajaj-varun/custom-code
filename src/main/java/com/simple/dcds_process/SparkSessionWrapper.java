package com.simple.dcds_process;

import org.apache.spark.sql.SparkSession;

public interface SparkSessionWrapper {
    SparkSession spark = SparkSession
            .builder()
            .appName("DCDS transformations")
            .getOrCreate();

}
