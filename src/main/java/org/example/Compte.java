package org.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Compte {
    private String numCompte;
    private Date dateCreation;
    private Date dateUpdate;
    private String devise;
    public Client client;
    public List<Transaction> transactions;

    public Compte(String numCompte, Date dateCreation, Date dateUpdate, String devise, Client client) {
        this.numCompte = numCompte;
        this.dateCreation = dateCreation;
        this.dateUpdate = dateUpdate;
        this.devise = devise;
        this.client = client;
        this.transactions=new ArrayList<>();
    }

    public String getNumCompte() {
        return this.numCompte;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public Date getDateUpdate() {
        return this.dateUpdate;
    }

    public String getDevise() {
        return this.devise;
    }

     public Client getClient(){
        return this.client;
     }

     public List <Transaction> getTransactions(){
        return this.transactions;
     }
    public void AfficherTransactions(){
        for(Transaction transaction :transactions){
            System.out.println(transaction.getReference());
        }
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void AddTransaction (Transaction t){
        this.transactions.add(t);
    }


    public void compte_json(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("numcompte", this.numCompte);
        // jsonObject.put("date create", this.dateCreat);
        // jsonObject.put("date update", this.dateUpdate);
        jsonObject.put("device", this.devise);
        jsonObject.put("client", this.client.getNumClient());
        JSONArray transactionArray = new JSONArray();
        for (Transaction transaction1 : this.transactions) {
            JSONObject compteJson = new JSONObject();
            compteJson.put("transaction", transaction1.getReference());
            transactionArray.put(compteJson);
        }
        jsonObject.put("transactions", transactionArray);
        System.out.println("JSON : " + jsonObject.toString());
    }
}
