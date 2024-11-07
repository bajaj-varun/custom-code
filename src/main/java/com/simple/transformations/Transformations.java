package com.simple.transformations;

import com.simple.dcds_process.SparkSessionWrapper;
import com.simple.utils.CustomUtils;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import java.util.List;

public class Transformations implements SparkSessionWrapper {
    Dataset<Row> df;

    public Transformations() {
        this.df = new CustomUtils().readParquetFiles("test.csv");
    }

    public long myCounter(){
        this.df.show();
        return this.df.count();
    }

    public Dataset<Row> tf1(int party_id){
        Dataset<Row> t = this.df.filter(this.df.col("party_id").equalTo(party_id));
        t.show();
        return t;
    }

}
