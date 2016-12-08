package com.github.knightliao.canalx.db.test;

import java.util.Map;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.github.knightliao.canalx.db.DbFetchControllerFactory;
import com.github.knightliao.canalx.db.IDbFetchController;

/**
 * @author knightliao
 * @date 2016/11/29 15:12
 */
public class DbFetchControllerTest {

    @Ignore
    @Test
    public void test() {

        try {

            IDbFetchController dbFetchController = DbFetchControllerFactory.getDefaultDbController();

            dbFetchController.init("canalx-db-kv.xml");
            Map<String, Map<String, String>> dbKvs = dbFetchController.getInitDbKv();

            for (String tableId : dbKvs.keySet()) {

                System.out.println("table identify: " + tableId);
                System.out.println("table kv:" + dbKvs.get(tableId));
            }

        } catch (Exception e) {

            Assert.assertTrue(false);
        }
    }
}