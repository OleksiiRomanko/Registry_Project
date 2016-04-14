import com.kp_42.Model.Entity.CriminalActEntity;
import com.kp_42.Model.Entity.LawEntity;
import com.kp_42.Model.Entity.UsersEntity;
import com.kp_42.Model.Repositories.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/root-context.xml")


public class CriminalActTest {

    @Inject
    private CriminalActRepository criminalActRepository;
    @Inject
    private BirthCertificateRepository birthCertificateRepository;
    @Inject
    private CriminalActRepository actRepository;
    @Inject
    private ExtractionRepository extractionRepository;
    @Inject
    private LawRepository lawRepository;
    @Inject
    private LivingPlaceRepository livingPlaceRepository;
    @Inject
    private PassportsRepository passportsRepository;
    @Inject
    private UsersRepository usersRepository;
    @Inject
    private WorkPlaceRepository workPlaceRepository;
    @Inject
    private WorkTitleRepository workTitleRepository;




    @Test
    public void createAndDeleteCriminalAct(){


        TestUtility dummy = new TestUtility();
        UsersEntity user = dummy.createUser();
        user = usersRepository.save(user);
        CriminalActEntity criminalAct = dummy.createCriminalAct();

        LawEntity law1 = dummy.createLaw();
        LawEntity law2 = dummy.createLaw();
        List<LawEntity> list = new ArrayList<>();

        list.add(law1);
        list.add(law2);
        list = lawRepository.save(list);

        criminalAct.setLaw(list);
        criminalAct.setUser(user);
        criminalAct = criminalActRepository.save(criminalAct);

        criminalAct.setCriminalDescription("New Test Law");
        criminalAct = criminalActRepository.save(criminalAct);
        criminalActRepository.delete(criminalAct);
        lawRepository.delete(list);

        usersRepository.delete(user);

    }




}
