package dev.jair.bogo.gerenciadorsalareuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.jair.bogo.gerenciadorsalareuniao.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
