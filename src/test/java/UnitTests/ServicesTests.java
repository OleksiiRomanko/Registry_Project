package UnitTests;

import Utility.TestUtility;
import com.kp_42.Model.Entity.UsersEntity;
import com.kp_42.Model.Interface.IDeleteService;
import com.kp_42.Model.Interface.IPersistService;
import com.kp_42.Model.Interface.ISearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.inject.Named;

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




}
