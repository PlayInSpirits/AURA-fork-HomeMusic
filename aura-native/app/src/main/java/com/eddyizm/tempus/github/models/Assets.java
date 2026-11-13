package com.eddyizm.tempus.github.models;

import defpackage.b11;
import defpackage.f34;
import defpackage.h12;
import defpackage.ka4;
import defpackage.xj0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class Assets {
    public static final int $stable = 8;

    @ka4("browser_download_url")
    private String browserDownloadUrl;

    @ka4("content_type")
    private String contentType;

    @ka4("created_at")
    private String createdAt;

    @ka4("download_count")
    private Integer downloadCount;

    @ka4("id")
    private Integer id;

    @ka4("label")
    private String label;

    @ka4("name")
    private String name;

    @ka4("node_id")
    private String nodeId;

    @ka4("size")
    private Integer size;

    @ka4("state")
    private String state;

    @ka4("updated_at")
    private String updatedAt;

    @ka4("uploader")
    private Uploader uploader;

    @ka4("url")
    private String url;

    public /* synthetic */ Assets(String str, Integer num, String str2, String str3, String str4, Uploader uploader, String str5, String str6, Integer num2, Integer num3, String str7, String str8, String str9, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? new Uploader(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null) : uploader, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9);
    }

    public static /* synthetic */ Assets copy$default(Assets assets, String str, Integer num, String str2, String str3, String str4, Uploader uploader, String str5, String str6, Integer num2, Integer num3, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assets.url;
        }
        return assets.copy(str, (i & 2) != 0 ? assets.id : num, (i & 4) != 0 ? assets.nodeId : str2, (i & 8) != 0 ? assets.name : str3, (i & 16) != 0 ? assets.label : str4, (i & 32) != 0 ? assets.uploader : uploader, (i & 64) != 0 ? assets.contentType : str5, (i & 128) != 0 ? assets.state : str6, (i & 256) != 0 ? assets.size : num2, (i & 512) != 0 ? assets.downloadCount : num3, (i & 1024) != 0 ? assets.createdAt : str7, (i & 2048) != 0 ? assets.updatedAt : str8, (i & 4096) != 0 ? assets.browserDownloadUrl : str9);
    }

    public final String component1() {
        return this.url;
    }

    public final Integer component10() {
        return this.downloadCount;
    }

    public final String component11() {
        return this.createdAt;
    }

    public final String component12() {
        return this.updatedAt;
    }

    public final String component13() {
        return this.browserDownloadUrl;
    }

    public final Integer component2() {
        return this.id;
    }

    public final String component3() {
        return this.nodeId;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.label;
    }

    public final Uploader component6() {
        return this.uploader;
    }

    public final String component7() {
        return this.contentType;
    }

    public final String component8() {
        return this.state;
    }

    public final Integer component9() {
        return this.size;
    }

    public final Assets copy(String str, Integer num, String str2, String str3, String str4, Uploader uploader, String str5, String str6, Integer num2, Integer num3, String str7, String str8, String str9) {
        return new Assets(str, num, str2, str3, str4, uploader, str5, str6, num2, num3, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Assets)) {
            return false;
        }
        Assets assets = (Assets) obj;
        return h12.c(this.url, assets.url) && h12.c(this.id, assets.id) && h12.c(this.nodeId, assets.nodeId) && h12.c(this.name, assets.name) && h12.c(this.label, assets.label) && h12.c(this.uploader, assets.uploader) && h12.c(this.contentType, assets.contentType) && h12.c(this.state, assets.state) && h12.c(this.size, assets.size) && h12.c(this.downloadCount, assets.downloadCount) && h12.c(this.createdAt, assets.createdAt) && h12.c(this.updatedAt, assets.updatedAt) && h12.c(this.browserDownloadUrl, assets.browserDownloadUrl);
    }

    public final String getBrowserDownloadUrl() {
        return this.browserDownloadUrl;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final Integer getDownloadCount() {
        return this.downloadCount;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final String getState() {
        return this.state;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final Uploader getUploader() {
        return this.uploader;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.nodeId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.label;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uploader uploader = this.uploader;
        int hashCode6 = (hashCode5 + (uploader == null ? 0 : uploader.hashCode())) * 31;
        String str5 = this.contentType;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.state;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.size;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.downloadCount;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.createdAt;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.updatedAt;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.browserDownloadUrl;
        return hashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setBrowserDownloadUrl(String str) {
        this.browserDownloadUrl = str;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setDownloadCount(Integer num) {
        this.downloadCount = num;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final void setLabel(String str) {
        this.label = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNodeId(String str) {
        this.nodeId = str;
    }

    public final void setSize(Integer num) {
        this.size = num;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public final void setUploader(Uploader uploader) {
        this.uploader = uploader;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        String str = this.url;
        Integer num = this.id;
        String str2 = this.nodeId;
        String str3 = this.name;
        String str4 = this.label;
        Uploader uploader = this.uploader;
        String str5 = this.contentType;
        String str6 = this.state;
        Integer num2 = this.size;
        Integer num3 = this.downloadCount;
        String str7 = this.createdAt;
        String str8 = this.updatedAt;
        String str9 = this.browserDownloadUrl;
        StringBuilder sb = new StringBuilder("Assets(url=");
        sb.append(str);
        sb.append(", id=");
        sb.append(num);
        sb.append(", nodeId=");
        f34.n(sb, str2, ", name=", str3, ", label=");
        sb.append(str4);
        sb.append(", uploader=");
        sb.append(uploader);
        sb.append(", contentType=");
        f34.n(sb, str5, ", state=", str6, ", size=");
        sb.append(num2);
        sb.append(", downloadCount=");
        sb.append(num3);
        sb.append(", createdAt=");
        f34.n(sb, str7, ", updatedAt=", str8, ", browserDownloadUrl=");
        return b11.q(sb, str9, ")");
    }

    public Assets(String str, Integer num, String str2, String str3, String str4, Uploader uploader, String str5, String str6, Integer num2, Integer num3, String str7, String str8, String str9) {
        this.url = str;
        this.id = num;
        this.nodeId = str2;
        this.name = str3;
        this.label = str4;
        this.uploader = uploader;
        this.contentType = str5;
        this.state = str6;
        this.size = num2;
        this.downloadCount = num3;
        this.createdAt = str7;
        this.updatedAt = str8;
        this.browserDownloadUrl = str9;
    }

    public Assets() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
