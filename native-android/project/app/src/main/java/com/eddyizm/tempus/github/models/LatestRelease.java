package com.eddyizm.tempus.github.models;

import defpackage.b11;
import defpackage.f34;
import defpackage.h12;
import defpackage.ka4;
import defpackage.xj0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class LatestRelease {
    public static final int $stable = 8;

    @ka4("assets")
    private ArrayList<Assets> assets;

    @ka4("assets_url")
    private String assetsUrl;

    @ka4("author")
    private Author author;

    @ka4("body")
    private String body;

    @ka4("created_at")
    private String createdAt;

    @ka4("draft")
    private Boolean draft;

    @ka4("html_url")
    private String htmlUrl;

    @ka4("id")
    private Integer id;

    @ka4("name")
    private String name;

    @ka4("node_id")
    private String nodeId;

    @ka4("prerelease")
    private Boolean prerelease;

    @ka4("published_at")
    private String publishedAt;

    @ka4("reactions")
    private Reactions reactions;

    @ka4("tag_name")
    private String tagName;

    @ka4("tarball_url")
    private String tarballUrl;

    @ka4("target_commitish")
    private String targetCommitish;

    @ka4("upload_url")
    private String uploadUrl;

    @ka4("url")
    private String url;

    @ka4("zipball_url")
    private String zipballUrl;

    public /* synthetic */ LatestRelease(String r32, String r33, String r34, String r35, Integer r36, Author r37, String r38, String r39, String r40, String r41, Boolean r42, Boolean r43, String r44, String r45, ArrayList r46, String r47, String r48, String r49, Reactions r50, int r51, xj0 r52) {
        if ((r51 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r51 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r51 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r51 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r51 & 16) == 0) goto L21;
        Integer r6 = null;
    L23:
        if ((r51 & 32) == 0) goto L25;
        Author r8 = new Author(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    L27:
        if ((r51 & 64) == 0) goto L29;
        String r7 = null;
    L31:
        if ((r51 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r51 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r51 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r51 & 1024) == 0) goto L45;
        Boolean r12 = null;
    L47:
        if ((r51 & 2048) == 0) goto L49;
        Boolean r13 = null;
    L51:
        if ((r51 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r51 & 8192) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r51 & 16384) == 0) goto L61;
        ArrayList r2 = new ArrayList();
    L63:
        if ((r51 & 32768) == 0) goto L65;
        String r16 = null;
    L67:
        if ((r51 & 65536) == 0) goto L69;
        String r17 = null;
    L71:
        if ((r51 & 131072) == 0) goto L73;
        String r18 = null;
    L75:
        if ((r51 & 262144) == 0) goto L78;
        Reactions r53 = new Reactions(null, null, null, null, null, null, null, null, null, null, 1023, null);
    L79:
        this(r1, r3, r4, r5, r6, r8, r7, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r53);
        return;
    L78:
        r53 = r50;
        goto L79
    L73:
        r18 = r49;
        goto L75
    L69:
        r17 = r48;
        goto L71
    L65:
        r16 = r47;
        goto L67
    L61:
        r2 = r46;
        goto L63
    L57:
        r15 = r45;
        goto L59
    L53:
        r14 = r44;
        goto L55
    L49:
        r13 = r43;
        goto L51
    L45:
        r12 = r42;
        goto L47
    L41:
        r11 = r41;
        goto L43
    L37:
        r10 = r40;
        goto L39
    L33:
        r9 = r39;
        goto L35
    L29:
        r7 = r38;
        goto L31
    L25:
        r8 = r37;
        goto L27
    L21:
        r6 = r36;
        goto L23
    L17:
        r5 = r35;
        goto L19
    L13:
        r4 = r34;
        goto L15
    L9:
        r3 = r33;
        goto L11
    L5:
        r1 = r32;
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LatestRelease copy$default(LatestRelease r17, String r18, String r19, String r20, String r21, Integer r22, Author r23, String r24, String r25, String r26, String r27, Boolean r28, Boolean r29, String r30, String r31, ArrayList r32, String r33, String r34, String r35, Reactions r36, int r37, Object r38) {
        if ((r37 & 1) == 0) goto L5;
        String r2 = r17.url;
    L7:
        if ((r37 & 2) == 0) goto L9;
        String r3 = r17.assetsUrl;
    L11:
        if ((r37 & 4) == 0) goto L13;
        String r4 = r17.uploadUrl;
    L15:
        if ((r37 & 8) == 0) goto L17;
        String r5 = r17.htmlUrl;
    L19:
        if ((r37 & 16) == 0) goto L21;
        Integer r6 = r17.id;
    L23:
        if ((r37 & 32) == 0) goto L25;
        Author r7 = r17.author;
    L27:
        if ((r37 & 64) == 0) goto L29;
        String r8 = r17.nodeId;
    L31:
        if ((r37 & 128) == 0) goto L33;
        String r9 = r17.tagName;
    L35:
        if ((r37 & 256) == 0) goto L37;
        String r10 = r17.targetCommitish;
    L39:
        if ((r37 & 512) == 0) goto L41;
        String r11 = r17.name;
    L43:
        if ((r37 & 1024) == 0) goto L45;
        Boolean r12 = r17.draft;
    L47:
        if ((r37 & 2048) == 0) goto L49;
        Boolean r13 = r17.prerelease;
    L51:
        if ((r37 & 4096) == 0) goto L53;
        String r14 = r17.createdAt;
    L55:
        if ((r37 & 8192) == 0) goto L57;
        String r15 = r17.publishedAt;
    L58:
        String r110 = r2;
        if ((r37 & 16384) == 0) goto L61;
        ArrayList r16 = r17.assets;
    L63:
        if ((r37 & 32768) == 0) goto L65;
        String r1 = r17.tarballUrl;
    L66:
        String r111 = r1;
        if ((r37 & 65536) == 0) goto L69;
        String r39 = r17.zipballUrl;
    L70:
        String r210 = r39;
        if ((r37 & 131072) == 0) goto L73;
        String r40 = r17.body;
    L75:
        if ((r37 & 262144) == 0) goto L78;
        String r211 = r40;
        String r310 = r211;
        Reactions r311 = r17.reactions;
    L80:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r310, r311);
    L78:
        r311 = r36;
        r310 = r40;
        goto L80
    L73:
        r40 = r35;
        goto L75
    L69:
        r39 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final String component1() {
        return this.url;
    }

    public final String component10() {
        return this.name;
    }

    public final Boolean component11() {
        return this.draft;
    }

    public final Boolean component12() {
        return this.prerelease;
    }

    public final String component13() {
        return this.createdAt;
    }

    public final String component14() {
        return this.publishedAt;
    }

    public final ArrayList<Assets> component15() {
        return this.assets;
    }

    public final String component16() {
        return this.tarballUrl;
    }

    public final String component17() {
        return this.zipballUrl;
    }

    public final String component18() {
        return this.body;
    }

    public final Reactions component19() {
        return this.reactions;
    }

    public final String component2() {
        return this.assetsUrl;
    }

    public final String component3() {
        return this.uploadUrl;
    }

    public final String component4() {
        return this.htmlUrl;
    }

    public final Integer component5() {
        return this.id;
    }

    public final Author component6() {
        return this.author;
    }

    public final String component7() {
        return this.nodeId;
    }

    public final String component8() {
        return this.tagName;
    }

    public final String component9() {
        return this.targetCommitish;
    }

    public final LatestRelease copy(String r21, String r22, String r23, String r24, Integer r25, Author r26, String r27, String r28, String r29, String r30, Boolean r31, Boolean r32, String r33, String r34, ArrayList<Assets> r35, String r36, String r37, String r38, Reactions r39) {
        r35.getClass();
        return new LatestRelease(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof LatestRelease) == true) goto L8;
        return false;
    L8:
        LatestRelease r6 = (LatestRelease) r5;
        if (h12.c(this.url, r6.url) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.assetsUrl, r6.assetsUrl) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.uploadUrl, r6.uploadUrl) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.htmlUrl, r6.htmlUrl) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.id, r6.id) == true) goto L24;
        return false;
    L24:
        if (h12.c(this.author, r6.author) == true) goto L27;
        return false;
    L27:
        if (h12.c(this.nodeId, r6.nodeId) == true) goto L30;
        return false;
    L30:
        if (h12.c(this.tagName, r6.tagName) == true) goto L33;
        return false;
    L33:
        if (h12.c(this.targetCommitish, r6.targetCommitish) == true) goto L36;
        return false;
    L36:
        if (h12.c(this.name, r6.name) == true) goto L39;
        return false;
    L39:
        if (h12.c(this.draft, r6.draft) == true) goto L42;
        return false;
    L42:
        if (h12.c(this.prerelease, r6.prerelease) == true) goto L45;
        return false;
    L45:
        if (h12.c(this.createdAt, r6.createdAt) == true) goto L48;
        return false;
    L48:
        if (h12.c(this.publishedAt, r6.publishedAt) == true) goto L51;
        return false;
    L51:
        if (h12.c(this.assets, r6.assets) == true) goto L54;
        return false;
    L54:
        if (h12.c(this.tarballUrl, r6.tarballUrl) == true) goto L57;
        return false;
    L57:
        if (h12.c(this.zipballUrl, r6.zipballUrl) == true) goto L60;
        return false;
    L60:
        if (h12.c(this.body, r6.body) == true) goto L63;
        return false;
    L63:
        if (h12.c(this.reactions, r6.reactions) == true) goto L65;
        return false;
    L65:
        return true;
    }

    public final ArrayList<Assets> getAssets() {
        return this.assets;
    }

    public final String getAssetsUrl() {
        return this.assetsUrl;
    }

    public final Author getAuthor() {
        return this.author;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final Boolean getDraft() {
        return this.draft;
    }

    public final String getHtmlUrl() {
        return this.htmlUrl;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final Boolean getPrerelease() {
        return this.prerelease;
    }

    public final String getPublishedAt() {
        return this.publishedAt;
    }

    public final Reactions getReactions() {
        return this.reactions;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public final String getTarballUrl() {
        return this.tarballUrl;
    }

    public final String getTargetCommitish() {
        return this.targetCommitish;
    }

    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getZipballUrl() {
        return this.zipballUrl;
    }

    public int hashCode() {
        String r0 = this.url;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        String r4 = this.assetsUrl;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        String r7 = this.uploadUrl;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        String r10 = this.htmlUrl;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        Integer r13 = this.id;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        Author r16 = this.author;
        if (r16 != null) goto L25;
        int r17 = 0;
    L26:
        int r18 = (r15 + r17) * 31;
        String r19 = this.nodeId;
        if (r19 != null) goto L29;
        int r20 = 0;
    L30:
        int r21 = (r18 + r20) * 31;
        String r22 = this.tagName;
        if (r22 != null) goto L33;
        int r23 = 0;
    L34:
        int r24 = (r21 + r23) * 31;
        String r25 = this.targetCommitish;
        if (r25 != null) goto L37;
        int r26 = 0;
    L38:
        int r27 = (r24 + r26) * 31;
        String r28 = this.name;
        if (r28 != null) goto L41;
        int r29 = 0;
    L42:
        int r30 = (r27 + r29) * 31;
        Boolean r31 = this.draft;
        if (r31 != null) goto L45;
        int r32 = 0;
    L46:
        int r33 = (r30 + r32) * 31;
        Boolean r34 = this.prerelease;
        if (r34 != null) goto L49;
        int r35 = 0;
    L50:
        int r36 = (r33 + r35) * 31;
        String r37 = this.createdAt;
        if (r37 != null) goto L53;
        int r38 = 0;
    L54:
        int r39 = (r36 + r38) * 31;
        String r40 = this.publishedAt;
        if (r40 != null) goto L57;
        int r41 = 0;
    L58:
        int r42 = (this.assets.hashCode() + ((r39 + r41) * 31)) * 31;
        String r43 = this.tarballUrl;
        if (r43 != null) goto L61;
        int r44 = 0;
    L62:
        int r45 = (r42 + r44) * 31;
        String r46 = this.zipballUrl;
        if (r46 != null) goto L65;
        int r47 = 0;
    L66:
        int r48 = (r45 + r47) * 31;
        String r49 = this.body;
        if (r49 != null) goto L69;
        int r50 = 0;
    L70:
        int r51 = (r48 + r50) * 31;
        Reactions r52 = this.reactions;
        if (r52 == null) goto L75;
        r1 = r52.hashCode();
    L75:
        return r51 + r1;
    L69:
        r50 = r49.hashCode();
        goto L70
    L65:
        r47 = r46.hashCode();
        goto L66
    L61:
        r44 = r43.hashCode();
        goto L62
    L57:
        r41 = r40.hashCode();
        goto L58
    L53:
        r38 = r37.hashCode();
        goto L54
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

    public final void setAssets(ArrayList<Assets> r1) {
        r1.getClass();
        this.assets = r1;
    }

    public final void setAssetsUrl(String r1) {
        this.assetsUrl = r1;
    }

    public final void setAuthor(Author r1) {
        this.author = r1;
    }

    public final void setBody(String r1) {
        this.body = r1;
    }

    public final void setCreatedAt(String r1) {
        this.createdAt = r1;
    }

    public final void setDraft(Boolean r1) {
        this.draft = r1;
    }

    public final void setHtmlUrl(String r1) {
        this.htmlUrl = r1;
    }

    public final void setId(Integer r1) {
        this.id = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    public final void setNodeId(String r1) {
        this.nodeId = r1;
    }

    public final void setPrerelease(Boolean r1) {
        this.prerelease = r1;
    }

    public final void setPublishedAt(String r1) {
        this.publishedAt = r1;
    }

    public final void setReactions(Reactions r1) {
        this.reactions = r1;
    }

    public final void setTagName(String r1) {
        this.tagName = r1;
    }

    public final void setTarballUrl(String r1) {
        this.tarballUrl = r1;
    }

    public final void setTargetCommitish(String r1) {
        this.targetCommitish = r1;
    }

    public final void setUploadUrl(String r1) {
        this.uploadUrl = r1;
    }

    public final void setUrl(String r1) {
        this.url = r1;
    }

    public final void setZipballUrl(String r1) {
        this.zipballUrl = r1;
    }

    public String toString() {
        String r1 = this.url;
        String r2 = this.assetsUrl;
        String r3 = this.uploadUrl;
        String r4 = this.htmlUrl;
        Integer r5 = this.id;
        Author r6 = this.author;
        String r7 = this.nodeId;
        String r8 = this.tagName;
        String r9 = this.targetCommitish;
        String r10 = this.name;
        Boolean r11 = this.draft;
        Boolean r12 = this.prerelease;
        String r13 = this.createdAt;
        String r14 = this.publishedAt;
        ArrayList<Assets> r15 = this.assets;
        String r16 = this.tarballUrl;
        String r17 = this.zipballUrl;
        String r18 = this.body;
        Reactions r0 = this.reactions;
        StringBuilder r19 = b11.u("LatestRelease(url=", r1, ", assetsUrl=", r2, ", uploadUrl=");
        f34.n(r19, r3, ", htmlUrl=", r4, ", id=");
        r19.append(r5);
        r19.append(", author=");
        r19.append(r6);
        r19.append(", nodeId=");
        f34.n(r19, r7, ", tagName=", r8, ", targetCommitish=");
        f34.n(r19, r9, ", name=", r10, ", draft=");
        r19.append(r11);
        r19.append(", prerelease=");
        r19.append(r12);
        r19.append(", createdAt=");
        f34.n(r19, r13, ", publishedAt=", r14, ", assets=");
        r19.append(r15);
        r19.append(", tarballUrl=");
        r19.append(r16);
        r19.append(", zipballUrl=");
        f34.n(r19, r17, ", body=", r18, ", reactions=");
        r19.append(r0);
        r19.append(")");
        return r19.toString();
    }

    public LatestRelease(String r1, String r2, String r3, String r4, Integer r5, Author r6, String r7, String r8, String r9, String r10, Boolean r11, Boolean r12, String r13, String r14, ArrayList<Assets> r15, String r16, String r17, String r18, Reactions r19) {
        r15.getClass();
        this.url = r1;
        this.assetsUrl = r2;
        this.uploadUrl = r3;
        this.htmlUrl = r4;
        this.id = r5;
        this.author = r6;
        this.nodeId = r7;
        this.tagName = r8;
        this.targetCommitish = r9;
        this.name = r10;
        this.draft = r11;
        this.prerelease = r12;
        this.createdAt = r13;
        this.publishedAt = r14;
        this.assets = r15;
        this.tarballUrl = r16;
        this.zipballUrl = r17;
        this.body = r18;
        this.reactions = r19;
    }

    public LatestRelease() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        Integer r5 = null;
        Author r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        Boolean r11 = null;
        Boolean r12 = null;
        String r13 = null;
        String r14 = null;
        ArrayList r15 = null;
        String r16 = null;
        String r17 = null;
        String r18 = null;
        Reactions r19 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, 524287, null);
    }
}
