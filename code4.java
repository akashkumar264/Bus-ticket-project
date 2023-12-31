public class Loop2400_837PMap :
    X12LayoutMap<Loop2400_837P, X12Entity>
{
    public Loop2400_837PMap()
    {
        Id = "Loop_2400_837P";
        Name = "Line Adjudication Information";
        
        Segment(x => x.LineAdjudicationInformation, 0);
        Segment(x => x.AdjustedRevenueCode, 1);
        Segment(x => x.HealthcareRemarkCodes, 2);
        Segment(x => x.QuantityInformation, 3);
        Segment(x => x.LinePricingOrRepricingInfo, 4);
        Segment(x => x.AdjustedGroupNmbrPayer, 5);
        Segment(x => x.LineSupplementalInfo, 6);
        Segment(x => x.PlacedOfServiceSupplemental Info, 7);
        Segment(x => x.RenderingProviderSupplemental Info, 8);
        Segment(x => x.ServiceAuditNumber, 9);
        Segment(x => x.Product Serial Number, 10);
        Segment(x => x.Composite Medical Product Identifier, 11);
        Segment(x => x.Ambulance Transport Info, 12);
        Segment(x => x.Durable Medical Equipment Info, 13);
        Segment(x => x.Healthcare Diagnostic Code, 14);
        Segment(x => x.Healthcare Subsequent Steps Code, 15);
        Segment(x => x.Durable Medical Equipment Certificate of Medical Necessity, 16);
        Segment(x => x.Patient, 17);
        Segment(x => x.Packaging, 18);
        Segment(x => x.Third Party Organization, 19);
        Segment(x => x.Other Healthcare Provider, 20);
        Segment(x => x.Third Party Billing, 21);
        Segment(x => x.Adjustment Reason, 22);
        Segment(x => x.Line Benefit Balance, 23);
        Segment(x => x.Plan Type or Loan Agreement Number, 24);
        Segment(x => x.Other Identification Information, 25);
        Segment(x => x.Contract Code, 26);
        Segment(x => x.Pricing Information, 27);
        Segment(x => x.Allowed Amount, 28);
        Segment(x => x.Processed Line Pricing/Repricing Information, 29);
        Segment(x => x.Processing Indicator, 30);
        Segment(x => x.Inventory Number, 31);
        Segment(x => x.Hierarchical Structure Code, 32);
        Segment(x => x.Assigned Number, 33);
        Segment(x => x.Date Time Period, 34);
        Segment(x => x.Monetary Amount Information, 35);
        Segment(x => x.Recursive Hierarchical Structure, 36);
        Segment(x => x.EPSDT Required Indicator, 37);
        Segment(x => x.Facility Code Value, 38);
        Segment(x => x.Supervising Provider, 39);
        Segment(x => x.Pharmacy Prescription Number, 40);
        Segment(x => x.Supplier Order Number, 41);
        Segment(x => x.Vision Plan, 42);
        Segment(x => x.Healthcare Common Procedure Coding System, 43);
        Segment(x => x.HIPAA Audit Trail, 44);
        Segment(x => x.Payee Indicator, 45);
        Segment(x => x.EPSDT Eligibility Status, 46);
        Segment(x => x.Nurse Practitioner Prescriptive Authority, 47);
        Segment(x => x.Nursing Home Residential Status, 48);
        Segment(x => x.DRG Information, 49);
        Segment(x => x.Component Information, 50);
        Segment(x => x.Hospital Acquired Condition Indicator, 51);
        Segment(x => x.Message Type, 52);
        Segment(x => x.Code of Conduct Issues, 53);
        Segment(x => x.Low Dose X-Ray Information, 54);
        Segment(x => x.Form Identification Code, 55);
        Segment(x => x.Code Category, 56);
        Segment(x => x.Emergency Transportation, 57);
        Segment(x => x.Oxygen Content, 58);
        Segment(x => x.Sales Tax, 59);
        Segment(x => x.Third Party Supplier Information, 60);
        Segment(x => x.Billing Category, 61);
        Segment(x => x.Industry Code, 62);
        Segment(x => x.Surgical Capitation, 63);
        Segment(x => x.Physician Profile Information, 64);
        Segment(x => x.Non Covered Professional and Technical Service, 65);
        Segment(x => x.Information Status, 66);
        Segment(x => x.Form Identification, 67);
        Segment(x => x.Living Dependency, 68);
        Segment(x => x.Medical Record Number, 69);
        Segment(x => x.Lifetime Reserved, 70);
        Segment(x => x.Daily Workload Allocation, 71);
        Segment(x => x.Rental Unit Rate, 72);
        Segment(x => x.Miscellaneous Taxes, 73);
        Segment(x => x.Tax Identification Number, 74);
        Segment(x => x.Line Adjustment, 75);
        Segment(x => x.Frequency, 76);
        Segment(x => x.Compound Drug Information, 77);
        Segment(x => x.Revised Compound Drug Information, 78);
        Segment(x => x.Copay Status, 79);
        Segment(x => x.Deductible Status, 80);
        Segment(x => x.Collaborative Care Approval, 81);
        Segment(x => x.Immunization Status, 82);
        Segment(x => x.Request Validation, 83);
        Segment(x => x.Compound Drug Quantity, 84);
        Segment(x => x.Dispense-to Pharmacy Address, 85);
        Segment(x => x.Inventory Report Quantity, 86);
        Segment(x => x.Condition Response, 87);
        Segment(x => x.Request Validation Criteria, 88);
        Segment(x => x.HIPAA Related and Non-Related Parties, 89);
        Segment(x => x.Bank Name, 90);
        Segment(x => x.Encrypted Transaction Reference Number, 91);
        Segment(x => x.Patient Dental History, 92);
        Segment(x => x.Order Related Data, 93);
        Segment(x => x.Superseding Claim, 94);
        Segment(x => x.Hospitalization, 95);
        Segment(x => x.Principal Procedure, 96);
        Segment(x => x.Episode of Care, 97);
        Segment(x => x.Billing Notes, 98);
        Segment(x => x.Service Payment Information, 99