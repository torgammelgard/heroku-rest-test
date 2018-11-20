package se.torgammelgard.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.springframework.util.Assert.notNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Value("spring.datasource.url")
    private String dbUrl;


    @Autowired
    private DataSource dataSource;

    @Test
    public void checkDbUrl() {
        notNull(dataSource);
        try (Connection connection = dataSource.getConnection()) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from test");
            while (rs.next()) {
                System.out.println(rs.getString(0));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
