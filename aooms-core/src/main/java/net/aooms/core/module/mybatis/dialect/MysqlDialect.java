package net.aooms.core.module.mybatis.dialect;

import org.apache.ibatis.session.RowBounds;

/**
 * Mysql方言
 * Created by 风象南(cheereebo) on 2018-08-23
 */
public class MysqlDialect implements Dialect {

    @Override
    public String pagingQuery(String originalSql, RowBounds rowBounds) {
        String countsql = "select * from (" + originalSql + ") _table limit " + rowBounds.getOffset() + "," + rowBounds.getLimit();
        return  countsql;
    }
}
