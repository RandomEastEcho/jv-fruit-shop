package core.basesyntax.service;

import core.basesyntax.db.FruitMapImpl;
import java.util.stream.Collectors;

public class ReportService {
    private static final String HEADER = "fruit,quantity";
    private static final String SEPARATOR = ",";

    public String generateReport() {
        return FruitMapImpl.fruitMap.entrySet().stream()
                .map(e -> e.getKey() + SEPARATOR + e.getValue())
                .collect(Collectors.joining(System.lineSeparator(), HEADER
                        + System.lineSeparator(), System.lineSeparator()));
    }
}
