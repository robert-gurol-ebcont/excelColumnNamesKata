package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.Main.toCellReference;

public class Test {

    @ParameterizedTest
    @CsvSource({
            "0, 0, A1",
            "1, 1, B2",
            "2, 0, C1",
            "25, 0, Z1",
            "26, 0, AA1",
            "27, 0, AB1",
            "28, 0, AC1",
            "51, 0, AZ1",
            "52, 0, BA1",
            "675, 0, YZ1",
            "676, 0, ZA1",
            "701, 0, ZZ1",
            "702, 0, AAA1",
            "703, 0, AAB1",
    })
    public void toCellReference_convertsGivenNumbers(int column, int row, String expected) {
        assertThat(toCellReference(column, row)).isEqualTo(expected);
    }
}
