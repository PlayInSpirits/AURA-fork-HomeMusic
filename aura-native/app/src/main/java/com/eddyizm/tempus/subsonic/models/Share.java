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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class Share implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Share> CREATOR = new j84(2);
    private Date created;
    private String description;

    @ka4("entry")
    private List<Child> entries;
    private Date expires;
    private String id;
    private Date lastVisited;
    private String url;
    private String username;
    private int visitCount;

    public /* synthetic */ Share(List list, String str, String str2, String str3, String str4, Date date, Date date2, Date date3, int i, int i2, xj0 xj0Var) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : date, (i2 & 64) != 0 ? null : date2, (i2 & 128) != 0 ? null : date3, (i2 & 256) != 0 ? 0 : i);
    }

    public static /* synthetic */ Share copy$default(Share share, List list, String str, String str2, String str3, String str4, Date date, Date date2, Date date3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = share.entries;
        }
        if ((i2 & 2) != 0) {
            str = share.id;
        }
        if ((i2 & 4) != 0) {
            str2 = share.url;
        }
        if ((i2 & 8) != 0) {
            str3 = share.description;
        }
        if ((i2 & 16) != 0) {
            str4 = share.username;
        }
        if ((i2 & 32) != 0) {
            date = share.created;
        }
        if ((i2 & 64) != 0) {
            date2 = share.expires;
        }
        if ((i2 & 128) != 0) {
            date3 = share.lastVisited;
        }
        if ((i2 & 256) != 0) {
            i = share.visitCount;
        }
        Date date4 = date3;
        int i3 = i;
        Date date5 = date;
        Date date6 = date2;
        String str5 = str4;
        String str6 = str2;
        return share.copy(list, str, str6, str3, str5, date5, date6, date4, i3);
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

    public final Share copy(List<Child> list, String str, String str2, String str3, String str4, Date date, Date date2, Date date3, int i) {
        return new Share(list, str, str2, str3, str4, date, date2, date3, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Share)) {
            return false;
        }
        Share share = (Share) obj;
        return h12.c(this.entries, share.entries) && h12.c(this.id, share.id) && h12.c(this.url, share.url) && h12.c(this.description, share.description) && h12.c(this.username, share.username) && h12.c(this.created, share.created) && h12.c(this.expires, share.expires) && h12.c(this.lastVisited, share.lastVisited) && this.visitCount == share.visitCount;
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
        List<Child> list = this.entries;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.username;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Date date = this.created;
        int hashCode6 = (hashCode5 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expires;
        int hashCode7 = (hashCode6 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.lastVisited;
        return Integer.hashCode(this.visitCount) + ((hashCode7 + (date3 != null ? date3.hashCode() : 0)) * 31);
    }

    public final void setCreated(Date date) {
        this.created = date;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setEntries(List<Child> list) {
        this.entries = list;
    }

    public final void setExpires(Date date) {
        this.expires = date;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLastVisited(Date date) {
        this.lastVisited = date;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public final void setVisitCount(int i) {
        this.visitCount = i;
    }

    public String toString() {
        List<Child> list = this.entries;
        String str = this.id;
        String str2 = this.url;
        String str3 = this.description;
        String str4 = this.username;
        Date date = this.created;
        Date date2 = this.expires;
        Date date3 = this.lastVisited;
        int i = this.visitCount;
        StringBuilder sb = new StringBuilder("Share(entries=");
        sb.append(list);
        sb.append(", id=");
        sb.append(str);
        sb.append(", url=");
        f34.n(sb, str2, ", description=", str3, ", username=");
        sb.append(str4);
        sb.append(", created=");
        sb.append(date);
        sb.append(", expires=");
        sb.append(date2);
        sb.append(", lastVisited=");
        sb.append(date3);
        sb.append(", visitCount=");
        return f34.i(sb, i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List<Child> list = this.entries;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Child> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        parcel.writeString(this.id);
        parcel.writeString(this.url);
        parcel.writeString(this.description);
        parcel.writeString(this.username);
        parcel.writeSerializable(this.created);
        parcel.writeSerializable(this.expires);
        parcel.writeSerializable(this.lastVisited);
        parcel.writeInt(this.visitCount);
    }

    public Share(List<Child> list, String str, String str2, String str3, String str4, Date date, Date date2, Date date3, int i) {
        this.entries = list;
        this.id = str;
        this.url = str2;
        this.description = str3;
        this.username = str4;
        this.created = date;
        this.expires = date2;
        this.lastVisited = date3;
        this.visitCount = i;
    }

    public Share() {
        this(null, null, null, null, null, null, null, null, 0, 511, null);
    }
}
