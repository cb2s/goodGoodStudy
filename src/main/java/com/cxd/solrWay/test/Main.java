package com.cxd.solrWay.test;

import com.cxd.solrWay.parse.v1.solrParser.SolrQueryParser;
import com.cxd.solrWay.parse.v1.statement.SolrStatementV1;
import com.cxd.solrWay.statement.StatementFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by childe on 2017/7/14.
 */
public class Main {

    public static void main(String[] args) {
        OrderVo orderVo = new OrderVo();
        orderVo.setId("0001");
        orderVo.setNo("no1");
        List<String> statusList = new ArrayList<>(3);
        statusList.add("1");
        statusList.add("2");
        statusList.add("3");
        orderVo.setStatusList(statusList);
        SolrStatementV1 solrStatement = StatementFactory.getStatementV1("sotiy1.getDemo");
        System.out.println(SolrQueryParser.parse(solrStatement,orderVo));
    }
}
