package defpackage;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yj5 extends ak5 {
    public final int n;
    public final ji5 o;

    public yj5(ji5 ji5Var) throws zzhf {
        ji5Var.getClass();
        this.o = ji5Var;
        o15 o15VarE = ji5Var.entrySet().e();
        int i = 0;
        while (o15VarE.hasNext()) {
            Map.Entry entry = (Map.Entry) o15VarE.next();
            int iB = ((ak5) entry.getKey()).b();
            i = i < iB ? iB : i;
            int iB2 = ((ak5) entry.getValue()).b();
            if (i < iB2) {
                i = iB2;
            }
        }
        int i2 = i + 1;
        this.n = i2;
        if (i2 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.ak5
    public final int a() {
        return ak5.d((byte) -96);
    }

    @Override // defpackage.ak5
    public final int b() {
        return this.n;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        ak5 ak5Var = (ak5) obj;
        int iA = ak5Var.a();
        int iD = ak5.d((byte) -96);
        if (iD != iA) {
            return iD - ak5Var.a();
        }
        ji5 ji5Var = ((yj5) ak5Var).o;
        ji5 ji5Var2 = this.o;
        if (ji5Var2.q.size() != ji5Var.q.size()) {
            return ji5Var2.q.size() - ji5Var.q.size();
        }
        o15 o15VarE = ji5Var2.entrySet().e();
        o15 o15VarE2 = ji5Var.entrySet().e();
        do {
            if (!o15VarE.hasNext() && !o15VarE2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) o15VarE.next();
            Map.Entry entry2 = (Map.Entry) o15VarE2.next();
            int iCompareTo2 = ((ak5) entry.getKey()).compareTo((ak5) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((ak5) entry.getValue()).compareTo((ak5) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yj5.class == obj.getClass()) {
            return this.o.equals(((yj5) obj).o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(ak5.d((byte) -96)), this.o});
    }

    public final String toString() {
        ji5 ji5Var = this.o;
        if (ji5Var.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o15 o15VarE = ji5Var.entrySet().e();
        while (o15VarE.hasNext()) {
            Map.Entry entry = (Map.Entry) o15VarE.next();
            linkedHashMap.put(((ak5) entry.getKey()).toString().replace("\n", "\n  "), ((ak5) entry.getValue()).toString().replace("\n", "\n  "));
        }
        z45 z45Var = new z45(8);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            uo.V(sb, linkedHashMap.entrySet().iterator(), z45Var);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
