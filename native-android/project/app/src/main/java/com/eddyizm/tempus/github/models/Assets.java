package com.eddyizm.tempus.github.models;

import defpackage.b11;
import defpackage.f34;
import defpackage.h12;
import defpackage.ka4;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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

    public /* synthetic */ Assets(String r30, Integer r31, String r32, String r33, String r34, Uploader r35, String r36, String r37, Integer r38, Integer r39, String r40, String r41, String r42, int r43, xj0 r44) {
        if ((r43 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r43 & 2) == 0) goto L9;
        Integer r3 = null;
    L11:
        if ((r43 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r43 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r43 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r43 & 32) == 0) goto L25;
        Uploader r8 = new Uploader(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    L27:
        if ((r43 & 64) == 0) goto L29;
        String r7 = null;
    L31:
        if ((r43 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r43 & 256) == 0) goto L37;
        Integer r10 = null;
    L39:
        if ((r43 & 512) == 0) goto L41;
        Integer r11 = null;
    L43:
        if ((r43 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r43 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r43 & 4096) == 0) goto L54;
        String r45 = null;
    L55:
        this(r1, r3, r4, r5, r6, r8, r7, r9, r10, r11, r12, r13, r45);
        return;
    L54:
        r45 = r42;
        goto L55
    L49:
        r13 = r41;
        goto L51
    L45:
        r12 = r40;
        goto L47
    L41:
        r11 = r39;
        goto L43
    L37:
        r10 = r38;
        goto L39
    L33:
        r9 = r37;
        goto L35
    L29:
        r7 = r36;
        goto L31
    L25:
        r8 = r35;
        goto L27
    L21:
        r6 = r34;
        goto L23
    L17:
        r5 = r33;
        goto L19
    L13:
        r4 = r32;
        goto L15
    L9:
        r3 = r31;
        goto L11
    L5:
        r1 = r30;
        goto L7
    }

    public static /* synthetic */ Assets copy$default(Assets r12, String r13, Integer r14, String r15, String r16, String r17, Uploader r18, String r19, String r20, Integer r21, Integer r22, String r23, String r24, String r25, int r26, Object r27) {
        if ((r26 & 1) == 0) goto L6;
        r13 = r12.url;
    L6:
        if ((r26 & 2) == 0) goto L8;
        Integer r1 = r12.id;
    L10:
        if ((r26 & 4) == 0) goto L12;
        String r2 = r12.nodeId;
    L14:
        if ((r26 & 8) == 0) goto L16;
        String r3 = r12.name;
    L18:
        if ((r26 & 16) == 0) goto L20;
        String r4 = r12.label;
    L22:
        if ((r26 & 32) == 0) goto L24;
        Uploader r5 = r12.uploader;
    L26:
        if ((r26 & 64) == 0) goto L28;
        String r6 = r12.contentType;
    L30:
        if ((r26 & 128) == 0) goto L32;
        String r7 = r12.state;
    L34:
        if ((r26 & 256) == 0) goto L36;
        Integer r8 = r12.size;
    L38:
        if ((r26 & 512) == 0) goto L40;
        Integer r9 = r12.downloadCount;
    L42:
        if ((r26 & 1024) == 0) goto L44;
        String r10 = r12.createdAt;
    L46:
        if ((r26 & 2048) == 0) goto L48;
        String r11 = r12.updatedAt;
    L50:
        if ((r26 & 4096) == 0) goto L53;
        String r28 = r12.browserDownloadUrl;
    L55:
        return r12.copy(r13, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r28);
    L53:
        r28 = r25;
        goto L55
    L48:
        r11 = r24;
        goto L50
    L44:
        r10 = r23;
        goto L46
    L40:
        r9 = r22;
        goto L42
    L36:
        r8 = r21;
        goto L38
    L32:
        r7 = r20;
        goto L34
    L28:
        r6 = r19;
        goto L30
    L24:
        r5 = r18;
        goto L26
    L20:
        r4 = r17;
        goto L22
    L16:
        r3 = r16;
        goto L18
    L12:
        r2 = r15;
        goto L14
    L8:
        r1 = r14;
        goto L10
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

    public final Assets copy(String r1, Integer r2, String r3, String r4, String r5, Uploader r6, String r7, String r8, Integer r9, Integer r10, String r11, String r12, String r13) {
        return new Assets(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Assets) == true) goto L8;
        return false;
    L8:
        Assets r6 = (Assets) r5;
        if (h12.c(this.url, r6.url) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.id, r6.id) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.nodeId, r6.nodeId) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.name, r6.name) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.label, r6.label) == true) goto L24;
        return false;
    L24:
        if (h12.c(this.uploader, r6.uploader) == true) goto L27;
        return false;
    L27:
        if (h12.c(this.contentType, r6.contentType) == true) goto L30;
        return false;
    L30:
        if (h12.c(this.state, r6.state) == true) goto L33;
        return false;
    L33:
        if (h12.c(this.size, r6.size) == true) goto L36;
        return false;
    L36:
        if (h12.c(this.downloadCount, r6.downloadCount) == true) goto L39;
        return false;
    L39:
        if (h12.c(this.createdAt, r6.createdAt) == true) goto L42;
        return false;
    L42:
        if (h12.c(this.updatedAt, r6.updatedAt) == true) goto L45;
        return false;
    L45:
        if (h12.c(this.browserDownloadUrl, r6.browserDownloadUrl) == true) goto L47;
        return false;
    L47:
        return true;
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
        String r0 = this.url;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        Integer r4 = this.id;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        String r7 = this.nodeId;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        String r10 = this.name;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        String r13 = this.label;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        Uploader r16 = this.uploader;
        if (r16 != null) goto L25;
        int r17 = 0;
    L26:
        int r18 = (r15 + r17) * 31;
        String r19 = this.contentType;
        if (r19 != null) goto L29;
        int r20 = 0;
    L30:
        int r21 = (r18 + r20) * 31;
        String r22 = this.state;
        if (r22 != null) goto L33;
        int r23 = 0;
    L34:
        int r24 = (r21 + r23) * 31;
        Integer r25 = this.size;
        if (r25 != null) goto L37;
        int r26 = 0;
    L38:
        int r27 = (r24 + r26) * 31;
        Integer r28 = this.downloadCount;
        if (r28 != null) goto L41;
        int r29 = 0;
    L42:
        int r30 = (r27 + r29) * 31;
        String r31 = this.createdAt;
        if (r31 != null) goto L45;
        int r32 = 0;
    L46:
        int r33 = (r30 + r32) * 31;
        String r34 = this.updatedAt;
        if (r34 != null) goto L49;
        int r35 = 0;
    L50:
        int r36 = (r33 + r35) * 31;
        String r37 = this.browserDownloadUrl;
        if (r37 == null) goto L55;
        r1 = r37.hashCode();
    L55:
        return r36 + r1;
    L49:
        r35 = r34.hashCode();
        goto L50
    L45:
        r32 = r31.hashCode();
        goto L46
    L41:
        r29 = r28.hashCode();
        goto L42
    L37:
        r26 = r25.hashCode();
        goto L38
    L33:
        r23 = r22.hashCode();
        goto L34
    L29:
        r20 = r19.hashCode();
        goto L30
    L25:
        r17 = r16.hashCode();
        goto L26
    L21:
        r14 = r13.hashCode();
        goto L22
    L17:
        r11 = r10.hashCode();
        goto L18
    L13:
        r8 = r7.hashCode();
        goto L14
    L9:
        r5 = r4.hashCode();
        goto L10
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    public final void setBrowserDownloadUrl(String r1) {
        this.browserDownloadUrl = r1;
    }

    public final void setContentType(String r1) {
        this.contentType = r1;
    }

    public final void setCreatedAt(String r1) {
        this.createdAt = r1;
    }

    public final void setDownloadCount(Integer r1) {
        this.downloadCount = r1;
    }

    public final void setId(Integer r1) {
        this.id = r1;
    }

    public final void setLabel(String r1) {
        this.label = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    public final void setNodeId(String r1) {
        this.nodeId = r1;
    }

    public final void setSize(Integer r1) {
        this.size = r1;
    }

    public final void setState(String r1) {
        this.state = r1;
    }

    public final void setUpdatedAt(String r1) {
        this.updatedAt = r1;
    }

    public final void setUploader(Uploader r1) {
        this.uploader = r1;
    }

    public final void setUrl(String r1) {
        this.url = r1;
    }

    public String toString() {
        String r0 = this.url;
        Integer r1 = this.id;
        String r2 = this.nodeId;
        String r3 = this.name;
        String r4 = this.label;
        Uploader r5 = this.uploader;
        String r6 = this.contentType;
        String r7 = this.state;
        Integer r8 = this.size;
        Integer r9 = this.downloadCount;
        String r10 = this.createdAt;
        String r11 = this.updatedAt;
        String r14 = this.browserDownloadUrl;
        StringBuilder r12 = new StringBuilder("Assets(url=");
        r12.append(r0);
        r12.append(", id=");
        r12.append(r1);
        r12.append(", nodeId=");
        f34.n(r12, r2, ", name=", r3, ", label=");
        r12.append(r4);
        r12.append(", uploader=");
        r12.append(r5);
        r12.append(", contentType=");
        f34.n(r12, r6, ", state=", r7, ", size=");
        r12.append(r8);
        r12.append(", downloadCount=");
        r12.append(r9);
        r12.append(", createdAt=");
        f34.n(r12, r10, ", updatedAt=", r11, ", browserDownloadUrl=");
        return b11.q(r12, r14, ")");
    }

    public Assets(String r1, Integer r2, String r3, String r4, String r5, Uploader r6, String r7, String r8, Integer r9, Integer r10, String r11, String r12, String r13) {
        this.url = r1;
        this.id = r2;
        this.nodeId = r3;
        this.name = r4;
        this.label = r5;
        this.uploader = r6;
        this.contentType = r7;
        this.state = r8;
        this.size = r9;
        this.downloadCount = r10;
        this.createdAt = r11;
        this.updatedAt = r12;
        this.browserDownloadUrl = r13;
    }

    public Assets() {
        String r1 = null;
        Integer r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        Uploader r6 = null;
        String r7 = null;
        String r8 = null;
        Integer r9 = null;
        Integer r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, 8191, null);
    }
}
