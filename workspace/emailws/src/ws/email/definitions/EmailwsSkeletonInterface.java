
/**
 * EmailwsSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package ws.email.definitions;
    /**
     *  EmailwsSkeletonInterface java skeleton interface for the axisService
     */
    public interface EmailwsSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * Gets a list of emails that check certain values ​​over their metadata.
                                    * @param getEmails
         */

        
                public ws.email.definitions.GetEmailsResponse getEmails
                (
                  ws.email.definitions.GetEmails getEmails
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Send an email; issues the shipping status.
                                    * @param sendEmail
         */

        
                public ws.email.definitions.SendEmailResponse sendEmail
                (
                  ws.email.definitions.SendEmail sendEmail
                 )
            ;
        
         }
    