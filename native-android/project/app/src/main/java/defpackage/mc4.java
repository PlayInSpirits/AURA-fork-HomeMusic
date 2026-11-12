package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mc4 {
    public boolean a;
    public boolean b;
    public bc4 c;
    public RectF d;
    public final Path e;

    public mc4() {
        this.a = false;
        this.b = false;
        this.d = new RectF();
        this.e = new Path();
    }

    public abstract void a(NavigationView r1);

    public abstract boolean b();
}
