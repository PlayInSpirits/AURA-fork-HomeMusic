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

    public uc0(String r2) {
        this.n = 2;
        r2.getClass();
        this.o = r2;
    }

    @Override // defpackage.o73
    public Object A() {
        int r0 = this.n;
        String r1 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new JsonIOException(r1);
    L7:
        throw new JsonIOException(r1);
    }

    public void a(StringBuilder r2, Iterator r3) {
    L10:
        e = move-exception;
        throw new AssertionError(e);
    L3:
        if (r3.hasNext() == false) goto L9;
        r2.append(c(r3.next()));     // Catch: IOException -> L10
    L6:
        if (r3.hasNext() == false) goto L17;
        r2.append(this.o);     // Catch: IOException -> L10
        r2.append(c(r3.next()));     // Catch: IOException -> L10
        goto L6
    L17:
        return;
    }

    public String b(Iterable r2) {
        Iterator r3 = r2.iterator();
        StringBuilder r0 = new StringBuilder();
        a(r0, r3);
        return r0.toString();
    }

    public CharSequence c(Object r1) {
        Objects.requireNonNull(r1);
        if ((r1 instanceof CharSequence) == false) goto L7;
        return (CharSequence) r1;
    L7:
        return r1.toString();
    }

    public /* synthetic */ uc0(int r1, String r2) {
        this.n = r1;
        this.o = r2;
    }

    public uc0(uc0 r2) {
        this.n = 2;
        this.o = r2.o;
    }
}
