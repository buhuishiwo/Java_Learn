import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

//通过实现 FactoryBean 接口实现自定义 Bean 实例化
public class DateFactoryBean implements FactoryBean<Date> {

    private String strDate;

    //构造注入
//    public DateFactoryBean(String strDate) {
//        this.strDate = strDate;
//    }
    //set注入
    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strDate);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
