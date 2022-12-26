package services;

import data.Nif;
import data.SmallCode;
import exceptions.AnyMobileRegisteredException;
import exceptions.IncorrectValDateException;
import exceptions.NifNotRegisteredException;
import exceptions.NotValidPINException;

import java.net.ConnectException;
import java.util.Date;

public class CertificationAuthorityImpl {
    public boolean sendPIN (Nif nif, Date date) throws NifNotRegisteredException, IncorrectValDateException, AnyMobileRegisteredException,
            ConnectException {
        return true;
    }
    public boolean checkPIN (Nif nif, SmallCode pin) throws NotValidPINException, ConnectException {
        return true;
    }
}
