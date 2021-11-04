package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfer;
import com.techelevator.tenmo.model.User;

import java.security.Principal;
import java.util.List;

public interface UserDao {

    List<User> findAll();

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password);

    double getBalanceByUsername(String username);

    void createTransfer(Transfer transfer) throws InsufficientFundsException;

    public List<Transfer> getTransfersForUser(String user);
}
