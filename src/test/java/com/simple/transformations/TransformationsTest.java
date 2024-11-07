package com.simple.transformations;

import com.simple.dcds_process.SparkSessionWrapper;
import junit.framework.TestCase;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

import java.util.List;

public class TransformationsTest extends TestCase implements SparkSessionWrapper {
    Transformations transformations = new Transformations();

    public void testCounter() {
        long result = transformations.myCounter();
        assertEquals(1, result);
    }

    public void testTf1(){
        Dataset<Row> row = transformations.tf1(1);
        assertNotNull(row);
//        JavaRDD<Row> objRow = row.javaRDD();

//        assertEquals(1, objRow["party_id"]);
//        assertEquals(2024-03-03, row.col("hist_eff_dte"));
//        assertEquals(2, row.col("upd_meth_cde"));
    }
}
