package com.yzgaming.vo.banner;

public class BannerVO {
    // 主键
    private Integer id;
    // 图片名称(带后缀名)
    private String imageName;
    // 点击图片跳转链接
    private String imageUrl;
    // 图片说明(banner下方文字)
    private String imageTitle;
    // 属于那个端(0，共用，1,PC客户端，2，APP，3微信端)
    private Integer type;
    //图片地址
    private String imageAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImageAddress() {
        imageAddress="阿里云地址"+imageName;
        return imageAddress;
    }

}
