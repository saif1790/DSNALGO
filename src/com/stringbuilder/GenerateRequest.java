package com.stringbuilder;

public class GenerateRequest {
    public static void main(String[] args) {

        String promotionCode = "lUX1";
        String s = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.append("<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "<s:Header>\n" +
                "<h:ContractVersion\n" +
                "xmlns:h=\"http://schemas.navitaire.com/WebServices\">420</h:ContractVersion>\n" +
                "<h:EnableExceptionStackTrace\n" +
                "xmlns:h=\"http://schemas.navitaire.com/WebServices\">false</h:EnableExceptionStackTr\n" +
                "ace>\n" +
                "<h:MessageContractVersion i:nil=\"true\"\n" +
                "xmlns:h=\"http://schemas.navitaire.com/WebServices\"\n" +
                "xmlns:i=\"http://www.w3.org/2001/XMLSchemainstance\"></\n" +
                "h:MessageContractVersion>\n" +
                "<h:Signature\n" +
                "xmlns:h=\"http://schemas.navitaire.com/WebServices\">bbj4n+60pBg=|+gaxFAIbdhZaGm\n" +
                "9Sn02gYyggVtKBUJmoMCprOsSK04TRI12xb29fq1LJ1LbtXR6zRyu7jzkhcFvqLhlYo/EmpXbxj\n" +
                "nzMSygeN1v3VDMtoJwhPbRHg/CG/irB1y3KaLxOivzvq9QZbUU=</h:Signature>\n" +
                "</s:Header>");
        stringBuilder.append("<s:Body>\n" +
                "<GetAvailabilityRequest\n" +
                "xmlns=\"http://schemas.navitaire.com/WebServices/ServiceContracts/BookingService\">\n" +
                "<TripAvailabilityRequest\n" +
                "xmlns=\"http://schemas.navitaire.com/WebServices/DataContracts/Booking\"\n" +
                "xmlns:i=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "<AvailabilityRequests>\n" +
                "<AvailabilityRequest>\n" +
                "<DepartureStation>DEL</DepartureStation>\n" +
                "<ArrivalStation>BOM</ArrivalStation>\n" +
                "<BeginDate>2019-12-01T00:00:00</BeginDate>\n" +
                "<EndDate>2019-12-01T00:00:00</EndDate>\n" +
                "<CarrierCode>6E</CarrierCode>\n" +
                "<FlightNumber i:nil=\"true\"></FlightNumber>\n" +
                "<FlightType>All</FlightType>\n" +
                "<PaxCount>1</PaxCount>\n" +
                "<Dow>Daily</Dow>\n" +
                "<CurrencyCode>INR</CurrencyCode>\n" +
                "<DisplayCurrencyCode i:nil=\"true\"></DisplayCurrencyCode>\n" +
                "<DiscountCode i:nil=\"true\"></DiscountCode>\n" +
                "<PromotionCode>"+promotionCode+"</PromotionCode>(Optional/If applicable)\n" +
                "<AvailabilityType>Default</AvailabilityType>\n" +
                "<SourceOrganization i:nil=\"true\"></SourceOrganization>\n" +
                "<MaximumConnectingFlights>20</MaximumConnectingFlights>\n" +
                "<AvailabilityFilter>Default</AvailabilityFilter>");
        stringBuilder.append("<FareClassControl>LowestFareClass</FareClassControl>\n" +
                "<MinimumFarePrice>0</MinimumFarePrice>\n" +
                "<MaximumFarePrice>0</MaximumFarePrice>\n" +
                "<ProductClassCode i:nil=\"true\"></ProductClassCode>\n" +
                "<SSRCollectionsMode>None</SSRCollectionsMode>\n" +
                "<InboundOutbound>None</InboundOutbound>\n" +
                "<NightsStay>0</NightsStay>\n" +
                "<IncludeAllotments>false</IncludeAllotments>\n" +
                "<BeginTime i:nil=\"true\"></BeginTime>\n" +
                "<EndTime i:nil=\"true\"></EndTime>\n" +
                "<DepartureStations i:nil=\"true\"\n" +
                "xmlns:a=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"></DepartureStati\n" +
                "ons>\n" +
                "<ArrivalStations i:nil=\"true\"\n" +
                "xmlns:a=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"></ArrivalStations\n" +
                ">\n" +
                "<FareTypes\n" +
                "xmlns:a=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\">\n" +
                "<a:string>R</a:string>\n" +
                "</FareTypes>\n" +
                "<ProductClasses\n" +
                "xmlns:a=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\">\n" +
                "<a:string>R</a:string>\n" +
                "</ProductClasses>\n" +
                "<FareClasses i:nil=\"true\"\n" +
                "xmlns:a=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"></FareClasses>\n" +
                "<PaxPriceTypes>\n" +
                "<PaxPriceType>\n" +
                "<PaxType>ADT</PaxType>\n" +
                "<PaxDiscountCode i:nil=\"true\"></PaxDiscountCode>\n" +
                "<PaxCount>0</PaxCount>\n" +
                "</PaxPriceType>\n" +
                "</PaxPriceTypes>\n" +
                "<JourneySortKeys i:nil=\"true\"\n" +
                "xmlns:a=\"http://schemas.navitaire.com/WebServices/DataContracts/Common/Enumerat\n" +
                "ions\"></JourneySortKeys>\n" +
                "<TravelClassCodes i:nil=\"true\"\n" +
                "xmlns:a=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"></TravelClassCo\n" +
                "des>\n" +
                "<IncludeTaxesAndFees>false</IncludeTaxesAndFees>\n" +
                "<FareRuleFilter>Default</FareRuleFilter>\n" +
                "<LoyaltyFilter>MonetaryOnly</LoyaltyFilter>\n" +
                "<PaxResidentCountry i:nil=\"true\"></PaxResidentCountry>");
        stringBuilder.append("<TravelClassCodeList i:nil=\"true\"\n" +
                "xmlns:a=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\"></TravelClassCo\n" +
                "deList>\n" +
                "<SystemCode i:nil=\"true\"></SystemCode>\n" +
                "<CurrentSourceOrganization i:nil=\"true\"></CurrentSourceOrganization>\n" +
                "<PaxPriceDetailList i:nil=\"true\"></PaxPriceDetailList>\n" +
                "<ServiceBundleControl>Disabled</ServiceBundleControl>\n" +
                "<BookingStatus>Default</BookingStatus>\n" +
                "</AvailabilityRequest>\n" +
                "</AvailabilityRequests>\n" +
                "<LoyaltyFilter>MonetaryOnly</LoyaltyFilter>\n" +
                "<SourceOrganization i:nil=\"true\"></SourceOrganization>\n" +
                "<SourceAgentCode i:nil=\"true\"></SourceAgentCode>\n" +
                "<SourceDomainCode i:nil=\"true\"></SourceDomainCode>\n" +
                "<SourceLocationCode i:nil=\"true\"></SourceLocationCode>\n" +
                "<SourceIOSCountryCode i:nil=\"true\"></SourceIOSCountryCode>\n" +
                "<SourceSystemCode i:nil=\"true\"></SourceSystemCode>\n" +
                "<LowFareMode>false</LowFareMode>\n" +
                "</TripAvailabilityRequest>\n" +
                "</GetAvailabilityRequest>\n" +
                "</s:Body>\n" +
                "</s:Envelope>");
        System.out.println(stringBuilder);
    }
}
