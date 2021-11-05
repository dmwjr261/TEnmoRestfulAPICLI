package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.*;

import java.security.Principal;
import java.util.List;

public interface UserDao {

    List<User> findAll();

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password);

    double getBalanceByUsername(String username);

    int createTransfer(TransferPayment transfer) throws InsufficientFundsException;

    List<TransferHistory> getTransfersForUser(String user);

    List<User> getAllUsers();

    TransferDetails getTransferDetails(int id);
}
