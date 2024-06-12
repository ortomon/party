package entity;

import lombok.Data;

@Data
public class Guest {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
