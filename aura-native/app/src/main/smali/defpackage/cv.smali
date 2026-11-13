.class public final Ldefpackage/cv;
.super Ldefpackage/cx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/zu;
.implements Ldefpackage/o62;


# instance fields
.field public B:Ldefpackage/gd0;

.field public C:Z


# direct methods
.method public static final q0(Ldefpackage/cv;Ldefpackage/f63;Ldefpackage/fa;)Ldefpackage/wv3;
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldefpackage/cx2;->A:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-boolean v0, p0, Ldefpackage/cv;->C:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    invoke-static {p0}, Ldefpackage/j51;->N(Ldefpackage/eo0;)Ldefpackage/f63;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p1}, Ldefpackage/f63;->A0()Ldefpackage/cx2;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-boolean v0, v0, Ldefpackage/cx2;->A:Z

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    move-object p1, v1

    .line 26
    :goto_0
    if-nez p1, :cond_3

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    invoke-virtual {p2}, Ldefpackage/fa;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Ldefpackage/wv3;

    .line 34
    .line 35
    if-nez p2, :cond_4

    .line 36
    .line 37
    :goto_1
    return-object v1

    .line 38
    :cond_4
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p0, p1, v0}, Ldefpackage/f63;->C(Ldefpackage/q62;Z)Ldefpackage/wv3;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget p1, p0, Ldefpackage/wv3;->a:F

    .line 44
    .line 45
    iget p0, p0, Ldefpackage/wv3;->b:F

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    int-to-long v0, p1

    .line 52
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    int-to-long p0, p0

    .line 57
    const/16 v2, 0x20

    .line 58
    .line 59
    shl-long/2addr v0, v2

    .line 60
    const-wide v2, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    and-long/2addr p0, v2

    .line 66
    or-long/2addr p0, v0

    .line 67
    invoke-virtual {p2, p0, p1}, Ldefpackage/wv3;->f(J)Ldefpackage/wv3;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method


# virtual methods
.method public final e(Ldefpackage/q62;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Ldefpackage/cv;->C:Z

    .line 3
    .line 4
    return-void
.end method

.method public final f0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final k(Ldefpackage/f63;Ldefpackage/fa;Ldefpackage/ep4;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v4, Ldefpackage/jo;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {v4, p0, p1, p2, v0}, Ldefpackage/jo;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ldefpackage/bv;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move-object v3, p2

    .line 13
    invoke-direct/range {v0 .. v5}, Ldefpackage/bv;-><init>(Ldefpackage/cv;Ldefpackage/f63;Ldefpackage/fa;Ldefpackage/jo;Ldefpackage/vd0;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p3}, Ldefpackage/te5;->j(Ldefpackage/wf1;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object p1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 21
    .line 22
    if-ne p0, p1, :cond_0

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 26
    .line 27
    return-object p0
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ldefpackage/cx2;-><init>()V

    return-void
.end method
