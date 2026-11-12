package defpackage;

import com.google.gson.JsonIOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vc0 implements o73, kg1, wo4 {
    public final String n;

    public /* synthetic */ vc0(String str) {
        this.n = str;
    }

    @Override // defpackage.o73
    public Object A() {
        throw new JsonIOException(this.n);
    }

    @Override // defpackage.wo4
    public String f() {
        return this.n;
    }

    @Override // defpackage.kg1
    public /* bridge */ /* synthetic */ void h(Object obj) {
    }

    @Override // defpackage.wo4
    public void n(vo4 vo4Var) {
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
        l93.r0("MediaNtfMng", "custom command " + this.n + " produced an error: " + th.getMessage(), th);
    }
}
