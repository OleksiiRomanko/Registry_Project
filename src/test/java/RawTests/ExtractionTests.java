package RawTests;

import Utility.TestUtility;
import com.kp_42.Model.Entity.CriminalActEntity;
import com.kp_42.Model.Entity.ExtractionEntity;
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

/**
 * Created by lysogordima on 13.04.16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/root-context.xml")
public class ExtractionTests {
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
    public void complexTestOfCreatingExctraction(){


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
        actRepository.save(criminalAct);
        ExtractionEntity extraction = dummy.createExtraction();
        extraction.setUser(criminalAct.getUser());
        extraction.setCriminalAct(criminalAct);
        extractionRepository.save(extraction);
        extractionRepository.delete(extraction);
        actRepository.delete(criminalAct);
        lawRepository.delete(list);
        usersRepository.delete(user);

    }





}
