import com.kp_42.Model.Entity.*;
import com.kp_42.Model.Repositories.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by user on 13.04.2016.
 */



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/root-context.xml")
public class UsersTest {

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
    public void OrphanTest(){
        TestUtility dummy = new TestUtility();
        UsersEntity user = dummy.createUser();
        PassportsEntity entity = new PassportsEntity();

        entity.setAuthor("Author 2");
        entity.setBirthDate(new Date().getTime());
        entity.setBirthPlace("Place 2");
        entity.setDate(new Date().getTime());
        entity.setNumber(959659656);
        entity.setSeries("Series 2");

        user = usersRepository.save(user);
        user.setPassport(entity);
        user = usersRepository.save(user);
        usersRepository.delete(user);
    }

    @Test
    public void CreateUserAndDeleteByPassportRef(){

        TestUtility dummy = new TestUtility();
        UsersEntity user = dummy.createUser();
        user = usersRepository.save(user);
        user.setName("Ivan 1");
        user = usersRepository.save(user);
        assertNotNull(usersRepository.findUserByName("Ivan 1"));
        user = usersRepository.findUserByName("Ivan 1");
        passportsRepository.delete(user.getPassport());
        assertNull(usersRepository.findUserByName("Ivan 1"));
    }

    @Test
    public void CreateUserAndDeleteByCerifRef(){

        TestUtility dummy = new TestUtility();
        UsersEntity user = dummy.createUser();
        user = usersRepository.save(user);
        user.setName("Ivan 2");
        user = usersRepository.save(user);
        assertNotNull(usersRepository.findUserByName("Ivan 2"));
        user = usersRepository.findUserByName("Ivan 2");
        birthCertificateRepository.delete(user.getBirthCertificate());
        assertNull(usersRepository.findUserByName("Ivan 2"));
    }


    @Test
    public void CreateUserAndDeleteByUserRef(){

        TestUtility dummy = new TestUtility();
        UsersEntity user = dummy.createUser();
        user = usersRepository.save(user);
        user.setName("Ivan 3");
        user = usersRepository.save(user);
        assertNotNull(usersRepository.findUserByName("Ivan 3"));
        usersRepository.delete(user);
        assertNull(usersRepository.findUserByName("Ivan 3"));
    }

}
