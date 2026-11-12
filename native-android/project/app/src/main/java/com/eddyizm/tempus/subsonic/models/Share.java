package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f34;
import defpackage.h12;
import defpackage.j84;
import defpackage.ka4;
import defpackage.xj0;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Share implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Share> CREATOR = null;
    private Date created;
    private String description;

    @ka4("entry")
    private List<? extends Child> entries;
    private Date expires;
    private String id;
    private Date lastVisited;
    private String url;
    private String username;
    private int visitCount;

    static {
        CREATOR = new j84(2);
    }

    public /* synthetic */ Share(List r2, String r3, String r4, String r5, String r6, Date r7, Date r8, Date r9, int r10, int r11, xj0 r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = 0;
    L29:
        this(r2, r3, r4, r5, r6, r7, r8, r9, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Share copy$default(Share r0, List r1, String r2, String r3, String r4, String r5, Date r6, Date r7, Date r8, int r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.entries;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.id;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.url;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.description;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.username;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.created;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.expires;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.lastVisited;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.visitCount;
    L29:
        Date r12 = r8;
        int r13 = r9;
        Date r14 = r6;
        Date r15 = r7;
        String r16 = r4;
        String r17 = r5;
        String r18 = r3;
        List r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final List<Child> component1() {
        return this.entries;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.username;
    }

    public final Date component6() {
        return this.created;
    }

    public final Date component7() {
        return this.expires;
    }

    public final Date component8() {
        return this.lastVisited;
    }

    public final int component9() {
        return this.visitCount;
    }

    public final Share copy(List<? extends Child> r1, String r2, String r3, String r4, String r5, Date r6, Date r7, Date r8, int r9) {
        return new Share(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Share) == true) goto L8;
        return false;
    L8:
        Share r6 = (Share) r5;
        if (h12.c(this.entries, r6.entries) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.id, r6.id) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.url, r6.url) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.description, r6.description) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.username, r6.username) == true) goto L24;
        return false;
    L24:
        if (h12.c(this.created, r6.created) == true) goto L27;
        return false;
    L27:
        if (h12.c(this.expires, r6.expires) == true) goto L30;
        return false;
    L30:
        if (h12.c(this.lastVisited, r6.lastVisited) == true) goto L33;
        return false;
    L33:
        if (this.visitCount == r6.visitCount) goto L35;
        return false;
    L35:
        return true;
    }

    public final Date getCreated() {
        return this.created;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<Child> getEntries() {
        return this.entries;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final String getId() {
        return this.id;
    }

    public final Date getLastVisited() {
        return this.lastVisited;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUsername() {
        return this.username;
    }

    public final int getVisitCount() {
        return this.visitCount;
    }

    public int hashCode() {
        List<? extends Child> r0 = this.entries;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        String r4 = this.id;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        String r7 = this.url;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        String r10 = this.description;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        String r13 = this.username;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        Date r16 = this.created;
        if (r16 != null) goto L25;
        int r17 = 0;
    L26:
        int r18 = (r15 + r17) * 31;
        Date r19 = this.expires;
        if (r19 != null) goto L29;
        int r20 = 0;
    L30:
        int r21 = (r18 + r20) * 31;
        Date r22 = this.lastVisited;
        if (r22 == null) goto L35;
        r1 = r22.hashCode();
    L35:
        return Integer.hashCode(this.visitCount) + ((r21 + r1) * 31);
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

    public final void setCreated(Date r1) {
        this.created = r1;
    }

    public final void setDescription(String r1) {
        this.description = r1;
    }

    public final void setEntries(List<? extends Child> r1) {
        this.entries = r1;
    }

    public final void setExpires(Date r1) {
        this.expires = r1;
    }

    public final void setId(String r1) {
        this.id = r1;
    }

    public final void setLastVisited(Date r1) {
        this.lastVisited = r1;
    }

    public final void setUrl(String r1) {
        this.url = r1;
    }

    public final void setUsername(String r1) {
        this.username = r1;
    }

    public final void setVisitCount(int r1) {
        this.visitCount = r1;
    }

    public String toString() {
        List<? extends Child> r0 = this.entries;
        String r1 = this.id;
        String r2 = this.url;
        String r3 = this.description;
        String r4 = this.username;
        Date r5 = this.created;
        Date r6 = this.expires;
        Date r7 = this.lastVisited;
        int r10 = this.visitCount;
        StringBuilder r8 = new StringBuilder("Share(entries=");
        r8.append(r0);
        r8.append(", id=");
        r8.append(r1);
        r8.append(", url=");
        f34.n(r8, r2, ", description=", r3, ", username=");
        r8.append(r4);
        r8.append(", created=");
        r8.append(r5);
        r8.append(", expires=");
        r8.append(r6);
        r8.append(", lastVisited=");
        r8.append(r7);
        r8.append(", visitCount=");
        return f34.i(r8, r10, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        List<? extends Child> r0 = this.entries;
        if (r0 != null) goto L5;
        r3.writeInt(0);
    L9:
        r3.writeString(this.id);
        r3.writeString(this.url);
        r3.writeString(this.description);
        r3.writeString(this.username);
        r3.writeSerializable(this.created);
        r3.writeSerializable(this.expires);
        r3.writeSerializable(this.lastVisited);
        r3.writeInt(this.visitCount);
        return;
    L5:
        r3.writeInt(1);
        r3.writeInt(r0.size());
        Iterator<? extends Child> r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        r3.writeParcelable(r1.next(), r4);
        goto L7
    }

    public Share(List<? extends Child> r1, String r2, String r3, String r4, String r5, Date r6, Date r7, Date r8, int r9) {
        this.entries = r1;
        this.id = r2;
        this.url = r3;
        this.description = r4;
        this.username = r5;
        this.created = r6;
        this.expires = r7;
        this.lastVisited = r8;
        this.visitCount = r9;
    }

    public Share() {
        List r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        Date r6 = null;
        Date r7 = null;
        Date r8 = null;
        int r9 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }
}
