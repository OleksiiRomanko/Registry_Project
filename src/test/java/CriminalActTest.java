import com.kp_42.Model.Entity.CriminalActEntity;
import com.kp_42.Model.Repositories.CriminalActRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/root-context.xml")
public class CriminalActTest {

    @Inject
    private CriminalActRepository criminalActRepository;

    @Test
    public void criminalActTest(){

        CriminalActEntity crime = new CriminalActEntity();
        crime.setActivationDate(new Date().getTime());
        crime.setCriminalDescription("Description about crim");
        crime.setCriminalType("Type 1");
        crime.setDateoffPenalty(new Date().getTime());
        crime.setDateRepaymentConvitions(new Date().getTime());
////        crime.setExtraction();
//        crime.
//        //        lawRepository.save(law);

    }
}
