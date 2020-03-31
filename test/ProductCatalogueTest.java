import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception{
        //given
        ProductCatalogue catalogue = new ProductCatalogue();

        //when
        catalogue.isSuppliedBy(ProductFixtures.bobs);
        catalogue.isSuppliedBy(ProductFixtures.kates);

        //then
        assertThat(catalogue, contains(ProductFixtures.door, ProductFixtures.floorPanel));
    }


}