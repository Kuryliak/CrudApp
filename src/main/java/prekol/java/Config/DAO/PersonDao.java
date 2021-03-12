    package prekol.java.Config.DAO;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.jdbc.core.BeanPropertyRowMapper;
    import org.springframework.jdbc.core.JdbcTemplate;
    import org.springframework.stereotype.Component;
    import prekol.java.Config.models.Person;

import java.util.List;
@Component
public class PersonDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDao(JdbcTemplate jdbcTemplate)  {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Person> index(){
        return jdbcTemplate.query("SELECT * FROM Person",new
                BeanPropertyRowMapper<>(Person.class));
    }
    public Person show(int id){
        return jdbcTemplate.query("SELECT * FROM Person WHERE id=?",
                new Object[]{id},new BeanPropertyRowMapper<>(Person.class))
                .stream().findAny().orElse(null);
    }
    public void save(Person person) {
        jdbcTemplate.update("INSERT INTO Person (email,age,firstname) VALUES(?,?,?)",person.getEmail(),
                person.getAge(),person.getFirstname());
    }
    public void update(int id,Person updatedperson){
        jdbcTemplate.update("UPDATE Person SET firstname=?,email=?,age=? WHERE id=?",
                updatedperson.getEmail(),updatedperson.getAge(),updatedperson.getFirstname(),id);
    }
    public void delete(int id){
        jdbcTemplate.update("DELETE FROM Person WHERE id=?",id);
    }
}