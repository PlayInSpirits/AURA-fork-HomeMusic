package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g35 extends h2 {
    public static final Parcelable.Creator<g35> CREATOR = null;
    public final List n;

    static {
        CREATOR = new ch5(29);
    }

    public g35(ArrayList r1) {
        this.n = r1;
    }

    public final JSONArray b() {
        JSONArray r0 = new JSONArray();     // Catch: JSONException -> L11
        List r5 = this.n;
        if (r5 == null) goto L10;
        int r1 = 0;
    L7:
        if (r1 >= r5.size()) goto L10;
        h35 r2 = (h35) r5.get(r1);     // Catch: JSONException -> L11
        JSONArray r3 = new JSONArray();     // Catch: JSONException -> L11
        r3.put(r2.p);     // Catch: JSONException -> L11
        r3.put(r2.o);     // Catch: JSONException -> L11
        r3.put(r2.p);     // Catch: JSONException -> L11
        r0.put(r1, r3);     // Catch: JSONException -> L11
        r1 = r1 + 1;
    L10:
        return r0;
    L11:
        e = move-exception;
        nz2.s("Error encoding UvmEntries to JSON object", e);
        return null;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof g35) == true) goto L5;
        return false;
    L5:
        List r5 = ((g35) r4).n;
        List r3 = this.n;
        if (r3 != null) goto L10;
        if (r5 != null) goto L10;
        return true;
    L10:
        if (r3 == null) goto L17;
        if (r5 == null) goto L17;
        if (r3.containsAll(r5) == false) goto L17;
        if (r5.containsAll(r3) == false) goto L17;
        return true;
    L17:
        return false;
    }

    public final int hashCode() {
        List r1 = this.n;
        if (r1 != null) goto L5;
        HashSet r2 = null;
    L7:
        return Arrays.hashCode(new Object[]{r2});
    L5:
        r2 = new HashSet(r1);
        goto L7
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        int r4 = ud3.R0(r2, 20293);
        ud3.Q0(r2, 1, this.n);
        ud3.S0(r2, r4);
    }
}
