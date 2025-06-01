
package com.khor.healthclientapp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.khor.healthclientapp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcAge_QNAME = new QName("http://healthwebservice.khor.com/", "calcAge");
    private final static QName _CalcAgeResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calcAgeResponse");
    private final static QName _CalcBFPValue_QNAME = new QName("http://healthwebservice.khor.com/", "calcBFPValue");
    private final static QName _CalcBFPValueResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calcBFPValueResponse");
    private final static QName _CalcBMIValue_QNAME = new QName("http://healthwebservice.khor.com/", "calcBMIValue");
    private final static QName _CalcBMIValueResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calcBMIValueResponse");
    private final static QName _CalcBMRValue_QNAME = new QName("http://healthwebservice.khor.com/", "calcBMRValue");
    private final static QName _CalcBMRValueResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calcBMRValueResponse");
    private final static QName _CalcCaloriesValue_QNAME = new QName("http://healthwebservice.khor.com/", "calcCaloriesValue");
    private final static QName _CalcCaloriesValueResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calcCaloriesValueResponse");
    private final static QName _CalcLBMValue_QNAME = new QName("http://healthwebservice.khor.com/", "calcLBMValue");
    private final static QName _CalcLBMValueResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calcLBMValueResponse");
    private final static QName _GetBFPCategories_QNAME = new QName("http://healthwebservice.khor.com/", "getBFPCategories");
    private final static QName _GetBFPCategoriesResponse_QNAME = new QName("http://healthwebservice.khor.com/", "getBFPCategoriesResponse");
    private final static QName _GetBMICategories_QNAME = new QName("http://healthwebservice.khor.com/", "getBMICategories");
    private final static QName _GetBMICategoriesResponse_QNAME = new QName("http://healthwebservice.khor.com/", "getBMICategoriesResponse");
    private final static QName _GetBMRCategories_QNAME = new QName("http://healthwebservice.khor.com/", "getBMRCategories");
    private final static QName _GetBMRCategoriesResponse_QNAME = new QName("http://healthwebservice.khor.com/", "getBMRCategoriesResponse");
    private final static QName _GetCaloriesCategories_QNAME = new QName("http://healthwebservice.khor.com/", "getCaloriesCategories");
    private final static QName _GetCaloriesCategoriesResponse_QNAME = new QName("http://healthwebservice.khor.com/", "getCaloriesCategoriesResponse");
    private final static QName _GetLBMCategories_QNAME = new QName("http://healthwebservice.khor.com/", "getLBMCategories");
    private final static QName _GetLBMCategoriesResponse_QNAME = new QName("http://healthwebservice.khor.com/", "getLBMCategoriesResponse");
    private final static QName _GetUserInfo_QNAME = new QName("http://healthwebservice.khor.com/", "getUserInfo");
    private final static QName _GetUserInfoResponse_QNAME = new QName("http://healthwebservice.khor.com/", "getUserInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.khor.healthclientapp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcAge }
     * 
     */
    public CalcAge createCalcAge() {
        return new CalcAge();
    }

    /**
     * Create an instance of {@link CalcAgeResponse }
     * 
     */
    public CalcAgeResponse createCalcAgeResponse() {
        return new CalcAgeResponse();
    }

    /**
     * Create an instance of {@link CalcBFPValue }
     * 
     */
    public CalcBFPValue createCalcBFPValue() {
        return new CalcBFPValue();
    }

    /**
     * Create an instance of {@link CalcBFPValueResponse }
     * 
     */
    public CalcBFPValueResponse createCalcBFPValueResponse() {
        return new CalcBFPValueResponse();
    }

    /**
     * Create an instance of {@link CalcBMIValue }
     * 
     */
    public CalcBMIValue createCalcBMIValue() {
        return new CalcBMIValue();
    }

    /**
     * Create an instance of {@link CalcBMIValueResponse }
     * 
     */
    public CalcBMIValueResponse createCalcBMIValueResponse() {
        return new CalcBMIValueResponse();
    }

    /**
     * Create an instance of {@link CalcBMRValue }
     * 
     */
    public CalcBMRValue createCalcBMRValue() {
        return new CalcBMRValue();
    }

    /**
     * Create an instance of {@link CalcBMRValueResponse }
     * 
     */
    public CalcBMRValueResponse createCalcBMRValueResponse() {
        return new CalcBMRValueResponse();
    }

    /**
     * Create an instance of {@link CalcCaloriesValue }
     * 
     */
    public CalcCaloriesValue createCalcCaloriesValue() {
        return new CalcCaloriesValue();
    }

    /**
     * Create an instance of {@link CalcCaloriesValueResponse }
     * 
     */
    public CalcCaloriesValueResponse createCalcCaloriesValueResponse() {
        return new CalcCaloriesValueResponse();
    }

    /**
     * Create an instance of {@link CalcLBMValue }
     * 
     */
    public CalcLBMValue createCalcLBMValue() {
        return new CalcLBMValue();
    }

    /**
     * Create an instance of {@link CalcLBMValueResponse }
     * 
     */
    public CalcLBMValueResponse createCalcLBMValueResponse() {
        return new CalcLBMValueResponse();
    }

    /**
     * Create an instance of {@link GetBFPCategories }
     * 
     */
    public GetBFPCategories createGetBFPCategories() {
        return new GetBFPCategories();
    }

    /**
     * Create an instance of {@link GetBFPCategoriesResponse }
     * 
     */
    public GetBFPCategoriesResponse createGetBFPCategoriesResponse() {
        return new GetBFPCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetBMICategories }
     * 
     */
    public GetBMICategories createGetBMICategories() {
        return new GetBMICategories();
    }

    /**
     * Create an instance of {@link GetBMICategoriesResponse }
     * 
     */
    public GetBMICategoriesResponse createGetBMICategoriesResponse() {
        return new GetBMICategoriesResponse();
    }

    /**
     * Create an instance of {@link GetBMRCategories }
     * 
     */
    public GetBMRCategories createGetBMRCategories() {
        return new GetBMRCategories();
    }

    /**
     * Create an instance of {@link GetBMRCategoriesResponse }
     * 
     */
    public GetBMRCategoriesResponse createGetBMRCategoriesResponse() {
        return new GetBMRCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetCaloriesCategories }
     * 
     */
    public GetCaloriesCategories createGetCaloriesCategories() {
        return new GetCaloriesCategories();
    }

    /**
     * Create an instance of {@link GetCaloriesCategoriesResponse }
     * 
     */
    public GetCaloriesCategoriesResponse createGetCaloriesCategoriesResponse() {
        return new GetCaloriesCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetLBMCategories }
     * 
     */
    public GetLBMCategories createGetLBMCategories() {
        return new GetLBMCategories();
    }

    /**
     * Create an instance of {@link GetLBMCategoriesResponse }
     * 
     */
    public GetLBMCategoriesResponse createGetLBMCategoriesResponse() {
        return new GetLBMCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcAge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcAge }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcAge")
    public JAXBElement<CalcAge> createCalcAge(CalcAge value) {
        return new JAXBElement<CalcAge>(_CalcAge_QNAME, CalcAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcAgeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcAgeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcAgeResponse")
    public JAXBElement<CalcAgeResponse> createCalcAgeResponse(CalcAgeResponse value) {
        return new JAXBElement<CalcAgeResponse>(_CalcAgeResponse_QNAME, CalcAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcBFPValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcBFPValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcBFPValue")
    public JAXBElement<CalcBFPValue> createCalcBFPValue(CalcBFPValue value) {
        return new JAXBElement<CalcBFPValue>(_CalcBFPValue_QNAME, CalcBFPValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcBFPValueResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcBFPValueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcBFPValueResponse")
    public JAXBElement<CalcBFPValueResponse> createCalcBFPValueResponse(CalcBFPValueResponse value) {
        return new JAXBElement<CalcBFPValueResponse>(_CalcBFPValueResponse_QNAME, CalcBFPValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcBMIValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcBMIValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcBMIValue")
    public JAXBElement<CalcBMIValue> createCalcBMIValue(CalcBMIValue value) {
        return new JAXBElement<CalcBMIValue>(_CalcBMIValue_QNAME, CalcBMIValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcBMIValueResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcBMIValueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcBMIValueResponse")
    public JAXBElement<CalcBMIValueResponse> createCalcBMIValueResponse(CalcBMIValueResponse value) {
        return new JAXBElement<CalcBMIValueResponse>(_CalcBMIValueResponse_QNAME, CalcBMIValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcBMRValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcBMRValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcBMRValue")
    public JAXBElement<CalcBMRValue> createCalcBMRValue(CalcBMRValue value) {
        return new JAXBElement<CalcBMRValue>(_CalcBMRValue_QNAME, CalcBMRValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcBMRValueResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcBMRValueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcBMRValueResponse")
    public JAXBElement<CalcBMRValueResponse> createCalcBMRValueResponse(CalcBMRValueResponse value) {
        return new JAXBElement<CalcBMRValueResponse>(_CalcBMRValueResponse_QNAME, CalcBMRValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcCaloriesValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcCaloriesValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcCaloriesValue")
    public JAXBElement<CalcCaloriesValue> createCalcCaloriesValue(CalcCaloriesValue value) {
        return new JAXBElement<CalcCaloriesValue>(_CalcCaloriesValue_QNAME, CalcCaloriesValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcCaloriesValueResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcCaloriesValueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcCaloriesValueResponse")
    public JAXBElement<CalcCaloriesValueResponse> createCalcCaloriesValueResponse(CalcCaloriesValueResponse value) {
        return new JAXBElement<CalcCaloriesValueResponse>(_CalcCaloriesValueResponse_QNAME, CalcCaloriesValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcLBMValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcLBMValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcLBMValue")
    public JAXBElement<CalcLBMValue> createCalcLBMValue(CalcLBMValue value) {
        return new JAXBElement<CalcLBMValue>(_CalcLBMValue_QNAME, CalcLBMValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcLBMValueResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcLBMValueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calcLBMValueResponse")
    public JAXBElement<CalcLBMValueResponse> createCalcLBMValueResponse(CalcLBMValueResponse value) {
        return new JAXBElement<CalcLBMValueResponse>(_CalcLBMValueResponse_QNAME, CalcLBMValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBFPCategories }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBFPCategories }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getBFPCategories")
    public JAXBElement<GetBFPCategories> createGetBFPCategories(GetBFPCategories value) {
        return new JAXBElement<GetBFPCategories>(_GetBFPCategories_QNAME, GetBFPCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBFPCategoriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBFPCategoriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getBFPCategoriesResponse")
    public JAXBElement<GetBFPCategoriesResponse> createGetBFPCategoriesResponse(GetBFPCategoriesResponse value) {
        return new JAXBElement<GetBFPCategoriesResponse>(_GetBFPCategoriesResponse_QNAME, GetBFPCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBMICategories }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBMICategories }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getBMICategories")
    public JAXBElement<GetBMICategories> createGetBMICategories(GetBMICategories value) {
        return new JAXBElement<GetBMICategories>(_GetBMICategories_QNAME, GetBMICategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBMICategoriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBMICategoriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getBMICategoriesResponse")
    public JAXBElement<GetBMICategoriesResponse> createGetBMICategoriesResponse(GetBMICategoriesResponse value) {
        return new JAXBElement<GetBMICategoriesResponse>(_GetBMICategoriesResponse_QNAME, GetBMICategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBMRCategories }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBMRCategories }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getBMRCategories")
    public JAXBElement<GetBMRCategories> createGetBMRCategories(GetBMRCategories value) {
        return new JAXBElement<GetBMRCategories>(_GetBMRCategories_QNAME, GetBMRCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBMRCategoriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBMRCategoriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getBMRCategoriesResponse")
    public JAXBElement<GetBMRCategoriesResponse> createGetBMRCategoriesResponse(GetBMRCategoriesResponse value) {
        return new JAXBElement<GetBMRCategoriesResponse>(_GetBMRCategoriesResponse_QNAME, GetBMRCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCaloriesCategories }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCaloriesCategories }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getCaloriesCategories")
    public JAXBElement<GetCaloriesCategories> createGetCaloriesCategories(GetCaloriesCategories value) {
        return new JAXBElement<GetCaloriesCategories>(_GetCaloriesCategories_QNAME, GetCaloriesCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCaloriesCategoriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCaloriesCategoriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getCaloriesCategoriesResponse")
    public JAXBElement<GetCaloriesCategoriesResponse> createGetCaloriesCategoriesResponse(GetCaloriesCategoriesResponse value) {
        return new JAXBElement<GetCaloriesCategoriesResponse>(_GetCaloriesCategoriesResponse_QNAME, GetCaloriesCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLBMCategories }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLBMCategories }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getLBMCategories")
    public JAXBElement<GetLBMCategories> createGetLBMCategories(GetLBMCategories value) {
        return new JAXBElement<GetLBMCategories>(_GetLBMCategories_QNAME, GetLBMCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLBMCategoriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLBMCategoriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getLBMCategoriesResponse")
    public JAXBElement<GetLBMCategoriesResponse> createGetLBMCategoriesResponse(GetLBMCategoriesResponse value) {
        return new JAXBElement<GetLBMCategoriesResponse>(_GetLBMCategoriesResponse_QNAME, GetLBMCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getUserInfo")
    public JAXBElement<GetUserInfo> createGetUserInfo(GetUserInfo value) {
        return new JAXBElement<GetUserInfo>(_GetUserInfo_QNAME, GetUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "getUserInfoResponse")
    public JAXBElement<GetUserInfoResponse> createGetUserInfoResponse(GetUserInfoResponse value) {
        return new JAXBElement<GetUserInfoResponse>(_GetUserInfoResponse_QNAME, GetUserInfoResponse.class, null, value);
    }

}
