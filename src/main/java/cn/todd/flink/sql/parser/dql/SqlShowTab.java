package cn.todd.flink.sql.parser.dql;

import java.util.Collections;
import java.util.List;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlOperator;
import org.apache.calcite.sql.SqlSpecialOperator;
import org.apache.calcite.sql.SqlWriter;
import org.apache.calcite.sql.parser.SqlParserPos;

// show tables 语句解析后生成的SqlNode
public class SqlShowTab extends SqlCall {
  public static final SqlSpecialOperator OPERATOR = new SqlSpecialOperator("SHOW TAB", SqlKind.OTHER);
  public SqlShowTab(SqlParserPos pos) {
    super(pos);
  }
  @Override
  public SqlOperator getOperator() {
    return OPERATOR;
  }
  @Override
  public List<SqlNode> getOperandList() {
    return Collections.emptyList();
  }
  @Override
  public void unparse(
      SqlWriter writer,
      int leftPrec,
      int rightPrec) {
    writer.keyword("SHOW TAB");
  }
}
