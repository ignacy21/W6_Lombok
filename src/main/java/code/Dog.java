package code;


import lombok.*;

@Data
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
//@Getter
//@Setter

// @Data to wszystko p owyżej

@NoArgsConstructor(force = true)
//@AllArgsConstructor(staticName = "of")
@AllArgsConstructor
@With
public class Dog {


    private final String name;
    @EqualsAndHashCode.Exclude
    @Getter(value = AccessLevel.NONE)
    private final Integer age;
    private final Owner owner;

    public void consume(@NonNull String whatToConsume) {
        System.out.println("Consume " + whatToConsume);
    }
}

