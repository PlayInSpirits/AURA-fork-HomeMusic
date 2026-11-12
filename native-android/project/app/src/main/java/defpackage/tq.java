package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tq extends View.BaseSavedState {
    public static final Parcelable.Creator<tq> CREATOR = null;
    public float n;
    public float o;
    public ArrayList p;
    public float q;
    public boolean r;

    static {
        CREATOR = new w4(11);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        r2.writeFloat(this.n);
        r2.writeFloat(this.o);
        r2.writeList(this.p);
        r2.writeFloat(this.q);
        r2.writeBooleanArray(new boolean[]{this.r});
    }
}
