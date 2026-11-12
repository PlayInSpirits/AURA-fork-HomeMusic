package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fk4 extends bk0 {
    public final /* synthetic */ int c;

    public /* synthetic */ fk4(int r1, Class r2) {
        this.c = r1;
        super(r2);
    }

    @Override // defpackage.bk0
    public final Date b(Date r3) {
        switch(this.c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new Timestamp(r3.getTime());
    L7:
        return new java.sql.Date(r3.getTime());
    }
}
