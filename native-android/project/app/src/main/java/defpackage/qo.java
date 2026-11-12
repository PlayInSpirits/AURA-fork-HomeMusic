package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qo implements Parcelable {
    public static final Parcelable.Creator<qo> CREATOR = new w4(8);
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

    public qo(po poVar) {
        int size = poVar.a.size();
        this.n = new int[size * 6];
        if (!poVar.g) {
            kf2.o("Not on back stack");
            throw null;
        }
        this.o = new ArrayList(size);
        this.p = new int[size];
        this.q = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            je1 je1Var = (je1) poVar.a.get(i2);
            int i3 = i + 1;
            this.n[i] = je1Var.a;
            ArrayList arrayList = this.o;
            kc1 kc1Var = je1Var.b;
            arrayList.add(kc1Var != null ? kc1Var.r : null);
            int[] iArr = this.n;
            iArr[i3] = je1Var.c ? 1 : 0;
            iArr[i + 2] = je1Var.d;
            iArr[i + 3] = je1Var.e;
            int i4 = i + 5;
            iArr[i + 4] = je1Var.f;
            i += 6;
            iArr[i4] = je1Var.g;
            this.p[i2] = je1Var.h.ordinal();
            this.q[i2] = je1Var.i.ordinal();
        }
        this.r = poVar.f;
        this.s = poVar.i;
        this.t = poVar.s;
        this.u = poVar.j;
        this.v = poVar.k;
        this.w = poVar.l;
        this.x = poVar.m;
        this.y = poVar.n;
        this.z = poVar.o;
        this.A = poVar.p;
    }

    public final void a(po poVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.n;
            boolean z = true;
            if (i >= iArr.length) {
                poVar.f = this.r;
                poVar.i = this.s;
                poVar.g = true;
                poVar.j = this.u;
                poVar.k = this.v;
                poVar.l = this.w;
                poVar.m = this.x;
                poVar.n = this.y;
                poVar.o = this.z;
                poVar.p = this.A;
                return;
            }
            je1 je1Var = new je1();
            int i3 = i + 1;
            je1Var.a = iArr[i];
            if (ld1.I(2)) {
                Log.v("FragmentManager", "Instantiate " + poVar + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            je1Var.h = r92.values()[this.p[i2]];
            je1Var.i = r92.values()[this.q[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            je1Var.c = z;
            int i5 = iArr[i4];
            je1Var.d = i5;
            int i6 = iArr[i + 3];
            je1Var.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            je1Var.f = i8;
            i += 6;
            int i9 = iArr[i7];
            je1Var.g = i9;
            poVar.b = i5;
            poVar.c = i6;
            poVar.d = i8;
            poVar.e = i9;
            poVar.b(je1Var);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.n);
        parcel.writeStringList(this.o);
        parcel.writeIntArray(this.p);
        parcel.writeIntArray(this.q);
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        TextUtils.writeToParcel(this.v, parcel, 0);
        parcel.writeInt(this.w);
        TextUtils.writeToParcel(this.x, parcel, 0);
        parcel.writeStringList(this.y);
        parcel.writeStringList(this.z);
        parcel.writeInt(this.A ? 1 : 0);
    }

    public qo(Parcel parcel) {
        this.n = parcel.createIntArray();
        this.o = parcel.createStringArrayList();
        this.p = parcel.createIntArray();
        this.q = parcel.createIntArray();
        this.r = parcel.readInt();
        this.s = parcel.readString();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.v = (CharSequence) creator.createFromParcel(parcel);
        this.w = parcel.readInt();
        this.x = (CharSequence) creator.createFromParcel(parcel);
        this.y = parcel.createStringArrayList();
        this.z = parcel.createStringArrayList();
        this.A = parcel.readInt() != 0;
    }
}
