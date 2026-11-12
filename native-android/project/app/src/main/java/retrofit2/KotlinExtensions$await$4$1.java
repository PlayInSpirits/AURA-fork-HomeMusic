package retrofit2;

import defpackage.if1;
import defpackage.j15;
import defpackage.q42;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class KotlinExtensions$await$4$1 extends q42 implements if1 {
    final /* synthetic */ Call<T> $this_await;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinExtensions$await$4$1(Call<T> call) {
        super(1);
        this.$this_await = call;
    }

    @Override // defpackage.if1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return j15.a;
    }

    public final void invoke(Throwable th) {
        this.$this_await.cancel();
    }
}
