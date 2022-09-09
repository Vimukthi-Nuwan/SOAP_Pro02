package model;

import logic.ServiceImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Finder {
    ServiceImpl serviceImpl=new ServiceImpl();

    @WebMethod
    public int calculate(int year,int month,int day){

        return serviceImpl.calculate(year, month, day);

    }
}
