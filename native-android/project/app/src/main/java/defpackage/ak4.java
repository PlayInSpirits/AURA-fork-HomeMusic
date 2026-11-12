package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ak4 {
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final yx0 j;

    public ak4() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new yx0();
    }

    public final yx0 a(double r17, double r19, long r21) {
        if (this.c == false) goto L6;
    L16:
        double r4 = r21 / 1000.0d;
        double r6 = r17 - this.i;
        double r8 = this.b;
        if (r8 <= 1.0d) goto L19;
        double r1 = this.g;
        double r9 = ((r1 * r6) - r19) / (r1 - this.f);
        double r7 = r6 - r9;
        double r12 = (Math.pow(2.718281828459045d, this.f * r4) * r9) + (Math.pow(2.718281828459045d, r1 * r4) * r7);
        double r2 = this.g;
        double r3 = Math.pow(2.718281828459045d, r2 * r4) * (r7 * r2);
        double r10 = this.f;
        double r5 = (Math.pow(2.718281828459045d, r10 * r4) * (r9 * r10)) + r3;
    L22:
        float r11 = (float) (r12 + this.i);
        yx0 r0 = this.j;
        r0.a = r11;
        r0.b = (float) r5;
        return r0;
    L19:
        if (r8 != 1.0d) goto L21;
        double r13 = this.a;
        double r14 = (r13 * r6) + r19;
        double r15 = (r14 * r4) + r6;
        double r16 = Math.pow(2.718281828459045d, (-r13) * r4) * r15;
        double r18 = Math.pow(2.718281828459045d, (-this.a) * r4) * r15;
        double r110 = -this.a;
        r5 = (Math.pow(2.718281828459045d, r110 * r4) * r14) + (r18 * r110);
        r12 = r16;
        goto L22
    L21:
        double r20 = 1.0d / this.h;
        double r111 = this.a;
        double r112 = (((r8 * r111) * r6) + r19) * r20;
        r12 = ((Math.sin(this.h * r4) * r112) + (Math.cos(this.h * r4) * r6)) * Math.pow(2.718281828459045d, ((-r8) * r111) * r4);
        double r22 = this.a;
        double r113 = this.b;
        double r23 = ((-r22) * r12) * r113;
        double r24 = Math.pow(2.718281828459045d, ((-r113) * r22) * r4);
        double r114 = this.h;
        double r25 = Math.sin(r114 * r4) * ((-r114) * r6);
        double r26 = this.h;
        r5 = (((Math.cos(r26 * r4) * (r112 * r26)) + r25) * r24) + r23;
        goto L22
    L6:
        if (this.i == Double.MAX_VALUE) goto L24;
        double r27 = this.b;
        if (r27 <= 1.0d) goto L11;
        double r28 = this.a;
        this.f = (Math.sqrt((r27 * r27) - 1.0d) * r28) + ((-r27) * r28);
        double r29 = this.b;
        double r30 = this.a;
        this.g = ((-r29) * r30) - (Math.sqrt((r29 * r29) - 1.0d) * r30);
    L15:
        this.c = true;
        goto L16
    L11:
        if (r27 < 0.0d) goto L15;
        if (r27 >= 1.0d) goto L15;
        this.h = Math.sqrt(1.0d - (r27 * r27)) * this.a;
        goto L15
    L24:
        kf2.o("Error: Final position of the spring must be set before the animation starts");
        return null;
    }

    public ak4(float r3) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.j = new yx0();
        this.i = r3;
    }
}
