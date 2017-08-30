package com.newwordpress.hum.persistence.model.user;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by humin on 4/11/2017.
 */
@Entity
@Table(name="sessions")
public class Sessions {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long session_id;

    @NotEmpty
    @Column(name="FLAG", nullable=false)
    private Boolean flag;

    @NotEmpty
    @Column(name="LAST_LOGIN_DATE", nullable=false)
    private Date last_login_date;

    @NotEmpty
    @Column(name="SESSION_TIME", nullable=false)
    private Date session_time;

    public Long getSession_id() {
        return session_id;
    }

    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Date getLast_login_date() {
        return last_login_date;
    }

    public void setLast_login_date(Date last_login_date) {
        this.last_login_date = last_login_date;
    }

    public Date getSession_time() {
        return session_time;
    }

    public void setSession_time(Date session_time) {
        this.session_time = session_time;
    }
}
