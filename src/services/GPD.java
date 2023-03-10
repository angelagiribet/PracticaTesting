package services;

import exceptions.IncorrectVerificationException;
import publicadministration.Citizen;
import data.Goal;
import java.net.ConnectException;

public interface GPD { // External service that represents the General Police Direction

    boolean verifyData(Citizen persData, Goal goal)
            throws IncorrectVerificationException, ConnectException;

}
