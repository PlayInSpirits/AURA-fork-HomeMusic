.class public final synthetic Ly15;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:Lb25;

.field public final synthetic o:F

.field public final synthetic p:Lif1;


# direct methods
.method public synthetic constructor <init>(Lb25;FLif1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly15;->n:Lb25;

    .line 5
    .line 6
    iput p2, p0, Ly15;->o:F

    .line 7
    .line 8
    iput-object p3, p0, Ly15;->p:Lif1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object p1, p0, Ly15;->n:Lb25;

    .line 8
    .line 9
    iget-wide v2, p1, Lb25;->b:J

    .line 10
    .line 11
    const-wide/high16 v4, -0x8000000000000000L

    .line 12
    .line 13
    cmp-long v2, v2, v4

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iput-wide v0, p1, Lb25;->b:J

    .line 18
    .line 19
    :cond_0
    new-instance v6, Lzd;

    .line 20
    .line 21
    iget v2, p1, Lb25;->e:F

    .line 22
    .line 23
    invoke-direct {v6, v2}, Lzd;-><init>(F)V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    iget v4, p0, Ly15;->o:F

    .line 28
    .line 29
    cmpg-float v3, v4, v3

    .line 30
    .line 31
    sget-object v7, Lb25;->f:Lzd;

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    iget-object v3, p1, Lb25;->a:Lg45;

    .line 36
    .line 37
    new-instance v4, Lzd;

    .line 38
    .line 39
    invoke-direct {v4, v2}, Lzd;-><init>(F)V

    .line 40
    .line 41
    .line 42
    iget-object v2, p1, Lb25;->c:Lzd;

    .line 43
    .line 44
    invoke-interface {v3, v4, v7, v2}, Lg45;->m(Lce;Lce;Lce;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    :goto_0
    move-wide v4, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-wide v2, p1, Lb25;->b:J

    .line 51
    .line 52
    sub-long v2, v0, v2

    .line 53
    .line 54
    long-to-float v2, v2

    .line 55
    div-float/2addr v2, v4

    .line 56
    invoke-static {v2}, Lji2;->M(F)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    goto :goto_0

    .line 61
    :goto_1
    iget-object v3, p1, Lb25;->a:Lg45;

    .line 62
    .line 63
    iget-object v8, p1, Lb25;->c:Lzd;

    .line 64
    .line 65
    invoke-interface/range {v3 .. v8}, Lg45;->k(JLce;Lce;Lce;)Lce;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lzd;

    .line 70
    .line 71
    iget v2, v2, Lzd;->a:F

    .line 72
    .line 73
    iget-object v3, p1, Lb25;->a:Lg45;

    .line 74
    .line 75
    iget-object v8, p1, Lb25;->c:Lzd;

    .line 76
    .line 77
    invoke-interface/range {v3 .. v8}, Lg45;->d(JLce;Lce;Lce;)Lce;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Lzd;

    .line 82
    .line 83
    iput-object v3, p1, Lb25;->c:Lzd;

    .line 84
    .line 85
    iput-wide v0, p1, Lb25;->b:J

    .line 86
    .line 87
    iget v0, p1, Lb25;->e:F

    .line 88
    .line 89
    sub-float/2addr v0, v2

    .line 90
    iput v2, p1, Lb25;->e:F

    .line 91
    .line 92
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget-object p0, p0, Ly15;->p:Lif1;

    .line 97
    .line 98
    invoke-interface {p0, p1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    sget-object p0, Lj15;->a:Lj15;

    .line 102
    .line 103
    return-object p0
.end method
