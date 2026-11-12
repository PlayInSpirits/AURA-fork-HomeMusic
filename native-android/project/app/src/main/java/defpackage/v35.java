package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v35 extends u35 {
    public cf3[] a;
    public String b;
    public int c;

    public v35(v35 v35Var) {
        this.a = null;
        this.c = 0;
        this.b = v35Var.b;
        cf3[] cf3VarArr = v35Var.a;
        cf3[] cf3VarArr2 = new cf3[cf3VarArr.length];
        for (int i = 0; i < cf3VarArr.length; i++) {
            cf3VarArr2[i] = new cf3(cf3VarArr[i]);
        }
        this.a = cf3VarArr2;
    }

    public cf3[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(cf3[] cf3VarArr) {
        cf3[] cf3VarArr2 = this.a;
        if (cf3VarArr2 != null && cf3VarArr != null && cf3VarArr2.length == cf3VarArr.length) {
            int i = 0;
            while (true) {
                if (i >= cf3VarArr2.length) {
                    cf3[] cf3VarArr3 = this.a;
                    for (int i2 = 0; i2 < cf3VarArr.length; i2++) {
                        cf3VarArr3[i2].a = cf3VarArr[i2].a;
                        int i3 = 0;
                        while (true) {
                            float[] fArr = cf3VarArr[i2].b;
                            if (i3 < fArr.length) {
                                cf3VarArr3[i2].b[i3] = fArr[i3];
                                i3++;
                            }
                        }
                    }
                    return;
                }
                cf3 cf3Var = cf3VarArr2[i];
                char c = cf3Var.a;
                cf3 cf3Var2 = cf3VarArr[i];
                if (c != cf3Var2.a || cf3Var.b.length != cf3Var2.b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        cf3[] cf3VarArr4 = new cf3[cf3VarArr.length];
        for (int i4 = 0; i4 < cf3VarArr.length; i4++) {
            cf3VarArr4[i4] = new cf3(cf3VarArr[i4]);
        }
        this.a = cf3VarArr4;
    }

    public v35() {
        this.a = null;
        this.c = 0;
    }
}
