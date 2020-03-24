import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception{
        //given
        ProductCatalogue catalogue = new ProductCatalogue();

        //when
        catalogue.isSuppliedBy(Supplier.tom);
        catalogue.isSuppliedBy(Supplier.kate);

        //then
        assertThat(catalogue, containsInAnyOrder(door, floorPanel));
    }


}