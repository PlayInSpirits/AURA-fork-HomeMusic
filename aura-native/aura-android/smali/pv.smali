.class public final Lpv;
.super Luo;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public u:Lrm2;

.field public v:J

.field public final synthetic w:Landroid/graphics/Shader;


# direct methods
.method public constructor <init>(Landroid/graphics/Shader;)V
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-direct {p0, v0}, Luo;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lpv;->w:Landroid/graphics/Shader;

    .line 6
    .line 7
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v0, p0, Lpv;->v:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final d(JLgc;F)V
    .locals 5

    .line 1
    iget-object v0, p3, Lgc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    iget-object v1, p0, Lpv;->u:Lrm2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-wide v3, p0, Lpv;->v:J

    .line 11
    .line 12
    invoke-static {v3, v4, p1, p2}, Lqf4;->a(JJ)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_3

    .line 17
    .line 18
    :cond_0
    invoke-static {p1, p2}, Lqf4;->b(J)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iput-object v2, p0, Lpv;->u:Lrm2;

    .line 25
    .line 26
    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iput-wide p1, p0, Lpv;->v:J

    .line 32
    .line 33
    move-object v1, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v1, p0, Lpv;->u:Lrm2;

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    new-instance v1, Lrm2;

    .line 40
    .line 41
    const/16 v3, 0x1a

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-direct {v1, v3, v4}, Lrm2;-><init>(IZ)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lpv;->u:Lrm2;

    .line 48
    .line 49
    :cond_2
    iget-object v3, p0, Lpv;->w:Landroid/graphics/Shader;

    .line 50
    .line 51
    iput-object v3, v1, Lrm2;->o:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v1, p0, Lpv;->u:Lrm2;

    .line 54
    .line 55
    iput-wide p1, p0, Lpv;->v:J

    .line 56
    .line 57
    :cond_3
    :goto_0
    invoke-virtual {p3}, Lgc;->a()J

    .line 58
    .line 59
    .line 60
    move-result-wide p0

    .line 61
    sget-wide v3, Lx40;->b:J

    .line 62
    .line 63
    invoke-static {p0, p1, v3, v4}, Lx40;->c(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-nez p0, :cond_4

    .line 68
    .line 69
    invoke-virtual {p3, v3, v4}, Lgc;->f(J)V

    .line 70
    .line 71
    .line 72
    :cond_4
    iget-object p0, p3, Lgc;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Landroid/graphics/Shader;

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    iget-object p1, v1, Lrm2;->o:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Landroid/graphics/Shader;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    move-object p1, v2

    .line 84
    :goto_1
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_7

    .line 89
    .line 90
    if-eqz v1, :cond_6

    .line 91
    .line 92
    iget-object p0, v1, Lrm2;->o:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v2, p0

    .line 95
    check-cast v2, Landroid/graphics/Shader;

    .line 96
    .line 97
    :cond_6
    iput-object v2, p3, Lgc;->c:Ljava/lang/Object;

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 100
    .line 101
    .line 102
    :cond_7
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    int-to-float p0, p0

    .line 107
    const/high16 p1, 0x437f0000    # 255.0f

    .line 108
    .line 109
    div-float/2addr p0, p1

    .line 110
    cmpg-float p0, p0, p4

    .line 111
    .line 112
    if-nez p0, :cond_8

    .line 113
    .line 114
    return-void

    .line 115
    :cond_8
    invoke-virtual {p3, p4}, Lgc;->d(F)V

    .line 116
    .line 117
    .line 118
    return-void
.end method
