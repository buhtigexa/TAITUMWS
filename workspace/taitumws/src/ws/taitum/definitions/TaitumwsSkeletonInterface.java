
/**
 * TaitumwsSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package ws.taitum.definitions;
    /**
     *  TaitumwsSkeletonInterface java skeleton interface for the axisService
     */
    public interface TaitumwsSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * Retrieve all ads for rent or sale actually availables.
                                    * @param getAds
         */

        
                public ws.taitum.definitions.GetAdsResponse getAds
                (
                  ws.taitum.definitions.GetAds getAds
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Search for and retrieve ads that match criteria. ie: the lowest price of $, proximity, street or city location exact match ... The server is able to implement any combination of those criteria (are not currently available combined queries)
                                    * @param search
             * @throws UnssuportedFilter : 
         */

        
                public ws.taitum.definitions.SearchResponse search
                (
                  ws.taitum.definitions.Search search
                 )
            throws UnssuportedFilter;
        
         
        /**
         * Auto generated method signature
         * Upload to server an ad for search or sale. When that ad matches, the server sent an email to the interested
                                    * @param publish
         */

        
                public void publish
                (
                  ws.taitum.definitions.Publish publish
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Build a statistical report on the ads that verify certain properties. This is useful for studying relationships between user preferences, location, price patterns, leads, etc..
								Throws an exception when requested by invalid data filter.
                                    * @param getReport
             * @throws UnssuportedFilter : 
         */

        
                public ws.taitum.definitions.GetReportResponse getReport
                (
                  ws.taitum.definitions.GetReport getReport
                 )
            throws UnssuportedFilter;
        
         }
    