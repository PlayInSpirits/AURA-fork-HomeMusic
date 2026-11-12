package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qo implements Parcelable {
    public static final Parcelable.Creator<qo> CREATOR = null;
    public final boolean A;
    public final int[] n;
    public final ArrayList o;
    public final int[] p;
    public final int[] q;
    public final int r;
    public final String s;
    public final int t;
    public final int u;
    public final CharSequence v;
    public final int w;
    public final CharSequence x;
    public final ArrayList y;
    public final ArrayList z;

    static {
        CREATOR = new w4(8);
    }

    public qo(po r10) {
        int r0 = r10.a.size();
        this.n = new int[r0 * 6];
        if (r10.g == false) goto L13;
        this.o = new ArrayList(r0);
        this.p = new int[r0];
        this.q = new int[r0];
        int r1 = 0;
        int r3 = 0;
    L5:
        if (r1 >= r0) goto L11;
        je1 r4 = (je1) r10.a.get(r1);
        int r6 = r3 + 1;
        this.n[r3] = r4.a;
        ArrayList r5 = this.o;
        kc1 r7 = r4.b;
        if (r7 == null) goto L9;
        String r8 = r7.r;
    L10:
        r5.add(r8);
        int[] r9 = this.n;
        r9[r6] = r4.c ? 1 : 0;
        r9[r3 + 2] = r4.d;
        r9[r3 + 3] = r4.e;
        int r11 = r3 + 5;
        r9[r3 + 4] = r4.f;
        r3 = r3 + 6;
        r9[r11] = r4.g;
        this.p[r1] = r4.h.ordinal();
        this.q[r1] = r4.i.ordinal();
        r1 = r1 + 1;
        goto L5
    L9:
        r8 = null;
        goto L10
    L11:
        this.r = r10.f;
        this.s = r10.i;
        this.t = r10.s;
        this.u = r10.j;
        this.v = r10.k;
        this.w = r10.l;
        this.x = r10.m;
        this.y = r10.n;
        this.z = r10.o;
        this.A = r10.p;
        return;
    L13:
        kf2.o("Not on back stack");
        throw null;
    }

    public final void a(po r10) {
        int r1 = 0;
        int r2 = 0;
    L3:
        int[] r3 = this.n;
        boolean r5 = true;
        if (r1 >= r3.length) goto L13;
        je1 r4 = new je1();
        int r6 = r1 + 1;
        r4.a = r3[r1];
        if (ld1.I(2) == false) goto L8;
        Log.v("FragmentManager", "Instantiate " + r10 + " op #" + r2 + " base fragment #" + r3[r6]);
    L8:
        r4.h = r92.values()[this.p[r2]];
        r4.i = r92.values()[this.q[r2]];
        int r7 = r1 + 2;
        if (r3[r6] != 0) goto L12;
        r5 = false;
    L12:
        r4.c = r5;
        int r8 = r3[r7];
        r4.d = r8;
        int r9 = r3[r1 + 3];
        r4.e = r9;
        int r11 = r1 + 5;
        int r12 = r3[r1 + 4];
        r4.f = r12;
        r1 = r1 + 6;
        int r13 = r3[r11];
        r4.g = r13;
        r10.b = r8;
        r10.c = r9;
        r10.d = r12;
        r10.e = r13;
        r10.b(r4);
        r2 = r2 + 1;
        goto L3
    L13:
        r10.f = this.r;
        r10.i = this.s;
        r10.g = true;
        r10.j = this.u;
        r10.k = this.v;
        r10.l = this.w;
        r10.m = this.x;
        r10.n = this.y;
        r10.o = this.z;
        r10.p = this.A;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeIntArray(this.n);
        r2.writeStringList(this.o);
        r2.writeIntArray(this.p);
        r2.writeIntArray(this.q);
        r2.writeInt(this.r);
        r2.writeString(this.s);
        r2.writeInt(this.t);
        r2.writeInt(this.u);
        TextUtils.writeToParcel(this.v, r2, 0);
        r2.writeInt(this.w);
        TextUtils.writeToParcel(this.x, r2, 0);
        r2.writeStringList(this.y);
        r2.writeStringList(this.z);
        r2.writeInt(this.A ? 1 : 0);
    }

    public qo(Parcel r3) {
        this.n = r3.createIntArray();
        this.o = r3.createStringArrayList();
        this.p = r3.createIntArray();
        this.q = r3.createIntArray();
        this.r = r3.readInt();
        this.s = r3.readString();
        this.t = r3.readInt();
        this.u = r3.readInt();
        Parcelable.Creator r0 = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.v = (CharSequence) r0.createFromParcel(r3);
        this.w = r3.readInt();
        this.x = (CharSequence) r0.createFromParcel(r3);
        this.y = r3.createStringArrayList();
        this.z = r3.createStringArrayList();
        if (r3.readInt() == 0) goto L5;
        boolean r4 = true;
    L6:
        this.A = r4;
        return;
    L5:
        r4 = false;
        goto L6
    }
}
