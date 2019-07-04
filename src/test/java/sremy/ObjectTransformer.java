package sremy;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;

import java.util.Locale;

public class ObjectTransformer implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.FRANCE;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(DataTableType.entry(Product.class));
        typeRegistry.defineDataTableType(DataTableType.entry(Discount.class));
    }
}
