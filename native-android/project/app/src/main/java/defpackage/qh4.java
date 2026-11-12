package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qh4 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ qh4(int r1) {
        this.a = r1;
    }

    public static rh4 a(Parcel r4, ClassLoader r5) {
        if (r5 != null) goto L4;
        r5 = qh4.class.getClassLoader();
    L4:
        int r0 = r4.readInt();
        if (r0 == 0) goto L7;
        xf3 r1 = og4.o.f();
        int r2 = 0;
    L9:
        if (r2 >= r0) goto L12;
        r1.add(r4.readValue(r5));
        r2 = r2 + 1;
        goto L9
    L12:
        return new rh4(r1.d());
    L7:
        return new rh4();
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r2) {
        switch(this.a) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L5:
        return new bv4(r2, null);
    L7:
        return new rd4(r2, null);
    L9:
        return new w74(r2, null);
    L11:
        return new vw3(r2, null);
    L13:
        return new r43(r2, null);
    L15:
        return new fh2(r2, null);
    L17:
        return new b51(r2, null);
    L19:
        return new he0(r2, null);
    L21:
        return new vt(r2, null);
    L23:
        return a(r2, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        switch(this.a) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L5:
        return new bv4[r1];
    L7:
        return new rd4[r1];
    L9:
        return new w74[r1];
    L11:
        return new vw3[r1];
    L13:
        return new r43[r1];
    L15:
        return new fh2[r1];
    L17:
        return new b51[r1];
    L19:
        return new he0[r1];
    L21:
        return new vt[r1];
    L23:
        return new rh4[r1];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel r1, ClassLoader r2) {
        switch(this.a) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L5:
        return new bv4(r1, r2);
    L7:
        return new rd4(r1, r2);
    L9:
        return new w74(r1, r2);
    L11:
        return new vw3(r1, r2);
    L13:
        return new r43(r1, r2);
    L15:
        return new fh2(r1, r2);
    L17:
        return new b51(r1, r2);
    L19:
        return new he0(r1, r2);
    L21:
        return new vt(r1, r2);
    L23:
        return a(r1, r2);
    }
}
