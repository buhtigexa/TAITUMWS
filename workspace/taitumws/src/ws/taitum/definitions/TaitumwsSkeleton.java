
/**
 * TaitumwsSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package ws.taitum.definitions;
    /**
     *  TaitumwsSkeleton java skeleton for the axisService
     */
    public class TaitumwsSkeleton implements TaitumwsSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * Retrieve all ads for rent or sale actually availables.
                                     * @param getAds0 
             * @return getAdsResponse1 
         */
        
                 public ws.taitum.definitions.GetAdsResponse getAds
                  (
                  ws.taitum.definitions.GetAds getAds0
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getAds");
        }
     
         
        /**
         * Auto generated method signature
         * Search for and retrieve ads that match criteria. ie: the lowest price of $, proximity, street or city location exact match ... The server is able to implement any combination of those criteria (are not currently available combined queries)
                                     * @param search2 
             * @return searchResponse3 
             * @throws UnssuportedFilter 
         */
        
                 public ws.taitum.definitions.SearchResponse search
                  (
                  ws.taitum.definitions.Search search2
                  )
            throws UnssuportedFilter{
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#search");
        }
     
         
        /**
         * Auto generated method signature
         * Upload to server an ad for search or sale. When that ad matches, the server sent an email to the interested
                                     * @param publish4 
             * @return  
         */
        
                 public void publish
                  (
                  ws.taitum.definitions.Publish publish4
                  )
            {
                //TODO : fill this with the necessary business logic
                
        }
     
         
        /**
         * Auto generated method signature
         * Build a statistical report on the ads that verify certain properties. This is useful for studying relationships between user preferences, location, price patterns, leads, etc..
								Throws an exception when requested by invalid data filter.
                                     * @param getReport5 
             * @return getReportResponse6 
             * @throws UnssuportedFilter 
         */
        
                 public ws.taitum.definitions.GetReportResponse getReport
                  (
                  ws.taitum.definitions.GetReport getReport5
                  )
            throws UnssuportedFilter{
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getReport");
        }
     
    }
    