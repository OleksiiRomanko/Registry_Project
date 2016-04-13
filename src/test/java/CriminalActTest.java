import com.kp_42.Model.Entity.*;
import com.kp_42.Model.Repositories.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.Date;
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


        UsersEntity user = createUser();
        user = usersRepository.save(user);
        CriminalActEntity criminalAct = createCriminalAct();
//        criminalAct.setUser(user);
//        criminalActRepository.save(criminalAct);
//
//        criminalAct = criminalActRepository.findActByCriminalDescription("Test Law");
//        criminalAct.setCriminalDescription("New Test Law");
//        criminalAct = criminalActRepository.save(criminalAct);
//        criminalActRepository.delete(criminalAct);
//
//

        List<LawEntity> list = lawRepository.findAll();
        list.remove(0);

        criminalAct.setLaw(list);
        criminalAct.setUser(user);
        criminalActRepository.save(criminalAct);


    }

    private CriminalActEntity createCriminalAct() {

        CriminalActEntity crime = new CriminalActEntity();

//        crime.setLaw(createLaw());
        crime.setCriminalDescription("Test Law");
        crime.setCriminalType("Type 1");
        crime.setTribunalDate(new Date().getTime());
        crime.setActivationDate(new Date().getTime());
        crime.setPenaltyType("Penalty 1");
        crime.setRepaymentConvictions("Reason for repayment");
        crime.setDateRepaymentConvitions(new Date().getTime());
        crime.setRequisitesOfPaymentPenalty("Requisites");
        crime.setProcessOfCriminal("process");
        crime.setGroundOfPenalty("Ground 1");
        crime.setDateoffPenalty(new Date().getTime());

        return crime;

    }


    private UsersEntity createUser(){

        UsersEntity user = new UsersEntity();
        user.setName("Alex");
        user.setSecondName("Myer");
        user.setSurname("Sanders");
        user.setWorkplace(createWorkplace());
        user.setBirthCertificate(createBirthCertificate());
        user.setLivingPlace(createLivingPlace());
        user.setPassport(createPassport());

        return user;
    }

    private PassportsEntity createPassport(){

        PassportsEntity entity = new PassportsEntity();
        entity.setAuthor("Author 1");
        entity.setBirthDate(new Date().getTime());
        entity.setBirthPlace("Place ");
        entity.setDate(new Date().getTime());
        entity.setNumber(959659656);
        entity.setSeries("Series");

        return entity;

    }

    private WorkplaceEntity createWorkplace(){

        WorkplaceEntity entity = new WorkplaceEntity();
        entity.setWorkplaceName("Name 1");
        entity.setAdress("Address 1");
        entity.setWorksphere("Sphere 1");

        WorktitleEntity title = new WorktitleEntity();
        title.setTitle("title 1");
        entity.setWorktitle(title);

        return entity;

    }

    private BirthCertificateEntity createBirthCertificate(){

        BirthCertificateEntity entity = new BirthCertificateEntity();
        entity.setBitrhPlace("Place 1");
        entity.setBirthDate(new Date().getTime());

        return entity;

    }

    private LivingPlaceEntity createLivingPlace(){

        LivingPlaceEntity livingPlaceEntity = new LivingPlaceEntity();

        livingPlaceEntity.setCity("City ");
        livingPlaceEntity.setCountry("Country 1");
        livingPlaceEntity.setDistrict("District 1");
        livingPlaceEntity.setFlat("Flat 1");
        livingPlaceEntity.setHouse("house 1");
        livingPlaceEntity.setRegion("region 1");

        return livingPlaceEntity;

    }

    private LawEntity createLaw() {

        LawEntity law = new LawEntity();
        law.setName("Law 1");
        law.setType("Type 1");

        return law;
    }



}
