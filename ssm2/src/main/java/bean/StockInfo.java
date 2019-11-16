package bean;

public class StockInfo {
    private Integer stockId;
    private Integer goodsId;
    private Integer goodsStockNum;

    public StockInfo() {
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsStockNum() {
        return goodsStockNum;
    }

    public void setGoodsStockNum(Integer goodsStockNum) {
        this.goodsStockNum = goodsStockNum;
    }
}
