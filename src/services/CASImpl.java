package services;

import exceptions.InsufficientBalanceException;
import exceptions.NotValidPaymentDataException;
import publicadministration.CreditCard;

import java.math.BigDecimal;
import java.net.ConnectException;
import java.util.Date;

public class CASImpl implements CAS {

    public boolean askForApproval(String nTrans, CreditCard cardData,
                                  Date date, BigDecimal imp) throws NotValidPaymentDataException,
            InsufficientBalanceException, ConnectException {
        return true;
    }
}
