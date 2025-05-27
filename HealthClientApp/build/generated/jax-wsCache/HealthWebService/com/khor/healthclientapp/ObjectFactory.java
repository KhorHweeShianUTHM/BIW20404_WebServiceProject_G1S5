
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

    private final static QName _CalculateAge_QNAME = new QName("http://healthwebservice.khor.com/", "calculateAge");
    private final static QName _CalculateAgeResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calculateAgeResponse");
    private final static QName _CalculateBFP_QNAME = new QName("http://healthwebservice.khor.com/", "calculateBFP");
    private final static QName _CalculateBFPResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calculateBFPResponse");
    private final static QName _CalculateBMI_QNAME = new QName("http://healthwebservice.khor.com/", "calculateBMI");
    private final static QName _CalculateBMIResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calculateBMIResponse");
    private final static QName _CalculateBMR_QNAME = new QName("http://healthwebservice.khor.com/", "calculateBMR");
    private final static QName _CalculateBMRResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calculateBMRResponse");
    private final static QName _CalculateCBR_QNAME = new QName("http://healthwebservice.khor.com/", "calculateCBR");
    private final static QName _CalculateCBRResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calculateCBRResponse");
    private final static QName _CalculateLBM_QNAME = new QName("http://healthwebservice.khor.com/", "calculateLBM");
    private final static QName _CalculateLBMResponse_QNAME = new QName("http://healthwebservice.khor.com/", "calculateLBMResponse");
    private final static QName _GetUserInfo_QNAME = new QName("http://healthwebservice.khor.com/", "getUserInfo");
    private final static QName _GetUserInfoResponse_QNAME = new QName("http://healthwebservice.khor.com/", "getUserInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.khor.healthclientapp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateAge }
     * 
     */
    public CalculateAge createCalculateAge() {
        return new CalculateAge();
    }

    /**
     * Create an instance of {@link CalculateAgeResponse }
     * 
     */
    public CalculateAgeResponse createCalculateAgeResponse() {
        return new CalculateAgeResponse();
    }

    /**
     * Create an instance of {@link CalculateBFP }
     * 
     */
    public CalculateBFP createCalculateBFP() {
        return new CalculateBFP();
    }

    /**
     * Create an instance of {@link CalculateBFPResponse }
     * 
     */
    public CalculateBFPResponse createCalculateBFPResponse() {
        return new CalculateBFPResponse();
    }

    /**
     * Create an instance of {@link CalculateBMI }
     * 
     */
    public CalculateBMI createCalculateBMI() {
        return new CalculateBMI();
    }

    /**
     * Create an instance of {@link CalculateBMIResponse }
     * 
     */
    public CalculateBMIResponse createCalculateBMIResponse() {
        return new CalculateBMIResponse();
    }

    /**
     * Create an instance of {@link CalculateBMR }
     * 
     */
    public CalculateBMR createCalculateBMR() {
        return new CalculateBMR();
    }

    /**
     * Create an instance of {@link CalculateBMRResponse }
     * 
     */
    public CalculateBMRResponse createCalculateBMRResponse() {
        return new CalculateBMRResponse();
    }

    /**
     * Create an instance of {@link CalculateCBR }
     * 
     */
    public CalculateCBR createCalculateCBR() {
        return new CalculateCBR();
    }

    /**
     * Create an instance of {@link CalculateCBRResponse }
     * 
     */
    public CalculateCBRResponse createCalculateCBRResponse() {
        return new CalculateCBRResponse();
    }

    /**
     * Create an instance of {@link CalculateLBM }
     * 
     */
    public CalculateLBM createCalculateLBM() {
        return new CalculateLBM();
    }

    /**
     * Create an instance of {@link CalculateLBMResponse }
     * 
     */
    public CalculateLBMResponse createCalculateLBMResponse() {
        return new CalculateLBMResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateAge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateAge }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateAge")
    public JAXBElement<CalculateAge> createCalculateAge(CalculateAge value) {
        return new JAXBElement<CalculateAge>(_CalculateAge_QNAME, CalculateAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateAgeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateAgeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateAgeResponse")
    public JAXBElement<CalculateAgeResponse> createCalculateAgeResponse(CalculateAgeResponse value) {
        return new JAXBElement<CalculateAgeResponse>(_CalculateAgeResponse_QNAME, CalculateAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateBFP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateBFP }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateBFP")
    public JAXBElement<CalculateBFP> createCalculateBFP(CalculateBFP value) {
        return new JAXBElement<CalculateBFP>(_CalculateBFP_QNAME, CalculateBFP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateBFPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateBFPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateBFPResponse")
    public JAXBElement<CalculateBFPResponse> createCalculateBFPResponse(CalculateBFPResponse value) {
        return new JAXBElement<CalculateBFPResponse>(_CalculateBFPResponse_QNAME, CalculateBFPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateBMI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateBMI }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateBMI")
    public JAXBElement<CalculateBMI> createCalculateBMI(CalculateBMI value) {
        return new JAXBElement<CalculateBMI>(_CalculateBMI_QNAME, CalculateBMI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateBMIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateBMIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateBMIResponse")
    public JAXBElement<CalculateBMIResponse> createCalculateBMIResponse(CalculateBMIResponse value) {
        return new JAXBElement<CalculateBMIResponse>(_CalculateBMIResponse_QNAME, CalculateBMIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateBMR }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateBMR }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateBMR")
    public JAXBElement<CalculateBMR> createCalculateBMR(CalculateBMR value) {
        return new JAXBElement<CalculateBMR>(_CalculateBMR_QNAME, CalculateBMR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateBMRResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateBMRResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateBMRResponse")
    public JAXBElement<CalculateBMRResponse> createCalculateBMRResponse(CalculateBMRResponse value) {
        return new JAXBElement<CalculateBMRResponse>(_CalculateBMRResponse_QNAME, CalculateBMRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateCBR }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateCBR }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateCBR")
    public JAXBElement<CalculateCBR> createCalculateCBR(CalculateCBR value) {
        return new JAXBElement<CalculateCBR>(_CalculateCBR_QNAME, CalculateCBR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateCBRResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateCBRResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateCBRResponse")
    public JAXBElement<CalculateCBRResponse> createCalculateCBRResponse(CalculateCBRResponse value) {
        return new JAXBElement<CalculateCBRResponse>(_CalculateCBRResponse_QNAME, CalculateCBRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateLBM }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateLBM }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateLBM")
    public JAXBElement<CalculateLBM> createCalculateLBM(CalculateLBM value) {
        return new JAXBElement<CalculateLBM>(_CalculateLBM_QNAME, CalculateLBM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateLBMResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateLBMResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://healthwebservice.khor.com/", name = "calculateLBMResponse")
    public JAXBElement<CalculateLBMResponse> createCalculateLBMResponse(CalculateLBMResponse value) {
        return new JAXBElement<CalculateLBMResponse>(_CalculateLBMResponse_QNAME, CalculateLBMResponse.class, null, value);
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
