package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mi3 {
    public static final mi3 b;
    public static final String c;
    public final w71 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        rr2.w(!false);
        b = new mi3(new w71(sparseBooleanArray));
        String str = f35.a;
        c = Integer.toString(0, 36);
    }

    public mi3(w71 w71Var) {
        this.a = w71Var;
    }

    public static mi3 b(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
        if (integerArrayList == null) {
            return b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int iIntValue = integerArrayList.get(i).intValue();
            rr2.w(!false);
            sparseBooleanArray.append(iIntValue, true);
        }
        rr2.w(!false);
        return new mi3(new w71(sparseBooleanArray));
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            w71 w71Var = this.a;
            if (i >= w71Var.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(w71Var.b(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mi3) {
            return this.a.equals(((mi3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
