package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lw {
    public final /* synthetic */ int a;

    public /* synthetic */ lw(int r1) {
        this.a = r1;
    }

    public final int a(Object r1) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((int[]) r1).length;
    L7:
        return ((byte[]) r1).length;
    }

    public final int b() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 4;
    L6:
        return 1;
    }

    public final String c() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return "IntegerArrayPool";
    L6:
        return "ByteArrayPool";
    }
}
