package defpackage;

import com.google.gson.JsonIOException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class uc0 implements o73 {
    public final /* synthetic */ int n;
    public final String o;

    public uc0(String str) {
        this.n = 2;
        str.getClass();
        this.o = str;
    }

    @Override // defpackage.o73
    public Object A() {
        int i = this.n;
        String str = this.o;
        switch (i) {
            case 0:
                throw new JsonIOException(str);
            default:
                throw new JsonIOException(str);
        }
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.o);
                    sb.append(c(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public String b(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public /* synthetic */ uc0(int i, String str) {
        this.n = i;
        this.o = str;
    }

    public uc0(uc0 uc0Var) {
        this.n = 2;
        this.o = uc0Var.o;
    }
}
