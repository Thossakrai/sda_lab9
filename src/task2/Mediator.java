package task2;


public class Mediator {
    Buyer swedishBuyer;
    Buyer frenchBuyer;
    AmericanSeller seller;
    DollarConverter converter;

    public void registerSwedishBuyer(SwedishBuyer buyer) {
        this.swedishBuyer = buyer;
    }

    public void registerFrenchBuyer(FrenchBuyer buyer) {
        this.frenchBuyer = buyer;
    }

    public void registerAmericanSeller(AmericanSeller seller) {
        this.seller = seller;
    }

    public void registerDollarConverter(DollarConverter converter) {
        this.converter = converter;
    }

    public boolean placeBid(float bid, String unitOfCurrency) {
        float dollars;
        dollars = converter.convertCurrencyToDollars(bid, unitOfCurrency);
        return seller.isBidAccepted(dollars);
    }
}
