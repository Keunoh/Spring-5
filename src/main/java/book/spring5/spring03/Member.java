package book.spring5.spring03;

import java.time.LocalTime;

public class Member {

    private Long id;
    private String email;
    private String password;
    private String name;
    private LocalTime registerDateTime;

    public Member(String email, String password, String name, LocalTime registerDateTime) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.registerDateTime = registerDateTime;
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (!password.equals(oldPassword))
            throw new WrongIdPasswordException();
        this.password = newPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public LocalTime getRegisterDateTime() {
        return registerDateTime;
    }
}
