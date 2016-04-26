package Utility;

import com.kp_42.Model.Entity.*;

import java.util.Date;
import java.util.Random;

/**
 * Created by user on 14.04.2016.
 */
public class TestUtility {

    private final long SERIAL;

    public TestUtility() {
        SERIAL = new Random().nextLong();
    }

    public CriminalActEntity createCriminalAct() {

        CriminalActEntity crime = new CriminalActEntity();

//        crime.setLaw(createLaw());
        crime.setCriminalDescription("Test Description " + SERIAL);
        crime.setCriminalType("Type " + SERIAL);
        crime.setTribunalDate(new Date().getTime());
        crime.setActivationDate(new Date().getTime());
        crime.setPenaltyType("Penalty " + SERIAL);
        crime.setRepaymentConvictions("Reason for repayment "+ SERIAL);
        crime.setDateRepaymentConvitions(new Date().getTime());
        crime.setRequisitesOfPaymentPenalty("Requisites "+ SERIAL);
        crime.setProcessOfCriminal("process "+ SERIAL);
        crime.setGroundOfPenalty("Ground " + SERIAL);
        crime.setDateoffPenalty(new Date().getTime());

        return crime;

    }


    public UsersEntity createUser(){

        UsersEntity user = new UsersEntity();
        user.setName("Name "+ SERIAL);
        user.setSecondName("Second name "+ SERIAL);
        user.setSurname("Surname "+ SERIAL);
        user.setWorkplace(createWorkplace());
        user.setBirthCertificate(createBirthCertificate());
        user.setLivingPlace(createLivingPlace());
        user.setPassport(createPassport());

        return user;
    }

    public PassportsEntity createPassport(){

        PassportsEntity entity = new PassportsEntity();
        entity.setAuthor("Author " + SERIAL);
        entity.setBirthDate(new Date().getTime());
        entity.setBirthPlace("Place " + SERIAL );
        entity.setDate(new Date().getTime());
        entity.setNumber(5454445);
        entity.setSeries("SS");

        return entity;

    }

    public WorkplaceEntity createWorkplace(){

        WorkplaceEntity entity = new WorkplaceEntity();
        entity.setWorkplaceName("Name "+ SERIAL);
        entity.setAdress("Address "+ SERIAL);
        entity.setWorksphere("Sphere "+ SERIAL);

        WorktitleEntity title = new WorktitleEntity();
        title.setTitle("title "+ SERIAL);
        entity.setWorktitle(title);

        return entity;

    }

    public BirthCertificateEntity createBirthCertificate(){

        BirthCertificateEntity entity = new BirthCertificateEntity();
        entity.setBitrhPlace("Place "+ SERIAL);
        entity.setBirthDate(new Date().getTime());

        return entity;

    }

    public LivingPlaceEntity createLivingPlace(){

        LivingPlaceEntity livingPlaceEntity = new LivingPlaceEntity();

        livingPlaceEntity.setCity("City " + SERIAL);
        livingPlaceEntity.setCountry("Country " + SERIAL);
        livingPlaceEntity.setDistrict("District " + SERIAL);
        livingPlaceEntity.setFlat("Flat " + SERIAL);
        livingPlaceEntity.setHouse("house " + SERIAL);
        livingPlaceEntity.setRegion("region " + SERIAL);

        return livingPlaceEntity;

    }

    public LawEntity createLaw() {

        LawEntity law = new LawEntity();
        law.setName("Law " + SERIAL);
        law.setType("Type " + SERIAL);

        return law;
    }

    public ExtractionEntity createExtraction (){
        ExtractionEntity ext = new ExtractionEntity();
        ext.setDate(new Date().getTime());
        ext.setIsPresent(0);
        ext.setNumber("0");
        ext.setSourceInformation("information" + SERIAL );
        return ext;
    }

}
