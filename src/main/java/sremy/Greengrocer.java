package sremy;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Greengrocer {

    private Map<String, Long> mapProductPrice = new HashMap<String, Long>();
    private ArrayList<Map.Entry<String, Long>> listProductWeight = new ArrayList<Map.Entry<String, Long>>();

    public void appendCatalogItems(Map<String, Long> mapProductPrice) {
        this.mapProductPrice.putAll(mapProductPrice);
    }


    public void buyItem(String product, Long weight) {
        this.listProductWeight.add(new AbstractMap.SimpleEntry<>(product, weight));
    }

    public long computePrice() {
        long sum = 0;
        for(Map.Entry<String, Long> kv : listProductWeight) {
            String product = kv.getKey();
            Long price = mapProductPrice.get(product);
            sum += price * kv.getValue() / 1000;
        }
        return sum;
    }
}
