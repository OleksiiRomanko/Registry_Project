import com.kp_42.Model.Entity.UsersEntity;
import com.kp_42.Model.Interface.IAddService;
import com.kp_42.Model.Interface.IDeleteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by maxymratoshniuk on 4/14/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/root-context.xml")
public class ServicesTests {

    @Inject
    @Named("DeleteService")
    private IDeleteService iDeleteService;

    @Inject
    @Named("AddService")
    private IAddService iAddService;

    @Test
    public void AddAndDeleteUser() {
        TestUtility dummy = new TestUtility();

        UsersEntity testUser = iAddService.addUser("Max", "James", "Sanders", dummy.createPassport(), dummy.createWorkplace(),
                dummy.createBirthCertificate(), dummy.createLivingPlace());
        iDeleteService.deleteUser(testUser);
    }




}
