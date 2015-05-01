
/**
 * StatisticswsSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package ws.statistics.definitions;
    /**
     *  StatisticswsSkeletonInterface java skeleton interface for the axisService
     */
    public interface StatisticswsSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * Calculates the probability distribution of a sample space indicated in the input argument, 
										    	that is, a sequence of samples and their overall frequency.
                                    * @param getDistribution
         */

        
                public ws.statistics.definitions.CalculateDistributionResponse calculateDistribution
                (
                  ws.statistics.definitions.GetDistribution getDistribution
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Calculates the distribution's variablity
                                    * @param getDeviation
         */

        
                public ws.statistics.definitions.IndicatorResponse calculateDeviation
                (
                  ws.statistics.definitions.GetDeviation getDeviation
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Computes the average or expected value of the probability distribution corresponding to the indicated sample space.
                                    * @param getAverage
         */

        
                public ws.statistics.definitions.IndicatorResponse calculateAverage
                (
                  ws.statistics.definitions.GetAverage getAverage
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Creates a muetral space.Returns an space id
                                    * @param createSpace
         */

        
                public ws.statistics.definitions.CreateSpaceResponse createSpace
                (
                  ws.statistics.definitions.CreateSpace createSpace
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Stores a value in the muestral spaces.The operation follows the one-way pattern.
                                    * @param addSample
         */

        
                public void addSample
                (
                  ws.statistics.definitions.AddSample addSample
                 )
            ;
        
         }
    