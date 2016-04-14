package UnitTests;

import Utility.TestUtility;
import com.kp_42.Model.Entity.*;
import com.kp_42.Model.Interface.IDeleteService;
import com.kp_42.Model.Interface.IPersistService;
import com.kp_42.Model.Interface.ISearchService;
import com.kp_42.Model.Repositories.LawRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by maxymratoshniuk on 4/14/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/root-context.xml")
public class ServicesTests {

    @Inject
    @Named("DeleteService")
    private IDeleteService deleteService;

    @Inject
    @Named("PersistService")
    private IPersistService persistService;

    @Inject
    @Named("SearchService")
    private ISearchService searchService;

    @Inject
    private LawRepository lawRepository;


    @Test
    public void AddAndDeleteUser() {
        TestUtility dummy = new TestUtility();
        UsersEntity testUser = persistService.addUser("Max", "James", "Sanders", dummy.createPassport(), dummy.createWorkplace(),
                dummy.createBirthCertificate(), dummy.createLivingPlace());
        testUser = searchService.findUsersByPassport(testUser.getPassport());
        assertNotNull(testUser);
        testUser.setPassport(dummy.createPassport());
        testUser = persistService.save(testUser);
        assertNotNull(testUser);
        deleteService.deleteUser(testUser);
    }
    @Test
    public void AddAndDeleteUserAct() {
        TestUtility dummy = new TestUtility();

        UsersEntity testUser = persistService.addUser("Max", "James", "Sanders", dummy.createPassport(), dummy.createWorkplace(),
                dummy.createBirthCertificate(), dummy.createLivingPlace());

        CriminalActEntity criminalAct = dummy.createCriminalAct();

        LawEntity law1 = dummy.createLaw();
        LawEntity law2 = dummy.createLaw();
        List<LawEntity> list = new ArrayList<>();

        list.add(law1);
        list.add(law2);
        list = persistService.save(list);

        criminalAct.setLaw(list);
        criminalAct.setUser(testUser);
        criminalAct = persistService.save(criminalAct);

        criminalAct.setCriminalDescription("New Test Law");
        criminalAct = persistService.save(criminalAct);
        deleteService.deleteAct(criminalAct);
        deleteService.deleteLaw(law1);
        deleteService.deleteLaw(law2);
        deleteService.deleteUser(testUser);
    }

    @Test
    public void CheckAddAndDeleteActWithoutUser(){
        TestUtility dummy = new TestUtility();

        UsersEntity testUser = persistService.addUser("Max", "James", "Sanders", dummy.createPassport(), dummy.createWorkplace(),
                dummy.createBirthCertificate(), dummy.createLivingPlace());

        CriminalActEntity criminalAct = dummy.createCriminalAct();

        LawEntity law1 = dummy.createLaw();
        LawEntity law2 = dummy.createLaw();
        List<LawEntity> list = new ArrayList<>();

        list.add(law1);
        list.add(law2);
        list = persistService.save(list);

        criminalAct.setLaw(list);
        criminalAct.setUser(testUser);
        criminalAct = persistService.save(criminalAct);

        criminalAct.setCriminalDescription("New Test Law");
        criminalAct = persistService.save(criminalAct);
        deleteService.deleteAct(criminalAct);
        deleteService.deleteLaw(law1);
        deleteService.deleteLaw(law2);
    }

    @Test
    public void AddAndDeleteUserPassport() {
        TestUtility dummy = new TestUtility();
        UsersEntity testUser = persistService.addUser("Max", "James", "Sanders", dummy.createPassport(), dummy.createWorkplace(),
                dummy.createBirthCertificate(), dummy.createLivingPlace());
        testUser = searchService.findUsersByPassport(testUser.getPassport());
        assertNotNull(testUser);
        testUser.setPassport(dummy.createPassport());
        testUser = persistService.save(testUser);
        assertNotNull(testUser);
        PassportsEntity pass = testUser.getPassport();
        deleteService.deleteUser(pass);
    }
    @Test
    public void AddAndDeleteUserBirthCertificate (){
        TestUtility dummy = new TestUtility();
        UsersEntity testUser = persistService.addUser("Max", "James", "Sanders", dummy.createPassport(), dummy.createWorkplace(),
                dummy.createBirthCertificate(), dummy.createLivingPlace());
        testUser = searchService.findUsersByCertificate(testUser.getBirthCertificate());
        assertNotNull(testUser);
        testUser.setPassport(dummy.createPassport());
        testUser = persistService.save(testUser);
        assertNotNull(testUser);
        BirthCertificateEntity certificate = testUser.getBirthCertificate();
        deleteService.deleteUser(certificate);
    }

    @Test
    public void AddFindAndDeleteUserByCertificate () {
        TestUtility dummy = new TestUtility();
        BirthCertificateEntity certificate = dummy.createBirthCertificate();
        UsersEntity testUser = persistService.addUser("Max", "James", "Sanders", dummy.createPassport(), dummy.createWorkplace(), certificate
                , dummy.createLivingPlace());
        testUser = searchService.findUsersByCertificate(testUser.getBirthCertificate());
        assertNotNull(testUser);
        testUser.setPassport(dummy.createPassport());
        testUser = persistService.save(testUser);
        assertNotNull(testUser);
        deleteService.deleteUser(certificate);


    }



}
