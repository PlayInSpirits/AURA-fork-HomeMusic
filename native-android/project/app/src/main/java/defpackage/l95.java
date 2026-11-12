package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l95 extends te {
    @Override // defpackage.ue
    public final boolean b() {
        if (super.b() == true) goto L6;
    L12:
        return false;
    L6:
        if (g12.C("MULTI_PROCESS") == false) goto L12;
        int r1 = j95.a;
        if (m95.a.b() == true) goto L10;
        er1.l("This method is not supported by the current version of the framework and the current WebView APK");
        goto L12
    L10:
        return n95.a.getStatics().isMultiProcessEnabled();
    }
}
