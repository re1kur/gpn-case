package re1kur.taskservice.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Value;

@Data
@Value
public class TaskWriteDto {
    @Positive
    Integer trackId;
    @NotBlank
    @Size(min = 5, max = 128)
    String name;
    @NotBlank
    String description;
    @Max(3)
    @Min(1)
    Integer level;
    @Positive
    Integer cost;
}
