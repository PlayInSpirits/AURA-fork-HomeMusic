package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qs0 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    public /* synthetic */ qs0(String str, String str2, String str3, int i) {
        this.n = i;
        this.o = str;
        this.p = str2;
        this.q = str3;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        int i = this.n;
        String str = this.q;
        String str2 = this.p;
        String str3 = this.o;
        switch (i) {
            case 0:
                x34 x34Var = (x34) obj;
                z34 z34VarU = x34Var.U("UPDATE download SET album_artist = ? WHERE album_id = ? AND album = ? AND NULLIF(album_artist, '') IS NULL");
                try {
                    z34VarU.r(1, str3);
                    if (str2 == null) {
                        z34VarU.e(2);
                    } else {
                        z34VarU.r(2, str2);
                    }
                    z34VarU.r(3, str);
                    z34VarU.O();
                    return Integer.valueOf(ji2.x(x34Var));
                } finally {
                    z34VarU.close();
                }
            default:
                String str4 = (String) obj;
                str4.getClass();
                String strConcat = str4.concat("/api/dislikes");
                fr1 fr1Var = new fr1();
                fr1Var.e(null, strConcat);
                fr1 fr1VarG = fr1Var.b().g();
                fr1VarG.a(str3, str2);
                fr1VarG.a("client", str);
                gr1 gr1VarB = fr1VarG.b();
                nz3 nz3Var = new nz3();
                nz3Var.a = gr1VarB;
                nz3Var.b("DELETE", xe5.d);
                return new oz3(nz3Var);
        }
    }
}
