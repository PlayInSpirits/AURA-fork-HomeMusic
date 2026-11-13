package com.eddyizm.tempus.github.models;

import defpackage.f34;
import defpackage.h12;
import defpackage.ka4;
import defpackage.xj0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class Author {
    public static final int $stable = 8;

    @ka4("avatar_url")
    private String avatarUrl;

    @ka4("events_url")
    private String eventsUrl;

    @ka4("followers_url")
    private String followersUrl;

    @ka4("following_url")
    private String followingUrl;

    @ka4("gists_url")
    private String gistsUrl;

    @ka4("gravatar_id")
    private String gravatarId;

    @ka4("html_url")
    private String htmlUrl;

    @ka4("id")
    private Integer id;

    @ka4("login")
    private String login;

    @ka4("node_id")
    private String nodeId;

    @ka4("organizations_url")
    private String organizationsUrl;

    @ka4("received_events_url")
    private String receivedEventsUrl;

    @ka4("repos_url")
    private String reposUrl;

    @ka4("site_admin")
    private Boolean siteAdmin;

    @ka4("starred_url")
    private String starredUrl;

    @ka4("subscriptions_url")
    private String subscriptionsUrl;

    @ka4("type")
    private String type;

    @ka4("url")
    private String url;

    public /* synthetic */ Author(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : bool);
    }

    public static /* synthetic */ Author copy$default(Author author, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, int i, Object obj) {
        Boolean bool2;
        String str17;
        String str18 = (i & 1) != 0 ? author.login : str;
        Integer num2 = (i & 2) != 0 ? author.id : num;
        String str19 = (i & 4) != 0 ? author.nodeId : str2;
        String str20 = (i & 8) != 0 ? author.avatarUrl : str3;
        String str21 = (i & 16) != 0 ? author.gravatarId : str4;
        String str22 = (i & 32) != 0 ? author.url : str5;
        String str23 = (i & 64) != 0 ? author.htmlUrl : str6;
        String str24 = (i & 128) != 0 ? author.followersUrl : str7;
        String str25 = (i & 256) != 0 ? author.followingUrl : str8;
        String str26 = (i & 512) != 0 ? author.gistsUrl : str9;
        String str27 = (i & 1024) != 0 ? author.starredUrl : str10;
        String str28 = (i & 2048) != 0 ? author.subscriptionsUrl : str11;
        String str29 = (i & 4096) != 0 ? author.organizationsUrl : str12;
        String str30 = (i & 8192) != 0 ? author.reposUrl : str13;
        String str31 = str18;
        String str32 = (i & 16384) != 0 ? author.eventsUrl : str14;
        String str33 = (i & 32768) != 0 ? author.receivedEventsUrl : str15;
        String str34 = (i & 65536) != 0 ? author.type : str16;
        if ((i & 131072) != 0) {
            str17 = str34;
            bool2 = author.siteAdmin;
        } else {
            bool2 = bool;
            str17 = str34;
        }
        return author.copy(str31, num2, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str32, str33, str17, bool2);
    }

    public final String component1() {
        return this.login;
    }

    public final String component10() {
        return this.gistsUrl;
    }

    public final String component11() {
        return this.starredUrl;
    }

    public final String component12() {
        return this.subscriptionsUrl;
    }

    public final String component13() {
        return this.organizationsUrl;
    }

    public final String component14() {
        return this.reposUrl;
    }

    public final String component15() {
        return this.eventsUrl;
    }

    public final String component16() {
        return this.receivedEventsUrl;
    }

    public final String component17() {
        return this.type;
    }

    public final Boolean component18() {
        return this.siteAdmin;
    }

    public final Integer component2() {
        return this.id;
    }

    public final String component3() {
        return this.nodeId;
    }

    public final String component4() {
        return this.avatarUrl;
    }

    public final String component5() {
        return this.gravatarId;
    }

    public final String component6() {
        return this.url;
    }

    public final String component7() {
        return this.htmlUrl;
    }

    public final String component8() {
        return this.followersUrl;
    }

    public final String component9() {
        return this.followingUrl;
    }

    public final Author copy(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool) {
        return new Author(str, num, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return h12.c(this.login, author.login) && h12.c(this.id, author.id) && h12.c(this.nodeId, author.nodeId) && h12.c(this.avatarUrl, author.avatarUrl) && h12.c(this.gravatarId, author.gravatarId) && h12.c(this.url, author.url) && h12.c(this.htmlUrl, author.htmlUrl) && h12.c(this.followersUrl, author.followersUrl) && h12.c(this.followingUrl, author.followingUrl) && h12.c(this.gistsUrl, author.gistsUrl) && h12.c(this.starredUrl, author.starredUrl) && h12.c(this.subscriptionsUrl, author.subscriptionsUrl) && h12.c(this.organizationsUrl, author.organizationsUrl) && h12.c(this.reposUrl, author.reposUrl) && h12.c(this.eventsUrl, author.eventsUrl) && h12.c(this.receivedEventsUrl, author.receivedEventsUrl) && h12.c(this.type, author.type) && h12.c(this.siteAdmin, author.siteAdmin);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getEventsUrl() {
        return this.eventsUrl;
    }

    public final String getFollowersUrl() {
        return this.followersUrl;
    }

    public final String getFollowingUrl() {
        return this.followingUrl;
    }

    public final String getGistsUrl() {
        return this.gistsUrl;
    }

    public final String getGravatarId() {
        return this.gravatarId;
    }

    public final String getHtmlUrl() {
        return this.htmlUrl;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getLogin() {
        return this.login;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final String getOrganizationsUrl() {
        return this.organizationsUrl;
    }

    public final String getReceivedEventsUrl() {
        return this.receivedEventsUrl;
    }

    public final String getReposUrl() {
        return this.reposUrl;
    }

    public final Boolean getSiteAdmin() {
        return this.siteAdmin;
    }

    public final String getStarredUrl() {
        return this.starredUrl;
    }

    public final String getSubscriptionsUrl() {
        return this.subscriptionsUrl;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.login;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.nodeId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gravatarId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.htmlUrl;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.followersUrl;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.followingUrl;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.gistsUrl;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.starredUrl;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.subscriptionsUrl;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.organizationsUrl;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.reposUrl;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.eventsUrl;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.receivedEventsUrl;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.type;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool = this.siteAdmin;
        return hashCode17 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public final void setEventsUrl(String str) {
        this.eventsUrl = str;
    }

    public final void setFollowersUrl(String str) {
        this.followersUrl = str;
    }

    public final void setFollowingUrl(String str) {
        this.followingUrl = str;
    }

    public final void setGistsUrl(String str) {
        this.gistsUrl = str;
    }

    public final void setGravatarId(String str) {
        this.gravatarId = str;
    }

    public final void setHtmlUrl(String str) {
        this.htmlUrl = str;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final void setLogin(String str) {
        this.login = str;
    }

    public final void setNodeId(String str) {
        this.nodeId = str;
    }

    public final void setOrganizationsUrl(String str) {
        this.organizationsUrl = str;
    }

    public final void setReceivedEventsUrl(String str) {
        this.receivedEventsUrl = str;
    }

    public final void setReposUrl(String str) {
        this.reposUrl = str;
    }

    public final void setSiteAdmin(Boolean bool) {
        this.siteAdmin = bool;
    }

    public final void setStarredUrl(String str) {
        this.starredUrl = str;
    }

    public final void setSubscriptionsUrl(String str) {
        this.subscriptionsUrl = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        String str = this.login;
        Integer num = this.id;
        String str2 = this.nodeId;
        String str3 = this.avatarUrl;
        String str4 = this.gravatarId;
        String str5 = this.url;
        String str6 = this.htmlUrl;
        String str7 = this.followersUrl;
        String str8 = this.followingUrl;
        String str9 = this.gistsUrl;
        String str10 = this.starredUrl;
        String str11 = this.subscriptionsUrl;
        String str12 = this.organizationsUrl;
        String str13 = this.reposUrl;
        String str14 = this.eventsUrl;
        String str15 = this.receivedEventsUrl;
        String str16 = this.type;
        Boolean bool = this.siteAdmin;
        StringBuilder sb = new StringBuilder("Author(login=");
        sb.append(str);
        sb.append(", id=");
        sb.append(num);
        sb.append(", nodeId=");
        f34.n(sb, str2, ", avatarUrl=", str3, ", gravatarId=");
        f34.n(sb, str4, ", url=", str5, ", htmlUrl=");
        f34.n(sb, str6, ", followersUrl=", str7, ", followingUrl=");
        f34.n(sb, str8, ", gistsUrl=", str9, ", starredUrl=");
        f34.n(sb, str10, ", subscriptionsUrl=", str11, ", organizationsUrl=");
        f34.n(sb, str12, ", reposUrl=", str13, ", eventsUrl=");
        f34.n(sb, str14, ", receivedEventsUrl=", str15, ", type=");
        sb.append(str16);
        sb.append(", siteAdmin=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public Author(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool) {
        this.login = str;
        this.id = num;
        this.nodeId = str2;
        this.avatarUrl = str3;
        this.gravatarId = str4;
        this.url = str5;
        this.htmlUrl = str6;
        this.followersUrl = str7;
        this.followingUrl = str8;
        this.gistsUrl = str9;
        this.starredUrl = str10;
        this.subscriptionsUrl = str11;
        this.organizationsUrl = str12;
        this.reposUrl = str13;
        this.eventsUrl = str14;
        this.receivedEventsUrl = str15;
        this.type = str16;
        this.siteAdmin = bool;
    }

    public Author() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }
}
