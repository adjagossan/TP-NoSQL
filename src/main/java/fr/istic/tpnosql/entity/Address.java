
package fr.istic.tpnosql.entity;

import com.google.code.morphia.annotations.Embedded;

@Embedded
public class Address {
   private String street;
   private String city;
   private String postCode;
   private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
   
   public Address(){}
   
   public Address(String street, String city, String postCode, String country){
       this.street = street;
       this.city = city;
       this.postCode = postCode;
       this.country = country;
   }
   
   public String toString(){
       return "address : {country: "+this.country+", city: "+this.city+", street: "+this.street+", postCode: "+this.postCode+"}";
   }
}
