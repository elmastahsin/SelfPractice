package day25_constructors.offerTask;


import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {

        Offer offer1 = new Offer("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);
        Offer offer2 = new Offer("CA", "Sony Inc", "QA", 120000, true, false, false, true);
        Offer offer3 = new Offer("FL", "Apple Inc", "QE", 125000, true, true, true, false);
        Offer offer4 = new Offer("TX", "CapitalOne", "SM", 115000, false, false, true, true);
        Offer offer5 = new Offer("WA", "Bank Of America", "BA", 130000, true, true, false, true);
        Offer offer6 = new Offer("WA", "Bank Of America", "BA", 130000, true, true, false, true);
        Offer offer7 = new Offer("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
        System.out.println(offer6);
        System.out.println(offer7);

        Offer[] myOffer = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffer));
        fullTimeOffers.removeIf(p -> !p.isFullTime);
        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffer));
        localOffers.removeIf(p -> !(p.location.equals("VA")) || p.location.equals("CA"));
        System.out.println(localOffers.size());


        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffer));
        offersWithBenefits.removeIf(p -> !(p.hasBenefit || p.hasPTO));

        System.out.println(offersWithBenefits.size());

        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(myOffer));
        devOffers.removeIf(p -> !p.jobTitle.equals("DEV"));
        System.out.println(devOffers.size());

        ArrayList<Offer> with100K = new ArrayList<>(Arrays.asList(myOffer));
        with100K.removeIf(p -> p.salary < 100000);
        System.out.println(with100K.size());
        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " : " +localOffer.salary);
        }


    }
}
/*
    2. Create a class named MyOffers:
            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and
                    does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer
                    in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than
                    100K salary*/