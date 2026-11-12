package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m23 extends q42 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Bundle o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m23(int i, Bundle bundle) {
        super(1);
        this.n = i;
        this.o = bundle;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        Bundle bundle = this.o;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(!bundle.containsKey(str));
            default:
                String str2 = (String) obj;
                str2.getClass();
                return Boolean.valueOf(!bundle.containsKey(str2));
        }
    }
}
