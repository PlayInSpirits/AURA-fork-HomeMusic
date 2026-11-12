package defpackage;

import android.os.Parcel;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class oz4 implements de, za3, zy3 {
    public final Object n;

    public oz4(int r1) {
        switch(r1) {
            case 2: goto L5;
            default: goto L3;
        };
    L3:
        this.n = ly3.t;
        return;
    L5:
        this.n = ByteBuffer.allocate(4);
    }

    public Type a(TypeVariable r2, nz4 r3) {
        Type r1 = (Type) ((ly3) this.n).get(new pz4(r2));
        if (r1 != null) goto L15;
        Type[] r4 = r2.getBounds();
        if (r4.length == 0) goto L11;
        Type[] r5 = new sz4(r3).c(r4);
        if (y05.a == false) goto L13;
        if (Arrays.equals(r4, r5) == true) goto L11;
    L13:
        return b15.e(r2.getGenericDeclaration(), r2.getName(), r5);
    L11:
        return r2;
    L15:
        return new sz4(r3).b(r1);
    }

    @Override // defpackage.zy3
    public void accept(Object r4, Object r5) {
        jg5 r0 = new jg5((cr4) r5, 1);
        eh5 r6 = (eh5) ((lg5) r4).e();
        cs r3 = (cs) this.n;
        Parcel r7 = r6.m();
        int r2 = pg5.a;
        r7.writeStrongBinder(r0);
        pg5.c(r7, r3);
        r6.U(r7, 1);
    }

    @Override // defpackage.za3
    public void e(byte[] r3, Object r4, MessageDigest r5) {
        Integer r6 = (Integer) r4;
        if (r6 != null) goto L5;
        return;
    L5:
        r5.update(r3);
        ByteBuffer r7 = (ByteBuffer) this.n;
        monitor-enter(r7);
        ((ByteBuffer) this.n).position(0);     // Catch: Throwable -> L10
        r5.update(((ByteBuffer) this.n).putInt(r6.intValue()).array());     // Catch: Throwable -> L10
        monitor-exit(r7);     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.de
    public c81 get(int r1) {
        return (c81) this.n;
    }

    public /* synthetic */ oz4(kg5 r1, cs r2) {
        this.n = r2;
    }

    public /* synthetic */ oz4(Object r1) {
        this.n = r1;
    }
}
