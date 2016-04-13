import com.kp_42.Model.Entity.LawEntity;
import com.kp_42.Model.Repositories.LawRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by user on 13.04.2016.
 */


/*

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/root-context.xml")
public class SimpleDaoIT  {


 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/root-context.xml")
public class OrmTests {


    @Inject
    private LawRepository lawRepository;

    @Test
    public void lawTest(){

        LawEntity law = new LawEntity();
        law.setName("Law 1");
        law.setType("Type 1");
        lawRepository.save(law);

    }



}
