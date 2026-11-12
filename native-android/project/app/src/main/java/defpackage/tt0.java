package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tt0 implements Parcelable {
    public static final Parcelable.Creator<tt0> CREATOR = null;
    public final String n;
    public final Uri o;
    public final String p;
    public final List q;
    public final byte[] r;
    public final String s;
    public final byte[] t;
    public final rt0 u;
    public final st0 v;

    static {
        CREATOR = new w4(25);
    }

    public tt0(Parcel r5) {
        String r0 = r5.readString();
        String r1 = f35.a;
        this.n = r0;
        this.o = Uri.parse(r5.readString());
        this.p = r5.readString();
        int r2 = r5.readInt();
        ArrayList r3 = new ArrayList(r2);
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L5;
        r3.add((fm4) r5.readParcelable(fm4.class.getClassLoader()));
        r4 = r4 + 1;
        goto L3
    L5:
        this.q = Collections.unmodifiableList(r3);
        this.r = r5.createByteArray();
        this.s = r5.readString();
        this.t = r5.createByteArray();
        this.u = (rt0) r5.readParcelable(rt0.class.getClassLoader());
        this.v = (st0) r5.readParcelable(st0.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof tt0) == true) goto L5;
        return false;
    L5:
        tt0 r5 = (tt0) r4;
        if (this.n.equals(r5.n) == true) goto L8;
    L25:
        return false;
    L8:
        if (this.o.equals(r5.o) == false) goto L25;
        if (Objects.equals(this.p, r5.p) == false) goto L25;
        if (this.q.equals(r5.q) == false) goto L25;
        if (Arrays.equals(this.r, r5.r) == false) goto L25;
        if (Objects.equals(this.s, r5.s) == false) goto L25;
        if (Arrays.equals(this.t, r5.t) == false) goto L25;
        if (Objects.equals(this.u, r5.u) == false) goto L25;
        if (Objects.equals(this.v, r5.v) == false) goto L25;
        return true;
    }

    public final int hashCode() {
        int r1 = (this.o.hashCode() + (this.n.hashCode() * 961)) * 31;
        int r0 = 0;
        String r2 = this.p;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L6:
        int r4 = (Arrays.hashCode(this.r) + ((this.q.hashCode() + ((r1 + r3) * 31)) * 31)) * 31;
        String r5 = this.s;
        if (r5 == null) goto L9;
        int r6 = r5.hashCode();
    L10:
        int r7 = (Arrays.hashCode(this.t) + ((r4 + r6) * 31)) * 31;
        rt0 r8 = this.u;
        if (r8 == null) goto L13;
        int r9 = r8.hashCode();
    L14:
        int r10 = (r7 + r9) * 31;
        st0 r11 = this.v;
        if (r11 == null) goto L18;
        r0 = r11.hashCode();
    L18:
        return r10 + r0;
    L13:
        r9 = 0;
        goto L14
    L9:
        r6 = 0;
        goto L10
    L5:
        r3 = 0;
        goto L6
    }

    public final String toString() {
        return this.p + ":" + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        r4.writeString(this.n);
        r4.writeString(this.o.toString());
        r4.writeString(this.p);
        List r6 = this.q;
        r4.writeInt(r6.size());
        int r1 = 0;
    L4:
        if (r1 >= r6.size()) goto L6;
        r4.writeParcelable((Parcelable) r6.get(r1), 0);
        r1 = r1 + 1;
        goto L4
    L6:
        r4.writeByteArray(this.r);
        r4.writeString(this.s);
        r4.writeByteArray(this.t);
        r4.writeParcelable(this.u, 0);
        r4.writeParcelable(this.v, 0);
    }

    public tt0(String r5, Uri r6, String r7, List r8, byte[] r9, String r10, byte[] r11, rt0 r12, st0 r13) {
        int r0 = f35.J(r6, r7);
        boolean r1 = true;
        byte[] r2 = null;
        if (r0 != 0) goto L5;
    L9:
        if (r10 == null) goto L12;
        r1 = false;
    L12:
        rr2.j(r0, "customCacheKey must be null for type: %s", r1);
        this.u = null;
        this.v = r13;
    L13:
        this.n = r5;
        this.o = r6;
        this.p = r7;
        ArrayList r14 = new ArrayList(r8);
        Collections.sort(r14);
        this.q = Collections.unmodifiableList(r14);
        if (r9 == null) goto L16;
        r2 = Arrays.copyOf(r9, r9.length);
    L16:
        this.r = r2;
        this.s = r10;
        if (r11 == null) goto L19;
        byte[] r15 = Arrays.copyOf(r11, r11.length);
    L20:
        this.t = r15;
        return;
    L19:
        r15 = f35.b;
        goto L20
    L5:
        if (r0 == 2) goto L9;
        if (r0 == 1) goto L9;
        this.u = r12;
        this.v = null;
        goto L13
    }
}
