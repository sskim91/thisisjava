package chapter08_practice;

public class OracleDao implements DataAccessObject {

    private String oracleStr;

    public OracleDao() {
        this.oracleStr = "Oracle DB";
    }

    @Override
    public void select() {
        System.out.println(oracleStr+"에서 검색");
    }

    @Override
    public void insert() {
        System.out.println(oracleStr+"에서 삽입");
    }

    @Override
    public void update() {
        System.out.println(oracleStr+"에서 수정");
    }

    @Override
    public void delete() {
        System.out.println(oracleStr+"에서 삭제");
    }
}
