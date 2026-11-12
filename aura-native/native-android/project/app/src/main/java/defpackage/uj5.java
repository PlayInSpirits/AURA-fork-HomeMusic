package defpackage;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uj5 extends ak5 {
    public final ei5 n;
    public final int o;

    public uj5(pi5 pi5Var) throws zzhf {
        pi5Var.getClass();
        this.n = pi5Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            ei5 ei5Var = this.n;
            if (i >= ei5Var.size()) {
                break;
            }
            int iB = ((ak5) ei5Var.get(i)).b();
            if (i2 < iB) {
                i2 = iB;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.o = i3;
        if (i3 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.ak5
    public final int a() {
        return ak5.d((byte) -128);
    }

    @Override // defpackage.ak5
    public final int b() {
        return this.o;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ak5 ak5Var = (ak5) obj;
        int iA = ak5Var.a();
        int iD = ak5.d((byte) -128);
        if (iD != iA) {
            return iD - ak5Var.a();
        }
        ei5 ei5Var = ((uj5) ak5Var).n;
        ei5 ei5Var2 = this.n;
        if (ei5Var2.size() != ei5Var.size()) {
            return ei5Var2.size() - ei5Var.size();
        }
        for (int i = 0; i < ei5Var2.size(); i++) {
            int iCompareTo = ((ak5) ei5Var2.get(i)).compareTo((ak5) ei5Var.get(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uj5.class == obj.getClass()) {
            return this.n.equals(((uj5) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(ak5.d((byte) -128)), this.n});
    }

    public final String toString() {
        ei5 ei5Var = this.n;
        if (ei5Var.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = ei5Var.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((ak5) ei5Var.get(i)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(z45.a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(z45.a(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
