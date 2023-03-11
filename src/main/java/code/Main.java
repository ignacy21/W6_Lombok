package code;

import lombok.SneakyThrows;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

//        Owner owner = new Owner();
//        Dog romek = new Dog("romek", 5, owner);
//        romek.consume("rabarbar");

        Employee employee = Employee.builder()
                .name("Robert")
                .surname("Kowalski")
                .salary(BigDecimal.TEN)
                .build();
        System.out.println(employee);
    }

    @SneakyThrows
    private static void fileSize(Path path) {
        System.out.println(Files.size(path));
    }
}
