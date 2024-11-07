package org.example;
import java.util.*;
import org.json.JSONObject;

public class Transaction {
    public enum Type{
        VIRIN,VIREST,VIRCAK,VIRMULTA;
    }
    private Type type;
    private String reference;
    private String timestamp;
    private Compte compte1;
    private Compte compte2;

    public Transaction(Type type,String reference,String timestamp,Compte c1,Compte c2) {
        this.type=type;
        this.reference = reference;
        this.timestamp = timestamp;
        this.compte1=c1;
        this.compte2=c2;

    }

    public String getReference() {
        return this.reference;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Compte getCompte1() {
        return this.compte1;
    }

    public Compte getCompte2() {
        return this.compte2;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setCompte1(Compte compte1) {
        this.compte1 = compte1;
    }

    public void setCompte2(Compte compte2) {
        this.compte2 = compte2;
    }


    public void transaction_json(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Type", this.type);
        jsonObject.put("Timestmp", this.timestamp);
        jsonObject.put("Reference", this.reference);
        jsonObject.put("numcompte1", this.compte1.getNumCompte());
        jsonObject.put("numcompte2", this.compte2.getNumCompte());
        System.out.println("JSON : " + jsonObject.toString());
    }
}
