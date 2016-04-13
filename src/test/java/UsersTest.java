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
        UsersEntity user = createUser();
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
        UsersEntity user = createUser();
        user = usersRepository.save(user);
        user = usersRepository.findUserByName("Name");
        user.setName("Ivan");
        user = usersRepository.save(user);
        assertNotNull(usersRepository.findUserByName("Ivan"));
        passportsRepository.delete(user.getPassport());
        assertNull(usersRepository.findUserByName("Name"));
        assertNull(usersRepository.findUserByName("Ivan"));
    }

    @Test
    public void CreateUserAndDeleteByCerifRef(){

        UsersEntity user = createUser();
        user = usersRepository.save(user);
        user = usersRepository.findUserByName("Name");
        user.setName("Ivan");
        user = usersRepository.save(user);
        assertNotNull(usersRepository.findUserByName("Ivan"));
        birthCertificateRepository.delete(user.getBirthCertificate());
        assertNull(usersRepository.findUserByName("Name"));
        assertNull(usersRepository.findUserByName("Ivan"));
    }


    @Test
    public void CreateUserAndDeleteByUserRef(){

        UsersEntity user = createUser();
        user = usersRepository.save(user);
        user = usersRepository.findUserByName("Name");
        user.setName("Ivan");
        user = usersRepository.save(user);
        assertNotNull(usersRepository.findUserByName("Ivan"));
        usersRepository.delete(user);
        assertNull(usersRepository.findUserByName("Name"));
        assertNull(usersRepository.findUserByName("Ivan"));
    }


    private UsersEntity createUser(){

        UsersEntity user = new UsersEntity();
        user.setName("Name");
        user.setSecondName("Second Name");
        user.setSurname("Surname");
        user.setWorkplace(createWorkplace());
        user.setBirthCertificate(createBirthCertificate());
        user.setLivingPlace(createLivingPlace());
        user.setPassport(createPassport());
        return user;
    }

    private PassportsEntity createPassport(){

        PassportsEntity entity = new PassportsEntity();
        entity.setAuthor("Author");
        entity.setBirthDate(new Date().getTime());
        entity.setBirthPlace("Place");
        entity.setDate(new Date().getTime());
        entity.setNumber(959659656);
        entity.setSeries("Series");
        return entity;

    }

    private WorkplaceEntity createWorkplace(){

        WorkplaceEntity entity = new WorkplaceEntity();
        entity.setWorkplaceName("Name");
        entity.setAdress("Address");
        entity.setWorksphere("Sphere");

        WorktitleEntity title = new WorktitleEntity();
        title.setTitle("title");
        entity.setWorktitle(title);

        return entity;

    }

    private BirthCertificateEntity createBirthCertificate(){

        BirthCertificateEntity entity = new BirthCertificateEntity();
        entity.setBitrhPlace("Place");
        entity.setBirthDate(new Date().getTime());

        return entity;

    }

    private LivingPlaceEntity createLivingPlace(){

        LivingPlaceEntity livingPlaceEntity = new LivingPlaceEntity();

        livingPlaceEntity.setCity("City");
        livingPlaceEntity.setCountry("Country");
        livingPlaceEntity.setDistrict("District");
        livingPlaceEntity.setFlat("Flat");
        livingPlaceEntity.setHouse("house");
        livingPlaceEntity.setRegion("region");

        return livingPlaceEntity;

    }

}
