package org.example;

import org.example.Transaction.Type;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Client c1= new Client("cle101","Mouina","youssef","233454433","marrakech amerchich","youssef@gmail.com");
        Client c2= new Client("cle102","mouina","hicham","5624353534","Taza","hicham@gmail.com");
        Compte cmp1=new Compte("12",new Date(123,8,11),new Date(124,8,11),"USD",c1);
        Compte cmp2=new Compte("13",new Date(123,5,11),new Date(124,5,11),"USD",c2);
        c1.AddCompte(cmp1);
        c2.AddCompte(cmp2);
        Transaction t1=new Transaction(Type.VIRIN,"11-12-2024","ref101",cmp1,cmp2);
        cmp1.AddTransaction(t1);
        cmp2.AddTransaction(t1);
        c1.AfficherComptes();
        System.out.println(cmp1.getClient().getNumClient());
        cmp1.compte_json();
        t1.transaction_json();

    }
}
