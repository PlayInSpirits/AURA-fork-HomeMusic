.class final Lt30;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:Lgf1;


# direct methods
.method public constructor <init>(Lgf1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt30;->a:Lgf1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 1

    .line 1
    new-instance v0, Lu30;

    .line 2
    .line 3
    iget-object p0, p0, Lt30;->a:Lgf1;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lu30;-><init>(Lgf1;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 7

    .line 1
    check-cast p1, Lu30;

    .line 2
    .line 3
    iget-object v0, p1, Lu30;->H:Lea1;

    .line 4
    .line 5
    iget-object v1, p1, Lu30;->Q:Lrm2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lu30;->v0()V

    .line 17
    .line 18
    .line 19
    iput-object v2, p1, Lu30;->Q:Lrm2;

    .line 20
    .line 21
    iput-object v2, p1, Lu30;->D:Lrm2;

    .line 22
    .line 23
    move v1, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v4

    .line 26
    :goto_0
    iget-boolean v5, p1, Lu30;->E:Z

    .line 27
    .line 28
    if-eq v5, v3, :cond_1

    .line 29
    .line 30
    iput-boolean v3, p1, Lu30;->E:Z

    .line 31
    .line 32
    invoke-virtual {p1}, Lu30;->Q()V

    .line 33
    .line 34
    .line 35
    move v1, v3

    .line 36
    :cond_1
    iget-boolean v5, p1, Lu30;->F:Z

    .line 37
    .line 38
    if-eq v5, v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lfo0;->q0(Leo0;)Leo0;

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lfu;->C(Lg94;)V

    .line 44
    .line 45
    .line 46
    iput-boolean v3, p1, Lu30;->F:Z

    .line 47
    .line 48
    :cond_2
    iget-object p0, p0, Lt30;->a:Lgf1;

    .line 49
    .line 50
    iput-object p0, p1, Lu30;->G:Lgf1;

    .line 51
    .line 52
    iget-boolean p0, p1, Lu30;->R:Z

    .line 53
    .line 54
    iget-object v5, p1, Lu30;->Q:Lrm2;

    .line 55
    .line 56
    if-nez v5, :cond_3

    .line 57
    .line 58
    move v6, v3

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move v6, v4

    .line 61
    :goto_1
    if-eq p0, v6, :cond_5

    .line 62
    .line 63
    if-nez v5, :cond_4

    .line 64
    .line 65
    move v4, v3

    .line 66
    :cond_4
    iput-boolean v4, p1, Lu30;->R:Z

    .line 67
    .line 68
    if-nez v4, :cond_5

    .line 69
    .line 70
    iget-object p0, p1, Lu30;->L:Lck0;

    .line 71
    .line 72
    if-nez p0, :cond_5

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    move v3, v1

    .line 76
    :goto_2
    if-eqz v3, :cond_8

    .line 77
    .line 78
    iget-object p0, p1, Lu30;->L:Lck0;

    .line 79
    .line 80
    if-nez p0, :cond_6

    .line 81
    .line 82
    iget-boolean v1, p1, Lu30;->R:Z

    .line 83
    .line 84
    if-nez v1, :cond_8

    .line 85
    .line 86
    :cond_6
    if-eqz p0, :cond_7

    .line 87
    .line 88
    invoke-virtual {p1, p0}, Lfo0;->r0(Leo0;)V

    .line 89
    .line 90
    .line 91
    :cond_7
    iput-object v2, p1, Lu30;->L:Lck0;

    .line 92
    .line 93
    invoke-virtual {p1}, Lu30;->x0()V

    .line 94
    .line 95
    .line 96
    :cond_8
    iget-object p0, p1, Lu30;->D:Lrm2;

    .line 97
    .line 98
    invoke-virtual {v0, p0}, Lea1;->v0(Lrm2;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_1
    const-class v0, Lt30;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_2
    check-cast p1, Lt30;

    .line 17
    .line 18
    iget-object p0, p0, Lt30;->a:Lgf1;

    .line 19
    .line 20
    iget-object p1, p1, Lt30;->a:Lgf1;

    .line 21
    .line 22
    if-eq p0, p1, :cond_3

    .line 23
    .line 24
    :goto_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 27
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    mul-int/lit8 v1, v1, 0x1f

    .line 7
    .line 8
    const/16 v2, 0x745f

    .line 9
    .line 10
    invoke-static {v1, v2, v0}, Lxa3;->c(IIZ)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, Lt30;->a:Lgf1;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    add-int/2addr p0, v0

    .line 21
    return p0
.end method
