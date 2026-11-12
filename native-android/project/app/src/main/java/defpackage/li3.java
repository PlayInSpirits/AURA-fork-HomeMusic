package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class li3 extends x65 {
    public final k03 b = new k03(null);
    public final k03 c = new k03(Boolean.FALSE);

    public final void c(String str, boolean z) {
        k03 k03Var = this.b;
        if (!Objects.equals(k03Var.d(), str)) {
            k03Var.i(str);
        }
        k03 k03Var2 = this.c;
        if (Objects.equals(k03Var2.d(), Boolean.valueOf(z))) {
            return;
        }
        k03Var2.i(Boolean.valueOf(z));
    }
}
