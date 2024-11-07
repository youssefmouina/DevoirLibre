package org.example;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;
public class Client {
    private String numClient;
    private String nom;
    private String prenom;
    private String phone;
    private String adresse;
    private String email;
    public List <Compte> comptes;

    public Client(String nom, String numClient, String prenom, String phone, String adresse, String email) {
        this.nom = nom;
        this.numClient = numClient;
        this.prenom = prenom;
        this.phone = phone;
        this.adresse = adresse;
        this.email = email;
        this.comptes=new ArrayList<>();
    }

    public String getNumClient() {
        return this.numClient;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public String getEmail() {
        return this.email;
    }

    public List<Compte> getComptes() {
        return this.comptes;
    }


    public void AfficherComptes(){
          for(Compte compte :comptes){
              System.out.println(compte.getNumCompte());
          }
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public void AddCompte(Compte compte){
        comptes.add(compte);
    }
    public void client_json(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("numclient", this.numClient);
        jsonObject.put("nom", this.nom);
        jsonObject.put("prenom", this.prenom);
        jsonObject.put("adresse", this.adresse);
        jsonObject.put("phone", this.phone);
        jsonObject.put("email", this.email);
        JSONArray compteArray = new JSONArray();
        for (Compte compte : this.comptes) {
            JSONObject compteJson = new JSONObject();
            compteJson.put("numcompte", compte.getNumCompte());
            compteArray.put(compteJson);
        }
        jsonObject.put("comptes", compteArray);
        System.out.println("JSON : " + jsonObject.toString());
    }

}
