package services;

import data.Goal;
import exceptions.IncorrectVerificationException;
import publicadministration.Citizen;

import java.net.ConnectException;

public class GPDImpl {
    boolean verifyData(Citizen persData, Goal goal)
            throws IncorrectVerificationException, ConnectException {
        return true;
    }
}
