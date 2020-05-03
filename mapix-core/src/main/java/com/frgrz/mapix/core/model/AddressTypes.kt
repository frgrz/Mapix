package com.frgrz.mapix.core.model

enum class AddressTypes {
    // a precise street address.
    STREET_ADDRESS,

    // a named route (such as "US 101").
    ROUTE,

    // a major intersection, usually of two major roads.
    INTERSECTION,

    // a political entity. Usually, this type indicates a polygon of some civil administration.
    POLITICAL,

    // the national political entity, and is typically the highest order type returned by the Geocoder.
    COUNTRY,

    // a first-order civil entity below the country level. Within the United States, these administrative levels are states. Not all nations exhibit these administrative levels.
    ADMINISTRATIVE_AREA_LEVEL_1,

    // a second-order civil entity below the country level. Within the United States, these administrative levels are counties. Not all nations exhibit these administrative levels.
    ADMINISTRATIVE_AREA_LEVEL_2,

    // a third-order civil entity below the country level. This type indicates a minor civil division. Not all nations exhibit these administrative levels.
    ADMINISTRATIVE_AREA_LEVEL_3,

    // a fourth-order civil entity below the country level. This type indicates a minor civil division. Not all nations exhibit these administrative levels.
    ADMINISTRATIVE_AREA_LEVEL_4,

    // a fifth-order civil entity below the country level. This type indicates a minor civil division. Not all nations exhibit these administrative levels.
    ADMINISTRATIVE_AREA_LEVEL_5,

    // a commonly-used alternative name for the entity.
    COLLOQUIAL_AREA,

    // an incorporated city or town political entity.
    LOCALITY,

    // a specific type of Japanese locality, to facilitate distinction between multiple locality components within a Japanese address.
    WARD,

    // a first-order civil entity below a locality. For some locations may receive one of the additional types: sublocality_level_1 to sublocality_level_5. Each sublocality level is a civil entity. Larger numbers indicate a smaller geographic area.
    SUBLOCALITY,
    SUBLOCALITY_LEVEL_1,
    SUBLOCALITY_LEVEL_2,
    SUBLOCALITY_LEVEL_3,
    SUBLOCALITY_LEVEL_4,
    SUBLOCALITY_LEVEL_5,

    // a named neighborhood
    NEIGHBORHOOD,

    // a named location, usually a building or collection of buildings with a common name
    PREMISE,

    // a first-order entity below a named location, usually a singular building within a collection of buildings with a common name
    SUBPREMISE,

    // a postal code as used to address postal mail within the country.
    POSTAL_CODE,

    // a prominent natural feature.
    NATURAL_FEATURE,

    // an airport.
    AIRPORT,

    // a named park.
    PARK,

    // a named point of interest. Typically, these "POI"s are prominent local entities that don't easily fit in another category, such as "Empire State Building" or "Statue of Liberty."
    POINT_OF_INTEREST,

    // the precise street number.
    STREET_NUMBER,

    // indicates a grouping of geographic areas, such as locality and sublocality, used for mailing addresses in some countries
    POSTAL_TOWN
}


