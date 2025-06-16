package hellojpa;

import jakarta.persistence.*;

import java.util.List;
import java.util.logging.Logger;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        //code

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // 비영속
            Member member = new Member();
            member.setName("HelloJpa");

            // 영속
            em.persist(member); // 이 때 영속성 컨텍스트(1차 캐시)에 영속화

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
