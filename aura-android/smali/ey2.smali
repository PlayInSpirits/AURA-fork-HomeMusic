.class public final synthetic Ley2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:Lhy2;

.field public final synthetic o:Ljx3;

.field public final synthetic p:Lgx3;

.field public final synthetic q:Lg74;

.field public final synthetic r:Lfx3;


# direct methods
.method public synthetic constructor <init>(Lhy2;Ljx3;Lgx3;Lg74;Lfx3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ley2;->n:Lhy2;

    .line 5
    .line 6
    iput-object p2, p0, Ley2;->o:Ljx3;

    .line 7
    .line 8
    iput-object p3, p0, Ley2;->p:Lgx3;

    .line 9
    .line 10
    iput-object p4, p0, Ley2;->q:Lg74;

    .line 11
    .line 12
    iput-object p5, p0, Ley2;->r:Lfx3;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Ljava/lang/Float;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Ley2;->n:Lhy2;

    .line 8
    .line 9
    iget-object v1, v0, Lhy2;->g:Law;

    .line 10
    .line 11
    invoke-static {v1}, Lhy2;->I(Law;)Lcy2;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, Lir2;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lrf2;

    .line 21
    .line 22
    iget-wide v3, v1, Lcy2;->b:J

    .line 23
    .line 24
    iget-wide v5, v1, Lcy2;->a:J

    .line 25
    .line 26
    iget-object v7, v0, Lrf2;->n:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v7, Lm45;

    .line 29
    .line 30
    const/16 v8, 0x20

    .line 31
    .line 32
    shr-long v8, v5, v8

    .line 33
    .line 34
    long-to-int v8, v8

    .line 35
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    invoke-virtual {v7, v3, v4, v8}, Lm45;->a(JF)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v0, Lrf2;->o:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lm45;

    .line 45
    .line 46
    const-wide v7, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long/2addr v5, v7

    .line 52
    long-to-int v5, v5

    .line 53
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    invoke-virtual {v0, v3, v4, v5}, Lm45;->a(JF)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Ley2;->o:Ljx3;

    .line 61
    .line 62
    iget-object v3, v0, Ljx3;->n:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, Lcy2;

    .line 65
    .line 66
    invoke-virtual {v3, v1}, Lcy2;->a(Lcy2;)Lcy2;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iput-object v3, v0, Ljx3;->n:Ljava/lang/Object;

    .line 71
    .line 72
    iget-wide v3, v3, Lcy2;->a:J

    .line 73
    .line 74
    iget-object v0, p0, Ley2;->q:Lg74;

    .line 75
    .line 76
    invoke-virtual {v0, v3, v4}, Lg74;->f(J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    invoke-virtual {v0, v3, v4}, Lg74;->j(J)F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-object v3, p0, Ley2;->p:Lgx3;

    .line 85
    .line 86
    iput v0, v3, Lgx3;->n:F

    .line 87
    .line 88
    sub-float/2addr v0, p1

    .line 89
    invoke-static {v0}, Lh12;->b(F)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    xor-int/2addr p1, v2

    .line 94
    iget-object p0, p0, Ley2;->r:Lfx3;

    .line 95
    .line 96
    iput-boolean p1, p0, Lfx3;->n:Z

    .line 97
    .line 98
    :cond_0
    if-eqz v1, :cond_1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    const/4 v2, 0x0

    .line 102
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0
.end method
