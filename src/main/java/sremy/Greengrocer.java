package sremy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Greengrocer {

    Map<String, Long> mapProductPrice = new HashMap<String, Long>();

    public void appendItems(Map<String, Long> mapProductPrice) {
        this.mapProductPrice.putAll(mapProductPrice);
    }


}
