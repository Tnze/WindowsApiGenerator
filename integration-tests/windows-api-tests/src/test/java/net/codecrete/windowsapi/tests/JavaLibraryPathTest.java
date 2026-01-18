package net.codecrete.windowsapi.tests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JavaLibraryPathTest {
    @Test
    void javaLibraryPath_isOverridden() {
        assertThat(System.getProperty("java.library.path")).isEqualTo("C:/Users");
    }
}
