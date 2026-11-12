package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yd3 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ yd3(int r1) {
        this.a = r1;
    }

    public static zd3 a(Parcel r2, ClassLoader r3) {
        if (r3 != null) goto L4;
        r3 = yd3.class.getClassLoader();
    L4:
        Object r4 = r2.readValue(r3);
        int r5 = r2.readInt();
        if (r5 != 0) goto L7;
        rv2 r6 = rv2.s;
    L16:
        return new zd3(r4, r6);
    L7:
        if (r5 != 1) goto L9;
        r6 = rv2.D;
        goto L16
    L9:
        if (r5 != 2) goto L11;
        r6 = rv2.A;
        goto L16
    L11:
        kf2.o(b11.j(r5, "Unsupported MutableState policy ", " was restored"));
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r3) {
        switch(this.a) {
            case 0: goto L28;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L4;
        };
    L4:
        q75 r2 = new q75(r3, null);
        r2.n = r3.readInt();
        r2.o = r3.readInt();
        r2.p = r3.readParcelable(null);
        return r2;
    L7:
        return new hs4(r3, null);
    L9:
        return new x74(r3, null);
    L11:
        return new j74(r3, null);
    L13:
        return new ae3(r3, null);
    L15:
        return new r33(r3, null);
    L17:
        return new jc1(r3, null);
    L19:
        return new iw0(r3, null);
    L21:
        return new z10(r3, null);
    L23:
        if (r3.readParcelable(null) == null) goto L29;
        kf2.o("superState must be null");
        return null;
    L29:
        return k.o;
    L28:
        return a(r3, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        switch(this.a) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L5;
        };
    L5:
        return new q75[r1];
    L7:
        return new hs4[r1];
    L9:
        return new x74[r1];
    L11:
        return new j74[r1];
    L13:
        return new ae3[r1];
    L15:
        return new r33[r1];
    L17:
        return new jc1[r1];
    L19:
        return new iw0[r1];
    L21:
        return new z10[r1];
    L23:
        return new k[r1];
    L25:
        return new zd3[r1];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel r2, ClassLoader r3) {
        switch(this.a) {
            case 0: goto L28;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L4;
        };
    L4:
        q75 r1 = new q75(r2, r3);
        r1.n = r2.readInt();
        r1.o = r2.readInt();
        r1.p = r2.readParcelable(r3);
        return r1;
    L7:
        return new hs4(r2, r3);
    L9:
        return new x74(r2, r3);
    L11:
        return new j74(r2, r3);
    L13:
        return new ae3(r2, r3);
    L15:
        return new r33(r2, r3);
    L17:
        return new jc1(r2, r3);
    L19:
        return new iw0(r2, r3);
    L21:
        return new z10(r2, r3);
    L23:
        if (r2.readParcelable(r3) == null) goto L29;
        kf2.o("superState must be null");
        return null;
    L29:
        return k.o;
    L28:
        return a(r2, r3);
    }
}
