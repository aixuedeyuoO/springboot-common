package com.stream.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author aixuedeyuoO
*/
public class TestTableInfo implements Serializable {

    private static final long serialVersionUID = 1579505045682L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:0
    */
    private String name;

    /**
    * 
    * isNullAble:0
    */
    private String testMessage;

    /**
    * 
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime updatedTime;

    /**
    * 
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime createdTime;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setTestMessage(String testMessage){this.testMessage = testMessage;}

    public String getTestMessage(){return this.testMessage;}

    public void setUpdatedTime(java.time.LocalDateTime updatedTime){this.updatedTime = updatedTime;}

    public java.time.LocalDateTime getUpdatedTime(){return this.updatedTime;}

    public void setCreatedTime(java.time.LocalDateTime createdTime){this.createdTime = createdTime;}

    public java.time.LocalDateTime getCreatedTime(){return this.createdTime;}
    @Override
    public String toString() {
        return "TestTableInfo{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "testMessage='" + testMessage + '\'' +
                "updatedTime='" + updatedTime + '\'' +
                "createdTime='" + createdTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private TestTableInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(TestTableInfo set){
            this.set = set;
            return this;
        }

        public TestTableInfo getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends TestTableInfo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> testMessageList;

        public List<String> getTestMessageList(){return this.testMessageList;}


        private List<String> fuzzyTestMessage;

        public List<String> getFuzzyTestMessage(){return this.fuzzyTestMessage;}

        private List<String> rightFuzzyTestMessage;

        public List<String> getRightFuzzyTestMessage(){return this.rightFuzzyTestMessage;}
        private List<java.time.LocalDateTime> updatedTimeList;

        public List<java.time.LocalDateTime> getUpdatedTimeList(){return this.updatedTimeList;}

        private java.time.LocalDateTime updatedTimeSt;

        private java.time.LocalDateTime updatedTimeEd;

        public java.time.LocalDateTime getUpdatedTimeSt(){return this.updatedTimeSt;}

        public java.time.LocalDateTime getUpdatedTimeEd(){return this.updatedTimeEd;}

        private List<java.time.LocalDateTime> createdTimeList;

        public List<java.time.LocalDateTime> getCreatedTimeList(){return this.createdTimeList;}

        private java.time.LocalDateTime createdTimeSt;

        private java.time.LocalDateTime createdTimeEd;

        public java.time.LocalDateTime getCreatedTimeSt(){return this.createdTimeSt;}

        public java.time.LocalDateTime getCreatedTimeEd(){return this.createdTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder fuzzyTestMessage (List<String> fuzzyTestMessage){
            this.fuzzyTestMessage = fuzzyTestMessage;
            return this;
        }

        public QueryBuilder fuzzyTestMessage (String ... fuzzyTestMessage){
            this.fuzzyTestMessage = solveNullList(fuzzyTestMessage);
            return this;
        }

        public QueryBuilder rightFuzzyTestMessage (List<String> rightFuzzyTestMessage){
            this.rightFuzzyTestMessage = rightFuzzyTestMessage;
            return this;
        }

        public QueryBuilder rightFuzzyTestMessage (String ... rightFuzzyTestMessage){
            this.rightFuzzyTestMessage = solveNullList(rightFuzzyTestMessage);
            return this;
        }

        public QueryBuilder testMessage(String testMessage){
            setTestMessage(testMessage);
            return this;
        }

        public QueryBuilder testMessageList(String ... testMessage){
            this.testMessageList = solveNullList(testMessage);
            return this;
        }

        public QueryBuilder testMessageList(List<String> testMessage){
            this.testMessageList = testMessage;
            return this;
        }

        public QueryBuilder fetchTestMessage(){
            setFetchFields("fetchFields","testMessage");
            return this;
        }

        public QueryBuilder excludeTestMessage(){
            setFetchFields("excludeFields","testMessage");
            return this;
        }

        public QueryBuilder updatedTimeBetWeen(java.time.LocalDateTime updatedTimeSt,java.time.LocalDateTime updatedTimeEd){
            this.updatedTimeSt = updatedTimeSt;
            this.updatedTimeEd = updatedTimeEd;
            return this;
        }

        public QueryBuilder updatedTimeGreaterEqThan(java.time.LocalDateTime updatedTimeSt){
            this.updatedTimeSt = updatedTimeSt;
            return this;
        }
        public QueryBuilder updatedTimeLessEqThan(java.time.LocalDateTime updatedTimeEd){
            this.updatedTimeEd = updatedTimeEd;
            return this;
        }


        public QueryBuilder updatedTime(java.time.LocalDateTime updatedTime){
            setUpdatedTime(updatedTime);
            return this;
        }

        public QueryBuilder updatedTimeList(java.time.LocalDateTime ... updatedTime){
            this.updatedTimeList = solveNullList(updatedTime);
            return this;
        }

        public QueryBuilder updatedTimeList(List<java.time.LocalDateTime> updatedTime){
            this.updatedTimeList = updatedTime;
            return this;
        }

        public QueryBuilder fetchUpdatedTime(){
            setFetchFields("fetchFields","updatedTime");
            return this;
        }

        public QueryBuilder excludeUpdatedTime(){
            setFetchFields("excludeFields","updatedTime");
            return this;
        }

        public QueryBuilder createdTimeBetWeen(java.time.LocalDateTime createdTimeSt,java.time.LocalDateTime createdTimeEd){
            this.createdTimeSt = createdTimeSt;
            this.createdTimeEd = createdTimeEd;
            return this;
        }

        public QueryBuilder createdTimeGreaterEqThan(java.time.LocalDateTime createdTimeSt){
            this.createdTimeSt = createdTimeSt;
            return this;
        }
        public QueryBuilder createdTimeLessEqThan(java.time.LocalDateTime createdTimeEd){
            this.createdTimeEd = createdTimeEd;
            return this;
        }


        public QueryBuilder createdTime(java.time.LocalDateTime createdTime){
            setCreatedTime(createdTime);
            return this;
        }

        public QueryBuilder createdTimeList(java.time.LocalDateTime ... createdTime){
            this.createdTimeList = solveNullList(createdTime);
            return this;
        }

        public QueryBuilder createdTimeList(List<java.time.LocalDateTime> createdTime){
            this.createdTimeList = createdTime;
            return this;
        }

        public QueryBuilder fetchCreatedTime(){
            setFetchFields("fetchFields","createdTime");
            return this;
        }

        public QueryBuilder excludeCreatedTime(){
            setFetchFields("excludeFields","createdTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public TestTableInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> testMessageList;

        public List<String> getTestMessageList(){return this.testMessageList;}


        private List<String> fuzzyTestMessage;

        public List<String> getFuzzyTestMessage(){return this.fuzzyTestMessage;}

        private List<String> rightFuzzyTestMessage;

        public List<String> getRightFuzzyTestMessage(){return this.rightFuzzyTestMessage;}
        private List<java.time.LocalDateTime> updatedTimeList;

        public List<java.time.LocalDateTime> getUpdatedTimeList(){return this.updatedTimeList;}

        private java.time.LocalDateTime updatedTimeSt;

        private java.time.LocalDateTime updatedTimeEd;

        public java.time.LocalDateTime getUpdatedTimeSt(){return this.updatedTimeSt;}

        public java.time.LocalDateTime getUpdatedTimeEd(){return this.updatedTimeEd;}

        private List<java.time.LocalDateTime> createdTimeList;

        public List<java.time.LocalDateTime> getCreatedTimeList(){return this.createdTimeList;}

        private java.time.LocalDateTime createdTimeSt;

        private java.time.LocalDateTime createdTimeEd;

        public java.time.LocalDateTime getCreatedTimeSt(){return this.createdTimeSt;}

        public java.time.LocalDateTime getCreatedTimeEd(){return this.createdTimeEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder fuzzyTestMessage (List<String> fuzzyTestMessage){
            this.fuzzyTestMessage = fuzzyTestMessage;
            return this;
        }

        public ConditionBuilder fuzzyTestMessage (String ... fuzzyTestMessage){
            this.fuzzyTestMessage = solveNullList(fuzzyTestMessage);
            return this;
        }

        public ConditionBuilder rightFuzzyTestMessage (List<String> rightFuzzyTestMessage){
            this.rightFuzzyTestMessage = rightFuzzyTestMessage;
            return this;
        }

        public ConditionBuilder rightFuzzyTestMessage (String ... rightFuzzyTestMessage){
            this.rightFuzzyTestMessage = solveNullList(rightFuzzyTestMessage);
            return this;
        }

        public ConditionBuilder testMessageList(String ... testMessage){
            this.testMessageList = solveNullList(testMessage);
            return this;
        }

        public ConditionBuilder testMessageList(List<String> testMessage){
            this.testMessageList = testMessage;
            return this;
        }

        public ConditionBuilder updatedTimeBetWeen(java.time.LocalDateTime updatedTimeSt,java.time.LocalDateTime updatedTimeEd){
            this.updatedTimeSt = updatedTimeSt;
            this.updatedTimeEd = updatedTimeEd;
            return this;
        }

        public ConditionBuilder updatedTimeGreaterEqThan(java.time.LocalDateTime updatedTimeSt){
            this.updatedTimeSt = updatedTimeSt;
            return this;
        }
        public ConditionBuilder updatedTimeLessEqThan(java.time.LocalDateTime updatedTimeEd){
            this.updatedTimeEd = updatedTimeEd;
            return this;
        }


        public ConditionBuilder updatedTimeList(java.time.LocalDateTime ... updatedTime){
            this.updatedTimeList = solveNullList(updatedTime);
            return this;
        }

        public ConditionBuilder updatedTimeList(List<java.time.LocalDateTime> updatedTime){
            this.updatedTimeList = updatedTime;
            return this;
        }

        public ConditionBuilder createdTimeBetWeen(java.time.LocalDateTime createdTimeSt,java.time.LocalDateTime createdTimeEd){
            this.createdTimeSt = createdTimeSt;
            this.createdTimeEd = createdTimeEd;
            return this;
        }

        public ConditionBuilder createdTimeGreaterEqThan(java.time.LocalDateTime createdTimeSt){
            this.createdTimeSt = createdTimeSt;
            return this;
        }
        public ConditionBuilder createdTimeLessEqThan(java.time.LocalDateTime createdTimeEd){
            this.createdTimeEd = createdTimeEd;
            return this;
        }


        public ConditionBuilder createdTimeList(java.time.LocalDateTime ... createdTime){
            this.createdTimeList = solveNullList(createdTime);
            return this;
        }

        public ConditionBuilder createdTimeList(List<java.time.LocalDateTime> createdTime){
            this.createdTimeList = createdTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private TestTableInfo obj;

        public Builder(){
            this.obj = new TestTableInfo();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder testMessage(String testMessage){
            this.obj.setTestMessage(testMessage);
            return this;
        }
        public Builder updatedTime(java.time.LocalDateTime updatedTime){
            this.obj.setUpdatedTime(updatedTime);
            return this;
        }
        public Builder createdTime(java.time.LocalDateTime createdTime){
            this.obj.setCreatedTime(createdTime);
            return this;
        }
        public TestTableInfo build(){return obj;}
    }

}
