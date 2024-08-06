public struct Flight: Bookable {
    
    // Information about current flight
    
    public var departure: Airport
    public var destination: Airport
    public var duration: TimeInterval
    public var price: Price
}

public struct Hotel: Bookable {
    // The struct contains the info related to a Hotel
    
    public var pricePerNight: Price
    public var stars: StarsType
}
