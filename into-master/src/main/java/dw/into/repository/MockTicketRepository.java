package dw.into.repository;

import dw.into.model.Mock;
import dw.into.model.MockTicket;
import dw.into.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MockTicketRepository extends JpaRepository<MockTicket, Integer> {
    Optional<MockTicket> findByUserAndMockAndIsUsedFalse(User user, Mock mock);

    List<MockTicket> findByStoreItemId(int storeItemId);
}