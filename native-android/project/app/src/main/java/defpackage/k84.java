package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k84 extends ap3 {
    public static final Parcelable.Creator<k84> CREATOR = null;
    public int n;
    public int o;
    public int p;

    static {
        CREATOR = new j84(0);
    }

    public k84(Parcel r2) {
        super(r2);
        this.n = r2.readInt();
        this.o = r2.readInt();
        this.p = r2.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.n);
        r1.writeInt(this.o);
        r1.writeInt(this.p);
    }

    public k84() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
