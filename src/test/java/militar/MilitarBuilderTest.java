package militar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MilitarBuilderTest {

    @Test
    void deveRetornarExcecaoParaMilitarSemIdentidade() {
        try {
            MilitarBuilder militarBuilder = new MilitarBuilder();
            Militar militar = militarBuilder
                    .setNome("Danilo")
                    .setCpf("1234")
                    .build();
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Identidade inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMilitarSemCpf() {
        try {
            MilitarBuilder militarBuilder = new MilitarBuilder();
            Militar militar = militarBuilder
                    .setNome("João")
                    .setIdentidade("1234567")
                    .build();
        }catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarMilitarValido() {
        MilitarBuilder militarBuilder = new MilitarBuilder();
        Militar militar = militarBuilder
                .setNome("Pedro")
                .setIdentidade("1234")
                .setCpf("5678")
                .build();

        assertNotNull(militar);
    }
}

