package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l95 extends te {
    @Override // defpackage.ue
    public final boolean b() {
        if (super.b() && g12.C("MULTI_PROCESS")) {
            int i = j95.a;
            if (m95.a.b()) {
                return n95.a.getStatics().isMultiProcessEnabled();
            }
            er1.l("This method is not supported by the current version of the framework and the current WebView APK");
        }
        return false;
    }
}
