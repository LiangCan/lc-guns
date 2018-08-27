package com.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lc
 * @since 2018-08-16
 */
@TableName("t_game_odds")
public class TGameOdds extends Model<TGameOdds> {

    private static final Long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 大的赔率
     */
    @TableField("big_odds")
    private Float bigOdds;
    /**
     * 小的赔率
     */
    @TableField("small_odds")
    private Float smallOdds;
    /**
     * 单的赔率
     */
    @TableField("single_odds")
    private Float singleOdds;
    /**
     * 双的赔率
     */
    @TableField("double_odds")
    private Float doubleOdds;
    /**
     * 大单的赔率
     */
    @TableField("big_single_odds")
    private Float bigSingleOdds;
    /**
     * 大双的赔率
     */
    @TableField("big_double_odds")
    private Float bigDoubleOdds;
    /**
     * 小单的赔率
     */
    @TableField("small_single_odds")
    private Float smallSingleOdds;
    /**
     * 小双的赔率
     */
    @TableField("small_double_odds")
    private Float smallDoubleOdds;
    /**
     * 对子的赔率
     */
    @TableField("couplet_odds")
    private Float coupletOdds;
    /**
     * 顺子的赔率
     */
    @TableField("along_odds")
    private Float alongOdds;
    /**
     * 豹子的赔率
     */
    @TableField("leopard_odds")
    private Float leopardOdds;
    /**
     * 0
     */
    @TableField("odds_0")
    private Float odds0;
    /**
     * 1
     */
    @TableField("odds_1")
    private Float odds1;
    /**
     * 2
     */
    @TableField("odds_2")
    private Float odds2;
    /**
     * 3
     */
    @TableField("odds_3")
    private Float odds3;
    /**
     * 4
     */
    @TableField("odds_4")
    private Float odds4;
    /**
     * 5
     */
    @TableField("odds_5")
    private Float odds5;
    /**
     * 6
     */
    @TableField("odds_6")
    private Float odds6;
    /**
     * 7
     */
    @TableField("odds_7")
    private Float odds7;
    /**
     * 8
     */
    @TableField("odds_8")
    private Float odds8;
    /**
     * 9
     */
    @TableField("odds_9")
    private Float odds9;
    /**
     * 10
     */
    @TableField("odds_10")
    private Float odds10;
    /**
     * 11
     */
    @TableField("odds_11")
    private Float odds11;
    /**
     * 12
     */
    @TableField("odds_12")
    private Float odds12;
    /**
     * 13
     */
    @TableField("odds_13")
    private Float odds13;
    /**
     * 14
     */
    @TableField("odds_14")
    private Float odds14;
    /**
     * 15
     */
    @TableField("odds_15")
    private Float odds15;
    /**
     * 16
     */
    @TableField("odds_16")
    private Float odds16;
    /**
     * 17
     */
    @TableField("odds_17")
    private Float odds17;
    /**
     * 18
     */
    @TableField("odds_18")
    private Float odds18;
    /**
     * 19
     */
    @TableField("odds_19")
    private Float odds19;
    /**
     * 20
     */
    @TableField("odds_20")
    private Float odds20;
    /**
     * 21
     */
    @TableField("odds_21")
    private Float odds21;
    /**
     * 22
     */
    @TableField("odds_22")
    private Float odds22;
    /**
     * 23
     */
    @TableField("odds_23")
    private Float odds23;
    /**
     * 24
     */
    @TableField("odds_24")
    private Float odds24;
    /**
     * 25
     */
    @TableField("odds_25")
    private Float odds25;
    /**
     * 26
     */
    @TableField("odds_26")
    private Float odds26;
    /**
     * 27
     */
    @TableField("odds_27")
    private Float odds27;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getBigOdds() {
        return bigOdds;
    }

    public void setBigOdds(Float bigOdds) {
        this.bigOdds = bigOdds;
    }

    public Float getSmallOdds() {
        return smallOdds;
    }

    public void setSmallOdds(Float smallOdds) {
        this.smallOdds = smallOdds;
    }

    public Float getSingleOdds() {
        return singleOdds;
    }

    public void setSingleOdds(Float singleOdds) {
        this.singleOdds = singleOdds;
    }

    public Float getDoubleOdds() {
        return doubleOdds;
    }

    public void setDoubleOdds(Float doubleOdds) {
        this.doubleOdds = doubleOdds;
    }

    public Float getBigSingleOdds() {
        return bigSingleOdds;
    }

    public void setBigSingleOdds(Float bigSingleOdds) {
        this.bigSingleOdds = bigSingleOdds;
    }

    public Float getBigDoubleOdds() {
        return bigDoubleOdds;
    }

    public void setBigDoubleOdds(Float bigDoubleOdds) {
        this.bigDoubleOdds = bigDoubleOdds;
    }

    public Float getSmallSingleOdds() {
        return smallSingleOdds;
    }

    public void setSmallSingleOdds(Float smallSingleOdds) {
        this.smallSingleOdds = smallSingleOdds;
    }

    public Float getSmallDoubleOdds() {
        return smallDoubleOdds;
    }

    public void setSmallDoubleOdds(Float smallDoubleOdds) {
        this.smallDoubleOdds = smallDoubleOdds;
    }

    public Float getCoupletOdds() {
        return coupletOdds;
    }

    public void setCoupletOdds(Float coupletOdds) {
        this.coupletOdds = coupletOdds;
    }

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Float getLeopardOdds() {
        return leopardOdds;
    }

    public void setLeopardOdds(Float leopardOdds) {
        this.leopardOdds = leopardOdds;
    }

    public Float getOdds0() {
        return odds0;
    }

    public void setOdds0(Float odds0) {
        this.odds0 = odds0;
    }

    public Float getOdds1() {
        return odds1;
    }

    public void setOdds1(Float odds1) {
        this.odds1 = odds1;
    }

    public Float getOdds2() {
        return odds2;
    }

    public void setOdds2(Float odds2) {
        this.odds2 = odds2;
    }

    public Float getOdds3() {
        return odds3;
    }

    public void setOdds3(Float odds3) {
        this.odds3 = odds3;
    }

    public Float getOdds4() {
        return odds4;
    }

    public void setOdds4(Float odds4) {
        this.odds4 = odds4;
    }

    public Float getOdds5() {
        return odds5;
    }

    public void setOdds5(Float odds5) {
        this.odds5 = odds5;
    }

    public Float getOdds6() {
        return odds6;
    }

    public void setOdds6(Float odds6) {
        this.odds6 = odds6;
    }

    public Float getOdds7() {
        return odds7;
    }

    public void setOdds7(Float odds7) {
        this.odds7 = odds7;
    }

    public Float getOdds8() {
        return odds8;
    }

    public void setOdds8(Float odds8) {
        this.odds8 = odds8;
    }

    public Float getOdds9() {
        return odds9;
    }

    public Float getAlongOdds() {
        return alongOdds;
    }

    public void setAlongOdds(Float alongOdds) {
        this.alongOdds = alongOdds;
    }

    public void setOdds9(Float odds9) {
        this.odds9 = odds9;
    }

    public Float getOdds10() {
        return odds10;
    }

    public void setOdds10(Float odds10) {
        this.odds10 = odds10;
    }

    public Float getOdds11() {
        return odds11;
    }

    public void setOdds11(Float odds11) {
        this.odds11 = odds11;
    }

    public Float getOdds12() {
        return odds12;
    }

    public void setOdds12(Float odds12) {
        this.odds12 = odds12;
    }

    public Float getOdds13() {
        return odds13;
    }

    public void setOdds13(Float odds13) {
        this.odds13 = odds13;
    }

    public Float getOdds14() {
        return odds14;
    }

    public void setOdds14(Float odds14) {
        this.odds14 = odds14;
    }

    public Float getOdds15() {
        return odds15;
    }

    public void setOdds15(Float odds15) {
        this.odds15 = odds15;
    }

    public Float getOdds16() {
        return odds16;
    }

    public void setOdds16(Float odds16) {
        this.odds16 = odds16;
    }

    public Float getOdds17() {
        return odds17;
    }

    public void setOdds17(Float odds17) {
        this.odds17 = odds17;
    }

    public Float getOdds18() {
        return odds18;
    }

    public void setOdds18(Float odds18) {
        this.odds18 = odds18;
    }

    public Float getOdds19() {
        return odds19;
    }

    public void setOdds19(Float odds19) {
        this.odds19 = odds19;
    }

    public Float getOdds20() {
        return odds20;
    }

    public void setOdds20(Float odds20) {
        this.odds20 = odds20;
    }

    public Float getOdds21() {
        return odds21;
    }

    public void setOdds21(Float odds21) {
        this.odds21 = odds21;
    }

    public Float getOdds22() {
        return odds22;
    }

    public void setOdds22(Float odds22) {
        this.odds22 = odds22;
    }

    public Float getOdds23() {
        return odds23;
    }

    public void setOdds23(Float odds23) {
        this.odds23 = odds23;
    }

    public Float getOdds24() {
        return odds24;
    }

    public void setOdds24(Float odds24) {
        this.odds24 = odds24;
    }

    public Float getOdds25() {
        return odds25;
    }

    public void setOdds25(Float odds25) {
        this.odds25 = odds25;
    }

    public Float getOdds26() {
        return odds26;
    }

    public void setOdds26(Float odds26) {
        this.odds26 = odds26;
    }

    public Float getOdds27() {
        return odds27;
    }

    public void setOdds27(Float odds27) {
        this.odds27 = odds27;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TGameOdds{" +
        "id=" + id +
        ", bigOdds=" + bigOdds +
        ", smallOdds=" + smallOdds +
        ", singleOdds=" + singleOdds +
        ", doubleOdds=" + doubleOdds +
        ", bigSingleOdds=" + bigSingleOdds +
        ", bigDoubleOdds=" + bigDoubleOdds +
        ", smallSingleOdds=" + smallSingleOdds +
        ", smallDoubleOdds=" + smallDoubleOdds +
        ", coupletOdds=" + coupletOdds +
        ", alongOdds=" + alongOdds +
        ", leopardOdds=" + leopardOdds +
        ", odds0=" + odds0 +
        ", odds1=" + odds1 +
        ", odds2=" + odds2 +
        ", odds3=" + odds3 +
        ", odds4=" + odds4 +
        ", odds5=" + odds5 +
        ", odds6=" + odds6 +
        ", odds7=" + odds7 +
        ", odds8=" + odds8 +
        ", odds9=" + odds9 +
        ", odds10=" + odds10 +
        ", odds11=" + odds11 +
        ", odds12=" + odds12 +
        ", odds13=" + odds13 +
        ", odds14=" + odds14 +
        ", odds15=" + odds15 +
        ", odds16=" + odds16 +
        ", odds17=" + odds17 +
        ", odds18=" + odds18 +
        ", odds19=" + odds19 +
        ", odds20=" + odds20 +
        ", odds21=" + odds21 +
        ", odds22=" + odds22 +
        ", odds23=" + odds23 +
        ", odds24=" + odds24 +
        ", odds25=" + odds25 +
        ", odds26=" + odds26 +
        ", odds27=" + odds27 +
        "}";
    }
}
