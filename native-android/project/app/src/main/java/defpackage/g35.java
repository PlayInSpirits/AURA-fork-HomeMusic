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
    public static final Parcelable.Creator<g35> CREATOR = new ch5(29);
    public final List n;

    public g35(ArrayList arrayList) {
        this.n = arrayList;
    }

    public final JSONArray b() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.n;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    h35 h35Var = (h35) list.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) h35Var.p);
                    jSONArray2.put((int) h35Var.o);
                    jSONArray2.put((int) h35Var.p);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            nz2.s("Error encoding UvmEntries to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g35)) {
            return false;
        }
        List list = ((g35) obj).n;
        List list2 = this.n;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.n;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.Q0(parcel, 1, this.n);
        ud3.S0(parcel, iR0);
    }
}
