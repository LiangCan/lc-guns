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
@TableName("t_user_history_statistics")
public class TUserHistoryStatistics extends Model<TUserHistoryStatistics> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 游戏ID
     */
    @TableField("game_id")
    private Long gameId;
    /**
     * 第多少期
     */
    private String period;
    /**
     * 总压
     */
    @TableField("sum_count")
    private Float sumCount;
    /**
     * 压大
     */
    @TableField("big_count")
    private Float bigCount;
    /**
     * 压小
     */
    @TableField("small_count")
    private Float smallCount;
    /**
     * 压单
     */
    @TableField("single_count")
    private Float singleCount;
    /**
     * 压双
     */
    @TableField("double_count")
    private Float doubleCount;
    /**
     * 压大单
     */
    @TableField("big_single_count")
    private Float bigSingleCount;
    /**
     * 压大双
     */
    @TableField("big_double_count")
    private Float bigDoubleCount;
    /**
     * 压小单
     */
    @TableField("small_single_count")
    private Float smallSingleCount;
    /**
     * 压小双
     */
    @TableField("small_double_count")
    private Float smallDoubleCount;
    /**
     * 压对子
     */
    @TableField("couplet_count")
    private Float coupletCount;
    /**
     * 压顺子
     */
    @TableField("along_count")
    private Float alongCount;
    /**
     * 压豹子
     */
    @TableField("leopard_count")
    private Float leopardCount;
    /**
     * 0
     */
    @TableField("count_0")
    private Float count0;
    /**
     * 1
     */
    @TableField("count_1")
    private Float count1;
    /**
     * 2
     */
    @TableField("count_2")
    private Float count2;
    /**
     * 3
     */
    @TableField("count_3")
    private Float count3;
    /**
     * 4
     */
    @TableField("count_4")
    private Float count4;
    /**
     * 5
     */
    @TableField("count_5")
    private Float count5;
    /**
     * 6
     */
    @TableField("count_6")
    private Float count6;
    /**
     * 7
     */
    @TableField("count_7")
    private Float count7;
    /**
     * 8
     */
    @TableField("count_8")
    private Float count8;
    /**
     * 9
     */
    @TableField("count_9")
    private Float count9;
    /**
     * 10
     */
    @TableField("count_10")
    private Float count10;
    /**
     * 11
     */
    @TableField("count_11")
    private Float count11;
    /**
     * 12
     */
    @TableField("count_12")
    private Float count12;
    /**
     * 13
     */
    @TableField("count_13")
    private Float count13;
    /**
     * 14
     */
    @TableField("count_14")
    private Float count14;
    /**
     * 15
     */
    @TableField("count_15")
    private Float count15;
    /**
     * 16
     */
    @TableField("count_16")
    private Float count16;
    /**
     * 17
     */
    @TableField("count_17")
    private Float count17;
    /**
     * 18
     */
    @TableField("count_18")
    private Float count18;
    /**
     * 19
     */
    @TableField("count_19")
    private Float count19;
    /**
     * 20
     */
    @TableField("count_20")
    private Float count20;
    /**
     * 21
     */
    @TableField("count_21")
    private Float count21;
    /**
     * 22
     */
    @TableField("count_22")
    private Float count22;
    /**
     * 23
     */
    @TableField("count_23")
    private Float count23;
    /**
     * 24
     */
    @TableField("count_24")
    private Float count24;
    /**
     * 25
     */
    @TableField("count_25")
    private Float count25;
    /**
     * 26
     */
    @TableField("count_26")
    private Float count26;
    /**
     * 27
     */
    @TableField("count_27")
    private Float count27;

    /**
     * 用户
     */
    @TableField("user_id")
    private Long  userId;

    /**
     * 最终结果
     */
    @TableField("count_sub")
    private Float  countSub;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Float getCountSub() {
        return countSub;
    }

    public void setCountSub(Float countSub) {
        this.countSub = countSub;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Float getSumCount() {
        return sumCount;
    }

    public void setSumCount(Float sumCount) {
        this.sumCount = sumCount;
    }

    public Float getBigCount() {
        return bigCount;
    }

    public void setBigCount(Float bigCount) {
        this.bigCount = bigCount;
    }

    public Float getSmallCount() {
        return smallCount;
    }

    public void setSmallCount(Float smallCount) {
        this.smallCount = smallCount;
    }

    public Float getSingleCount() {
        return singleCount;
    }

    public void setSingleCount(Float singleCount) {
        this.singleCount = singleCount;
    }

    public Float getDoubleCount() {
        return doubleCount;
    }

    public void setDoubleCount(Float doubleCount) {
        this.doubleCount = doubleCount;
    }

    public Float getBigSingleCount() {
        return bigSingleCount;
    }

    public void setBigSingleCount(Float bigSingleCount) {
        this.bigSingleCount = bigSingleCount;
    }

    public Float getBigDoubleCount() {
        return bigDoubleCount;
    }

    public void setBigDoubleCount(Float bigDoubleCount) {
        this.bigDoubleCount = bigDoubleCount;
    }

    public Float getSmallSingleCount() {
        return smallSingleCount;
    }

    public void setSmallSingleCount(Float smallSingleCount) {
        this.smallSingleCount = smallSingleCount;
    }

    public Float getSmallDoubleCount() {
        return smallDoubleCount;
    }

    public void setSmallDoubleCount(Float smallDoubleCount) {
        this.smallDoubleCount = smallDoubleCount;
    }

    public Float getCoupletCount() {
        return coupletCount;
    }

    public void setCoupletCount(Float coupletCount) {
        this.coupletCount = coupletCount;
    }

    public Float getAlongCount() {
        return alongCount;
    }

    public void setAlongCount(Float alongCount) {
        this.alongCount = alongCount;
    }

    public Float getLeopardCount() {
        return leopardCount;
    }

    public void setLeopardCount(Float leopardCount) {
        this.leopardCount = leopardCount;
    }

    public Float getCount0() {
        return count0;
    }

    public void setCount0(Float count0) {
        this.count0 = count0;
    }

    public Float getCount1() {
        return count1;
    }

    public void setCount1(Float count1) {
        this.count1 = count1;
    }

    public Float getCount2() {
        return count2;
    }

    public void setCount2(Float count2) {
        this.count2 = count2;
    }

    public Float getCount3() {
        return count3;
    }

    public void setCount3(Float count3) {
        this.count3 = count3;
    }

    public Float getCount4() {
        return count4;
    }

    public void setCount4(Float count4) {
        this.count4 = count4;
    }

    public Float getCount5() {
        return count5;
    }

    public void setCount5(Float count5) {
        this.count5 = count5;
    }

    public Float getCount6() {
        return count6;
    }

    public void setCount6(Float count6) {
        this.count6 = count6;
    }

    public Float getCount7() {
        return count7;
    }

    public void setCount7(Float count7) {
        this.count7 = count7;
    }

    public Float getCount8() {
        return count8;
    }

    public void setCount8(Float count8) {
        this.count8 = count8;
    }

    public Float getCount9() {
        return count9;
    }

    public void setCount9(Float count9) {
        this.count9 = count9;
    }

    public Float getCount10() {
        return count10;
    }

    public void setCount10(Float count10) {
        this.count10 = count10;
    }

    public Float getCount11() {
        return count11;
    }

    public void setCount11(Float count11) {
        this.count11 = count11;
    }

    public Float getCount12() {
        return count12;
    }

    public void setCount12(Float count12) {
        this.count12 = count12;
    }

    public Float getCount13() {
        return count13;
    }

    public void setCount13(Float count13) {
        this.count13 = count13;
    }

    public Float getCount14() {
        return count14;
    }

    public void setCount14(Float count14) {
        this.count14 = count14;
    }

    public Float getCount15() {
        return count15;
    }

    public void setCount15(Float count15) {
        this.count15 = count15;
    }

    public Float getCount16() {
        return count16;
    }

    public void setCount16(Float count16) {
        this.count16 = count16;
    }

    public Float getCount17() {
        return count17;
    }

    public void setCount17(Float count17) {
        this.count17 = count17;
    }

    public Float getCount18() {
        return count18;
    }

    public void setCount18(Float count18) {
        this.count18 = count18;
    }

    public Float getCount19() {
        return count19;
    }

    public void setCount19(Float count19) {
        this.count19 = count19;
    }

    public Float getCount20() {
        return count20;
    }

    public void setCount20(Float count20) {
        this.count20 = count20;
    }

    public Float getCount21() {
        return count21;
    }

    public void setCount21(Float count21) {
        this.count21 = count21;
    }

    public Float getCount22() {
        return count22;
    }

    public void setCount22(Float count22) {
        this.count22 = count22;
    }

    public Float getCount23() {
        return count23;
    }

    public void setCount23(Float count23) {
        this.count23 = count23;
    }

    public Float getCount24() {
        return count24;
    }

    public void setCount24(Float count24) {
        this.count24 = count24;
    }

    public Float getCount25() {
        return count25;
    }

    public void setCount25(Float count25) {
        this.count25 = count25;
    }

    public Float getCount26() {
        return count26;
    }

    public void setCount26(Float count26) {
        this.count26 = count26;
    }

    public Float getCount27() {
        return count27;
    }

    public void setCount27(Float count27) {
        this.count27 = count27;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TUserHistoryStatistics{" +
        "id=" + id +
        ", gameId=" + gameId +
        ", period=" + period +
        ", sumCount=" + sumCount +
        ", bigCount=" + bigCount +
        ", smallCount=" + smallCount +
        ", singleCount=" + singleCount +
        ", doubleCount=" + doubleCount +
        ", bigSingleCount=" + bigSingleCount +
        ", bigDoubleCount=" + bigDoubleCount +
        ", smallSingleCount=" + smallSingleCount +
        ", smallDoubleCount=" + smallDoubleCount +
        ", coupletCount=" + coupletCount +
        ", alongCount=" + alongCount +
        ", leopardCount=" + leopardCount +
        ", count0=" + count0 +
        ", count1=" + count1 +
        ", count2=" + count2 +
        ", count3=" + count3 +
        ", count4=" + count4 +
        ", count5=" + count5 +
        ", count6=" + count6 +
        ", count7=" + count7 +
        ", count8=" + count8 +
        ", count9=" + count9 +
        ", count10=" + count10 +
        ", count11=" + count11 +
        ", count12=" + count12 +
        ", count13=" + count13 +
        ", count14=" + count14 +
        ", count15=" + count15 +
        ", count16=" + count16 +
        ", count17=" + count17 +
        ", count18=" + count18 +
        ", count19=" + count19 +
        ", count20=" + count20 +
        ", count21=" + count21 +
        ", count22=" + count22 +
        ", count23=" + count23 +
        ", count24=" + count24 +
        ", count25=" + count25 +
        ", count26=" + count26 +
        ", count27=" + count27 +
        "}";
    }
}
