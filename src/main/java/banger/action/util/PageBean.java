package banger.action.util;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class PageBean implements Serializable {

    private static final long serialVersionUID = -303675966023156812L;
    private int dataSum = 0; // 数据总个数
    private int pageSum = 0; // 页面总个数
    private int pageSize = 10; // 单页面的数据个数
    private int pageNumber = 1; // 当前页号
    private int customPageSize = 0; // 自定义 单页面的数据个数

    public PageBean(){}
    public PageBean(int p_pageSize) {
        this.pageSize = p_pageSize;
    }
    public PageBean(int pageNumber,int customPageSize) {
        this.pageNumber = pageNumber;
        this.customPageSize = customPageSize;
    }

    /**
     * GETTER 数据总个数
     * @return int
     */
    public int getDataSum() {
        return dataSum;
    }

    /**
     * GETTER 页面总个数
     * @return int
     */
    public int getPageSum() {
        return pageSum;
    }

    /**
     * GETTER 单页面的数据个数
     * @return int
     */
    public int getPageSize() {
        return this.customPageSize == 0 ? this.pageSize : this.customPageSize;
    }

    /**
     * GETTER 当前页号
     * @return int
     */
    public int getPageNumber() {
        return pageNumber <=0 ? 1 : pageNumber;
    }

    /**
     * 查询数据库时，需要的结果集 在 满足SQL查询条件的结果集 中的起始位置。
     * @return int
     */
    public int getFirstResult() {
        return( this.getPageSize() * ( ( this.getPageNumber() == 0 ? 1 : this.getPageNumber() ) - 1 ) );
    }

    /**
     * 在查询数据库时，需要的结果集的行数。
     * @return int
     */
    public int getMaxResults() {
        return this.getPageSize();
    }

    /**
     * 前一页的页号
     * @return int
     */
    public int getPreviousNumber() {
        return this.pageNumber <= 1 ? 1 : this.pageNumber - 1;
    }

    /**
     * 后一页的页号
     * @return int
     */
    public int getNextNumber() {
        return this.pageNumber >= this.pageSum ? this.pageSum : this.pageNumber + 1;
    }

    /**
     * 当前页面第一条记录在整个结果集中的位置
     * @return int
     */
    public int getFirstNumber() {
        return this.getFirstResult() == 0 ? 1 : this.getFirstResult() + 1;
    }

    /**
     * 当前页面最后一条记录在整个结果集中的位置
     * @return int
     */
    public int getLastNumber() {
        return this.getFirstNumber() + this.getPageSize() - 1 > this.dataSum ? this.dataSum : this.getFirstNumber() + this.getPageSize() - 1;
    }

    /**
     * SETTER 数据总个数
     * @param p_dataSum int
     */
    public void setDataSum( int p_dataSum ) {
        this.dataSum = p_dataSum;
        this.computeAttributes();
    }

    /**
     * SETTER 单页面的数据个数
     * @param p_pageSize int
     */
    public void setPageSize( int p_pageSize ) {
        this.pageSize = p_pageSize;
    }

    /**
     * SETTER 当前页号
     * @param p_pageNumber int
     */
    public void setPageNumber( int p_pageNumber ) {
        this.pageNumber = p_pageNumber;
    }

    public int getCustomPageSize() {
        return customPageSize;
    }

    public void setCustomPageSize(int customPageSize) {
        this.customPageSize = customPageSize;
    }

    /**
     * 是否禁用“首页”
     * @return boolean
     */
    public boolean disabledFirstPage() {
        return this.pageSum == 0 || this.pageSum == 1 || this.pageNumber == 0 ||  this.pageNumber == 1;
    }

    /**
     * 是否禁用“上一页”
     * @return boolean
     */
    public boolean disabledPreviousPage() {
        return this.pageSum == 0 || this.pageSum == 1 || this.pageNumber == 0 ||  this.pageNumber == 1;
    }

    /**
     * 是否禁用“下一页”
     * @return boolean
     */
    public boolean disabledNextPage() {
        return this.pageSum == 0 || this.pageSum == 1 || this.pageNumber == this.pageSum;
    }

    /**
     * 是否禁用“末页”
     * @return boolean
     */
    public boolean disabledLastPage() {
        return this.pageSum == 0 || this.pageSum == 1 || this.pageNumber == this.pageSum;
    }

    /**
     * 是否禁用“GO”
     * @return boolean
     */
    public boolean disabledTurnTo() {
        return this.pageSum == 0 || this.pageSum == 1;
    }

    /**
     * 重新计算各个属性值
     */
    public void computeAttributes() {

        // 单页面的数据个数
        this.pageSize = this.pageSize <= 0 ? 1 : this.pageSize;

        // 数据总个数
        this.dataSum = this.dataSum < 0 ? 0 : this.dataSum;

        // 页面总个数
        if(this.dataSum == 0) {
            this.pageSum = 0;
        }
        else {
            int iResidualNum = this.dataSum % this.getPageSize();
            int iDivision = this.dataSum / this.getPageSize();
            this.pageSum = iDivision == 0 ? 1 : iDivision + (iResidualNum == 0 ? 0 : 1);
        }

        // 当前页号
        this.pageNumber = this.pageNumber <= 0 ? 1 : (this.pageNumber > this.pageSum ? this.pageSum : this.pageNumber);
    }

    public void reset(int pageSize) {
        this.dataSum = 0; // 数据总个数
        this.pageSum = 0; // 页面总个数
        this.pageSize = pageSize; // 单页面的数据个数
        this.pageNumber = 1; // 当前页号
        this.customPageSize = 0; // 当前页号
    }

    /**
     * toString
     * @return String
     */
    public String toString() {
        return ToStringBuilder.reflectionToString( this, ToStringStyle.DEFAULT_STYLE );
    }
}