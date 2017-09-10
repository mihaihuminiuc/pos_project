package com.newwordpress.hum.persistence.repository;

import com.newwordpress.hum.persistence.model.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Text, Long> {

    Text findByAuthorId(int id);
    Text findByPageName(String id);

}
