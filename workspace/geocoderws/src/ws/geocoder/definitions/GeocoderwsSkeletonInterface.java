
/**
 * GeocoderwsSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package ws.geocoder.definitions;
    /**
     *  GeocoderwsSkeletonInterface java skeleton interface for the axisService
     */
    public interface GeocoderwsSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * Reverse Geocoding: get the address format: street, high, city, state and country, from its geographical coordinates.
                                    * @param getAddress
         */

        
                public ws.geocoder.definitions.GetAddressResponse getAddress
                (
                  ws.geocoder.definitions.GetAddress getAddress
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Calculate the distance between two points or locations.
                                    * @param getDistance
         */

        
                public ws.geocoder.definitions.GetDistanceResponse getDistance
                (
                  ws.geocoder.definitions.GetDistance getDistance
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Calculate geographical coordinates of the address of a location (street, city, etc.)
                                    * @param getCoordinate
         */

        
                public ws.geocoder.definitions.GetCoordinateResponse getCoordinate
                (
                  ws.geocoder.definitions.GetCoordinate getCoordinate
                 )
            ;
        
         }
    