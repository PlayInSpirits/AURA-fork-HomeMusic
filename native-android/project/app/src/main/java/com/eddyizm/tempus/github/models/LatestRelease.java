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

    public /* synthetic */ LatestRelease(String str, String str2, String str3, String str4, Integer num, Author author, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, String str10, ArrayList arrayList, String str11, String str12, String str13, Reactions reactions, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? new Author(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null) : author, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? new ArrayList() : arrayList, (i & 32768) != 0 ? null : str11, (i & 65536) != 0 ? null : str12, (i & 131072) != 0 ? null : str13, (i & 262144) != 0 ? new Reactions(null, null, null, null, null, null, null, null, null, null, 1023, null) : reactions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LatestRelease copy$default(LatestRelease latestRelease, String str, String str2, String str3, String str4, Integer num, Author author, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, String str10, ArrayList arrayList, String str11, String str12, String str13, Reactions reactions, int i, Object obj) {
        Reactions reactions2;
        String str14;
        String str15 = (i & 1) != 0 ? latestRelease.url : str;
        String str16 = (i & 2) != 0 ? latestRelease.assetsUrl : str2;
        String str17 = (i & 4) != 0 ? latestRelease.uploadUrl : str3;
        String str18 = (i & 8) != 0 ? latestRelease.htmlUrl : str4;
        Integer num2 = (i & 16) != 0 ? latestRelease.id : num;
        Author author2 = (i & 32) != 0 ? latestRelease.author : author;
        String str19 = (i & 64) != 0 ? latestRelease.nodeId : str5;
        String str20 = (i & 128) != 0 ? latestRelease.tagName : str6;
        String str21 = (i & 256) != 0 ? latestRelease.targetCommitish : str7;
        String str22 = (i & 512) != 0 ? latestRelease.name : str8;
        Boolean bool3 = (i & 1024) != 0 ? latestRelease.draft : bool;
        Boolean bool4 = (i & 2048) != 0 ? latestRelease.prerelease : bool2;
        String str23 = (i & 4096) != 0 ? latestRelease.createdAt : str9;
        String str24 = (i & 8192) != 0 ? latestRelease.publishedAt : str10;
        String str25 = str15;
        ArrayList arrayList2 = (i & 16384) != 0 ? latestRelease.assets : arrayList;
        String str26 = (i & 32768) != 0 ? latestRelease.tarballUrl : str11;
        String str27 = (i & 65536) != 0 ? latestRelease.zipballUrl : str12;
        String str28 = (i & 131072) != 0 ? latestRelease.body : str13;
        if ((i & 262144) != 0) {
            str14 = str28;
            reactions2 = latestRelease.reactions;
        } else {
            reactions2 = reactions;
            str14 = str28;
        }
        return latestRelease.copy(str25, str16, str17, str18, num2, author2, str19, str20, str21, str22, bool3, bool4, str23, str24, arrayList2, str26, str27, str14, reactions2);
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

    public final LatestRelease copy(String str, String str2, String str3, String str4, Integer num, Author author, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, String str10, ArrayList<Assets> arrayList, String str11, String str12, String str13, Reactions reactions) {
        arrayList.getClass();
        return new LatestRelease(str, str2, str3, str4, num, author, str5, str6, str7, str8, bool, bool2, str9, str10, arrayList, str11, str12, str13, reactions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatestRelease)) {
            return false;
        }
        LatestRelease latestRelease = (LatestRelease) obj;
        return h12.c(this.url, latestRelease.url) && h12.c(this.assetsUrl, latestRelease.assetsUrl) && h12.c(this.uploadUrl, latestRelease.uploadUrl) && h12.c(this.htmlUrl, latestRelease.htmlUrl) && h12.c(this.id, latestRelease.id) && h12.c(this.author, latestRelease.author) && h12.c(this.nodeId, latestRelease.nodeId) && h12.c(this.tagName, latestRelease.tagName) && h12.c(this.targetCommitish, latestRelease.targetCommitish) && h12.c(this.name, latestRelease.name) && h12.c(this.draft, latestRelease.draft) && h12.c(this.prerelease, latestRelease.prerelease) && h12.c(this.createdAt, latestRelease.createdAt) && h12.c(this.publishedAt, latestRelease.publishedAt) && h12.c(this.assets, latestRelease.assets) && h12.c(this.tarballUrl, latestRelease.tarballUrl) && h12.c(this.zipballUrl, latestRelease.zipballUrl) && h12.c(this.body, latestRelease.body) && h12.c(this.reactions, latestRelease.reactions);
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
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.assetsUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uploadUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.htmlUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.id;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Author author = this.author;
        int iHashCode6 = (iHashCode5 + (author == null ? 0 : author.hashCode())) * 31;
        String str5 = this.nodeId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tagName;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.targetCommitish;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.name;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.draft;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.prerelease;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str9 = this.createdAt;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.publishedAt;
        int iHashCode14 = (this.assets.hashCode() + ((iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31)) * 31;
        String str11 = this.tarballUrl;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.zipballUrl;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.body;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Reactions reactions = this.reactions;
        return iHashCode17 + (reactions != null ? reactions.hashCode() : 0);
    }

    public final void setAssets(ArrayList<Assets> arrayList) {
        arrayList.getClass();
        this.assets = arrayList;
    }

    public final void setAssetsUrl(String str) {
        this.assetsUrl = str;
    }

    public final void setAuthor(Author author) {
        this.author = author;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setDraft(Boolean bool) {
        this.draft = bool;
    }

    public final void setHtmlUrl(String str) {
        this.htmlUrl = str;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNodeId(String str) {
        this.nodeId = str;
    }

    public final void setPrerelease(Boolean bool) {
        this.prerelease = bool;
    }

    public final void setPublishedAt(String str) {
        this.publishedAt = str;
    }

    public final void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    public final void setTagName(String str) {
        this.tagName = str;
    }

    public final void setTarballUrl(String str) {
        this.tarballUrl = str;
    }

    public final void setTargetCommitish(String str) {
        this.targetCommitish = str;
    }

    public final void setUploadUrl(String str) {
        this.uploadUrl = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setZipballUrl(String str) {
        this.zipballUrl = str;
    }

    public String toString() {
        String str = this.url;
        String str2 = this.assetsUrl;
        String str3 = this.uploadUrl;
        String str4 = this.htmlUrl;
        Integer num = this.id;
        Author author = this.author;
        String str5 = this.nodeId;
        String str6 = this.tagName;
        String str7 = this.targetCommitish;
        String str8 = this.name;
        Boolean bool = this.draft;
        Boolean bool2 = this.prerelease;
        String str9 = this.createdAt;
        String str10 = this.publishedAt;
        ArrayList<Assets> arrayList = this.assets;
        String str11 = this.tarballUrl;
        String str12 = this.zipballUrl;
        String str13 = this.body;
        Reactions reactions = this.reactions;
        StringBuilder sbU = b11.u("LatestRelease(url=", str, ", assetsUrl=", str2, ", uploadUrl=");
        f34.n(sbU, str3, ", htmlUrl=", str4, ", id=");
        sbU.append(num);
        sbU.append(", author=");
        sbU.append(author);
        sbU.append(", nodeId=");
        f34.n(sbU, str5, ", tagName=", str6, ", targetCommitish=");
        f34.n(sbU, str7, ", name=", str8, ", draft=");
        sbU.append(bool);
        sbU.append(", prerelease=");
        sbU.append(bool2);
        sbU.append(", createdAt=");
        f34.n(sbU, str9, ", publishedAt=", str10, ", assets=");
        sbU.append(arrayList);
        sbU.append(", tarballUrl=");
        sbU.append(str11);
        sbU.append(", zipballUrl=");
        f34.n(sbU, str12, ", body=", str13, ", reactions=");
        sbU.append(reactions);
        sbU.append(")");
        return sbU.toString();
    }

    public LatestRelease(String str, String str2, String str3, String str4, Integer num, Author author, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, String str10, ArrayList<Assets> arrayList, String str11, String str12, String str13, Reactions reactions) {
        arrayList.getClass();
        this.url = str;
        this.assetsUrl = str2;
        this.uploadUrl = str3;
        this.htmlUrl = str4;
        this.id = num;
        this.author = author;
        this.nodeId = str5;
        this.tagName = str6;
        this.targetCommitish = str7;
        this.name = str8;
        this.draft = bool;
        this.prerelease = bool2;
        this.createdAt = str9;
        this.publishedAt = str10;
        this.assets = arrayList;
        this.tarballUrl = str11;
        this.zipballUrl = str12;
        this.body = str13;
        this.reactions = reactions;
    }

    public LatestRelease() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }
}
