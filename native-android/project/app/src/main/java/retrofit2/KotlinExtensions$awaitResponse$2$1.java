package retrofit2;

import defpackage.if1;
import defpackage.j15;
import defpackage.q42;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class KotlinExtensions$awaitResponse$2$1 extends q42 implements if1 {
    final /* synthetic */ Call<T> $this_awaitResponse;

    public KotlinExtensions$awaitResponse$2$1(Call<T> r1) {
        this.$this_awaitResponse = r1;
        super(1);
    }

    @Override // defpackage.if1
    public /* bridge */ /* synthetic */ Object invoke(Object r1) {
        invoke((Throwable) r1);
        return j15.a;
    }

    public final void invoke(Throwable r1) {
        this.$this_awaitResponse.cancel();
    }
}
