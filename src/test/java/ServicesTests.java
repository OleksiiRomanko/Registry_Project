import com.kp_42.Model.Entity.*;
import com.kp_42.Model.Interface.IAddService;
import com.kp_42.Model.Interface.IDeleteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;

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

        UsersEntity testUser = iAddService.addUser("Max", "James", "Sanders", createPassport(), createWorkplace(),
                createBirthCertificate(), createLivingPlace());
        iDeleteService.deleteUser(testUser);
    }


    private PassportsEntity createPassport() {

        PassportsEntity entity = new PassportsEntity();
        entity.setAuthor("Author 1");
        entity.setBirthDate(new Date().getTime());
        entity.setBirthPlace("Place 1");
        entity.setDate(new Date().getTime());
        entity.setNumber(959659656);
        entity.setSeries("Series 1");
        return entity;

    }

    private WorkplaceEntity createWorkplace() {

        WorkplaceEntity entity = new WorkplaceEntity();
        entity.setWorkplaceName("Name 1");
        entity.setAdress("Address 1");
        entity.setWorksphere("Sphere 1");

        WorktitleEntity title = new WorktitleEntity();
        title.setTitle("title 1");
        entity.setWorktitle(title);

        return entity;

    }

    private BirthCertificateEntity createBirthCertificate() {

        BirthCertificateEntity entity = new BirthCertificateEntity();
        entity.setBitrhPlace("Place");
        entity.setBirthDate(new Date().getTime());

        return entity;

    }

    private LivingPlaceEntity createLivingPlace() {

        LivingPlaceEntity livingPlaceEntity = new LivingPlaceEntity();

        livingPlaceEntity.setCity("City 1 ");
        livingPlaceEntity.setCountry("Country 1");
        livingPlaceEntity.setDistrict("District 1");
        livingPlaceEntity.setFlat("Flat 1");
        livingPlaceEntity.setHouse("house 1");
        livingPlaceEntity.setRegion("region 1");

        return livingPlaceEntity;

    }

}
