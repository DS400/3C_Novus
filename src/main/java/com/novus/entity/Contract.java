package com.novus.entity;

import com.novus.util.DateFormat;

import java.text.ParseException;

// DB項目定義書ー＞契約情報タブに対応
// 上から下までの順番
public class Contract {
    private String prtNo;
    private String polNo;
    private Integer statusFlg;
    private Integer cancelFlg;
    /**
     * 20160101 こんな感じ
     */
    private String inceptionDate;
    /**
     * 16 こんな感じ 12時間表示に変更する必要あり
     */
    private String inceptionTime;
    /**
     * 20160101 こんな感じ
     */
    private String conclusionDate;
    /**
     * 16 こんな感じ 12時間表示に変更する必要あり
     */
    private String conclusionTime;
    private Integer paymentMethod;
    private Integer installment;
    private Integer insuredKbn;
    private String nameKana1;
    private String nameKana2;
    private String nameKanji1;
    private String nameKanji2;
    private String postcode;
    private String addrKana1;
    private String addrKana2;
    private String addrKanji1;
    private String addrKanji2;
    private String birthday;
    private Integer gender;
    private String telephoneNo;
    private String mobilephoneNo;
    private String faxNo;

    /**
     *
     * @param isKana カタカナ・漢字どっちのフルネーム
     * @return
     */
    public String getFullUsrName(boolean isKana){
        if(isKana)
            return String.format("%s %s様",this.nameKana1,this.nameKana2);
        else
            return String.format("%s %s様",this.nameKanji1,this.nameKanji1);
    }

    /**
     * 保険開始の日付・時間を和暦として出力
     *
     * @return
     */
    public String getDateTimeOfInceptionByName() throws ParseException {
        return DateFormat.number2Name(this.inceptionDate) + " " +
                DateFormat.to12hour(this.inceptionTime);
    }
    /**
     * 保険満期の日付・時間を和暦として出力
     *
     * @return
     */
    public String getDateTimeOfConclusionByName() throws ParseException {
        return DateFormat.number2Name(this.conclusionDate) + " " +
                DateFormat.to12hour(this.conclusionTime);
    }
    /**
     * 生年月日を和暦として出力
     *
     * @return
     */
    public String getBirthdayByName() throws ParseException {
        return DateFormat.number2Name(this.birthday);
    }

    /**------------フラグから文字に変更する関数--------------*/
    public String getPaymentMethodByName() {
        switch (this.paymentMethod) {
            case 1:
                return "直接集金";
            case 2:
                return "口座振替";
            case 3:
                return "クレジットカード";
            default:
                return null;
        }
    }

    public String getInsuredKbnByName() {
        switch (this.insuredKbn){
            case 1: return "個人";
            case 2: return "法人";
            default:
                return null;
        }
    }

    public String getGenderByName() {
        switch (this.gender){
            case 1: return "男性";
            case 2: return "女性";
            default:
                return null;
        }
    }


    public String getStatusFlgByName() {
        switch (this.statusFlg) {
            case 0:
                return "計上済み";
            case 1:
                return "計上処理待ち（新規）";
            case 5:
                return "計上処理待ち（変更）";
            case 9:
                return "計上処理待ち（解約）";
            default:
                return null;
        }
    }

    public String getCancelFlgByName() {
        switch (this.cancelFlg) {
            case 0:
                return "通常";
            case 1:
                return "解約";
            default:
                return null;
        }
    }

    /**--------------getter&setter---------------*/
    /**
     * @return Gets the value of prtNo and returns prtNo
     */
    public String getPrtNo() {
        return prtNo;
    }

    /**
     * Sets the prtNo
     * You can use getPrtNo() to get the value of prtNo
     */
    public void setPrtNo(String prtNo) {
        this.prtNo = prtNo;
    }

    /**
     * @return Gets the value of polNo and returns polNo
     */
    public String getPolNo() {
        return polNo;
    }

    /**
     * Sets the polNo
     * You can use getPolNo() to get the value of polNo
     */
    public void setPolNo(String polNo) {
        this.polNo = polNo;
    }

    /**
     * @return Gets the value of statusFlg and returns statusFlg
     */
    public Integer getStatusFlg() {
        return statusFlg;
    }

    /**
     * Sets the statusFlg
     * You can use getStatusFlg() to get the value of statusFlg
     */
    public void setStatusFlg(Integer statusFlg) {
        this.statusFlg = statusFlg;
    }




    /**
     * @return Gets the value of cancelFlg and returns cancelFlg
     */
    public Integer getCancelFlg() {
        return cancelFlg;
    }

    /**
     * Sets the cancelFlg
     * You can use getCancelFlg() to get the value of cancelFlg
     */
    public void setCancelFlg(Integer cancelFlg) {
        this.cancelFlg = cancelFlg;
    }


    /**
     * @return Gets the value of inceptionDate and returns inceptionDate
     */
    public String getInceptionDate() {
        return inceptionDate;
    }

    /**
     * Sets the inceptionDate
     * You can use getInceptionDate() to get the value of inceptionDate
     */
    public void setInceptionDate(String inceptionDate) {
        this.inceptionDate = inceptionDate;
    }

    /**
     * @return Gets the value of inceptionTime and returns inceptionTime
     */
    public String getInceptionTime() {
        return inceptionTime;
    }

    /**
     * Sets the inceptionTime
     * You can use getInceptionTime() to get the value of inceptionTime
     */
    public void setInceptionTime(String inceptionTime) {
        this.inceptionTime = inceptionTime;
    }

    /**
     * @return Gets the value of conclusionDate and returns conclusionDate
     */
    public String getConclusionDate() {
        return conclusionDate;
    }

    /**
     * Sets the conclusionDate
     * You can use getConclusionDate() to get the value of conclusionDate
     */
    public void setConclusionDate(String conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    /**
     * @return Gets the value of conclusionTime and returns conclusionTime
     */
    public String getConclusionTime() {
        return conclusionTime;
    }

    /**
     * Sets the conclusionTime
     * You can use getConclusionTime() to get the value of conclusionTime
     */
    public void setConclusionTime(String conclusionTime) {
        this.conclusionTime = conclusionTime;
    }

    /**
     * @return Gets the value of paymentMethod and returns paymentMethod
     */
    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the paymentMethod
     * You can use getPaymentMethod() to get the value of paymentMethod
     */
    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }



    /**
     * @return Gets the value of installment and returns installment
     */
    public Integer getInstallment() {
        return installment;
    }

    /**
     * Sets the installment
     * You can use getInstallment() to get the value of installment
     */
    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    /**
     * @return Gets the value of insuredKbn and returns insuredKbn
     */
    public Integer getInsuredKbn() {
        return insuredKbn;
    }

    /**
     * Sets the insuredKbn
     * You can use getInsuredKbn() to get the value of insuredKbn
     */
    public void setInsuredKbn(Integer insuredKbn) {
        this.insuredKbn = insuredKbn;
    }


    /**
     * @return Gets the value of nameKana1 and returns nameKana1
     */
    public String getNameKana1() {
        return nameKana1;
    }

    /**
     * Sets the nameKana1
     * You can use getNameKana1() to get the value of nameKana1
     */
    public void setNameKana1(String nameKana1) {
        this.nameKana1 = nameKana1;
    }

    /**
     * @return Gets the value of nameKana2 and returns nameKana2
     */
    public String getNameKana2() {
        return nameKana2;
    }

    /**
     * Sets the nameKana2
     * You can use getNameKana2() to get the value of nameKana2
     */
    public void setNameKana2(String nameKana2) {
        this.nameKana2 = nameKana2;
    }

    /**
     * @return Gets the value of nameKanji1 and returns nameKanji1
     */
    public String getNameKanji1() {
        return nameKanji1;
    }

    /**
     * Sets the nameKanji1
     * You can use getNameKanji1() to get the value of nameKanji1
     */
    public void setNameKanji1(String nameKanji1) {
        this.nameKanji1 = nameKanji1;
    }

    /**
     * @return Gets the value of nameKanji2 and returns nameKanji2
     */
    public String getNameKanji2() {
        return nameKanji2;
    }

    /**
     * Sets the nameKanji2
     * You can use getNameKanji2() to get the value of nameKanji2
     */
    public void setNameKanji2(String nameKanji2) {
        this.nameKanji2 = nameKanji2;
    }

    /**
     * @return Gets the value of postcode and returns postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the postcode
     * You can use getPostcode() to get the value of postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * @return Gets the value of addrKana1 and returns addrKana1
     */
    public String getAddrKana1() {
        return addrKana1;
    }

    /**
     * Sets the addrKana1
     * You can use getAddrKana1() to get the value of addrKana1
     */
    public void setAddrKana1(String addrKana1) {
        this.addrKana1 = addrKana1;
    }

    /**
     * @return Gets the value of addrKana2 and returns addrKana2
     */
    public String getAddrKana2() {
        return addrKana2;
    }

    /**
     * Sets the addrKana2
     * You can use getAddrKana2() to get the value of addrKana2
     */
    public void setAddrKana2(String addrKana2) {
        this.addrKana2 = addrKana2;
    }

    /**
     * @return Gets the value of addrKanji1 and returns addrKanji1
     */
    public String getAddrKanji1() {
        return addrKanji1;
    }

    /**
     * Sets the addrKanji1
     * You can use getAddrKanji1() to get the value of addrKanji1
     */
    public void setAddrKanji1(String addrKanji1) {
        this.addrKanji1 = addrKanji1;
    }

    /**
     * @return Gets the value of addrKanji2 and returns addrKanji2
     */
    public String getAddrKanji2() {
        return addrKanji2;
    }

    /**
     * Sets the addrKanji2
     * You can use getAddrKanji2() to get the value of addrKanji2
     */
    public void setAddrKanji2(String addrKanji2) {
        this.addrKanji2 = addrKanji2;
    }

    /**
     * @return Gets the value of birthday and returns birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Sets the birthday
     * You can use getBirthday() to get the value of birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return Gets the value of gender and returns gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * Sets the gender
     * You can use getGender() to get the value of gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }



    /**
     * @return Gets the value of telephoneNo and returns telephoneNo
     */
    public String getTelephoneNo() {
        return telephoneNo;
    }

    /**
     * Sets the telephoneNo
     * You can use getTelephoneNo() to get the value of telephoneNo
     */
    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    /**
     * @return Gets the value of mobilephoneNo and returns mobilephoneNo
     */
    public String getMobilephoneNo() {
        return mobilephoneNo;
    }

    /**
     * Sets the mobilephoneNo
     * You can use getMobilephoneNo() to get the value of mobilephoneNo
     */
    public void setMobilephoneNo(String mobilephoneNo) {
        this.mobilephoneNo = mobilephoneNo;
    }

    /**
     * @return Gets the value of faxNo and returns faxNo
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * Sets the faxNo
     * You can use getFaxNo() to get the value of faxNo
     */
    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

}
