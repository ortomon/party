package repository;

import entity.Guest;
import entity.GuestName;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GuestRepository {
    private final JdbcTemplate jdbcTemplate;

    public void create(Guest guest) {
        String sql = """
                insert into party.guest (name, email, phone) values (?, ?, ?);
                """;
        jdbcTemplate.execute("");
        jdbcTemplate.update(guest.getName(), guest.getEmail(), guest.getPhone());
    }

    public List<GuestName> findAll () {
        String sql
    }
}
