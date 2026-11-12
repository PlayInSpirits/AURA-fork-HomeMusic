package com.eddyizm.tempus.github.models;

import defpackage.f34;
import defpackage.h12;
import defpackage.ka4;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Uploader {
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

    public /* synthetic */ Uploader(String r20, Integer r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, Boolean r37, int r38, xj0 r39) {
        if ((r38 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r38 & 2) == 0) goto L9;
        Integer r3 = null;
    L11:
        if ((r38 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r38 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r38 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r38 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r38 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r38 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r38 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r38 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r38 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r38 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r38 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r38 & 8192) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r38 & 16384) == 0) goto L61;
        String r2 = null;
    L63:
        if ((r38 & 32768) == 0) goto L65;
        String r16 = null;
    L67:
        if ((r38 & 65536) == 0) goto L69;
        String r17 = null;
    L71:
        if ((r38 & 131072) == 0) goto L74;
        Boolean r310 = null;
    L75:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r310);
        return;
    L74:
        r310 = r37;
        goto L75
    L69:
        r17 = r36;
        goto L71
    L65:
        r16 = r35;
        goto L67
    L61:
        r2 = r34;
        goto L63
    L57:
        r15 = r33;
        goto L59
    L53:
        r14 = r32;
        goto L55
    L49:
        r13 = r31;
        goto L51
    L45:
        r12 = r30;
        goto L47
    L41:
        r11 = r29;
        goto L43
    L37:
        r10 = r28;
        goto L39
    L33:
        r9 = r27;
        goto L35
    L29:
        r8 = r26;
        goto L31
    L25:
        r7 = r25;
        goto L27
    L21:
        r6 = r24;
        goto L23
    L17:
        r5 = r23;
        goto L19
    L13:
        r4 = r22;
        goto L15
    L9:
        r3 = r21;
        goto L11
    L5:
        r1 = r20;
        goto L7
    }

    public static /* synthetic */ Uploader copy$default(Uploader r17, String r18, Integer r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, Boolean r35, int r36, Object r37) {
        if ((r36 & 1) == 0) goto L5;
        String r2 = r17.login;
    L7:
        if ((r36 & 2) == 0) goto L9;
        Integer r3 = r17.id;
    L11:
        if ((r36 & 4) == 0) goto L13;
        String r4 = r17.nodeId;
    L15:
        if ((r36 & 8) == 0) goto L17;
        String r5 = r17.avatarUrl;
    L19:
        if ((r36 & 16) == 0) goto L21;
        String r6 = r17.gravatarId;
    L23:
        if ((r36 & 32) == 0) goto L25;
        String r7 = r17.url;
    L27:
        if ((r36 & 64) == 0) goto L29;
        String r8 = r17.htmlUrl;
    L31:
        if ((r36 & 128) == 0) goto L33;
        String r9 = r17.followersUrl;
    L35:
        if ((r36 & 256) == 0) goto L37;
        String r10 = r17.followingUrl;
    L39:
        if ((r36 & 512) == 0) goto L41;
        String r11 = r17.gistsUrl;
    L43:
        if ((r36 & 1024) == 0) goto L45;
        String r12 = r17.starredUrl;
    L47:
        if ((r36 & 2048) == 0) goto L49;
        String r13 = r17.subscriptionsUrl;
    L51:
        if ((r36 & 4096) == 0) goto L53;
        String r14 = r17.organizationsUrl;
    L55:
        if ((r36 & 8192) == 0) goto L57;
        String r15 = r17.reposUrl;
    L58:
        String r110 = r2;
        if ((r36 & 16384) == 0) goto L61;
        String r16 = r17.eventsUrl;
    L63:
        if ((r36 & 32768) == 0) goto L65;
        String r1 = r17.receivedEventsUrl;
    L66:
        String r111 = r1;
        if ((r36 & 65536) == 0) goto L69;
        String r38 = r17.type;
    L71:
        if ((r36 & 131072) == 0) goto L74;
        String r210 = r38;
        String r39 = r210;
        Boolean r310 = r17.siteAdmin;
    L76:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r39, r310);
    L74:
        r310 = r35;
        r39 = r38;
        goto L76
    L69:
        r38 = r34;
        goto L71
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

    public final Uploader copy(String r20, Integer r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, Boolean r37) {
        return new Uploader(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Uploader) == true) goto L8;
        return false;
    L8:
        Uploader r6 = (Uploader) r5;
        if (h12.c(this.login, r6.login) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.id, r6.id) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.nodeId, r6.nodeId) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.avatarUrl, r6.avatarUrl) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.gravatarId, r6.gravatarId) == true) goto L24;
        return false;
    L24:
        if (h12.c(this.url, r6.url) == true) goto L27;
        return false;
    L27:
        if (h12.c(this.htmlUrl, r6.htmlUrl) == true) goto L30;
        return false;
    L30:
        if (h12.c(this.followersUrl, r6.followersUrl) == true) goto L33;
        return false;
    L33:
        if (h12.c(this.followingUrl, r6.followingUrl) == true) goto L36;
        return false;
    L36:
        if (h12.c(this.gistsUrl, r6.gistsUrl) == true) goto L39;
        return false;
    L39:
        if (h12.c(this.starredUrl, r6.starredUrl) == true) goto L42;
        return false;
    L42:
        if (h12.c(this.subscriptionsUrl, r6.subscriptionsUrl) == true) goto L45;
        return false;
    L45:
        if (h12.c(this.organizationsUrl, r6.organizationsUrl) == true) goto L48;
        return false;
    L48:
        if (h12.c(this.reposUrl, r6.reposUrl) == true) goto L51;
        return false;
    L51:
        if (h12.c(this.eventsUrl, r6.eventsUrl) == true) goto L54;
        return false;
    L54:
        if (h12.c(this.receivedEventsUrl, r6.receivedEventsUrl) == true) goto L57;
        return false;
    L57:
        if (h12.c(this.type, r6.type) == true) goto L60;
        return false;
    L60:
        if (h12.c(this.siteAdmin, r6.siteAdmin) == true) goto L62;
        return false;
    L62:
        return true;
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
        String r0 = this.login;
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
        String r10 = this.avatarUrl;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        String r13 = this.gravatarId;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        String r16 = this.url;
        if (r16 != null) goto L25;
        int r17 = 0;
    L26:
        int r18 = (r15 + r17) * 31;
        String r19 = this.htmlUrl;
        if (r19 != null) goto L29;
        int r20 = 0;
    L30:
        int r21 = (r18 + r20) * 31;
        String r22 = this.followersUrl;
        if (r22 != null) goto L33;
        int r23 = 0;
    L34:
        int r24 = (r21 + r23) * 31;
        String r25 = this.followingUrl;
        if (r25 != null) goto L37;
        int r26 = 0;
    L38:
        int r27 = (r24 + r26) * 31;
        String r28 = this.gistsUrl;
        if (r28 != null) goto L41;
        int r29 = 0;
    L42:
        int r30 = (r27 + r29) * 31;
        String r31 = this.starredUrl;
        if (r31 != null) goto L45;
        int r32 = 0;
    L46:
        int r33 = (r30 + r32) * 31;
        String r34 = this.subscriptionsUrl;
        if (r34 != null) goto L49;
        int r35 = 0;
    L50:
        int r36 = (r33 + r35) * 31;
        String r37 = this.organizationsUrl;
        if (r37 != null) goto L53;
        int r38 = 0;
    L54:
        int r39 = (r36 + r38) * 31;
        String r40 = this.reposUrl;
        if (r40 != null) goto L57;
        int r41 = 0;
    L58:
        int r42 = (r39 + r41) * 31;
        String r43 = this.eventsUrl;
        if (r43 != null) goto L61;
        int r44 = 0;
    L62:
        int r45 = (r42 + r44) * 31;
        String r46 = this.receivedEventsUrl;
        if (r46 != null) goto L65;
        int r47 = 0;
    L66:
        int r48 = (r45 + r47) * 31;
        String r49 = this.type;
        if (r49 != null) goto L69;
        int r50 = 0;
    L70:
        int r51 = (r48 + r50) * 31;
        Boolean r52 = this.siteAdmin;
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

    public final void setAvatarUrl(String r1) {
        this.avatarUrl = r1;
    }

    public final void setEventsUrl(String r1) {
        this.eventsUrl = r1;
    }

    public final void setFollowersUrl(String r1) {
        this.followersUrl = r1;
    }

    public final void setFollowingUrl(String r1) {
        this.followingUrl = r1;
    }

    public final void setGistsUrl(String r1) {
        this.gistsUrl = r1;
    }

    public final void setGravatarId(String r1) {
        this.gravatarId = r1;
    }

    public final void setHtmlUrl(String r1) {
        this.htmlUrl = r1;
    }

    public final void setId(Integer r1) {
        this.id = r1;
    }

    public final void setLogin(String r1) {
        this.login = r1;
    }

    public final void setNodeId(String r1) {
        this.nodeId = r1;
    }

    public final void setOrganizationsUrl(String r1) {
        this.organizationsUrl = r1;
    }

    public final void setReceivedEventsUrl(String r1) {
        this.receivedEventsUrl = r1;
    }

    public final void setReposUrl(String r1) {
        this.reposUrl = r1;
    }

    public final void setSiteAdmin(Boolean r1) {
        this.siteAdmin = r1;
    }

    public final void setStarredUrl(String r1) {
        this.starredUrl = r1;
    }

    public final void setSubscriptionsUrl(String r1) {
        this.subscriptionsUrl = r1;
    }

    public final void setType(String r1) {
        this.type = r1;
    }

    public final void setUrl(String r1) {
        this.url = r1;
    }

    public String toString() {
        String r1 = this.login;
        Integer r2 = this.id;
        String r3 = this.nodeId;
        String r4 = this.avatarUrl;
        String r5 = this.gravatarId;
        String r6 = this.url;
        String r7 = this.htmlUrl;
        String r8 = this.followersUrl;
        String r9 = this.followingUrl;
        String r10 = this.gistsUrl;
        String r11 = this.starredUrl;
        String r12 = this.subscriptionsUrl;
        String r13 = this.organizationsUrl;
        String r14 = this.reposUrl;
        String r15 = this.eventsUrl;
        String r16 = this.receivedEventsUrl;
        String r17 = this.type;
        Boolean r0 = this.siteAdmin;
        StringBuilder r18 = new StringBuilder("Uploader(login=");
        r18.append(r1);
        r18.append(", id=");
        r18.append(r2);
        r18.append(", nodeId=");
        f34.n(r18, r3, ", avatarUrl=", r4, ", gravatarId=");
        f34.n(r18, r5, ", url=", r6, ", htmlUrl=");
        f34.n(r18, r7, ", followersUrl=", r8, ", followingUrl=");
        f34.n(r18, r9, ", gistsUrl=", r10, ", starredUrl=");
        f34.n(r18, r11, ", subscriptionsUrl=", r12, ", organizationsUrl=");
        f34.n(r18, r13, ", reposUrl=", r14, ", eventsUrl=");
        f34.n(r18, r15, ", receivedEventsUrl=", r16, ", type=");
        r18.append(r17);
        r18.append(", siteAdmin=");
        r18.append(r0);
        r18.append(")");
        return r18.toString();
    }

    public Uploader(String r1, Integer r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, String r16, String r17, Boolean r18) {
        this.login = r1;
        this.id = r2;
        this.nodeId = r3;
        this.avatarUrl = r4;
        this.gravatarId = r5;
        this.url = r6;
        this.htmlUrl = r7;
        this.followersUrl = r8;
        this.followingUrl = r9;
        this.gistsUrl = r10;
        this.starredUrl = r11;
        this.subscriptionsUrl = r12;
        this.organizationsUrl = r13;
        this.reposUrl = r14;
        this.eventsUrl = r15;
        this.receivedEventsUrl = r16;
        this.type = r17;
        this.siteAdmin = r18;
    }

    public Uploader() {
        String r1 = null;
        Integer r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        Boolean r18 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, 262143, null);
    }
}
